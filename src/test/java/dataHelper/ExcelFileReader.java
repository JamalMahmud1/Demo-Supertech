package dataHelper;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ExcelFileReader {
    public static Object[][] ExcelReader(String filePath,String sheetName) throws IOException {
        FileInputStream fis=new FileInputStream(filePath);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet ws=wb.getSheet(sheetName);
        int rowCount=ws.getLastRowNum();
        int colCount=ws.getRow(0).getLastCellNum();
        Object[][]objects=new Object[rowCount][colCount];
        for(int i=0;i<rowCount;i++) {
            Row row=ws.getRow(i+1);

            for(int j=0;j<row.getLastCellNum();j++){
                objects[i][j]=row.getCell(j).toString();
            }
        }

        return objects;


    }

}
