package com.siege.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.siege.constant.ExcelConstant;
import com.siege.entity.AntingEntity;
import com.siege.mapper.AntingMapper;
import com.siege.util.ExcelUtil;

@RestController
@RequestMapping("/antingController")
public class AntingController {
	Gson gson = new Gson();
	static Map<Integer, String> map = new HashMap<Integer, String>();
	@Autowired private AntingMapper antingMapper;

	@RequestMapping("/data")
	public String get() {
		AntingEntity antingEntity = antingMapper.get();
		Map<String, Object> map = new HashMap<>();
		map.put("success", true);
		map.put("data", antingEntity);
		return gson.toJson(map);
	}
	@RequestMapping("/data_m")
	public String get1(@RequestParam("callback") String callback) {
		AntingEntity antingEntity = antingMapper.get();
		Map<String, Object> map = new HashMap<>();
		map.put("success", true);
		map.put("data", antingEntity);
		return callback+"("+gson.toJson(map)+")";
	}

	@RequestMapping("/reportData")
	public String getReport(@RequestParam("currentPage") int currentPage, @RequestParam("start_date") String start_date, @RequestParam("end_date") String end_date, @RequestParam("searchType") String searchType) {
		currentPage = (currentPage - 1) * 10;
		int count = antingMapper.getCount(start_date, end_date, searchType);
		List<AntingEntity> list = antingMapper.getReport(currentPage, start_date, end_date, searchType);
		Map<String, Object> map = new HashMap<>();
		map.put("success", true);
		map.put("data", list);
		map.put("pageCount", Math.ceil((double) count / 10));
		return gson.toJson(map);
	}

	@RequestMapping("/downloadExcel")
	public void downloadExcel(@RequestParam("start_date") String start_date, @RequestParam("end_date") String end_date, @RequestParam("searchType") String searchType, HttpServletResponse response) {
		List<Map<String, Object>> list = antingMapper.getExcelReport(start_date, end_date, searchType);
		String fileName = "安亭站数据报表" + start_date.replaceAll("-", "") + "-" + end_date.replaceAll("-", "") + ".xls";
		ExcelUtil.produceExcel(fileName, response, list, ExcelConstant.ANTING_TITLE, ExcelConstant.ANTING_FIELD);
	}
}
