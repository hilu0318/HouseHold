package com.hh.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HData{
	
	private Map<String, Object> hData;
	
	public HData() {
		hData = new HashMap<>();
	}
	
	public void setData(Map iData) {
		hData = iData;
	}
	
	public Map<String, Object> getData(){
		return hData;
	}
	
	public void set(String str, Object obj) {
		hData.put(str, obj);
	}
	
	public String getString(String str) {
		return (String)hData.get(str);
	}
	
	public int getInt(String str) {
		return (int)hData.get(str);
	}
	
	public long getLong(String str) {
		return (long)hData.get(str);
	}
	
	public BigDecimal getBigDecimal(String str) {
		return (BigDecimal)hData.get(str);
	}
	
	public String toString() {
		return hData.toString();
	}
	
	public boolean isEmpty() {
		return hData.isEmpty();
	}
}
