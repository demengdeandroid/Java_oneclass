package com.scxh.java.ex013.classs.innerclass;


/**
 * �ڲ���ѧϰ
 * 
 * @author viktor
 * 
 */
public class OuterClass {
	public String outerName;

	public void show() {
		System.out.println("Outer �ⲿ��ѧϰ  "+outerName);
	}

	public void say(){
		System.out.println("Outer �ⲿ��ѧϰ  say()");
		
		class InnerClass{   //�ֲ��ڲ���
			public String innerName;
			
			public void show(){
				innerName = outerName;
				say();
				System.out.println("Inner �ڲ���ѧϰ  "+innerName);
				
			}
			
		}
		
	}
	
	public class InnerClass {  //��Ա�ڲ���
		public String innerName;
		
		public  String number;
		
		public void show(){
			System.out.println("Inner �ڲ���ѧϰ  "+innerName);
		}
		
	}
	
	public static class InOuterClass{
		public String name;
	}
}


