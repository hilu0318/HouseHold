package com.hh.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

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
		String result = session.selectOne("DD_DAY01.iqryTest");
		gLog(result);
	}
	
	private void gLog(String txt) {
		System.out.println("Log :: "+txt);
	}
	
	private void gLog(int txt) {
		System.out.println("Log :: "+txt);
	}
}
