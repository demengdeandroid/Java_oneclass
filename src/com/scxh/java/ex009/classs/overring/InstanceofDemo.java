package com.scxh.java.ex009.classs.overring;
/**
 * instanceof �ؼ���ѧϰ
 * @author viktor
 *
 */
public class InstanceofDemo {
	public static void main(String[] args) {
		//������������������
		People obj = new Teacher("����ʦ");
		
		Teacher obj1 = (Teacher) obj; 
		
		if (obj1 instanceof People) {
			System.out.println("��������");
		}
		if (obj1 instanceof Teacher) {
			System.out.println("������ʦ");
		}
	}
}
