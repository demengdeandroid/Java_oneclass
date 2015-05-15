package com.scxh.java.ex021.collection.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSetDemo setDemo = new HashSetDemo();

		// setDemo.testHashMapPutAndGet();
		//		
		// setDemo.testHashSetAddAndIsEmpty();
		//	
		// setDemo.testHashSetcontains();

		// setDemo.testIterator();
//		setDemo.testHashMapSwitchSet();
		setDemo.testArrayListIterator();
	}

	
	/**
	 * HashMap�������ȡ����
	 */
	public void testHashMapPutAndGet() {
		Student stuA = new Student("����",1);
		Student stuB = new Student("����",2);
		Student stuC = new Student("����",3);
		Student stuD = new Student("����",4);

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
		Student stuA = new Student("����",1);
		Student stuB = new Student("����",2);
		Student stuC = new Student("����",3);
		Student stuD = new Student("����",4);

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

		Student stuA = new Student("����",1);
		Student stuB = new Student("����",2);
		Student stuC = new Student("����",3);
		Student stuD = new Student("����",4);

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
		Student stuA = new Student("����",1);
		Student stuB = new Student("����",2);
		Student stuC = new Student("����",3);
		Student stuD = new Student("����",4);

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
			if (name.equals("����")) {
				iterator.remove();
			}
		}

		iterator = sets.iterator();

		System.out.println(iterator.hasNext() ? "������" : "������");

		while (iterator.hasNext()) {
			Student stu = iterator.next();
			String name = stu.getName();

			System.out.println("����111 :" + name);
		}
	}

	/**
	 * ����HashMap,������Iteratorʹ��
	 */
	public void testHashMapSwitchSet() {
		Student stuA = new Student("����",1);
		Student stuB = new Student("����",2);
		Student stuC = new Student("����",3);
		Student stuD = new Student("����",4);

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
		Student stuA = new Student("����",1);
		Student stuB = new Student("����",9);
		Student stuC = new Student("����",8);
		Student stuD = new Student("����",4);

		List<Student> list = new ArrayList<Student>();
		list.add(stuA);
		list.add(stuB);
		list.add(stuC);
		list.add(stuD);

		//===============for ����================
		int count = list.size();
		for (int i = 0; i < count; i++) {
			Student stu = list.get(i);
			String name = stu.getName();
			System.out.println("for ���� ���� :" + name);
		}

		//===============================
		
		
		Collections.sort(list, new Comparator<Student>() {
			public int compare(Student arg0, Student arg1) {
				//����ѧ��Num���бȽ�
				return arg0.getNum().compareTo(arg1.getNum());
				
//				if(arg0.getNum()>arg1.getNum()){
//					return 1;
//				}else{
//					return 0;
//				}
			}
		});

		
		//===============Iterator ����================
		Iterator<Student> iterator = list.iterator();

		while (iterator.hasNext()) {
			Student stu = iterator.next();
			String name = stu.getName();
			System.out.println("Iterator ����  ���� :" + name);
		}
	}

}
