package com.scxh.java.ex008.classs.extend;
/**
 * 
 * @author viktor
 *
 */
public class Son extends Father{
	String name;
	int age;
	
	public Son(){
		super();
		this.name = "С��";
		this.age = 2;
		System.out.println("Son���๹�췽��");
	}
	
	public Son(String name,int age){
		super("����",24);
		
		super.name = "����";
		super.age = 25;
		super.swiming();
		super.getGirl();
		
		this.name = name;
		this.age = age;
		this.swiming();
		
		System.out.println("Son���๹�췽��");
	}

	void basketball(){
		System.out.println("������");
	}
	
	void swiming(String name){
		System.out.println("������Ӿ");
	}
	
	public String getGirl() {
		return "��Ů";
	}
}
