package com.scxh.java.ex009.classs.overring;

public class People {
	String name = "people";

	public People(){
		System.out.println("���췽��People");
	}
	
	public People(String name){
		this.name = name;
	}
	
	public void say() {
		System.out.println("People ���ҵ�������"+ name);
	}
}
