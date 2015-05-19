package com.scxh.java.ex023.file.reader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferWriterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedWriter bufWriter = null;
		try {

			String str1 = "1.�κ������࣬��������ĳ�ַ�ʽ���Խ������Ž�ȥ��Ȼ����ĳ�ַ�ʽ������ȡ����.";
			String str2 = "2.�������������������Ĺ���������ArrayList��add�����ǲ������ķ���.";

			bufWriter = new BufferedWriter(new FileWriter("E:/writerFile.txt"));

			bufWriter.write(str1);
			bufWriter.newLine();
//			bufWriter.write("\r\n");  //windows��д�ļ����з��� "\r\n"
//			bufWriter.write(str2);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bufWriter != null) {
				try {
					bufWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
