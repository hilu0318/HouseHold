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

import org.apache.ibatis.javassist.NotFoundException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hh.dao.dailyhistory.DailyHistory;
import com.hh.dao.dailyhistory.DailyHistoryImpl;
import com.hh.domain.HData;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/**/root-context.xml")
public class TestController {
	
	@Inject
	private DataSource dataSource;
	
	@Inject
	private SqlSessionTemplate session;
	
	private static String namespace = "DD_DAY01";
	
	@Inject
	private DailyHistory dailyHistoty;
	
	@Test
	public void testMethod() {
		HData iData = new HData();
		HData rData = new HData();
		
		iData.set("rgst_dt", "20181114");
		iData.set("seqno", 1);
		
		try {
			rData = dailyHistoty.iqryDailyHistory(iData);
			gLog(rData.toString());
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void gLog(String txt) {
		System.out.println("Log :: "+txt);
	}
	
	private void gLog(int txt) {
		System.out.println("Log :: "+txt);
	}
}
