package com.scxh.java.ex007.classs.bzclass;

public class Ex01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int m = 200;
		Integer obj1 = new Integer(m);   //������������int m - > ��װ�� Integer  ��װ��
		System.out.println(obj1.toString());
		
		Integer obj2 = new Integer(500);   //����
 		int n = obj2.intValue();
		
		String number = "101";
		int num = Integer.parseInt(number);
		
		num = num + 1;
		
		String nn = String.valueOf(num);
		
		int a = 1000;
		String xx = Integer.toString(a);
		
		System.out.println(nn);
		
	}
	/**
	 * �Զ�����
	 */
	public void autoChexiang(){
		//�Զ�װ��
		int m = 200;
		Integer obj1 = m;
		
		//�Զ�����
		Integer obj2 = new Integer(300);
		int n = obj2;
		
		//
		String a = "1002";
		int mm = Integer.parseInt(a);
		
		int b = 1003;
		String nn = Integer.toString(b);
		
		
	}

}
