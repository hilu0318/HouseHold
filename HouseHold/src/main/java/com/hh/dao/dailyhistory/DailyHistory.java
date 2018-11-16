package com.hh.dao.dailyhistory;

import java.util.Map;

import org.apache.ibatis.javassist.NotFoundException;

import com.hh.domain.HData;

public interface DailyHistory {
	public HData iqryDailyHistory(HData iData) throws NotFoundException;
}
