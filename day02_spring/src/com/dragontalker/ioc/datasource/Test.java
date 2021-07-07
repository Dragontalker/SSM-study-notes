package com.dragontalker.ioc.datasource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.druid.pool.DruidDataSource;

public class Test {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("datasource.xml");
		
		DruidDataSource bean = context.getBean("dataSource", DruidDataSource.class);
		
		System.out.println(bean);
		
	}
}
