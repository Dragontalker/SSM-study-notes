package com.dragontalker.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.dragontalker.bean.Emp;
import com.dragontalker.mapper.EmpMapper;

public class TestCRUD {

	@Test
	public void testCRUD() throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
		
		// 测试: 根据eid获取员工信息
		Emp emp = empMapper.getEmpByEid("3");
		System.out.println(">> " + emp);
	}
}
