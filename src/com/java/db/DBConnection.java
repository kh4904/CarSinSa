package com.java.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	static String driver = "org.mariadb.jdbc.Driver";
	static String url = "jdbc:mariadb://Localhost:3307/join";
	static String uid = "root";
	static String pwd = "1111";
	private static Connection conn = null;

	public static Connection getConnection() {
		if (conn == null) {
			try {
				Class.forName(driver);
				conn = DriverManager.getConnection(url, uid, pwd);
				System.out.println("DB연결 완료");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("DB연결 실패");
			}
		}
		return conn;
	}

}