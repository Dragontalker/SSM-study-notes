package com.dragontalker.test;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.dragontalker.bean.Emp;
import com.dragontalker.mapper.EmpMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


public class TestPage {
	
	@Test
	public void testCRUD() throws Exception{
		
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		
		EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
		
		PageHelper.startPage(4, 1);
		
		List<Emp> list = mapper.getAllEmp();
		
		PageInfo<Emp> pageInfo = new PageInfo<Emp>(list);
		System.out.println(Arrays.toString(pageInfo.getNavigatepageNums()));
		
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
