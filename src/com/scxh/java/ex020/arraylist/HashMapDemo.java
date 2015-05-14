package com.scxh.java.ex020.arraylist;

import java.util.ArrayList;
import java.util.HashMap;

import com.scxh.java.ex018.queue.ex01.Student;

public class HashMapDemo {
	ArrayList<Student> list = new ArrayList<Student>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMapDemo demo = new HashMapDemo();
		
		demo.addStudentToArryList();

		Student stu = demo.findStudentByName("С��");

		if (stu == null) {
			System.out.println("û���ҵ�����Ҫ����");
		} else {
			System.out.println("���� :" + stu.getName());
		}
		
		demo.testHashMapAddAndFind();
	}

	/**
	 * ���ѧ����ArrayList
	 */
	public void addStudentToArryList() {
		Student stuA = new Student("����");
		Student stuB = new Student("����");
		Student stuC = new Student("����");
		Student stuD = new Student("����");

		list.add(stuA);
		list.add(stuB);
		list.add(stuC);
		list.add(stuD);

	}

	/**
	 * ͨ����������ѧ������
	 */
	public Student findStudentByName(String stuName) {
		int count = list.size();
		Student student = null;
		for (int i = 0; i < count; i++) {
			Student stu = list.get(i);
			String name = stu.getName();
			if (stuName.equals(name)) {
				student = stu;
				break;
			}

		}

		return student;
	}
	
	public void testHashMapAddAndFind(){
		Student stuA = new Student("����");
		Student stuB = new Student("����");
		Student stuC = new Student("����");
		Student stuD = new Student("����");
		
		HashMap<String, Student> map = new HashMap<String, Student>();
		map.put("����", stuA);
		map.put("����", stuB);
		map.put("����", stuC);
		map.put("����", stuD);
		
		Student stu = map.get("����");
		System.out.println("���� :"+stu.getName());
	}

}
