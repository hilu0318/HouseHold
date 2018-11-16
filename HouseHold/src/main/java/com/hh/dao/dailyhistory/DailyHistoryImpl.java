package com.hh.dao.dailyhistory;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.javassist.NotFoundException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hh.domain.HData;

@Repository
public class DailyHistoryImpl implements DailyHistory {

	@Inject
	private SqlSession session;
	
	@Override
	public HData iqryDailyHistory(HData iData) throws NotFoundException {
		// TODO Auto-generated method stub
		//변수 초기화
		HData rData = new HData();
		rData.setData(session.selectOne("DD_DAY01.iqryDailyHistory", iData.getData()));
		
		return rData;
	}

}
