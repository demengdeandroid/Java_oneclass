package com.scxh.java.classs.interfaces;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SataHdd sam = new SamsungHdd();
		sam.writeData("����Ӳ��");
		sam.readData();
		
		SataHdd sea = new SeagateHdd();
		sea.writeData("ϣ��Ӳ��");
		sea.readData();
		
		
		Demo d = new Demo();
		d.show(sam);
	}
	
	public void show(SataHdd hdd){
		hdd.writeData("����Ӳ��");
	}

}
