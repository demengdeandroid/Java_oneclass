package com.scxh.java.ex009.classs.cover;

public class Teacher extends People {
	String name;

	public Teacher(String name){
		this.name = name;
	}
	
	public void say() {
		System.out.println("Teacher�� �ҵ�������" + name);
	}
	
	public void show(){
		System.out.println("Teacher�� show����" + name);
	}
}
