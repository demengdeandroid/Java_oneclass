package com.scxh.java.ex015.mangesystem_db;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentImp {
	public String name; // ����
	public int number; // ѧ��

	public ArrayList<StudentImp> mStudentList = new ArrayList<StudentImp>();// �洢ѧ������

	private StudentDB db = StudentDB.getInstance();
	
	public StudentImp() {
	}

	public StudentImp(String name, int number) {
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
		String number = scaner.next();

		boolean isStudent = db.selectStudent(number);
		
		if(!isStudent ){
			StudentBean student = new StudentBean(name, number);
			db.addStudent(student);

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

		boolean isStudent = db.selectStudentByNumber(number);
		if (!isStudent) {
			System.out.println("�������ѧ��Ϊ" + number + "��ѧ��������!");
		} else {
			db.deleteStudentBean(number);
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

		
		boolean isStudent = db.selectStudentByNumber(number);
		
		if (!isStudent) {
			System.out.println("�����ҵ�ѧ��Ϊ" + number + "��ѧ��������!");
		} else {
			StudentBean student = db.seleStudentBeans(number);
			System.out.println("===�����ҵ�ѧ����  "+student.getName()+"====");
		}
	}

	/**
	 * ��ʾ����ѧ��
	 */
	public void showAllStudent() {
		System.out.println("���� "+" \t"+ " ѧ��");
		ArrayList<StudentBean> list = db.selectAllStudent();
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
