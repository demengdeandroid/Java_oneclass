package com.scxh.java.ex009.classs.overring.ex01;

public class Dog extends Animal {
	// ���췽�����ܱ��̳У�ͨ��super()����
	public Dog(String name) {
		super(name);
	}

	// ����say() ����
	public void say() {
		System.out.println("����һֻС�����ҵ����ֽ�" + name + "���һᷢ�������Ľ���");
	}
}
