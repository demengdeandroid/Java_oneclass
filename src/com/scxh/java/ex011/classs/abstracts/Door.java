package com.scxh.java.ex011.classs.abstracts;
/**
 * ������  ��
 * 1.���г��󷽷�����϶��ǳ�����
 * 2.�����಻һ���г��󷽷�
 * 3.�����಻�ܱ�ʵ����
 * @author viktor
 *
 */
public abstract class Door { //�����ࣺ��abstract���β��ܱ�ʵ��������
	public String doorName;
	
	public int doorColor;
	
	public Door(){
		System.out.println("door ���췽��");
	}
	
	public abstract void open(); //���󷽷� ��  û�з����壬��abstract�ؼ������εķ����������󷽷�

	public abstract void close();
}
