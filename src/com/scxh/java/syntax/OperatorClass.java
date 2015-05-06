package com.scxh.java.syntax;

/**
 * �������ϰ
 * 
 * @author viktor.zhou
 * 
 */
public class OperatorClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OperatorClass operatorclass;
		operatorclass = new OperatorClass();

		operatorclass.mathOperator();
		System.out.println("=========================");
		operatorclass.relationOperator();
		System.out.println("=========================");
		operatorclass.bitOperator();
		System.out.println("=========================");
		operatorclass.conditionOperator();
	}

	/**
	 * ��ζ���һ������ ��һ���� �������η� �ڶ���: ��������ֵ���� ������: ��������
	 */
	public void mathOperator() {
		// ============��ѧ�����=================
		// ����
		int b = 1;
		int e = 2;
		int a = 3;
		e++; // e++ <=> e = e+1;

		System.out.println("e : " + e + "; a :" + (++a) + "; b :" + (b++));
		// �Լ�
		int f = 3;
		f--; // f-- <=> f = f-1;
		System.out.println("f :" + f);

	}

	public void relationOperator() {
		// ============�߼������==================
		boolean g = true;
		boolean h = false;

		boolean gh = g && h;

		boolean gg = true;
		boolean hh = true;

		boolean gghh = gg && hh;

		boolean ggghhh = false && false;

		System.out.println("g�� h ����������ֵ :" + gh + "  gghh :" + gghh
				+ " ggghhhh :" + ggghhh);

		// ����������Ϊtrueֵ=true, ���˶�Ϊfalse��ôֵ=false; ֻҪ��һ��Ϊfalse��ôֵ=false;

		boolean x = true || false;
		boolean xx = true || true;
		boolean xxx = false || false;
		System.out.println("(true || false) ������ֵ :" + x + "; (true || true) :"
				+ xx + "; (false || false) :" + xxx);
	}

	public void bitOperator() {
		// =================λ�����======================
		boolean y = true;
		boolean yy = !y;
		System.out.println("(!true) ������ֵ :" + yy + "(!false) ������ֵ :" + !false);

		int aa = 5 << 2; // 00000101 00010100 ; 0x2^0 + 0x2^1 + 1x2^2 + 0x2^3 +
							// 1x2^4 = 20
		System.out.println(" (5<<2) = " + aa);

		int bb = 5 >> 2; // 0000 0001
		System.out.println(" (5>>2) = " + bb);

		int i = 2;
		int j = 3;

		/**
		 * 0000 0010 2 & 0000 0011 3 --------------- 0000 0010 2
		 */
		int k = i & j;
		System.out.println(" (2&3) = " + k);

		/**
		 * 0000 0010 2 | 0000 0011 3 --------------- 0000 0011 3
		 */
		int kk = i | j;
		System.out.println(" (2|3) = " + kk);

		/**
		 * ~ 0000 0011 3 --------------- 1111 1100 -4
		 */
		byte kkk = ~3;
		System.out.println(" (~3) = " + kkk);

	}

	public void conditionOperator() {
		// =============���������====================
		boolean w = (100 > 10) ? true : false; // condition ? x1 : x2

		int ww = (100 < 10) ? 10 : 100;

		System.out.println("(100>10)?true:false : " + w + " (100<10)? 10:100 :"
				+ ww);
	}

}
