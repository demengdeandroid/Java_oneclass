package com.scxh.java.classs.abstracts;
/**
 * ������
 * @author viktor
 *
 */

public class SlidingDoor extends Door{

	@Override
	public void close() {
		System.out.println("�����ر���");
	}

	@Override
	public void open() {
		System.out.println("�ƶ�����");
	}

}
