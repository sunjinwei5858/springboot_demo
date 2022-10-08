package com.sunjinwei.utils;

import com.alibaba.excel.EasyExcel;

import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.List;

/**
 * @program: com.sunjinwei.utils
 * @author: sun jinwei
 * @create: 2022-10-09 07:09
 * @description:
 **/
public class ExcelUtils {

    public static <T> void exportEasyExcel(
            HttpServletResponse response,
            String fileName,
            String sheetName,
            Class<T> clazz,
            List<T> list
    ) throws Exception {
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        try {
            // 防止中文乱码
            String fileNameEncode = URLEncoder.encode(fileName, "UTF-8");
            String fileNameStr = "attachment;filename=" +
                    fileNameEncode +
                    ".xlsx";
            response.setHeader("content-disposition", fileNameStr);
            response.setHeader("Access-Control-Expose-Headers", "content-disposition");
            EasyExcel.write(response.getOutputStream(), clazz).sheet(sheetName).doWrite(list);
        } catch (Exception e) {
            throw e;
        }


    }

}