package com.scxh.java.ex029.data.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * 1.�������ݿ���������
 * 2.��������  
 * 3.��������
 * 4.��ȡStatement���󣬴���SQL������
 * @author viktor
 *
 */
public class DBTest {
	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
//		String url = "jdbc:mysql://192.168.1.199:3306/scxh?characterEncoding=UTF-8";
		String url = "jdbc:mysql://192.168.1.199:3306/scxh";
		String username = "root";
		String password = "a123";
		
		Connection connect = null;
		Statement sql = null;
		try {
			Class.forName(driver);////������������

			//�������ݿ�����
			connect = DriverManager.getConnection(url, username,password);
			
			if(!connect.isClosed())
				System.out.println("�������ӳɹ���");
			
			//����SQL������
			sql = connect.createStatement();
			
			//ִ��SQL���
			sql.execute("insert into student (number,name,sex,age) values (1004,'С��','Ů','3��')");
			
			sql.execute("update student set name = 'С��' where name='С��'");
			
			System.out.println("�������ݳɹ�");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			if(sql != null)
				try {
					sql.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			
			if(connect!= null){
				try {
					connect.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}			
		}
	}
}
