package com.siege.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.siege.entity.AntingEntity;

public interface AntingMapper {
	List<AntingEntity> getAll();
	// 获取最新的一条数据
	AntingEntity get();
	//获取报表数据
	List<AntingEntity> getReport(@Param("currentPage") int currentPage, @Param("start_date")String start_date, @Param("end_date")String end_date, @Param("searchType") String searchType);
	int getCount(@Param("start_date")String start_date, @Param("end_date")String end_date, @Param("searchType") String searchType);
	List<Map<String,Object>> getExcelReport(@Param("start_date")String start_date, @Param("end_date")String end_date, @Param("searchType")String searchType);
}