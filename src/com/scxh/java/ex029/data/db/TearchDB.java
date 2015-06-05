package com.scxh.java.ex029.data.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.scxh.java.ex015.mangesystem_db.ConnectionDB;

/**
 * ���ݴ洢��,ʵ�����ݿ��װ.
 * @author viktor
 *
 */
public class TearchDB extends ConnectionDB{
	private static TearchDB USS = null;
	
	public static TearchDB getInstance() {
		if (USS == null) {
			USS = new TearchDB();
		}
		return USS;
	}

	/**
	 * 
	 * ����ѧ�������ж�ѧ���Ƿ����
	 * @param studentName
	 * @return
	 */
	public boolean findTearchByUserNameAndPWD(String userName,String passWord) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "select * from tearch where name=? and password = ?";
		boolean fals = false;
		try {
			con = getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, userName);
			ps.setString(2, passWord);
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
}
