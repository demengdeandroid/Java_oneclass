package com.scxh.java.ex015.mangesystem_db;

import java.util.Scanner;

public class StudentImpTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StudentImp studentImp = new StudentImp();

		System.out
				.println("====��ӭ����ѧ������ϵͳ��====== \n 1  ���ѧ��,2 ��ʾѧ���б�,3 ɾ��ѧ��,4 ����ѧ��,5  �˳�");

		Scanner scaner = new Scanner(System.in);

		for (int i = 0;; i++) {
			System.out.println("[�����������]:");
			int command = scaner.nextInt();
			switch (command) {
			case 1:
				studentImp.addStudent();
				break;
			case 2:
				studentImp.showAllStudent();
				break;
			case 3:
				studentImp.deleteStudent();
				break;
			case 4:
				studentImp.findStudentByNumber();
				break;
			case 5:
				studentImp.exit();
				break;
			}
		}

	}

}
