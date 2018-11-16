package com.hh.domain;

import java.util.ArrayList;
import java.util.List;

public class LHData {
	private List<HData> lhData;
	
	public LHData() {
		lhData = new ArrayList<>();
	}
	
	public void set(HData iData) {
		lhData.add(iData);
	}
	
	public int getSize() {
		return lhData.size();
	}
	
	public HData getHData(int i) {
		return lhData.get(i);
	}
}
