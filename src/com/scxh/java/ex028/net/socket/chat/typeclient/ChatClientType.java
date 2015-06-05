package com.scxh.java.ex028.net.socket.chat.typeclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * ����ͻ���
 * 
 * @author viktor
 * 
 */
public class ChatClientType {
	public static boolean exitFlag = false;
	/**�ַ������׼������**/
	public BufferedReader sin;
	/**�ַ�����������, ��ȡ����˷��͹�������Ϣ��*/
	public BufferedReader from;
	/**�ַ����������, �����˷�����Ϣ��*/
	public PrintWriter to;
	/**sokcetͨ��*/
	public Socket socket;
	
	public String name;

	public ChatClientType(String host, int port) {
		try {
			socket = new Socket(host, port);

			sin = new BufferedReader(new InputStreamReader(System.in));
			
			from = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			to = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

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
		exitFlag = true;

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
}
