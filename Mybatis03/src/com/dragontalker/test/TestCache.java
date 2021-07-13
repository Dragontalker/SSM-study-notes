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

public class TestCache {
	
	/**
	 * MyBatis中的一级缓存默认开启, 是SqlSession级别的
	 * 即同一个SqlSession对于一个SQL语句, 执行之后就会存储在缓存中, 
	 * 下次执行相同的SQL, 直接从缓存中取 
	 */
	@Test
	public void testCache() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		
		SqlSession sqlSession1 = sqlSessionFactory.openSession(true);
		EmpMapper mapper1 = sqlSession1.getMapper(EmpMapper.class);
		Emp emp1 = mapper1.getEmpByEid("13");
		System.out.println(emp1);
		
		System.out.println("==========================");
		mapper1.deleteMoreEmp("1");
		System.out.println("==========================");
		
		SqlSession sqlSession2 = sqlSessionFactory.openSession(true);
		EmpMapper mapper2 = sqlSession1.getMapper(EmpMapper.class);
		Emp emp2 = mapper2.getEmpByEid("13");
		System.out.println(emp2);
	}

	
	public SqlSessionFactory getSqlSessionFactory() throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		return sqlSessionFactory;
	}
}
