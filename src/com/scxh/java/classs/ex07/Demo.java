package com.scxh.java.classs.ex07;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		People obj = new Teacher("����ʦ");//����������Ϊ��������ͣ�ȴ��������Ķ���������̾�������ת��
		obj.say();
		
		Teacher obj1 = (Teacher)obj; //������ת�ͺ�����������ת�����࣬��������ķ��������������ת�͡�
		obj1.show();
		if(obj1 instanceof People){
			System.out.println("��������");
		}
		if(obj1 instanceof Teacher){
			System.out.println("������ʦ");
		}
	}

}







