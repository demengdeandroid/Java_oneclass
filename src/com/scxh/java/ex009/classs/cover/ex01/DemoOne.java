package com.scxh.java.ex009.classs.cover.ex01;

public class DemoOne {
	public static void main(String[] args) {
		Animal obj;
		obj = new Animal("����"); // ���ø���ʵ��
		obj.say(); 
		
		obj = new Dog("����");// ��������ʵ��
		obj.say();
		
		if (obj instanceof Dog) {  //instanceof ���ã��ж���ǰ�����������Ǹ���(���࣬����)��
			System.out.println("����һֻС��");
		}
		
		
		if (obj instanceof Animal) {  //instanceof ���ã��ж���ǰ�������������ࡣ
			System.out.println("����һ������");
		}
		
		if (obj instanceof Object) {  //instanceof ���ã��ж���ǰ�������������ࡣ
			System.out.println("����һ������");
		}
		
		
		
		
	}
}
