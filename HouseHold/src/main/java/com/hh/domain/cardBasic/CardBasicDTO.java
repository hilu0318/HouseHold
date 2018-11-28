package com.hh.domain.cardBasic;

import org.apache.ibatis.type.Alias;

import com.hh.domain.dailyhistory.DailyHistoryRgstDTO;
import com.hh.util.DateUtil;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Alias("CardBasicDTO")
@Data
@Getter @Setter
public class CardBasicDTO {
	private String card_id;
	private String card_cmpn_cd;
	private String card_num;
	private String card_cvc_num;
	private String card_hdr_nm;
	private String pay_dd;
	private String cal_dd;
	private String card_tycd;
	private String valid_ym;
	private String acc_id;
	private String iss_dt;
	private String user_id;
	private String rgst_dttm;
	private String use_yn;
	private String frst_rgst_dttm;
	private String last_proc_dttm;
		
	public String getFrst_rgst_dttm() {
		return DateUtil.getDateTimeStr();
	}
	
	public String getLast_proc_dttm() {
		return DateUtil.getDateTimeStr();
	}
}
