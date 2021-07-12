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

public class TestSQL {
	
	@Test
	public void testChoose() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
		
		Emp emp = new Emp();
		
		//emp.setEid(1);
		//emp.setEname("ZhangSan");
		//emp.setAge(23);
		emp.setSex("1");
		
		List<Emp> list = mapper.getEmpListByChoose(emp);
		
		for (Emp e :list) {
			System.out.println(e);
		}
	}

	@Test
	public void testIf() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
		
		Emp emp = new Emp();
		
		//emp.setEid(1);
		emp.setEname("ZhangSan");
		emp.setAge(23);
		//emp.setSex("1");
		
		List<Emp> list = mapper.getEmpListByMoreTJ(emp);
		
		for (Emp e :list) {
			System.out.println(e);
		}
	}
	
	public SqlSessionFactory getSqlSessionFactory() throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		return sqlSessionFactory;
	}
}
