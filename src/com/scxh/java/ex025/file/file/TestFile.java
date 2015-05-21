package com.scxh.java.ex025.file.file;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 1. �ж�����ľ���·���Ǵ���һ���ļ�����һ��Ŀ¼�� 1>�����ļ�������ļ��ľ���·�������жϴ��ļ����ļ����ԣ��Ƿ�ɶ�д�����أ�;
 * //2>����Ŀ¼�������Ŀ¼�������ļ��������������ļ��� 3>����Ŀ¼������Ŀ¼���Ŀ¼�������ļ� .
 * 
 * @author viktor
 * 
 */
public class TestFile {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

//		BufferedReader reader = new BufferedReader(new InputStreamReader(
//				System.in));
//		System.out.println("�������ļ�·��:");
//		String path = reader.readLine(); // �Ӽ��������ļ�·��
//
//		File file = new File(path); // E:/java.txt
//		searchFile(file);

		String data = "���Java";
		
		byte[] bytes = data.getBytes();
		
		String str = new String(bytes,"GB2312");
		
		appendDataToFile(str);
	}

	public static void searchFile(File file) {
		if (file.isDirectory()) {
			// �ļ�Ŀ¼
			File[] files = file.listFiles();

			if (files != null) {
				int length = files.length;

				for (int i = 0; i < length; i++) {
					File f = files[i];
					searchFile(f);
				}
			}
		} else {
			// �ļ�
			System.out.println("�ļ�����·��  :" + file.getAbsolutePath() + "  "
					+ (file.canRead() ? "�ɶ�" : "���ɶ�") + "  "
					+ (file.canWrite() ? "��д" : "����д") + "  "
					+ (file.isHidden() ? "����" : "������"));
		}
	}

	/**
	 * ������ݵ��ļ�ĩβ
	 * @throws IOException 
	 */
	public static void appendDataToFile(String data) throws IOException{
		String line = data;
		
//		String path = "F:/appendFile.txt";
		String path = "F:/test.txt";
		
		File file = new File(path);
		
		String mode = "rw";
		
		RandomAccessFile rafile = new RandomAccessFile(file, mode);
		
		rafile.seek(file.length());
		
		rafile.writeBytes(line);
		
		rafile.close();
	}
}
