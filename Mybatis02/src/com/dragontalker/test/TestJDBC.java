package com.dragontalker.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.dragontalker.bean.Emp;

public class TestJDBC {

	public static void main(String[] args) throws Exception{
		
		Class.forName("");
		Connection conn = DriverManager.getConnection("", "", "");
		PreparedStatement ps = 
				conn.prepareStatement("insert into emp values(null, ?, ?, ?)", 1);
		ps.setString(1,  "root");
		ps.setString(2,  "23");
		ps.setString(3,  "male");
		ps.executeUpdate();
		ResultSet rs = ps.getGeneratedKeys();
		rs.next();
		int id = rs.getInt(1);
		
		Statement statement = conn.createStatement();
		Emp emp = new Emp(null, "a", 1, "b");
		statement.executeUpdate("insert into emp values(null, '"+emp.getEname()+"', '"+emp.getAge()+"', '"+emp.getSex()+"')");
		
	}
}
