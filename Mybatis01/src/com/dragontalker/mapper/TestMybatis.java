package com.dragontalker.mapper;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.junit.Test;

public class TestMybatis {

	@Test
	public void test() throws IOException {
		
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
	}

}
