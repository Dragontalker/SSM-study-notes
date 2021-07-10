package com.dragontalker.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.dragontalker.bean.Emp;
import com.dragontalker.mapper.EmpMapper;

public class TestCRUD {

	@Test
	public void testGetByEid() throws IOException {
		
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
		
		Emp emp = empMapper.getEmpByEid("3");
		
		System.out.println(">> " + emp);
	}
	
	@Test
	public void testGetAll() throws IOException {
		
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
		
		List<Emp> empList = empMapper.getAllEmp();
		
		for (Emp emp : empList) {
			System.out.println(">> " + emp);
		}
	}
	
	@Test
	public void testAddEmp() throws IOException {
		
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		
		EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
		
		empMapper.addEmp(new Emp(null, "root", 18, "male"));
	}
	
	@Test
	public void testUpdateEmp() throws IOException {
		
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		
		EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
		
		empMapper.updateEmp(new Emp(2, "ZhangSanSan", 33, "female"));
	}
}
