package com.scxh.java.ex015.mangesystem_db;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentImp {
	private StudentDB mDB = StudentDB.getInstance();
	/**
	 * ���ѧ��
	 */
	public void addStudent() {
		System.out.println("======���ѧ����Ϣ����=========");
		Scanner scaner = new Scanner(System.in);
		System.out.println("����������:");
		String name = scaner.next();
		System.out.println("������ѧ��:");
		String number = scaner.next();

		boolean isStudent = mDB.selectStudent(number);
		
		if(!isStudent ){
			StudentBean student = new StudentBean(name, number);
			mDB.addStudent(student);

			System.out.println("======��ӳɹ� ! ѧ�������� :" + student.getName() + ",ѧ���� : "
					+ student.getNumber()+"=========");
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
		String number = scaner.next();

		boolean isStudent = mDB.selectStudentByNumber(number);
		if (!isStudent) {
			System.out.println("�������ѧ��Ϊ" + number + "��ѧ��������!");
		} else {
			mDB.deleteStudentBean(number);
			System.out.println("====ɾ��ѧ���ɹ�!ѧ����:" + number + "��ѧ���Ѵ�ѧ������ϵͳ��ɾ��====");
		}
	}


	/**
	 * ����ѧ�Ų���ѧ��
	 */
	public void findStudentByNumber() {
		System.out.println("======����ѧ����Ϣ����=========");
		Scanner scaner = new Scanner(System.in);
		System.out.println("������ѧ��:");
		String number = scaner.next();

		
		boolean isStudent = mDB.selectStudentByNumber(number);
		
		if (!isStudent) {
			System.out.println("�����ҵ�ѧ��Ϊ" + number + "��ѧ��������!");
		} else {
			StudentBean student = mDB.seleStudentBeans(number);
			System.out.println("===�����ҵ�ѧ����  "+student.getName()+"====");
		}
	}

	/**
	 * ��ʾ����ѧ��
	 */
	public void showAllStudent() {
		System.out.println("���� "+" \t"+ " ѧ��");
		ArrayList<StudentBean> list = mDB.selectAllStudent();
		for(StudentBean students : list){
			System.out.println(students.getName()+"\t"+students.getNumber());
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
