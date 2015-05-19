package com.scxh.java.ex017.exercise.ex01;

public class TestParameterTransmit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		testBasicTypeTransParameter();
		
		testTypeTransParameter();
	}

	/**
	 * �������ݻ�����������
	 */
	public static void testBasicTypeTransParameter() {
		int num = 5;
		System.out.println("a :" + num);

		changeValue(num);

		System.out.println("a :" + num);
	}

	/**
	 * ����������������
	 */
	public static void testTypeTransParameter() {
		User user;  //����һ��user����������ָ���κ�User����
		
		user = new User();
		
		user.name = "����";

		System.out.println("11 name :" + user.name); // ����

		changeObjectValue(user);

		System.out.println("22 name :" + user.name); // ����
	}

	public static void changeValue(int x) {
		x = x * 2;
		System.out.println("x :" + x);
	}

	public static void changeObjectValue(User user) {
		user.name = "����";
		System.out.println("changeObjectValue name :" + user.name); // ����
	}

}
