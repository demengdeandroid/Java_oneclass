package com.scxh.java.ex028.net.socket.chat.tserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import com.scxh.java.ex028.net.socket.chat.tclient.ReceiveMessageRunable;

public class ChatServerThread {
	private static final int port = 7776;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			
			//ʵ����ServerSocket
			ServerSocket serverSocket = new ServerSocket(port);
			//�����ͻ���socket����
			Socket socket = serverSocket.accept();
			
			
			//�ַ������׼������
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			//�ַ�����������, ��ȡ�ͻ��˷��͹�������Ϣ��
			final BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//�ַ����������, ��ͻ��˷�����Ϣ��
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			ReceiveMessageRunable rmRunable = new ReceiveMessageRunable(reader);
			Thread receiveThread = new Thread(rmRunable);
			receiveThread.start();
			
			
//			// ���շ������Ϣ�߳�
//			new Thread(new Runnable() {
//
//				@Override
//				public void run() {
//					while (true) {
//						try {
//							String socketLine = reader.readLine();// ��socket�ܵ���ȡ���ݣ� �ӷ���˶�ȡ����
//							if(socketLine != null){
//								System.out.println("��˿  :" + socketLine);
//							}
//
//						} catch (IOException e) {
//							e.printStackTrace();
//						} 
//					}
//
//				}
//			}).start();
			
			
			
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
			socket.close();
			serverSocket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
