package com.scxh.java.ex017.exercise.ex01;

/**
 * �����������:   new ����();
 * 1.������  -> ��ʼ����̬����       ������м̳й�ϵ �ȳ�ʼ�����ྲ̬����  -> ��ʼ�����ྲ̬������
 * 2.ִ�й��췽�� -> ��ʼ����Ա����      ������м̳й�ϵ ��ִ�и��๹�췽�� ->��ʼ�������Ա������
 * 
 * 
 * @author viktor
 *
 */

public class Demo {

	public static void main(String[] args) {
		Father obj = new Son();  //����Son����
		
		System.out.println(obj.str);
		obj.show();
		
		Son son = (Son)obj;
		son.hello();
	}

}
