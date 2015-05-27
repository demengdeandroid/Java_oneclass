package com.scxh.java.ex028.net.socket.chat.tclient;

import java.io.BufferedReader;
import java.io.IOException;

public class ReceiveMessageRunable implements Runnable {
	
	public BufferedReader reader;
	
	public ReceiveMessageRunable(BufferedReader reader){
		this.reader = reader;
	}
	
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

}
