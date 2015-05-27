package com.scxh.java.ex028.net.socket.chat.tclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClientThread {
	private static final String host = "192.168.1.199";
	private static final int port = 9527;

	public static boolean exitFlag = false;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			
			Socket client = new Socket(host, port);
			
			
			
			// �ַ������׼������
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			// �ַ�����������, ��ȡ����˷��͹�������Ϣ��
			final BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			// �ַ����������, �����˷�����Ϣ��
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(client.getOutputStream()));

			
			
			
			//===================���߳�(���ղ���ʾ��Ϣ��ʵ�ֽ�����Ů���͸���˿����Ϣ========
			
			new Thread(new Runnable() {

				@Override
				public void run() {
					while (true) {
						try {
							String socketLine = reader.readLine();// ��socket�ܵ���ȡ���ݣ� �ӷ���˶�ȡ����
							if(socketLine != null){
								System.out.println("��Ů :" + socketLine);
							}

						} catch (IOException e) {
							e.printStackTrace();
						} 
						
						if(exitFlag == true){
							break;
						}
					}
				}
			}).start();
			
			//===================���߳�(���ղ���ʾ��Ϣ��ʵ�ֽ�����Ů���͸���˿����Ϣ========
			
			
			
			
			
			//=================���̣߳���Ϣ�����̣߳�ʵ�֌�˿����Ů������Ϣ============
			
			System.out.println("�������ַ���:");
			String line = sin.readLine();// �Ӽ��̶�ȡһ���ַ�����
			while (!line.equals("over")) {
				writer.println(line); // ��socket�ܵ�д�����ݣ������˷�������
				writer.flush();

				System.out.println("��˿:" + line);

				line = sin.readLine();
			}
			//=================���̣߳���Ϣ�����̣߳�ʵ�֌�˿����Ů������Ϣ============
			
			
			exitFlag = true;
			
			// ====================�ر���==================
//			reader.close();
			writer.close();
			sin.close();
			client.close();
			// ====================�ر���==================
		} catch (UnknownHostException e) {
		} catch (IOException e) {
		}

	}
	

}
