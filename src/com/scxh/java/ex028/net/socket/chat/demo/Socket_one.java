package com.scxh.java.ex028.net.socket.chat.demo;

import java.net.Socket;

public class Socket_one// �ͻ���
{
	private static final int PORT = 6666;// �˿�
	public static String user;
	public static Socket socket;

	public Socket_one(String user) {
		this.user = user;

		try {
			socket = new Socket("127.0.0.1", PORT);// ����socket����
			System.out.println("��" + user + "����ӭ���������ң�");

			Thread tt = new Thread(new Recove(socket, user));// �����ͻ����߳�
			tt.start();// �����߳�
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		new Socket_one(user);

	}
}