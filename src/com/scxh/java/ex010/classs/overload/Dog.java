package com.scxh.java.ex010.classs.overload;

/**
 * this �ؼ���������ʾ��ǰ��������ǰ���һ��ʵ����ͨ�� this ���Ե��ñ���������з��������ԡ�
 * 
 * @author viktor
 * 
 */
public class Dog {
	public String name;
	public int age;
	
	private static String number;
	
	public Dog() {
	}

	public Dog(String name, int age, String hungry) {
		hungry(hungry);
	}

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("�ҵ������� " + this.name + ",����" + this.age + "��!");

		// hungry(name);
	}

	public void hungry(String name) {
		System.out.println(name + "���ڶ���.");
	}

}
