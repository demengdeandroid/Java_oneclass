package com.scxh.java.ex028.net.socket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Clients {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Socket client = new Socket("192.168.1.199", 5552);

			OutputStream out = client.getOutputStream();
			OutputStreamWriter outWriter = new OutputStreamWriter(out);
			BufferedWriter writer = new BufferedWriter(outWriter);
			writer.write("���");
			System.out.println("�ͻ��˷�����Ϣ�ɹ�!");

			writer.close();
			client.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
