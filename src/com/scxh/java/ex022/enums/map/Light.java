package com.scxh.java.ex022.enums.map;
/**
 * <<ʵ�ֺ�ơ��̵ƺͻƵƣ���ʾ�����ֵ>>
 * ����ͨ�����캯���͸�дtoString ������ʵ�֡�
 * 1.���ȸ�Light ö���������ӹ��췽��.
 * 2.Ȼ��ÿ��ö�����͵�ֵͨ�����캯�������Ӧ�Ĳ�����
 * 3.ͬʱ��дtoString �������ڸ÷����з��شӹ��캯���д���Ĳ���
 * @author viktor
 *
 */
public enum Light {
	// ���ù��캯������
	RED(1), GREEN(3), YELLOW(2);

	// ����˽�б���
	private int nCode;

	// ���캯����ö������ֻ��Ϊ˽��
	private Light(int _nCode) {
		this.nCode = _nCode;
	}

	@Override
	public String toString() {
		return String.valueOf(this.nCode);
	}
}