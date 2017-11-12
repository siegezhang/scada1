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
import com.siege.entity.YunfuEntity;
import com.siege.mapper.YunfuMapper;
import com.siege.util.ExcelUtil;


@RestController
@RequestMapping("/yunfuController")
public class YunfuController {
	@Autowired
	private YunfuMapper yunfuMapper;
	Gson gson = new Gson();
	
	
	@RequestMapping("/data")
	public String get() {
		YunfuEntity yunfuEntity=yunfuMapper.get();
		Map<String, Object> map=new HashMap<>();
		map.put("success", true);
		map.put("data", yunfuEntity);
		return gson.toJson(map);
	}
	
	@RequestMapping("/data_m")
	public String get1(@RequestParam("callback") String callback) {
		YunfuEntity yunfuEntity=yunfuMapper.get();
		Map<String, Object> map=new HashMap<>();
		map.put("success", true);
		map.put("data", yunfuEntity);
		return callback+"("+gson.toJson(map)+")";
	}
	
	@RequestMapping("/reportData")
	public String getReport(@RequestParam("currentPage") int currentPage,
								  @RequestParam("start_date") String start_date,
								  @RequestParam("end_date")String end_date,
								  @RequestParam("searchType")String searchType) {
		currentPage=(currentPage-1)*10;
		int count=yunfuMapper.getCount(start_date,end_date,searchType);
		List<YunfuEntity> list=yunfuMapper.getReport(currentPage,start_date,end_date,searchType);
		Map<String, Object> map=new HashMap<>();
		map.put("success", true);
		map.put("data", list);
		map.put("pageCount", Math.ceil((double) count / 10));
		return gson.toJson(map);
	}
	@RequestMapping("/downloadExcel")
	public void downloadExcel(@RequestParam("start_date") String start_date, @RequestParam("end_date") String end_date, @RequestParam("searchType") String searchType, HttpServletResponse response) {
		List<Map<String, Object>> list = yunfuMapper.getExcelReport(start_date, end_date, searchType);
		String fileName = "云浮站数据报表" + start_date.replaceAll("-", "") + "-" + end_date.replaceAll("-", "") + ".xls";
		ExcelUtil.produceExcel(fileName, response, list, ExcelConstant.YUNFU_TITLE, ExcelConstant.YUNFU_FIELD);
	}
	@RequestMapping("/amount")
	public String  amount(){
		List<HashMap<String, Object>> listmap=yunfuMapper.amount();
		String antingA=String.valueOf(listmap.get(0).get("amount"));
		String yunfuA=String.valueOf(listmap.get(1).get("amount"));
		String yunfuB=String.valueOf(listmap.get(2).get("amount"));
		return "{\"data\":{\"anting\":["+antingA+",0"+"],\"yunfu\":["+yunfuA+","+yunfuB+"]}}";
	}
}
