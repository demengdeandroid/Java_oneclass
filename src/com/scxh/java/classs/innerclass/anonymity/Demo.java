package com.scxh.java.classs.innerclass.anonymity;

public class Demo {

	public static void main(String[] args) {
//		 Person person = new Child();
//		 person.eat();

		new Person() {

			@Override
			public void eat() {
				System.out.println("�Զ�����");
			}
		}.eat();

	}

//	public class Child extends Person {
//
//		@Override
//		public void eat() {
//			System.out.println("�Զ���");
//
//		}
//
//	}

}
