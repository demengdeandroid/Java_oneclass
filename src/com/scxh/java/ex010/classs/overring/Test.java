package com.scxh.java.ex010.classs.overring;

public class Test {

	public static void main(String[] args) {
		Dog dog = new Dog("С��",2);
		String name = dog.name;
		dog.hungry(name);
		
		Dog dogH = new Dog("С��",3,"hungry");
		String nameH = dogH.name;
		dogH.hungry(nameH);
		
		Dog dogHei = new Dog();
		dogHei.hungry("С��");
		
		
	}
	

}
