package com.scxh.java.ex027.thread;

/**
 * ��Ʒ�࣬����� ���� put ���� get
 * 
 * @author viktor
 * 
 */
public class Product {
	int n;
	boolean valueSet = false;

	synchronized int get() {

		if (!valueSet){
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		}
		System.out.println("������ ���ѵ�"+(n+1)+"��Ʒ ");
		valueSet = false;
		notify();
		return n;
	}

	synchronized void put(int n) {
		if (valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		this.n = n;
		valueSet = true;
		System.out.println("������ ������"+(n+1)+"��Ʒ ");
		notify();
	}

}
