package com.dragontalker.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
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
	public void testMore() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
		
		//List<Integer> eids = new ArrayList<>();
		//eids.add(7);
		//eids.add(8);
		//eids.add(10);
		
		//Emp[] emps = new Emp[];
		//Emp[] emps = new Emp[] {};
		
		Emp emp1 = new Emp(null, "a", 23, "male");
		Emp emp2 = new Emp(null, "aa", 23, "male");
		Emp emp3 = new Emp(null, "aaa", 23, "male");
		Emp[] emps = {emp1, emp2, emp3};
		
		
		mapper.insertMoreByArray(emps);
	}
	
	@Test
	public void testChoose() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
		
		Emp emp = new Emp();
		
		//emp.setEid(1);
		emp.setEname("ZhangSan");
		emp.setAge(23);
		emp.setSex("123");
		
		mapper.insertEmp(emp);
		
		//List<Emp> list = mapper.getEmpListByChoose(emp);
		
		//for (Emp e :list) {
			//System.out.println(e);
		//}
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
