package com.scxh.java.ex016.exception.ex01;

import java.util.ArrayList;

/**
 * 
 * 1.����������, ���� 
 * 2.Java�쳣������ƣ� ����ʱ���� 
 * 3.����ʱ����,��������� 1.Error 2.��׼�쳣 3.�Զ����쳣 
 * 4.��׼�쳣��
 * 
 * 5.���쳣 �֣�1>ϵͳ�� 2>�ֶ���(throw throws)
 * 6.�����쳣 �����쳣��д��ʽ
 * 
 * try {
 * 
 *   //���������쳣�Ĵ����
 * 
 * }catch (Exception e) { 
 *   //�����쳣 
 * }finallay{
 *   //һ��ִ�д����
 * }
 * 7.throw 
 * 8.throws 
 * 9.finally
 * 
 * @author viktor 
 * 
 */

public class TryCatchDemo {
	public int a = 10;
	public int c = 2;
	public ArrayList<String> list;

	public static void main(String args[]) {
		TryCatchDemo obj = new TryCatchDemo();
		obj.trycatchMethod();
		// demo.arrayIndexOutofMethod();
		// demo.nullMethod();
	}

	/**
	 * ����Ϊ�� java.lang.ArithmeticException
	 */
	public void arithmeticMethod() {
		int b = a / c;
		System.out.println("b = " + b);
	}
	
	/**
	 * �����±�Խ�� java.lang.ArrayIndexOutOfBoundsException
	 */
	public void arrayIndexOutofMethod() {
		String[] str = new String[3];
		str[0] = "1";
		str[1] = "2";
		str[2] = "3";

		System.out.println(str[3]);

	}

	/**
	 * java.lang.NullPointerException
	 */
	public void nullMethod() {
		list.add("����1");
	}

	/**
	 * �쳣���� �����쳣
	 */
	public void trycatchMethod() {
		try {

			int b = a / c;
			System.out.println("b = " + b);

			String[] str = new String[3];
			str[0] = "1";
			str[1] = "2";
			str[2] = "3";
			String d = str[3];
			System.out.println(d);

		} catch (ArithmeticException ae) {
			System.out.println("����Ϊ���쳣" + ae.getMessage());
			ae.printStackTrace();

		} catch (ArrayIndexOutOfBoundsException aoue) {
			System.out.println("�����±�Խ��" + aoue.getMessage());
		} finally {
			System.out.println("finally һ����ִ�еĴ����");
		}
	}

	public void trycatchExceptionMethod() {
		try {

			int b = a / c;
			System.out.println("b = " + b);

			String[] str = new String[3];
			str[0] = "1";
			str[1] = "2";
			str[2] = "3";
			str[3] = "4";
			System.out.println("str[2] :" + str[2]);

		} catch (Exception ae) {
			System.out.println("�쳣" + ae.getMessage());

		}
	}

}
