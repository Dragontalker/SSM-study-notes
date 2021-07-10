package com.dragontalker.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.dragontalker.bean.Emp;
import com.dragontalker.mapper.ParamMapper;

public class TestParam {

	@Test
	public void testUpdateEmp1() throws IOException {
		
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		
		ParamMapper mapper = sqlSession.getMapper(ParamMapper.class);
		
		Emp emp = new Emp(null, "admin", 23, "male");
		
		mapper.insertEmp(emp);
		
		System.out.println(emp.getEid());

	}
	
	@Test
	public void testGetEmpByEid() throws IOException {
		
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		
		ParamMapper mapper = sqlSession.getMapper(ParamMapper.class);
		
		Emp emp = mapper.getEmpByEid("1");
		
		System.out.println(">> " + emp);

	}
	
	@Test
	public void testGetEmpByEidAndEname() throws IOException {
		
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		
		ParamMapper mapper = sqlSession.getMapper(ParamMapper.class);
		
		Emp emp = mapper.getEmpByEidAndEname("1", "ZhangSan");
		
		System.out.println(">> " + emp);

	}
}
