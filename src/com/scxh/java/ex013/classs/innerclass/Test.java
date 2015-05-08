package com.scxh.java.ex013.classs.innerclass;

import com.scxh.java.ex013.classs.innerclass.OuterClass.InOuterClass;
import com.scxh.java.ex013.classs.innerclass.OuterClass.InnerClass;

public class Test{

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		outerClass.outerName = "�ⲿ��";
		outerClass.show();
		
		InnerClass innerClass = outerClass.new InnerClass();
		innerClass.innerName = "�ڲ���";
		innerClass.show();
		
		InOuterClass inOuterClass = new OuterClass.InOuterClass();
	}

}
