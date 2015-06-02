package com.scxh.java.ex029.data.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	// ����������
	private String driver = "com.mysql.jdbc.Driver";
	// URLָ��Ҫ���ʵ����ݿ���mydata
	private String url = "jdbc:mysql://localhost:3306/scxh";
	// MySQL����ʱ���û���
	private String user = "root";
	// MySQL����ʱ������
	private String password = "a123";

	private static DBUtil DB = new DBUtil();

	/**
	 * ���ģʽ ֮����ģʽ
	 * 
	 * @return
	 */
	public static DBUtil getInstance() {
		if (DB == null) {
			DB = new DBUtil();
		}

		return DB;
	}

	private DBUtil() {
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
	public Connection getConnectDB() {
		Connection connect = null;
		try {
			connect = (Connection) DriverManager.getConnection(url, user,
					password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connect;
	}

	/**
	 * ���ѧ������
	 * 
	 * @param student
	 */
	public void addStudent(Student student) {

		String sql = "insert into student (number,name,sex,age) values ('"
				+ student.getNumber() + "','" + student.getName() + "','"

				+ student.getSex() + "','" + student.getAge() + "')";

		Connection connect = getConnectDB();
		Statement stateMent = null;
		try {
			stateMent = connect.createStatement();
			stateMent.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stateMent != null) {
				try {
					stateMent.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connect != null) {
				try {
					connect.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void inSertStudent(Student student) {

		String sql = "insert into student (number,name,sex,age) values (?,?,?,?)";
		Connection connect = getConnectDB();
		PreparedStatement pStmt = null;
		try {
			pStmt = connect.prepareStatement(sql);
			pStmt.setLong(1, student.getNumber());
			pStmt.setString(2, student.getName());
			pStmt.setString(3, student.getSex());
			pStmt.setString(4, student.getAge());

			pStmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pStmt != null) {
				try {
					pStmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connect != null) {
				try {
					connect.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * �޸�ѧ����¼����ָ��ID
	 * 
	 * @param student
	 * @param id
	 */
	public void updateStudentById(Student student, int id) {
		String sql = "update student set name = '" + student.getName()
				+ "', number = '" + student.getNumber() + "' where id='" + id
				+ "'";
		Connection connect = getConnectDB();
		Statement stateMent = null;
		try {
			stateMent = connect.createStatement();
			stateMent.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stateMent != null) {
				try {
					stateMent.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connect != null) {
				try {
					connect.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * ɾ��ѧ����¼
	 * 
	 * @param id
	 */
	public void deleteStudentById(int id) {
		String sql = "delete from student where id = " + id;
		Statement stateMent = null;
		Connection connect = getConnectDB();
		try {
			stateMent = connect.createStatement();
			stateMent.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stateMent != null) {
				try {
					stateMent.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connect != null) {
				try {
					connect.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void selectStudent() {
		String sql = "select * from student";
		Statement stateMent = null;
		ResultSet resultSet = null;
		Connection connect = getConnectDB();
		try {
			stateMent = connect.createStatement();
			resultSet = stateMent.executeQuery(sql);
			while (resultSet.next()) {
				String name = resultSet.getString("name");
				int number = resultSet.getInt("number");
				String sex = resultSet.getString("sex");
				String age = resultSet.getString("age");

				System.out.println("����:" + name + "ѧ�� :" + number + " �Ա� :"
						+ sex + " ���� :" + age);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stateMent != null) {
				try {
					stateMent.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connect != null) {
				try {
					connect.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
