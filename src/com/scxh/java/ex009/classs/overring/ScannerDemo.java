package com.scxh.java.ex009.classs.overring;

import java.util.Scanner;

public class ScannerDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("请输入学生姓名:");
		String str = read.next();
		
		System.out.println("控制台输入的数据是 :"+str);
	}

}
