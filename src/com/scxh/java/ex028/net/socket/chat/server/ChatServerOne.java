package com.scxh.java.ex028.net.socket.chat.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServerOne {
	private static final int port = 7776;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			
			//�ַ������׼������
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("�������ַ���:");
			String line = sin.readLine();//�Ӽ��̶�ȡһ���ַ�����
			
			
			//=================����Socket����====================
			
			//ʵ����ServerSocket
			ServerSocket serverSocket = new ServerSocket(port);
			
			//�����ͻ���socket����
			Socket socket = serverSocket.accept();
			
			//=================����Socket����====================
			
			
			//�ַ�����������, ��ȡ�ͻ��˷��͹�������Ϣ��
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			//�ַ����������, ��ͻ��˷�����Ϣ��
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			
			
			writer.println(line);   //��socket�ܵ�д�����ݣ���ͻ��˷�������
			writer.flush();
			
			String socketLine = reader.readLine();  //��socket�ܵ���ȡ���ݣ� �ӿͻ��˶�ȡ����
			System.out.println("���տͻ������� :"+socketLine);
			
			
			//============================�ر���=================
			reader.close();
			writer.close();
			sin.close();
			socket.close();
			serverSocket.close();
			//============================�ر���=================
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
