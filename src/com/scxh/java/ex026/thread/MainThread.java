package com.scxh.java.ex026.thread;

public class MainThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		
		System.out.println("�߳����� :"+mainThread.getName());
		
		mainThread.setName("���߳�");
		
		System.out.println("�����߳����� :"+mainThread.getName());
		
	}
	
}
