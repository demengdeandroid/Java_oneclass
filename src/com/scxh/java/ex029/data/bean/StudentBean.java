package com.scxh.java.ex029.data.bean;

public class StudentBean {
	private String name; // ����
	private String number; // ѧ��

	public StudentBean() {

	}

	public StudentBean(String name, String number) {
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
