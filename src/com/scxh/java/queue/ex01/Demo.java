package com.scxh.java.queue.ex01;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//=====================================
		Student stuA = new Student("����");
		Student stuB = new Student("����");
		Student stuC = new Student("����");
		Student stuD = new Student("����");
		
//		MyQueue queue = new MyQueue();
		
		ArrayQueue queue = new ArrayQueue();
		queue.add(stuA);
		queue.add(stuB);
		queue.add(stuC);
		queue.add(stuD);
		
		Student stu1 = queue.get();
		System.out.println("�Ӷ���ȡ������ "+stu1.getName());
		//======================================
		
		
	}

}
