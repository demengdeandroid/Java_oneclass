package com.scxh.java.ex023.file.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) {
		// ���� �ַ�������FileReader
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("F:/test.txt");
			BufferedReader bReader = new BufferedReader(fileReader);
			
			//================  ��һ  ============
			int b;
			while( (b = bReader.read())!= -1){
				char c = (char)b;
				System.out.print(c);
			}
			
			//================  ����  ============
			
//			// ����һ���ַ����飬���ڽ��մ���������ȡ������
//			char[] cbuf = new char[100];
//
//			// ���ַ���������ȡ���ݸ����ַ����飬���ض�ȡ���ַ�����
//			int charCount = fileReader.read(cbuf);
//
//			// ���ַ�����ת���ַ���,���ո��ַ�����
//			String str = new String(cbuf, 0, charCount);
//
//			System.out.println("���ļ�test.txt��ȡ�����ݳ����� :" + charCount + "\n "
//					+ str);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
