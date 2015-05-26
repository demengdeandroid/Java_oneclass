package com.scxh.java.ex028.net.socket.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServerThread {
	private static final int port = 7776;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			//�ַ������׼������
			BufferedReader sin = new BufferedReader(new InputStreamReader(
					System.in));
			
			//ʵ����ServerSocket
			ServerSocket serverSocket = new ServerSocket(port);
			//�����ͻ���socket����
			Socket server = serverSocket.accept();
			
			//�ַ�����������, ��ȡ�ͻ��˷��͹�������Ϣ��
			final BufferedReader reader = new BufferedReader(new InputStreamReader(
					server.getInputStream()));

			//�ַ����������, ��ͻ��˷�����Ϣ��
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(
					server.getOutputStream()));
			
			// ���շ������Ϣ�߳�
			new Thread(new Runnable() {

				@Override
				public void run() {
					while (true) {
						try {
							String socketLine = reader.readLine();// ��socket�ܵ���ȡ���ݣ� �ӷ���˶�ȡ����
							if(socketLine != null){
								System.out.println("��˿  :" + socketLine);
							}

						} catch (IOException e) {
							e.printStackTrace();
						} 
					}

				}
			}).start();
			
			
			System.out.println("�������ַ���:");
			String line = sin.readLine();//�Ӽ��̶�ȡһ���ַ�����
			while( !line.equals("over")){
				writer.println(line);   //��socket�ܵ�д�����ݣ���ͻ��˷�������
				writer.flush();
				
				System.out.println("��Ů :"+line);
				line = sin.readLine();
			}
		    
			
			
			
			//�ر���
			reader.close();
			writer.close();
			sin.close();
			server.close();
			serverSocket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
