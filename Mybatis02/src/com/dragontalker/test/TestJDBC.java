package com.dragontalker.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestJDBC {

	public static void main(String[] args) throws Exception{
		
		Class.forName("");
		Connection conn = DriverManager.getConnection("", "", "");
		PreparedStatement ps = conn.prepareStatement("insert into emp values(null, ?, ?, ?)");
		ps.setString(1,  "root");
		ps.setString(2,  "23");
		ps.setString(3,  "male");
		ps.executeUpdate();
		
	}
}
