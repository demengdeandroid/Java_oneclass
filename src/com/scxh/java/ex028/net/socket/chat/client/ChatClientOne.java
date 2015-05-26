package com.scxh.java.ex028.net.socket.chat.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * SokcetͨѶ
 * �ͻ��������˷�����Ϣ
 * ֻ�ܷ���һ��
 * @author viktor
 *
 */
public class ChatClientOne {
	private static final String host = "192.168.1.199";
	private static final int port = 7776;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			
			//=================����Socket����====================
			
			Socket socket = new Socket(host, port);
			
			//=================����Socket����====================
			
			
			
			//==================��ʼ������=======================
			
			// �ַ������׼������,  ��ȡ�Ӽ���������ַ���
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			
			// �ַ�����������, ��ȡ����˷��͹�������Ϣ��
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// �ַ������, �����˷�����Ϣ��
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

			//==================��ʼ������=======================
			
			
			
			System.out.println("�������ַ���:");
			
			String line = sin.readLine();// �Ӽ��̶�ȡһ���ַ�������
			System.out.println("�ͻ��� :" + line);
			
			writer.println(line); // ��socket�ܵ�д�����ݣ������˷�������
			writer.flush();

			String socketLine = reader.readLine(); // ��socket�ܵ���ȡ���ݣ� �ӷ���˶�ȡ����
			System.out.println("����� :" + socketLine);

			
			
			//====================== �ر���======================
			reader.close();
			writer.close();
			sin.close();
			socket.close();
			//====================== �ر���======================
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
