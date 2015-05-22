package com.scxh.java.ex027.thread.product_consumer;

/**
 * 1����д���߳�Ӧ�ó���ģ������ͨ��һ��ɽ����ģ�⡣���ɽ��ÿ��ֻ��ͨ��һ���ˣ�
 * ÿ����ͨ��ɽ����ʱ��Ϊ5�룬�������10���ˣ�ͬʱ׼������ɽ������ʾһ��ÿ��ͨ��ɽ���˵�������
 * 
 * @author viktor
 * 
 */
class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}
}

public class Cave {

	public synchronized void passCave(Person person) {
		
		System.out.println(person.name+"����ͨ��ɽ����...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(person.name+"ͨ��ɽ���ɹ�!");
	
	}
}

class CavePerson implements Runnable {
	Person person;
	Cave cave;

	CavePerson(Cave cave,Person person) {
		this.cave = cave;
		this.person = person;
		new Thread(this).start();
	}

	public void run() {
		cave.passCave(person);
		
	}

}

class TestPassCave{
	
	public static void  main(String[] argss){
		String[] perArray = {"����","����","����","С��","С��","С��","����","����","����","ɳɳ"};
	    RandomNumber randomNumber=new RandomNumber();
        int c[]=randomNumber.ranNumber();
        
        Cave cave = new Cave();
        for(int d:c){
        	Person person = new Person(perArray[d]);
        	
        	new CavePerson(cave,person);
        }
		
		
	}
}