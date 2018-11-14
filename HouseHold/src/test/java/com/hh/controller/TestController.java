package com.hh.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/**/root-context.xml")
public class TestController {
	
	@Inject
	private DataSource dataSource;
	
	@Inject
	private SqlSessionTemplate session;
	
	private static String namespace = "DD_DAY01";
	
	@Test
	public void testMethod() {
		/*
		Map<String, Object> inParam = new HashMap();
		inParam.put("amt", 4000);
		inParam.put("title", "TEST01");
		inParam.put("memo", "TEST-memo01");
		int result = session.insert("DD_DAY01.rgstDailyBasic", inParam);
		gLog(result);
		*/
		List<Map<String, Object>> oList = session.selectList("DD_DAY01.iqryLstDaily");
		for(Map<String, Object> map : oList) {
			gLog(map.toString());
		}
	}
	
	private void gLog(String txt) {
		System.out.println("Log :: "+txt);
	}
	
	private void gLog(int txt) {
		System.out.println("Log :: "+txt);
	}
}
