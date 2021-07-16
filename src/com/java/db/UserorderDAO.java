package com.java.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class UserorderDAO {
	Connection conn;
	PreparedStatement pstmt;
	public ResultSet rs;

	private static UserorderDAO dao;

	public static UserorderDAO getInstance() {
		if (dao == null) {
			dao = new UserorderDAO();
		}
		return dao;
	}
	
	public void deleteCar(UserorderDTO cardto) {
		conn = DBConnection.getConnection();
		int result = 0;

		try {
			String sql = "delete from userorder where CarName = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cardto.getCarName());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
	 }       
	}

	
	

	

	public void carSelect() {
		conn = DBConnection.getConnection();
		try {
			String sql = "select * from userorder";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
		} catch (SQLException e1) {
			e1.getStackTrace();
		}
	}

	
	
	
}
