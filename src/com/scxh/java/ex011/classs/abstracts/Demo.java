package com.scxh.java.ex011.classs.abstracts;

public class Demo {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RollingDoor door = new RollingDoor();
		door.doorName = "������";
		door.open();
		door.close();
		
		SlidingDoor slingDoor = new SlidingDoor();
		slingDoor.doorName = "������";
		slingDoor.open();
		slingDoor.close();

	}

}
