package com.siege.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.siege.entity.AntingEntity;
import com.siege.entity.Dalian2Entity;
import com.siege.mapper.Dalian2Mapper;

@RestController
@RequestMapping("/dalian2Controller")
public class Dalian2Controller {
	@Autowired private Dalian2Mapper dalian2Mapper;
	Gson gson = new Gson();

	@RequestMapping("/data")
	public String get() {
		AntingEntity antingEntity = dalian2Mapper.get();
		Map<String, Object> map = new HashMap<>();
		map.put("success", true);
		map.put("data", antingEntity);
		return gson.toJson(map);
	}

	@RequestMapping("/reportData")
	public String getReport(@RequestParam("currentPage") int currentPage, @RequestParam("start_date") String start_date, @RequestParam("end_date") String end_date, @RequestParam("searchType") String searchType) {
		currentPage = (currentPage - 1) * 10;
		int count = dalian2Mapper.getCount(start_date, end_date, searchType);
		List<Dalian2Entity> list = dalian2Mapper.getReport(currentPage, start_date, end_date, searchType);
		Map<String, Object> map = new HashMap<>();
		map.put("success", true);
		map.put("data", list);
		map.put("pageCount", count);
		return gson.toJson(map);
	}
}
