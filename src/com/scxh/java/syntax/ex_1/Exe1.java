package com.scxh.java.syntax.ex_1;

import com.scxh.java.classs.ex02.Student;

/**
 * ���1��100��ǰ5�����Ա�3����������
 * 
 * @author viktor.zhou
 * 
 */
public class Exe1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int b = 0;
		do {
			b = b + 1;
		} while (b < 5);

		System.out.println("ѭ\\������\n��һ��\"Java\"����");
		
		byte a=(byte)128;  //aֵ��-128
		byte c=(byte)(-129);  //cֵ��127
		
		System.out.println("a :"+a + " c :"+c);
		
	}

}
