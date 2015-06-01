package com.scxh.java.ex029.data.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBDemo {
	public static void main(String[] args) {
		// ����Connection����
		Connection con;
		// ����������
		String driver = "com.mysql.jdbc.Driver";
		// URLָ��Ҫ���ʵ����ݿ���mydata
		String url = "jdbc:mysql://localhost:3306/scxh";
		// MySQL����ʱ���û���
		String user = "root";
		// MySQL����ʱ������
		String password = "a123";
		// ������ѯ�����
		try {
			// ������������
			Class.forName(driver);

			// 1.getConnection()����������MySQL���ݿ⣡��

			con = (Connection) DriverManager.getConnection(url, user, password);
			if (!con.isClosed())
				System.out.println("�ɹ����ӵ����ݿ�!");

			// 2.����statement���������ִ��SQL��䣡��
			Statement statement = (Statement) con.createStatement();

			// Ҫִ�е�SQL���
			String sql = "select * from student";

			// 3.ResultSet�࣬������Ż�ȡ�Ľ��������
			ResultSet rs = statement.executeQuery(sql);

			System.out.println("-----------------");
			System.out.println("ִ�н��������ʾ:");
			System.out.println("-----------------");
			System.out.println(" ѧ��" + "\t" + " ����");
			System.out.println("-----------------");

			String name = null;
			String id = null;
			while (rs.next()) {
				// ��ȡstuname��������
				name = rs.getString("name");
				// ��ȡstuid��������
				id = rs.getString("id");
				// ����ʹ��ISO-8859-1�ַ�����name����Ϊ�ֽ����в�������洢�µ��ֽ������С�
				// Ȼ��ʹ��GB2312�ַ�������ָ�����ֽ����顣
//				name = new String(name.getBytes("ISO-8859-1"), "UTF-8");
				// ������
				System.out.println(id + "\t" + name);
			}
			
			rs.close();
			statement.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// ���ݿ��������쳣����
			System.out.println("Sorry,can`t find the Driver!");
			e.printStackTrace();
		} catch (SQLException e) {
			// ���ݿ�����ʧ���쳣����
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("���ݿ����ݳɹ���ȡ����");
		}
	}

}
