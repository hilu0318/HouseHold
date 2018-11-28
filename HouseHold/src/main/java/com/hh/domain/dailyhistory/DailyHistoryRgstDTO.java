package com.hh.domain.dailyhistory;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter
public class DailyHistoryRgstDTO {
	private String rgst_dt;
	private int amt;
	private String title;
	private String memo;
	private String io_dvcd;
	private String pay_meth_cd;
	
}
