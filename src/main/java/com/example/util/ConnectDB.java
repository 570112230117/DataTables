package com.example.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {

	public Connection openConnect() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
//			conn = DriverManager.getConnection("jdbc:mysql://localhost/amnuay" + "?user=root&password=");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/amnuay?useUnicode=true&characterEncoding=utf-8" , "root" , "");
//			spring.datasource.url=jdbc:mysql://localhost:3306/epis?useUnicode=true&characterEncoding=utf-8
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return conn;
	}

//	public static void main(String[] args) {
//		ConnectDB con = new ConnectDB();
//		Connection conn = null;
//		conn = con.openConnect();
//		if (conn != null) {
//			System.out.println("เชื่อมแล้ว");
//		} else {
//			System.out.println("ยังไม่ได้เชื่อม");
//		}
//	}

	// end class
}
