package com.scxh.java.ex009.classs.overring;

/**
 * ����ת��
 * ����ת��
 */
public class Demo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//������������������
		People obj = new Teacher("����ʦ");// ����������Ϊ��������ͣ�ȴ��������Ķ���������̾�������ת��
		obj.say();
		
		System.out.println(obj.name);
		
		
		Teacher obj1 = (Teacher) obj; // ������ת�ͺ�����������ת�����࣬��������ķ��������������ת�͡�
		
		System.out.println(obj1.name);
		obj1.show();
	}

}
