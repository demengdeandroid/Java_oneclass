package com.scxh.java.ex027.thread;

/**
 * ��Ʒ�࣬����� ���� put ���� get
 * 
 * @author viktor
 * 
 */
public class Q {
	int n;

	synchronized int get() {
		int p = (int) (Math.random()*3)+1;
		n = n - p;
		
		if(n < 6){
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		}
		
		System.out.println("������ ���ѵ�"+(n+1)+"��Ʒ ");
		
		return n;
	}

	synchronized void put() {
		int p = (int) (Math.random()*3)+1;
		n = p + n;
		if(n > 20){
			notify();
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		}
		System.out.println("������ ������"+n+"��Ʒ ");
		
	}

}
