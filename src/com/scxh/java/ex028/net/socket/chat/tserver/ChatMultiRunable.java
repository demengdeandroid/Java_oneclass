package com.scxh.java.ex028.net.socket.chat.tserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatMultiRunable implements Runnable {
	public Socket socket;

	public ChatMultiRunable(Socket sokcet) {
		this.socket = sokcet;
	}

	@Override
	public void run() {
		try {
			// �ַ������׼������
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			// �ַ�����������, ��ȡ�ͻ��˷��͹�������Ϣ��

			final BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// �ַ����������, ��ͻ��˷�����Ϣ��
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			
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
			socket.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
