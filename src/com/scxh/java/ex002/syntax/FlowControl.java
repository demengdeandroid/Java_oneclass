package com.scxh.java.ex002.syntax;



/**
 * ���̿��������ϰ 1.���ʵ����һ���� 2.���ʵ��һ������ 3.��ε����෽�� 4.�˽����������Scanner
 * @author viktor.zhou
 * 
 */
public class FlowControl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		FlowControl flowControl = new FlowControl();
		
//		flowControl.isYear(year);
		
		flowControl.learnLoop();

	}
	/**
	 * ���̿������֮if  else
	 * @param year
	 */
	public void isYear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + "�����ꡣ");
		} else {
			System.out.println(year + "�������ꡣ");
		}
	}
	/**
	 * ���̿������֮for
	 * 
	 */
	public void learnLoop(){
		System.out.println("====for ѭ�����====");
		
		
		for(int i = 5; i < 10; i++){
			System.out.println("i :"+i);
		}
		
		
		System.out.println("====while ѭ�����====");
		
		int a =4;	
		while (a < 5 ) {
			++a;
			System.out.println("a :"+a);
		}
		
		
		System.out.println("==== do while ѭ�����====");
		
		
		int b = 6;
		
		
		do {
			System.out.println("b :"+b);
			b = b + 1;
//			++b;
		} while (b < 5);
		
		
	}

}
