package com.scxh.java.ex003.syntax.ex_1;

/**
 * ���1��100��ǰ5�����Ա�3����������
 * 
 * @author viktor.zhou
 * 
 */
public class Exe2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int b = 1;
		int count = 0; //������
		while (b <= 100) {
			if (b % 3 == 0) {
				System.out.println(" b = " + b);
//				count = count + 1;
				++count;
			}
			if(count == 5){
				break;
			}
//			b = b + 1;
			++b;

		}

		System.out.println("ѭ������");
	}

}
