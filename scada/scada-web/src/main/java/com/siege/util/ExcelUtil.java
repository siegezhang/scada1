package com.siege.util;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Font;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ExcelUtil {
  public static void produceExcel(
      String excelName,
      HttpServletResponse response,
      List<Map<String, Object>> list,
      String[] titles,
      String[] fields) {
    HSSFWorkbook workbook = new HSSFWorkbook();
    HSSFSheet sheet = workbook.createSheet();
    sheet.autoSizeColumn(0);
    // sheet.setColumnWidth((short) 0, (short) (35.7));
    HSSFCellStyle cellStyle = workbook.createCellStyle();
    Font font = workbook.createFont();
    font.setFontName("宋体");
    // font.setFontHeightInPoints((short) 14);
    cellStyle.setFont(font);
    cellStyle.setWrapText(true);
    cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
    try {
      HSSFRow row0 = sheet.createRow(0);
      HSSFCell cell0;
      for (int i = 0; i < titles.length; i++) {
        cell0 = row0.createCell(i);
        cell0.setCellStyle(cellStyle);
        cell0.setCellValue(titles[i]);
      }
      int i = 1;
      HSSFRow row;
      Iterator<Map<String, Object>> iterator = list.iterator();
      while (iterator.hasNext()) {
        row = sheet.createRow(i);
        Map<String, Object> dataMap = iterator.next();
        for (int j = 0; j < fields.length; j++) {
          HSSFCell cell = row.createCell(j);
          cell.setCellType(Cell.CELL_TYPE_STRING);
          cell.setCellValue(String.valueOf(dataMap.get(fields[j])));
        }
        i++;
      }
      response.setCharacterEncoding("UTF-8");
      response.setContentType("application/vnd.ms-excel;charset=utf-8");
      response.setHeader(
          "Content-disposition", "attachment;filename=" + URLEncoder.encode(excelName, "UTF-8"));
      OutputStream outputStream = response.getOutputStream();
      workbook.write(outputStream);
      outputStream.flush();
      outputStream.close();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        workbook.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
