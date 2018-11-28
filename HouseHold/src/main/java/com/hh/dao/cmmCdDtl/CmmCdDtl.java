package com.hh.dao.cmmCdDtl;

import java.util.List;
import java.util.Map;

import com.hh.domain.cmmCdDtl.CmmCdDtlDTO;

public interface CmmCdDtl {
	public Map<String, Object> iqryCmcdDtlBasic(CmmCdDtlDTO iDto);
	public List<Map<String, Object>> iqryListCmcdDtl(CmmCdDtlDTO iDto);
}
