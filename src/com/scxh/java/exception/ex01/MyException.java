package com.scxh.java.exception.ex01;

public class MyException extends Exception {
	public MyException() {
		System.out.println("�Զ����쳣��ʼ��");
	}

	public String getMessage() {
		return "����������ӷ�����ʧ�ܣ�";
	}
}
