package com.scxh.java.ex028.net.socket.chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClient {
	private static final String host = "192.168.1.199";
	private static final int port = 7776;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			//�ַ������׼������
			BufferedReader sin = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("�������ַ���:");
			String line = sin.readLine();//�Ӽ��̶�ȡһ���ַ�����
			
			Socket client = new Socket(host, port);

			//�ַ�����������, ��ȡ����˷��͹�������Ϣ��
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));

			//�ַ����������, �����˷�����Ϣ��
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(
					client.getOutputStream()));
			
			writer.println(line);   //��socket�ܵ�д�����ݣ������˷�������
			writer.flush();
			
			String socketLine = reader.readLine();  //��socket�ܵ���ȡ���ݣ� �ӷ���˶�ȡ����
			System.out.println("���շ�������� ��"+socketLine);
			

			//�ر���
			reader.close();
			writer.close();
			sin.close();
			client.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
