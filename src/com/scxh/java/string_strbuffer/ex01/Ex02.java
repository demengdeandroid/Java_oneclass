package com.scxh.java.string_strbuffer.ex01;
/**
 * String�� �����ַ���
 * @author viktor
 *
 */
public class Ex02 {

	public static void main(String[] args) {
		int a = 10;
		char b = '��';
		
		char[] arrayB = new char[4];
		arrayB[0] = '��';
		arrayB[1] = '��';
		arrayB[2] = '��';
		arrayB[3] = '��';
		
		for(char array:arrayB){
			System.out.print(array);
		}
		
		System.out.println("===========");
		
		
		String str = "�Ĵ��»�";
		System.out.println("���� String :"+str);
		
		String stry = new String(arrayB);
		System.out.println("new String :"+stry);
		
		System.out.println(str+"�ַ��������� "+str.length());
		
		
		System.out.println(str+"�ַ�������� \"��\"�ַ� "+"\""+str.charAt(1)+"\"");
		
		System.out.println("" + str.contains("����"));
		
		
		String str1 = "�й������»�";
		String str2 = str1.replace("�й�����", "�Ĵ�");
		System.out.println("str2  :"+str2);
		
		String str3 = "�й�;����;�»�";
		String[] str4;
		str4 = str3.split(";");
		
		for(String array:str4){
			System.out.println(array);
		}
		
		
	}

}
