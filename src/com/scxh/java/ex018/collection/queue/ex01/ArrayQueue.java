package com.scxh.java.ex018.collection.queue.ex01;

public class ArrayQueue {
	private Student[] list = new Student[3];
	private int i = -1;
	private int j = -1;

	/**
	 * �Ӷ�β�������
	 */
	public void add(Student student) {
		++i;
		if (i < list.length) {
			list[i] = student;
		} else {
			System.out.println("��������");
		}
	}

	/**
	 * �Ӷ�ͷ��ȡԪ��
	 */
	public Student get() {
		Student student = null;
		++j;
		if(j < list.length){
			student = list[j];
		}
		return student;
		
	}

	/**
	 * ���ض��д�С
	 * 
	 * @return
	 */
	public int size() {
		return list.length;
	}

	/**
	 * ��ն���
	 */
	public void clear() {
		for (int i = 0; i < list.length; i++) {
			list[i] = null;
		}
	}
}
