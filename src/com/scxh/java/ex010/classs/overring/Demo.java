package com.scxh.java.ex010.classs.overring;

/**
 * ��Java�У�ͬһ�����еĶ��������������ͬ�����֣�ֻҪ���ǵĲ����б�ͬ�Ϳ��ԣ��ⱻ��Ϊ��������(method overloading)��
 * 
 * �����б��ֽв���ǩ�����������������͡������ĸ����Ͳ�����˳��ֻҪ��һ����ͬ�ͽ��������б�ͬ��
 * 
 * ��������������һ���������ԡ�
 * 
 * @author viktor
 * 
 */
public class Demo {
	// һ����ͨ�ķ�������������
	void test() {
		System.out.println("No parameters");
	}

	// ��������ķ��������Ҵ���һ�����Ͳ���
	void test(int a) {
		System.out.println("a: " + a);
	}

	// ��������ķ��������Ҵ�����������
	void test(int a, int b) {
		System.out.println("a and b: " + a + " " + b);
	}
	
	void test(double a, int b) {
		System.out.println("a and b: " + a + " " + b);
	}
	
	void test(int b, double a) {
		System.out.println("a and b: " + a + " " + b);
	}

	// ��������ķ��������Ҵ���һ��˫���Ȳ���
	double test(double a) {
		System.out.println("double a: " + a);
		return a * a;
	}

	public static void main(String args[]) {
		Demo obj = new Demo();
		obj.test();
		obj.test(2);
		obj.test(2, 3);
		obj.test(2.0);
	}
}
