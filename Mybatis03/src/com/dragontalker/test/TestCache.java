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
	 * 
	 * 一级缓存失效的情况:
	 * 	- 同一个SqlSession但是查询条件不同
	 *  - 同一个SqlSession两次查询期间执行了任何一次增删改操作, 会自动将缓存清空
	 *  - 同一个SqlSession两次查询期间清空了缓存
	 */
	@Test
	public void testFirstCache() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		
		SqlSession sqlSession1 = sqlSessionFactory.openSession(true);
		EmpMapper mapper1 = sqlSession1.getMapper(EmpMapper.class);
		Emp emp1 = mapper1.getEmpByEid("13");
		System.out.println(emp1);
		
		System.out.println("==========================");
		sqlSession1.clearCache();
		System.out.println("==========================");
		
		//SqlSession sqlSession2 = sqlSessionFactory.openSession(true);
		EmpMapper mapper2 = sqlSession1.getMapper(EmpMapper.class);
		Emp emp2 = mapper2.getEmpByEid("13");
		System.out.println(emp2);
	}
	
	/**
	 * MyBatis的二级缓存默认不开启, 需要设置:
	 * 1. 在核心配置文件中加入配置<setting name="cacheEnabled" value="true />
	 * 2. 需要使用二级缓存的映射文件处使用cache配置缓存<cache />
	 * 3. POJO需要实现Serializable接口
	 * 注意: 二级缓存在SqlSession提交或者关闭之后才能生效
	 */
	@Test
	public void testSecondCache() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		EmpMapper mapper1 = sqlSession.getMapper(EmpMapper.class);
		Emp emp1 = mapper1.getEmpByEid("11");
		System.out.println(emp1);
		
		sqlSession.commit();
		
		System.out.println("==========================");
		
		//SqlSession sqlSession2 = sqlSessionFactory.openSession(true);
		EmpMapper mapper2 = sqlSession.getMapper(EmpMapper.class);
		Emp emp2 = mapper2.getEmpByEid("12");
		System.out.println(emp2);
		
		sqlSession.commit();
		
		System.out.println("==========================");
		
		EmpMapper mapper3 = sqlSession.getMapper(EmpMapper.class);
		Emp emp3 = mapper3.getEmpByEid("13");
		System.out.println(emp3);
		
		sqlSession.commit();
		
		System.out.println("==========================");
		
		EmpMapper mapper4 = sqlSession.getMapper(EmpMapper.class);
		Emp emp4 = mapper4.getEmpByEid("9");
		System.out.println(emp4);
		
		sqlSession.commit();
		
		System.out.println("==========================");
		
		EmpMapper mapper5 = sqlSession.getMapper(EmpMapper.class);
		Emp emp5 = mapper5.getEmpByEid("12");
		System.out.println(emp5);
	}

	
	public SqlSessionFactory getSqlSessionFactory() throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		return sqlSessionFactory;
	}
}
