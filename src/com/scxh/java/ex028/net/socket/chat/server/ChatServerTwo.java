package com.scxh.java.ex028.net.socket.chat.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServerTwo {
	private static final int port = 7776;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			
			//ʵ����ServerSocket
			ServerSocket serverSocket = new ServerSocket(port);
			//�����ͻ���socket����
			Socket server = serverSocket.accept();
			
			
			
			//�ַ������׼������
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			//�ַ�����������, ��ȡ�ͻ��˷��͹�������Ϣ��
			BufferedReader reader = new BufferedReader(new InputStreamReader(server.getInputStream()));
			//�ַ����������, ��ͻ��˷�����Ϣ��
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(server.getOutputStream()));

			
			
			
			System.out.println("�������ַ���:");
			String line = sin.readLine();//�Ӽ��̶�ȡһ���ַ�����
			
			while( !line.equals("over")){
				writer.println(line);   //��socket�ܵ�д�����ݣ���ͻ��˷�������
				writer.flush();
				
				System.out.println("����� :"+line);
				
				String socketLine = reader.readLine();  //��socket�ܵ���ȡ���ݣ� �ӿͻ��˶�ȡ����
				System.out.println("���տͻ������� :"+socketLine);
				
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
