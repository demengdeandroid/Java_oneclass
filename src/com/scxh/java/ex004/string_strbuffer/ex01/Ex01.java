package com.scxh.java.ex004.string_strbuffer.ex01;

import com.scxh.java.ex006.classs.class_object.Student;
import com.scxh.java.ex010.classs.overring.Dog;


/**
 * ���鶨���� ����length����
 * @author viktor
 *
 */
public class Ex01 {
	public static void main(String[] args){
		//typeName[] ������   ;   typeName ������[]
		int[] array = new int[5];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
//		int[] a = {1,2,3,4,5};
		
		int length = array.length;
		for(int i = 0; i < length; i++){
			System.out.println("�����"+(i+1)+"��Ԫ�� :"+array[i]);
		}
		
//		Student stuB;
//		stuB = new Student();
		
		Student stuB = new Student();
		stuB.name = "С��";
		
	}
}
