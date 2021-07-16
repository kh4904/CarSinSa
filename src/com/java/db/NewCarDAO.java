package com.java.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class NewCarDAO {
	Connection conn;
	PreparedStatement pstmt;
	public ResultSet rs;

	private static NewCarDAO dao;

	public static NewCarDAO getInstance() {
		if (dao == null) {
			dao = new NewCarDAO();
		}
		return dao;
	}

	public void carInselt(NewCarDTO cardto, String id) {
		conn = DBConnection.getConnection();

		String sql = "INSERT INTO userorder VALUES(?, ?, ?, ?, ?, ?,0,0)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, (String) id);
			pstmt.setString(2, cardto.getCarName());
			pstmt.setString(3, cardto.getCarBrand());
			pstmt.setString(4, cardto.getCarPrice());
			pstmt.setString(5, cardto.getCarOill());
			pstmt.setString(6, cardto.getCarFuel());

			int result = pstmt.executeUpdate();
			if (1 == result) {
				JOptionPane.showMessageDialog(null, "구매완료");

			} else {
				JOptionPane.showMessageDialog(null, "구매실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void carInselt2(UserorderDTO cardto, String id) {
		conn = DBConnection.getConnection();

		String sql = "INSERT INTO car VALUES(?, ?, ?, ?, ?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cardto.getCarName());
			pstmt.setString(2, cardto.getCarBrand());
			pstmt.setString(3, cardto.getCarPrice());
			pstmt.setString(4, cardto.getCarOill());
			pstmt.setString(5, cardto.getCarFuel());

			int result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	
	
	
	

	public void deleteCar(NewCarDTO cardto) {
		conn = DBConnection.getConnection();
		int result = 0;

		try {
			String sql = "delete from car where CarName = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cardto.getCarName());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
  
		
	}
	//주문정보조회 에서 지우기 
	public void deleteuser(UserorderDTO cardto) {
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
			String sql = "select * from car";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
		} catch (SQLException e1) {
			e1.getStackTrace();
		}
	}

	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}

			if (pstmt != null) {
				pstmt.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
}
