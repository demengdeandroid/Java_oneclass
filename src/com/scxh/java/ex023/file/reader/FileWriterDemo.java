package com.scxh.java.ex023.file.reader;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("f:/test.txt",true);

			String str = "����";
			String str1 = "����";
			
			fileWriter.write(str);
			fileWriter.write(str1);
			
			System.out.println("д�ļ��ɹ�!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
