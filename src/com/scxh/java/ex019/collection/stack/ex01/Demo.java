package com.scxh.java.ex019.collection.stack.ex01;

import com.scxh.java.ex018.collection.queue.ex01.Student;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student stuA = new Student("����");
		Student stuB = new Student("����");
		Student stuC = new Student("����");
		Student stuD = new Student("����");
		
		MyStack myStack = new MyStack();
		//=====ѹջ====
		myStack.doPush(stuA);
		myStack.doPush(stuB);
		myStack.doPush(stuC);
		myStack.doPush(stuD);
		
		
		//========��ջ=====
		Student stu1 = myStack.doPop();
		Student stu2 = myStack.doPop();
		Student stu3 = myStack.doPop();
		Student stu4 = myStack.doPop();
		System.out.println(stu1.getName());
		System.out.println(stu2.getName());
		System.out.println(stu3.getName());
		System.out.println(stu4.getName());
		
	}

}
