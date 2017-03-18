package com.github.VickyWang.ApachePoi;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class Import2003 {
    public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
        Workbook wb = WorkbookFactory.create(new File("c:/test.xls"));

        Sheet sheet = wb.getSheetAt(0);
        List<Connect> data = new ArrayList<>();

        for (int i = 1; i <=sheet.getLastRowNum() ; i++) {
            Connect c = new Connect();
            Row row = sheet.getRow(i);
            Cell c1 = row.getCell(0);
            Cell c2 = row.getCell(1);
            Cell c3 = row.getCell(2);
            Cell c4 = row.getCell(3);

            c.setName(c1.getStringCellValue());
            c.setAddress(c2.getStringCellValue());
            c.setTel(c3.getStringCellValue());
            c.setBirthdayStr(c4.getStringCellValue());

            data.add(c);
        }
        System.out.println(data);
        wb.close();
    }
}

