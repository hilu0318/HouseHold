package com.hh.dao.cardExpHistory;

import com.hh.domain.HData;

public interface CardExpHistory {
	
	/* ---------------
	 * 카드지출내역기본조회
	 * */
	public HData iqryCardExpHistoryBasic(HData iData);
	
	/* ---------------
	 * 카드지출내역기본등록
	 * */
	public void rgstCardExpHistoryBasic(HData iData);
	
	/* ---------------
	 * 카드지출내역기본수정
	 * */
	public void updtCardExpHistoryBasic(HData iData);
	
	/* ---------------
	 * 카드지출내역삭제여부수정
	 * */
	public void updtDelYnCardExpHistory(HData iData);
}