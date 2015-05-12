package com.scxh.java.queue.ex01;

import java.util.LinkedList;

/**
 * �Զ������
 * 
 * @author viktor
 * 
 */
public class MyQueue {
	private LinkedList<Student> list = new LinkedList<Student>();

	/**
	 * �Ӷ�β�������
	 */
	public void add(Student student) {
		list.addLast(student);
	}

	/**
	 * �Ӷ�ͷ��ȡԪ��
	 */
	public Student get() {
		Student student = list.getFirst();
		return student;
	}

	/**
	 * ���ض��д�С
	 * 
	 * @return
	 */
	public int size() {
		return list.size();
	}

	/**
	 * ��ն���
	 */
	public void clear() {
		list.clear();
	}
}
