package com.scxh.java.ex012.classs.innerclass.anonymity;
/**
 * �����ڲ���ʹ��
 * @author viktor
 *
 */
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
