package com.dragontalker.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.dragontalker.bean.Dept;
import com.dragontalker.mapper.EmpDeptMapper;

public class TestEmpDept {

	@Test
	public void testCRUD() throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = sqlSessionFactory.openSession(true); 
		
		EmpDeptMapper mapper = sqlSession.getMapper(EmpDeptMapper.class);
		//List<Emp> emp = mapper.getAllEmp();
		//System.out.println(emp);
		
		//Emp emp = mapper.getEmpStep("3");
		//System.out.println(emp.getEname());
		//System.out.println("==================");
		//System.out.println(emp.getDept());
		
		//Dept dept = mapper.getDeptEmpsByDid("2");
		//System.out.println(dept);
		
		Dept dept = mapper.getOnlyDeptByDid("1");
		System.out.println(dept);
	}
	
}
