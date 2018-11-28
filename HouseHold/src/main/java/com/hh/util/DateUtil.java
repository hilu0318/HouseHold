package com.hh.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.springframework.cglib.core.Local;

public class DateUtil {
	private static SimpleDateFormat nDateForm = new SimpleDateFormat("yyyyMMdd", Locale.KOREA);
	private static SimpleDateFormat nDateTimeForm = new SimpleDateFormat("yyyyMMddHHmmss", Locale.KOREA);
	
	public static String getDateStr() {
		return nDateForm.format(new Date());
	}
	
	public static String getDateTimeStr() {
		return nDateTimeForm.format(new Date());
	}
}
