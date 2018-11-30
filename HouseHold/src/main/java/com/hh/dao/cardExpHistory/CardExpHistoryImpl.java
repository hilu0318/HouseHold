package com.hh.dao.cardExpHistory;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hh.domain.HData;

@Repository
public class CardExpHistoryImpl implements CardExpHistory {

	/* 기준 테이블 
	 * CRD_CRD02
	 * */
	@Inject
	private SqlSession session;
	
	/* ---------------
	 * 카드지출내역기본조회
	 * */
	@Override
	public HData iqryCardExpHistoryBasic(HData iData) {
		// TODO Auto-generated method stub
		System.out.println(iData.toString());
		return session.selectOne("CRD_CRD02.iqryCardExpHistoryBasic", iData);
	}
	
	/* ---------------
	 * 카드지출내역기본등록
	 * */
	@Override
	public void rgstCardExpHistoryBasic(HData iData) {
		// TODO Auto-generated method stub
		session.insert("CRD_CRD02.rgstCardExpHistoryBasic", iData);
	}

	/* ---------------
	 * 카드지출내역기본수정
	 * */
	@Override
	public void updtCardExpHistoryBasic(HData iData) {
		// TODO Auto-generated method stub
		session.update("CRD_CRD02.updtCardExpHistoryBasic", iData);
	}

	/* ---------------
	 * 카드지출내역삭제여부수정
	 * */
	@Override
	public void updtDelYnCardExpHistory(HData iData) {
		// TODO Auto-generated method stub
		session.update("CRD_CRD02.updtDelYnCardExpHistory", iData);
	}

}
