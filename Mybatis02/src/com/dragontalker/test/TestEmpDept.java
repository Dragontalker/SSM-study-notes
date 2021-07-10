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
import com.dragontalker.mapper.EmpDeptMapper;

public class TestEmpDept {

	@Test
	public void testGetAllEmp() throws IOException {
		
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		
		EmpDeptMapper mapper = sqlSession.getMapper(EmpDeptMapper.class);
		
		List<Emp> empList = mapper.getAllEmp();
		
		for (Emp emp : empList) {
			System.out.println(">> " + emp);
		}
	}
}
