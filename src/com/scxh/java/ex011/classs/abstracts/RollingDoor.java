package com.scxh.java.ex011.classs.abstracts;

/**
 * ������
 * 
 * @author viktor
 * 
 */
public class RollingDoor extends Door {

	public RollingDoor(){
		System.out.println("RollingDoor ���췽��");
	}
	
	@Override
	public void close() {
		System.out.println("�������ر�");

	}

	@Override
	public void open() {
		System.out.println("�����ƴ�");

	}

}
