package com.scxh.java.ex015.mangesystem;

import java.util.Scanner;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Teacher teacher = new Teacher();
//		teacher.register();
//		teacher.login();

		Student student = new Student();

		System.out
				.println("====��ӭ����ѧ������ϵͳ��====== \n 1  ���ѧ��,2 ��ʾѧ���б�,3 ɾ��ѧ��,4 ����ѧ��,5  �˳�");

		Scanner scaner = new Scanner(System.in);

		for (int i = 0;; i++) {
			System.out.println("<�����������:>");
			int command = scaner.nextInt();
			switch (command) {
			case 1:
				student.addStudent();
				break;
			case 2:
				student.showAllStudent();
				break;
			case 3:
				student.deleteStudent();
				break;
			case 4:
				student.findStudentByNumber();
				break;
			case 5:
				student.exit();
				break;
			}
		}

	}

}
