package com.scxh.java.mangesystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Teacher {
	public String name; // ����
	public String id; // �˺�
	public int passWord; // ����

	public ArrayList<Teacher> mList = new ArrayList<Teacher>(); // �洢ע���ʦ��Ϣ

	public Teacher() {

	}

	public Teacher(String name, String id, int passWord) {
		this.name = name;
		this.id = id;
		this.passWord = passWord;
	}

	/**
	 * ע��
	 */
	public void register() {
		Scanner scaner = new Scanner(System.in);
		System.out.println("����������:");
		String name = scaner.next();
		System.out.println("�������˺�");
		String id = scaner.next();
		System.out.println("����������:");
		int passWord = scaner.nextInt();

		Teacher teacher = new Teacher(name, id, passWord);
		mList.add(teacher);

		System.out.println("�û� " + teacher.name + "ע��ɹ�,�˺���" + teacher.id
				+ ",������" + teacher.passWord);
	}

	/**
	 * ��¼
	 */
	public void login() {
		Scanner scaner = new Scanner(System.in);
		System.out.println("�������¼�˺�");
		String id = scaner.next();
		System.out.println("�������¼����:");
		int passWord = scaner.nextInt();

		boolean flag = check(id,passWord);
		if (flag) {
			System.out.println("��¼�ɹ���");
		}else{
			System.out.println("��������˺Ŵ���,���������룡");
			login();
		}

	}

	/**
	 * ���������Ƿ���ڵ�ǰ��¼������˺�
	 * 
	 * @return
	 */
	public boolean check(String id, int passWord) {
		boolean flag = false;// ���Ϊtrue��ʾû���ҵ���false��ʾ�ҵ�
	
		int count = mList.size();  //��ȡArrayList���϶���mList��Ԫ�ظ���
		for (int i = 0; i < count; i++) {
			Teacher teacher = mList.get(i);
			
			if (id.equals(teacher.id) && passWord == teacher.passWord) {
				flag = true;
				break;
			}
		}
		
//		for(Teacher teacher : mList){
//			if (id.equals(teacher.id) && passWord == teacher.passWord) {
//				flag = true;
//				break;
//			}
//		}
		
		return flag;
	}
}
