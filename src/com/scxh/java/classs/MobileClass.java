package com.scxh.java.classs;

/**
 * ���������ϰ 
 * ʲô����Ͷ���
 * 
 * @author viktor.zhou
 * 
 */
public class MobileClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ��������

		Mobile samMobile; // ����������һ�����󣬰����������ƺͶ������͡�
		samMobile = new Mobile("�����ֻ�", "1024x768", "��ɫ"); // ʵ������ʹ�ùؼ���new������һ������
		// �����������ֵ

		System.out.println("�ֻ����� :" + samMobile.name + "\n �ֻ���С :"
				+ samMobile.size + "\n �ֻ���ɫ :" + samMobile.color);

		Mobile mtMobile;
		mtMobile = new Mobile("Ħ���ֻ�", "480x800", "��ɫ");
		// �����������ֵ

		System.out.println("�ֻ����� :" + mtMobile.name + "\n �ֻ���С :"
				+ mtMobile.size + "\n �ֻ���ɫ :" + mtMobile.color);

	}

}
