package com.siege.mapper;

import com.siege.entity.Dalian1Entity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Dalian1Mapper {
  List<Dalian1Entity> getAll();
  /** 获取最新的一条数据 */
  Dalian1Entity get();

  /** 获取报表数据 */
  List<Dalian1Entity> getReport(
          @Param("currentPage") int currentPage,
          @Param("start_date") String start_date,
          @Param("end_date") String end_date,
          @Param("searchType") String searchType);

  int getCount(
          @Param("start_date") String start_date,
          @Param("end_date") String end_date,
          @Param("searchType") String searchType);
}
