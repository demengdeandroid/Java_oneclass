package com.scxh.java.syntax;
/**
 * ��������������ϰ
 * @author viktor.zhou
 *
 */
public class DataClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 // �ַ���
		char webName1 = '��';
		char webName2 = '��';
		char webName3 = 'Է';
		System.out.println("��վ�������ǣ�" + webName1 + webName2 + webName3);
	
		// ����
		short x=22;  // ʮ����
		int y=022;  // �˽���
		long z=0x22L;  // ʮ������
		System.out.println("ת����ʮ���ƣ�x = " + x + ", y = " + y + ", z = " + z);
		
		// ������
		float m = 22.45f;
		double n = 10;
		System.out.println("����˻���" + m + " * " + n + "=" + m*n);

		//������
		boolean a = 100>10;
		boolean b = 100<10;
		System.out.println("100>10 = " + a);
		System.out.println("100<10 = " + b);

	}

}
