package com.scxh.java.ex028.net.socket.chat.typeserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatMultiServer {
	private static boolean listening = true;

	private String serverName = "�����";
	/**
	 * �������������
	 */
	public void startServer(int port,String name){
		serverName = name;
		try {
			int count = 0; //��ʾ�ͻ��˸���
			
			ServerSocket serverSocket = new ServerSocket(port);
			
			while (listening) {

				Socket sokcet = serverSocket.accept();

				new Thread(new ChatMultiServer().new ChatServerRunable(sokcet,
						++count)).start();

			}

			serverSocket.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	class ChatServerRunable implements Runnable {
		/** �ַ������׼������ **/
		public BufferedReader sin;
		/** �ַ�����������, ��ȡ����˷��͹�������Ϣ�� */
		public BufferedReader from;
		/** �ַ����������, �����˷�����Ϣ�� */
		public PrintWriter to;
		/** sokcetͨ�� */
		public Socket socket;
		public int count;

		public ChatServerRunable(Socket socket, int count) {
			try {
				this.socket = socket;
				this.count = count;
				sin = new BufferedReader(new InputStreamReader(System.in));

				from = new BufferedReader(new InputStreamReader(socket
						.getInputStream()));

				to = new PrintWriter(new OutputStreamWriter(socket
						.getOutputStream()));

			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		/**
		 * ������Ϣ �Ӽ���������Ϣ.
		 * 
		 * @param keyBoard
		 * @return
		 */
		public String getMessageByKeyBoard(BufferedReader keyBoard) {
			showMessage("�����뷢�͵���Ϣ����:");
			String line = null;
			try {
				line = keyBoard.readLine();

			} catch (IOException e) {
				e.printStackTrace();
			}
			return line;

		}

		/**
		 * ��ʾ��Ϣ
		 * 
		 * @param message
		 */
		public void showMessage(String message) {
			System.out.println(message);
		}

		/**
		 * ������Ϣ
		 */
		public void sendMessage(String message, PrintWriter to) {
			to.println(message); // ��socket�ܵ�д�����ݣ������˷�������
			to.flush();
		}

		/**
		 * ������Ϣ
		 */
		public String receiveMessage(final BufferedReader from) {
			String socketLine = null;
			try {
				socketLine = from.readLine();// ��socket�ܵ���ȡ���ݣ�

			} catch (IOException e) {
				e.printStackTrace();
			}

			return socketLine;
		}

		/**
		 * ��������
		 */
		public void overChat() {

			try {
				if (from != null) {
					from.close();
				}
				if (to != null) {
					to.close();
				}
				if (sin != null) {
					sin.close();
				}
				if (socket != null) {
					socket.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		@Override
		public void run() {
			// ���շ������Ϣ�߳�
			new Thread(new Runnable() {

				@Override
				public void run() {
					while (true) {
						String fromMessage = receiveMessage(from);
						if (fromMessage != null) {
							showMessage("�ͻ��� :" + fromMessage);
						}
					}
				}
			}).start();

			String toMessage = getMessageByKeyBoard(sin);

			while (!toMessage.equals("over")) {

				sendMessage(toMessage, to);

				showMessage(serverName +" :" + toMessage);

				toMessage = getMessageByKeyBoard(sin);
			}

		}

	}

}
