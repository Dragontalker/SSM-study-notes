package com.dragontalker.mapper;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.dragontalker.bean.User;

public class TestMybatis {

	@Test
	public void test() throws IOException {
		
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		
		SqlSessionFactory sqlSessionFactory = 
				new SqlSessionFactoryBuilder().build(is);
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		// getMapper(): 会通过动态代理来动态生成UserMapper的代理实现类
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		
		User user = mapper.getUserByUid("1");
		
		System.out.println(user);
	}

}
