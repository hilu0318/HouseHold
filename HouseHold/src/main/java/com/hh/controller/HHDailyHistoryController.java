package com.hh.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hh.domain.dailyhistory.DailyHistoryRgstDTO;

@Controller
@RequestMapping(value="/dailyhistory")
public class HHDailyHistoryController {
	
	@RequestMapping(value="/rgst", method = RequestMethod.POST)
	public String setRgstDailyHistory(DailyHistoryRgstDTO iData) {
		
		System.out.println("inPost");
		System.out.println(iData.toString());
		return "hdailyhis/rgstdailyhistory";
	}
	
	@RequestMapping(value="/rgst", method = RequestMethod.GET)
	public String getRgstDailyHistory(Model model) {
		System.out.println("inGet");
		return "hdailyhis/rgstdailyhistory";
	}
}
