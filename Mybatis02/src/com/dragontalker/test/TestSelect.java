package com.dragontalker.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.dragontalker.mapper.EmpSelectMapper;

public class TestSelect {

	@Test
	public void testCRUD() throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		//SqlSession sqlSession = sqlSessionFactory.openSession(); // 需要手动处理事务
		SqlSession sqlSession = sqlSessionFactory.openSession(true); // 自动处理事务
		
		EmpSelectMapper mapper = sqlSession.getMapper(EmpSelectMapper.class);
		
		// 若查询出的数据有多条, 则绝对不能将接口中该方法的返回值设置为JavaBean
		//Emp emp = mapper.getEmpByEid("3");
		//System.out.println(emp);
		
		// 获取员工总记录数
		Integer i = mapper.getCount();
		System.out.println(i);
	}
	
}
