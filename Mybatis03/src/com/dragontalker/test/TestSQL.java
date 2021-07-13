package com.dragontalker.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;

public class TestSQL {
	
	@Test
	public void testMBG() throws Exception {
		
		List<String> warnings = new ArrayList<String>();
		
		boolean overwrite = true;
		
		File configFile = new File("mbg.xml");
		
		ConfigurationParser cp = new ConfigurationParser(warnings);
		
		Configuration config = cp.parseConfiguration(configFile);
		
		
		
	}
	
}
