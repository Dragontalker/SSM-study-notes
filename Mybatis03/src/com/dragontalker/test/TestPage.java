package com.dragontalker.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.dragontalker.bean.Emp;
import com.dragontalker.mapper.EmpMapper;
import com.github.pagehelper.PageHelper;


public class TestPage {
	
	@Test
	public void testCRUD() throws Exception{
		
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		
		EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
		
		PageHelper.startPage(2, 2);
		
		List<Emp> list = mapper.getAllEmp();
		
		for (Emp emp : list) {
			System.out.println(emp);
		}
		
	}
	
	public SqlSessionFactory getSqlSessionFactory() throws Exception {
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		return sqlSessionFactory;
	}
	
}
