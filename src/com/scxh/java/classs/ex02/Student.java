package com.scxh.java.classs.ex02;

/**
 * 1.��Ķ��� 
 * 2.��Ա���� 
 * 3.��Ա���� 
 * 4.�ֲ����� //�ڷ������ڶ���ı��� 
 * 5.���췽�� 
 * 6.ʵ������õ����� 
 * 7.���ñ����ͷ���
 * 
 * ���η����������η� �Ƿ������η��� ����ֵ���� ��������(�����б�[��������1 ������1,��������2 ������2,...]) { ������ }
 * 
 * @author viktor
 * 
 */
public class Student {
	// ��Ա���� Ҳ������
	public static String name; // ѧ������
	private int age; // ѧ������
	protected float score; // ѧ���ɼ�
	{
		int a = 1;
	}
	// ��Ա����
	/**
	 * ѧ���๹�췽�� ����ʵ������
	 */
	public Student() {
		System.out.println("ִ��ѧ����Ĺ��췽��");
	}

	/**
	 * ѧ������ķ���
	 */
	public String read() {
		String name = "�����"; // �ֲ�����
		age = 1;
		if(name.equals("����")){
			String result = name;
			age = 1;
		}else{
			String result = name;
		}
		
		return name;
	}

	/**
	 * ѧ��д�ֵķ���
	 * 
	 * @param str
	 */
	void write(String str) {
		System.out.println("д�������� " + str);
	}

	/**
	 * ��ʾѧ��������Ϣ�ķ���
	 */
	void show() {
		System.out.println("ѧ������ :" + name);
		System.out.println("ѧ������ :" + age);
		System.out.println("ѧ���ɼ� :" + score);
	}

	public static void main(String[] args) {
		System.out.println("===ѧ����Student ������main������ʼִ��===");

		Student stu = new Student(); // ʵ���� ѧ����Student �õ�����stu
		stu.name = "����";
		stu.age = 18;
		stu.score = 99;

		String result = stu.read();
		System.out.println(result);

		String a = "��д�ĺö�����";
		stu.write(a);

		stu.show();

		System.out.println("===ѧ����Student ������main��������ִ��===");
		
		
		Student stuA = new Student();
		stuA.name = "����";
		stuA.age = 13;
		stuA.score = 98;
		
		stuA.show();
		
	}
}
