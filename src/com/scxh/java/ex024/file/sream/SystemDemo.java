package com.scxh.java.ex024.file.sream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SystemDemo demo = new SystemDemo();

		// demo.testSystemInput();

		// demo.testInputStreamReader();

		demo.testSystemError();

	}

	public void testSystemInput() throws IOException {
		System.out.println("�Ӽ��̶�ȡ����:");

		byte[] b = new byte[100];

		int len = System.in.read(b);

		String str = new String(b, 0, len);

		System.out.println("���ȡ�������� :" + str);

		Class sysIn = System.in.getClass(); // BufferInputStream
		Class sysOut = System.out.getClass(); // PrintSteam

		System.out.println("System.in���������� :" + sysIn.toString());
		System.out.println("system.out���������� :" + sysOut.toString());
	}

	/**
	 * 
	 * ʵ�ִӼ��̶�ȡһ�����ݹ��ܡ�
	 * 
	 *  �����ݣ�������
	 *  һ�е�����==�ַ����� �ַ��� 
	 *  ����: System.in :�ֽ�������
	 *   InputStreamReader:���ֽ���ת�����ַ���
	 * 
	 * @throws IOException
	 */
	public void testInputStreamReader() throws IOException {
		System.out.println("�Ӽ�����������:");

		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader buferReader = new BufferedReader(inputStreamReader);

		String line = buferReader.readLine();

		System.out.print("�Ӽ��������������: \n" + line);
		
		buferReader.close();
		inputStreamReader.close();
	}

	public void testSystemError() {
		System.err.print("���");
	}

}
