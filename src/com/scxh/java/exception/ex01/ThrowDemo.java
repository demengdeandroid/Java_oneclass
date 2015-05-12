package com.scxh.java.exception.ex01;

import java.io.FileReader;
import java.io.IOException;

public class ThrowDemo {

	public static void main(String[] args) {
		ThrowDemo obj = new ThrowDemo();
		try {
			
			obj.readFileMethod();
			obj.arithmeticThrowMethod();
			
		} catch (ArithmeticException a) {
			System.out.println("����Ϊ��  .");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//һ��ִ�еĴ���
		}
	}

	public void arithmeticThrowMethod() {
		int a = 10;
		int b = 0;

		if (b == 0) {
			throw new ArithmeticException();
//			throw new Exception();
		}

		int c = a / b;

		System.out.println(c);
	}

	/**
	 * throws ���߷��������ߴ˷������ܻ���һ���쳣
	 * 
	 * @throws IOException
	 */
	public void readFileMethod() throws IOException {

		FileReader fileReader = new FileReader("f:\\test.txt");
		
		char[] c = new char[1000];
		
		int count = fileReader.read(c); //����������ȡ���ݷ��ض�ȡ���ݸ���
		
		System.out.println("�ַ����� :" + count);
		
		String str = new String(c, 0, count);//���ַ�����ת�����ַ���
		
		System.out.println(str);

	}
	
	public void readFilefinally(){
		FileReader fileReader = null;
		try{

			fileReader = new FileReader("f:\\test.txt");
			
			char[] c = new char[1000];
			
			int count = fileReader.read(c); //����������ȡ���ݷ��ض�ȡ���ݸ���
			
			System.out.println("�ַ����� :" + count);
			
			String str = new String(c, 0, count);//���ַ�����ת�����ַ���
			
			System.out.println(str);
			
		}catch(IOException io){
			io.printStackTrace();
		}finally{
			try {
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
