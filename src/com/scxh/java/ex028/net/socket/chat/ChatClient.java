package com.scxh.java.ex028.net.socket.chat;

import java.io.BufferedReader;
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
			
			Socket client = new Socket(host, port);

			//�ַ�����������, ��ȡ����˷��͹�������Ϣ��
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));

			//�ַ����������, �����˷�����Ϣ��
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(
					client.getOutputStream()));
			
			System.out.println("�������ַ���:");
			String line = sin.readLine();//�Ӽ��̶�ȡһ���ַ�����
			while(!line.equals("over")){
				writer.println(line);   //��socket�ܵ�д�����ݣ������˷�������
				writer.flush();
				
				System.out.println("�ͻ��� :"+line);
				
				String socketLine = reader.readLine();  //��socket�ܵ���ȡ���ݣ� �ӷ���˶�ȡ����
				
				System.out.println("����� :"+socketLine);
				line = sin.readLine();
			}
			


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
