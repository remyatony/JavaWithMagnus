package day9;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadXls {
    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir") + File.separator + "TestData" + File.separator + "Test_data_set_1.xlsx";
        try(FileInputStream fis = new FileInputStream(path)){
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sh = wb.getSheetAt(1);
            DataFormatter df = new DataFormatter();
           String val= df.formatCellValue(sh.getRow(1).getCell(1));
            System.out.println(val);
        }

    }
}
