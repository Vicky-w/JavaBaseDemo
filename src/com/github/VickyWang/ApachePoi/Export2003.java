package com.github.VickyWang.ApachePoi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Export2003 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // 准备模拟数据
        Connect c1 = new Connect("Tom", "Beijing", "438682293", new Date());
        Connect c2 = new Connect("张小军", "Shanghai", "89489343", new Date());
        Connect c3 = new Connect("Tom", "美国", "90842734", new Date());
        Connect c4 = new Connect("刘强", "英国", "69834340", new Date());
        Connect c5 = new Connect("Mike", "Beijing", "69082345", new Date());

        List<Connect> data = new ArrayList<>();
        data.add(c1);
        data.add(c2);
        data.add(c3);
        data.add(c4);
        data.add(c5);

        // 得到一个excel2003格式的workbook对象
        Workbook wb = new HSSFWorkbook();
        // 在workbook对象中创建一个名为"联系人信息"的sheet对象
        Sheet sheet = wb.createSheet("联系人信息");
        // 在sheet中创造表头行
        Row head = sheet.createRow(0);

        // 在表头行中创建4个单元格
        Cell ce1 = head.createCell(0);
        Cell ce2 = head.createCell(1);
        Cell ce3 = head.createCell(2);
        Cell ce4 = head.createCell(3);

        // 为每个表头行的单元格填充内容
        ce1.setCellValue("姓名");
        ce2.setCellValue("地址");
        ce3.setCellValue("电话");
        ce4.setCellValue("生日");

        // 通过遍历数据容器来为每一个数据元素创建一个数据行，并把信息填写在相应的单元格内
        for (int i = 1; i <= data.size(); i++) {
            Connect c = data.get(i - 1);
            Row row = sheet.createRow(i);
            row.createCell(0).setCellValue(c.getName());
            row.createCell(1).setCellValue(c.getAddress());
            row.createCell(2).setCellValue(c.getTel());
            row.createCell(3).setCellValue(c.getBirthdayStr());
        }

        // 向磁盘中写入excel文件
        wb.write(new FileOutputStream(new File("c:/test.xls")));
        wb.close();
    }
}