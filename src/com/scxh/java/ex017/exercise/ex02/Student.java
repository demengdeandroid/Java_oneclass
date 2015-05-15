package com.scxh.java.ex017.exercise.ex02;

public class Student implements Comparable<Student> {
	private String name;
	private int number;

	public Student(String name, int number) {
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public int compareTo(Student o) {
		int newNumber = o.getNumber(); //ָ���Ƚϵ�ѧ������
		int currenNumber = this.number;   //��ǰ����
		return currenNumber > newNumber ? 1 : -1;
	}

}
