package com.java.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import com.java.Frame.CarMain;
import com.java.main.join;

public class MemberDAO {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	private static MemberDAO dao;

	public static MemberDAO getInstance() {
		if (dao == null) {
			dao = new MemberDAO();
		}
		return dao;
	}
	static int r;
	
	public int mInsert(MemberDTO dto) {
		conn = DBConnection.getConnection();

		String sql = "INSERT INTO member VALUES(?, ?, ?, ?, ?, ?, ?)";

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPassword());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getYear());
			pstmt.setString(5, dto.getEmail());
			pstmt.setString(6, dto.getTel());
			pstmt.setString(7, dto.getHome());

			int result = pstmt.executeUpdate();

			if (1 == result) {
				JOptionPane.showMessageDialog(null, "회원가입 성공");
				r=1;
				
			} else {
				JOptionPane.showMessageDialog(null, "회원가입 실패");
				r=0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return r;
	}
	
	
	

	public void mSelect(String id,String password) {
		
		 conn = DBConnection.getConnection();

		String sql = "select * from member where id=? and password=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "로그인성공");
                new CarMain(id);
                
                
            } else
                JOptionPane.showMessageDialog(null, "로그인실패");
          

			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}