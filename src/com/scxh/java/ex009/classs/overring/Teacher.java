package com.scxh.java.ex009.classs.overring;
/**
 * ��д(����)(overring)
 * 
 * @author viktor
 *
 */
public class Teacher extends People {
	String name = "Teacher";

	public Teacher(String name){
		//super();���û����ʾ���ã�Ĭ��ִ�С�  super();
//		this.name = name;
	}
	/**
	 * ���Ǹ���say����
	 */
	public void say() {
		System.out.println("Teacher�� �ҵ�������" + name);
	}
	
	public void show(){
		System.out.println("Teacher�� show����" + name);
	}
}
