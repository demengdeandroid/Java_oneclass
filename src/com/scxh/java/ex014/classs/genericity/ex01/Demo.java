package com.scxh.java.ex014.classs.genericity.ex01;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Point<String, String> point = new Point<String, String>();
		point.setX("����180��");
		point.setY("��γ210��");

		Point<Integer, Integer> point1 = new Point<Integer, Integer>();
		point1.setX(10);
		point1.setY(10);

		Point<Double, String> point2 = new Point<Double, String>();
		point2.setX(12.88);
		point2.setY("��γ210��");

		point.printPoint(point.getX(), point.getY());
		
		point1.printPoint(point1.getX(), point1.getY());
		
		point2.printPoint(point2.getX(), point2.getY());
		

	}

}
