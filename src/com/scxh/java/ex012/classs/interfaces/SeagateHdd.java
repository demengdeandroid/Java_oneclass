package com.scxh.java.ex012.classs.interfaces;
/**
 * ϣ��Ӳ��
 * @author viktor
 *
 */
public class SeagateHdd implements SataHdd {

	public String readData() {
		String content = "��ϣ��Ӳ�� ����������";
		return content;
	}

	public void writeData(String data) {
		System.out.println("��ϣ��Ӳ��д������ "+data);
	}

}
