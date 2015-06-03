package com.scxh.java.ex015.mangesystem_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class StudentDB {
	private static StudentDB USS = null;
	// ����������
	private String driver = "com.mysql.jdbc.Driver";
	// URLָ��Ҫ���ʵ����ݿ���mydata
	private String url = "jdbc:mysql://localhost:3306/scxh";
	// MySQL����ʱ���û���
	private String user = "root";
	// MySQL����ʱ������
	private String password = "a123";

	public static StudentDB getInstance() {
		if (USS == null) {
			USS = new StudentDB();
		}
		return USS;
	}

	private StudentDB(){
		// ������������
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	/**
	 * ���ݿ�����
	 */
	public Connection getConnection() {
		Connection connect = null;
		try {
			connect = (Connection) DriverManager.getConnection(url, user,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connect;
	}
	/**
	 * ���ѧ���������ݿ�
	 * @param student
	 */
	public void addStudent(StudentBean student) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "insert into students (name,number)values(?,?)";
		try {
			con = getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, student.getName());
			ps.setString(2, student.getNumber());
			ps.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException sqle) {
			}
			if (con != null)
				freeConnection(con);
		}
	}
	/**
	 * ����ѧ�������ж�ѧ���Ƿ����
	 * @param studentName
	 * @return
	 */
	public boolean selectStudent(String studentName) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "select * from students where name=?";
		boolean fals = false;
		try {
			con = getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, studentName);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				fals = true;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException sqle) {
			}
			if (con != null)
				freeConnection(con);
		}
		return fals;
	}
	
	/**
	 * ����ѧ��ѧ���ж�ѧ���Ƿ����
	 * @param number
	 * @return
	 */
	public boolean selectStudentByNumber(String number) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "select * from students where number=?";
		boolean fals = false;
		try {
			con = getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, number);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				fals = true;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException sqle) {
			}
			if (con != null)
				freeConnection(con);
		}
		return fals;
	}
	/**
	 * �޸�ѧ����Ϣ
	 * @param student
	 */
	public void updateStudentBean(StudentBean student,String oldNumber) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "update students set name=?,number=? where number=?";
		try {
			con = getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, student.getName());
			ps.setString(2, student.getNumber());
			ps.setString(3, oldNumber);
			ps.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException sqle) {
			}
			if (con != null)
				freeConnection(con);
		}
	}
	/**
	 * ɾ��ѧ����Ϣ
	 * @param number
	 */
	public void deleteStudentBean(String number) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "delete from students where number=?";
		try {
			con = getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, number);
			ps.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException sqle) {
			}
			if (con != null)
				freeConnection(con);
		}
	}
	/**
	 * ��ѯ����ѧ����Ϣ
	 * @return
	 */
	public ArrayList<StudentBean> selectAllStudent() {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "select * from students";
		ArrayList<StudentBean> mList = new ArrayList<StudentBean>();
		try {
			con = getConnection();
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				StudentBean student = new StudentBean();
				
				student.setName(rs.getString("name"));
				student.setNumber(rs.getString("number"));
				
				mList.add(student);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException sqle) {
			}
			if (con != null)
				freeConnection(con);
		}
		return mList;
	}
	/**
	 * ����ѧ�Ų���ѧ��
	 * @param number
	 * @return
	 */
	public StudentBean seleStudentBeans(String number) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "select * from students where number =?";
		StudentBean student = new StudentBean();
		try {
			con = getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, number);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				student.setName(rs.getString("name"));
				student.setNumber(rs.getString("number"));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException sqle) {
			}
			if (con != null)
				freeConnection(con);
		}
		return student;

	}
	
	public void freeConnection(Connection con){
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
