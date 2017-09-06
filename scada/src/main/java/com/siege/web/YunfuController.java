package com.siege.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.siege.entity.YunfuEntity;
import com.siege.mapper.YunfuMapper;

import net.sf.json.JSONObject;


@RestController
@RequestMapping("/yunfuController")
public class YunfuController {
	@Autowired
	private YunfuMapper yunfuMapper;
	
	
	@RequestMapping("/data")
	public JSONObject get() {
		YunfuEntity yunfuEntity=yunfuMapper.get();
		Map<String, Object> map=new HashMap<>();
		map.put("success", true);
		map.put("data", yunfuEntity);
		return JSONObject.fromObject(map);
	}
	
	@RequestMapping("/reportData")
	public JSONObject getReport(@RequestParam("currentPage") int currentPage,
								  @RequestParam("start_date") String start_date,
								  @RequestParam("end_date")String end_date,
								  @RequestParam("searchType")String searchType) {
		currentPage=(currentPage-1)*10;
		int count=yunfuMapper.getCount(start_date,end_date,searchType);
		List<YunfuEntity> list=yunfuMapper.getReport(currentPage,start_date,end_date,searchType);
		Map<String, Object> map=new HashMap<>();
		map.put("success", true);
		map.put("data", list);
		map.put("pageCount", count);
		return JSONObject.fromObject(map);
	}
}
