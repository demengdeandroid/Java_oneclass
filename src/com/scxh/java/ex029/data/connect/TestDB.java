package com.scxh.java.ex029.data.connect;

public class TestDB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("����");
		student.setNumber(1005);
		student.setPassWord("abcd");
		student.setAge("13��");
		student.setSex("��");

		DBUtil db = new DBUtil();
		db.connectDB();
		
//		db.addStudent(student);
		db.inSertStudent(student);
		db.selectStudent();
		
		
//		Student studentA = new Student();
//		studentA.setName("����");
//		studentA.setNumber(2001);
//		db.updateStudentById(studentA, 29);
//		
//		db.selectStudent();
		
		db.closeDB();
	}

}
