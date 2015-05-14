package com.scxh.java.ex021.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.scxh.java.ex018.queue.ex01.Student;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSetDemo setDemo = new HashSetDemo();

		// setDemo.testHashMapPutAndGet();
		//		
		// setDemo.testHashSetAddAndIsEmpty();
		//	
		// setDemo.testHashSetcontains();

		// setDemo.testIterator();
		setDemo.testHashMapSwitchSet();
	}

	/**
	 * HashMap�������ȡ����
	 */
	public void testHashMapPutAndGet() {
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

		String name = stu.getName();

		System.out.println("���� :" + name);
	}

	/**
	 * HashSet �������ݣ�����Set�Ƿ�Ϊ��,��������ظ�����
	 */
	public void testHashSetAddAndIsEmpty() {
		Student stuA = new Student("����");
		Student stuB = new Student("����");
		Student stuC = new Student("����");
		Student stuD = new Student("����");

		HashSet<Student> sets = new HashSet<Student>();

		boolean isEmpty = sets.isEmpty();
		String result = isEmpty ? "û������" : "������";
		System.out.println(result);

		sets.add(stuA);
		sets.add(stuB);
		sets.add(stuC);
		sets.add(stuD);
		System.out.println("set���ݸ��� ǰ :" + sets.size());
		sets.add(stuD);// ��������ظ�����
		System.out.println("set���ݸ��� ��:" + sets.size());

		boolean isEmptys = sets.isEmpty();
		String results = isEmptys ? "û������" : "������";
		System.out.println(results);

	}

	/**
	 * HashSet contains������Clear����ѧϰ
	 */
	public void testHashSetcontains() {

		HashSet<Student> sets = new HashSet<Student>();

		Student stuA = new Student("����");
		Student stuB = new Student("����");
		Student stuC = new Student("����");
		Student stuD = new Student("����");

		sets.add(stuA);
		sets.add(stuB);

		boolean flag = sets.contains(stuB);
		if (flag) {
			System.out.println("�������Set��");
		} else {
			System.out.println("���󲻴���Set��");
		}

		sets.clear();

		boolean flags = sets.contains(stuB);
		if (flags) {
			System.out.println("�������Set��");
		} else {
			System.out.println("���󲻴���Set��");
		}

	}

	/**
	 * ����HashSet��������Iteratorʹ��
	 */
	public void testIterator() {
		Student stuA = new Student("����");
		Student stuB = new Student("����");
		Student stuC = new Student("����");
		Student stuD = new Student("����");

		HashSet<Student> sets = new HashSet<Student>();
		sets.add(stuA);
		sets.add(stuB);
		sets.add(stuC);
		sets.add(stuD);

		Iterator<Student> iterator = sets.iterator();

		while (iterator.hasNext()) {
			Student stu = iterator.next();
			String name = stu.getName();
			System.out.println("���� :" + name);
		}

	}

	/**
	 * ����HashMap,������Iteratorʹ��
	 */
	public void testHashMapSwitchSet() {
		Student stuA = new Student("����");
		Student stuB = new Student("����");
		Student stuC = new Student("����");
		Student stuD = new Student("����");

		HashMap<String, Student> map = new HashMap<String, Student>();
		map.put("����", stuA);
		map.put("����", stuB);
		map.put("����", stuC);
		map.put("����", stuD);

		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			Student stu = map.get(key);
			String name = stu.getName();
			System.out.println("���� :" + name);
		}
	}

	public void testArrayListIterator() {
		Student stuA = new Student("����");
		Student stuB = new Student("����");
		Student stuC = new Student("����");
		Student stuD = new Student("����");

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(stuA);
		list.add(stuB);
		list.add(stuC);
		list.add(stuD);

//		int count = list.size();
//		for (int i = 0; i < count; i++) {
//			Student stu = list.get(i);
//			String name = stu.getName();
//			System.out.println("���� :" + name);
//		}

		Iterator<Student> iterator = list.iterator();

		while (iterator.hasNext()) {
			Student stu = iterator.next();
			String name = stu.getName();
			System.out.println("���� :" + name);
		}
	}

}
