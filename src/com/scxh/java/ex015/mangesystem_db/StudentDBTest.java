package com.scxh.java.ex015.mangesystem_db;

import java.util.ArrayList;


public class StudentDBTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StudentBean student = new StudentBean("����","1003");
		
		StudentDB db = StudentDB.getInstance();
//		db.addStudent(student);
		
//		db.updateStudentBean(student, "1001");

		
//		boolean result = db.selectStudent("����");
//		if(result){
//			System.out.println("�Ѵ��ڣ�");
//		}else{
//			System.out.println(" �����ڣ�");
//		}
		
		
//		System.out.println("���� "+" \t"+ " ѧ��");
//		ArrayList<StudentBean> list = db.selectAllStudent();
//		for(StudentBean students : list){
//			System.out.println(students.getName()+"\t"+students.getNumber());
//		}
		
		db.deleteStudentBean("1003");
		
		
		System.out.println("���� "+" \t"+ " ѧ��");
		ArrayList<StudentBean> list = db.selectAllStudent();
		for(StudentBean students : list){
			System.out.println(students.getName()+"\t"+students.getNumber());
		}
		
	}

}
