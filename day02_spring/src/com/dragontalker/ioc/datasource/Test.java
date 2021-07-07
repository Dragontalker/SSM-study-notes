package com.dragontalker.ioc.datasource;

import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.druid.pool.DruidDataSource;

public class Test {
	
	public static void main(String[] args) throws SQLException {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("datasource.xml");
		
		DruidDataSource bean = context.getBean("dataSource", DruidDataSource.class);
		
		System.out.println(bean.getConnection());
		
		context.close();
		
	}
}
