package com.hh.domain.cmmCdDtl;

import org.apache.ibatis.type.Alias;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Alias("CmmCdDtlDTO")
@Data
@Getter @Setter
public class CmmCdDtlDTO {
	private String cmcd_nm_cd;
	private String cmcd_val_cd;
	private String cmcd_nm_cmt;
	private String cmcd_val_cmt;
	private int cmcd_val_ind;
	private int cmcd_val_size;
	private String parn_cmcd_nm_cd;
	private String parn_cmcd_val_cd;
	private String frst_rgst_dttm;
	private String last_proc_dttm;
}
