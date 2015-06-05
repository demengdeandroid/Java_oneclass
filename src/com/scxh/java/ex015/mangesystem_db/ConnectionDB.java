package com.scxh.java.ex015.mangesystem_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	// ����������
	private String driver = "com.mysql.jdbc.Driver";
	// URLָ��Ҫ���ʵ����ݿ���mydata
	private String url = "jdbc:mysql://localhost:3306/scxh";
	// MySQL����ʱ���û���
	private String user = "root";
	// MySQL����ʱ������
	private String password = "a123";

	/**
	 * ������������
	 */
	protected ConnectionDB() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * �������ݿ�����
	 */
	public Connection getConnection() {
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
	 * �ر����ݿ�����
	 * 
	 * @param con
	 */
	public void freeConnection(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
