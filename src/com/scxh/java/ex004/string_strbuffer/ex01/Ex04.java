package com.scxh.java.ex004.string_strbuffer.ex01;
/**
 * String�� equals ��  == ����
 * @author viktor
 *
 */
public class Ex04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = new String("�Ĵ�");
		String str2 = new String("�Ĵ�");
		
		int a = 10;
		int b = 10;
		if(a == b){
			System.out.println("a == b :"+(a == b));
		}else{
			System.out.println("!a == b :"+(a == b));
		}
		
		if(str1.equals(str2)){
			System.out.println("str1.==(str2) :"+(str1.equals(str2)));
					
		}else{
			System.out.println("! str1.==(str2) :"+(str1.equals(str2)));
		}

	}

}
