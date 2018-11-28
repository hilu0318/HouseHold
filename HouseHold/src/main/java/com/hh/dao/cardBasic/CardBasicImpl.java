package com.hh.dao.cardBasic;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hh.domain.cardBasic.CardBasicDTO;

@Repository
public class CardBasicImpl implements CardBasic {
	
	@Inject
	private SqlSession session;
	
	@Override
	public void rgstCrdBasic(CardBasicDTO iCardBasicDto) {
		session.insert("CRD_CRD01.rgstCrdBasic", iCardBasicDto);
	}
	
	@Override
	public void updtCrdBasic(CardBasicDTO iCardBasicDto) {
		session.update("CRD_CRD01.updtCrdBasic", iCardBasicDto);
	}

	@Override
	public Map<String, Object> iqryCrdBasic(CardBasicDTO iCardBasicDto) {
		return session.selectOne("CRD_CRD01.iqryCrdBasic", iCardBasicDto);
	}

	@Override
	public List<Map<String, Object>> iqryListCrdBasic(CardBasicDTO iCardBasicDto) {
		return session.selectList("CRD_CRD01.iqryListCrdBasic", iCardBasicDto);
	}
}
