package com.scxh.java.ex015.mangesystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	public String name; // ����
	public int number; // ѧ��

	public ArrayList<Student> mStudentList = new ArrayList<Student>();// �洢ѧ������

	public Student() {

	}

	public Student(String name, int number) {
		this.name = name;
		this.number = number;
	}

	/**
	 * ���ѧ��
	 */
	public void addStudent() {
		System.out.println("======���ѧ����Ϣ����=========");
		Scanner scaner = new Scanner(System.in);
		System.out.println("����������:");
		String name = scaner.next();
		System.out.println("������ѧ��:");
		int number = scaner.nextInt();

		Student stu = check(number);
		
		if(stu == null){
			Student student = new Student(name, number);
			mStudentList.add(student);

			System.out.println("======��ӳɹ� ! ѧ�������� :" + student.name + ",ѧ���� : "
					+ student.number+"=========");
		}else{
			System.out.println("������ѧ���Ѿ����ڣ����������룡");
		}
		
	}

	/**
	 * ɾ��ѧ��
	 */
	public void deleteStudent() {
		System.out.println("======ɾ��ѧ����Ϣ����=========");
		Scanner scaner = new Scanner(System.in);
		System.out.println("������ѧ��:");
		int number = scaner.nextInt();

		Student student = check(number);
		if (student == null) {
			System.out.println("�������ѧ��Ϊ" + number + "��ѧ��������!");
		} else {
			mStudentList.remove(student); // ��ѧ������ϵͳ��ɾ��ָ���Ķ���
			System.out.println("====ɾ��ѧ���ɹ�!ѧ����:" + number + "��ѧ���Ѵ�ѧ������ϵͳ��ɾ��====");
		}
	}

	/**
	 * ����ѧ������ϵͳ��mStudentList������Ƿ���ڶ�Ӧѧ�ŵ�ѧ��
	 * ������ھͷ��ض�Ӧѧ��
	 * �����ڷ���null
	 * @param number
	 * @return
	 */
	public Student check(int number) {
		int count = mStudentList.size();// ��ȡ���ѧ���ܸ���
		for (int i = 0; i < count; i++) {
			Student student = mStudentList.get(i);

			if (student.number == number) { // ���Ϊtrue��ʾ�ҵ�Ҫɾ����ѧ��
				return student;
			}
		}
		return null;
	}

	/**
	 * ����ѧ�Ų���ѧ��
	 */
	public void findStudentByNumber() {
		System.out.println("======����ѧ����Ϣ����=========");
		Scanner scaner = new Scanner(System.in);
		System.out.println("������ѧ��:");
		int number = scaner.nextInt();

		Student student = check(number);
		if (student == null) {
			System.out.println("�����ҵ�ѧ��Ϊ" + number + "��ѧ��������!");
		} else {
			System.out.println("===�����ҵ�ѧ����:" + student.name+"====");
		}
	}

	/**
	 * ��ʾ����ѧ��
	 */
	public void showAllStudent() {
		int count = mStudentList.size();// ��ȡ���ѧ���ܸ���
		System.out.println("����      ѧ��");
		for (int i = 0; i < count; i++) {
			Student student = mStudentList.get(i);
			System.out.println(student.name+"     "+ student.number);
		}
	}

	/**
	 * �˳�ѧ������ϵͳ
	 */
	public void exit() {
		System.out.println("====���Ѿ��˳�ѧ������ϵͳ====");
		System.exit(0);
		
	}
}
