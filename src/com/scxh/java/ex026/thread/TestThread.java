package com.scxh.java.ex026.thread;

public class TestThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Thread mainThread = Thread.currentThread();
		mainThread.setName("main");
		
		MyThread myThread = new MyThread(); // �����߳�
		myThread.setName("one");
		myThread.start(); // ����״̬

		System.out.println(myThread.isAlive() ? "one �߳���������" : "���߳�ֹͣ����");

		
//		try {
//			myThread.join();
//		} catch (InterruptedException e1) {
//			e1.printStackTrace();
//		}
		
		System.out.println(myThread.isAlive() ? "one �߳���������" : "���߳�ֹͣ����");
		
		if (myThread.isAlive() == false) {
		
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("ִ�����߳�");
			}
		}
	}

}
