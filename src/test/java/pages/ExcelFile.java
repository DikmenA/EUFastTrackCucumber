package pages;

import org.apache.poi.xssf.usermodel.*;
import org.junit.*;

import java.io.*;

public class ExcelFile {

    String path = "C:\\Users\\Zulpikar\\IdeaProjects\\EUFastTrackCucumber\\src\\test\\java\\utility\\sample data.xlsx";


    @Test
    public void test1() throws Exception {
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet workSheet = workbook.getSheetAt(0);
        System.out.println(workSheet.getRow(2).getCell(2));
    }

    @Test
    public void test2() throws Exception {
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook workbok = new XSSFWorkbook(fis);
        XSSFSheet worksheet = workbok.getSheetAt(0);
        XSSFCell cell = worksheet.getRow(0).createCell(0);
        cell.setCellValue(50);

        FileOutputStream fos = new FileOutputStream(path);
        workbok.write(fos);

        fos.close();
        workbok.close();
        fis.close();

    }
}
