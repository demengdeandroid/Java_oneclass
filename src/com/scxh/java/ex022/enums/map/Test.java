package com.scxh.java.ex022.enums.map;

public class Test {
	public static final int YEAR = 2015;
	public static final int MONTH = 5;
	public static final int DATE = 15;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = "������" + YEAR + "��" + MONTH + "��" + DATE + "��";

		System.out.println(str);

		String strS = "������:" + Calendar.YEAR + "��" + Calendar.MONTH + "��" + Calendar.DATE + "��";

		System.out.println(strS);
		
		testEnum();

	}
	
	public static void testEnum(){
		Calendar a = Calendar.YEAR;
		String name = a.name();
		int order = a.ordinal();
		String value = a.toString();
		String str = "������" + name + "��" + order + "��" + value + "��";
		
		System.out.println(str);
		
		
	}

}
