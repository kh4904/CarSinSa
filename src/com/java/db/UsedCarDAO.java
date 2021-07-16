package com.java.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.java.Frame.CarMain;

public class UsedCarDAO {
	Connection conn;
	PreparedStatement pstmt;
	public ResultSet rs;

	private static UsedCarDAO dao;

	public static UsedCarDAO getInstance() {
		if (dao == null) {
			dao = new UsedCarDAO();
		}
		return dao;
	}

	public void carInselt(UsedCarDTO cardto,String id) {
		conn = DBConnection.getConnection();

		String sql = "INSERT INTO userorder VALUES(?, ?, ?, ?, ?, ?,?,?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, (String) id);
			pstmt.setString(2, cardto.getCarName());
			pstmt.setString(3, cardto.getCarBrand());
			pstmt.setString(4, cardto.getCarPrice());
			pstmt.setString(5, cardto.getCarOill());
			pstmt.setString(6, cardto.getCarFuel());
			pstmt.setString(7, cardto.getAccident());
			pstmt.setString(8, cardto.getCarDrive());

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

		String sql = "INSERT INTO usedcar VALUES(?, ?, ?, ?, ?,?,?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cardto.getCarName());
			pstmt.setString(2, cardto.getCarBrand());
			pstmt.setString(3, cardto.getCarPrice());
			pstmt.setString(4, cardto.getCarOill());
			pstmt.setString(5, cardto.getCarFuel());
			pstmt.setString(6, cardto.getAccident());
			pstmt.setString(7, cardto.getCarDrive());

			int result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deleteCar(UsedCarDTO cardto) {
		conn = DBConnection.getConnection();
		int result = 0;

		try {
			String sql = "delete from usedcar where CarName = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cardto.getCarName());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
	 }       
	}
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

	public void carSelect2() {
		conn = DBConnection.getConnection();
		try {
			String sql = "select * from usedcar";
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
	
	public void UseCarmInsert(UsedCarDTO dto) {
		conn = DBConnection.getConnection();

		String sql = "INSERT INTO usedcar VALUES(?, ?, ?, ?, ?, ?, ?)";

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getCarName());
			pstmt.setString(2, dto.getCarBrand());
			pstmt.setString(3, dto.getCarPrice());
			pstmt.setString(4, dto.getCarOill());
			pstmt.setString(5, dto.getCarFuel());
			pstmt.setString(6, dto.getAccident());
			pstmt.setString(7, dto.getCarDrive());

			int result = pstmt.executeUpdate();

			if (1 == result) {
				JOptionPane.showMessageDialog(null, "상품등록 성공");
				
				
			} else {
				JOptionPane.showMessageDialog(null, "상품등록 실패");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
