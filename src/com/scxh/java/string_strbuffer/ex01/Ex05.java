package com.scxh.java.string_strbuffer.ex01;

/**
 * String,StringBuilder,StringBuffer ��������ϵ
 * 
 * @author viktor
 * 
 */
public class Ex05 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "�Ĵ��»�"; // ��������������ʹ�� String��
		str = "�й�" + str;
		System.out.println(str);
		
		//======================================
		StringBuffer strBuffer = new StringBuffer();// ���̲߳�����������ʹ�� StringBuffer��

		strBuffer.append("�й�");
		strBuffer.append("�Ĵ��»�");
		System.out.println(strBuffer);

		StringBuffer str1 = new StringBuffer("�Ĵ�����");
		str1.append("ѧУ");
		System.out.println("str1  :" + str1);

		str1.insert(2, "�»�");
		System.out.println("str1  :" + str1);

		str1.delete(4, 6);

		System.out.println("str1  :" + str1);

		str1.setCharAt(0, '��');
		str1.setCharAt(1, '��');

		System.out.println("str1  :" + str1);

		str1.replace(0, 2, "�Ĵ�");

		System.out.println("str1  :" + str1);

		//===============================
		StringBuilder strBuidler = new StringBuilder(); // ���̲߳�����������ʹ��
		// StringBuilder��
		strBuidler.append("�Ĵ���");

	}
}
