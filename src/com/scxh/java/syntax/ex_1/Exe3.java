package com.scxh.java.syntax.ex_1;

import java.util.Scanner;

public class Exe3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("�����һ����ֵ��");
		
		Scanner reader = new Scanner(System.in); // ʵ����Scanner�����
		int year = reader.nextInt();

		System.out.println("����ڶ�����ֵ��");
		Scanner readers = new Scanner(System.in); // ʵ����Scanner�����
		int num = readers.nextInt();
		
		System.out.println("year " + year + " num :"+num);
		
		
	}

}
