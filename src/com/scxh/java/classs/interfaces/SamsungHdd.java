package com.scxh.java.classs.interfaces;
/**
 * ����Ӳ��
 * @author viktor
 *
 */
public class SamsungHdd implements SataHdd,FixHdd {

	public String readData() {
		String content = "������Ӳ�� ����������";
		return content;
	}

	public void writeData(String data) {
		System.out.println("������Ӳ��д������ "+data);
	}

	public boolean doFix() {
		System.out.println("ά��Ӳ��");
		return false;
	}

}
