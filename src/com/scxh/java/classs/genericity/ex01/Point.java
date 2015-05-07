package com.scxh.java.classs.genericity.ex01;

public class Point<T1, T2> {
	T1 x;
	T2 y;

	public T1 getX() {
		return x;
	}

	public void setX(T1 x) {
		this.x = x;
	}

	public T2 getY() {
		return y;
	}

	public void setY(T2 y) {
		this.y = y;
	}

	// ���巺�ͷ���
	@SuppressWarnings("hiding")
	public <T1, T2> void printPoint(T1 x, T2 y) {
		T1 m = x;
		T2 n = y;
		System.out.println("This point is��" + m + ", " + n);
	}

}
