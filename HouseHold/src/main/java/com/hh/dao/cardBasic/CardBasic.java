package com.hh.dao.cardBasic;

import java.util.List;
import java.util.Map;

import com.hh.domain.cardBasic.CardBasicDTO;

public interface CardBasic {
	public void rgstCrdBasic(CardBasicDTO iCardBasicDto);
	public void updtCrdBasic(CardBasicDTO iCardBasicDto);
	public Map<String, Object> iqryCrdBasic(CardBasicDTO iCardBasicDto);
	public List<Map<String, Object>> iqryListCrdBasic(CardBasicDTO iCardBasicDto);
}
