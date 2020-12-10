package excelWorkingSample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		String excelFilePath = ".\\DataFiles\\Cricket_data.xlsx";
		FileInputStream inputStream = new FileInputStream(excelFilePath);
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0); //or you can use getSheet like this XSSFSheet sheet = workbook.getSheet("Sheet1");
        int rows = sheet.getLastRowNum();
        System.out.println(rows);
        int columns = sheet.getRow(1).getLastCellNum();
        System.out.println(columns);
        for(int r = 0; r<=rows;r++) {
        	XSSFRow row = sheet.getRow(r);
        	for(int c=0;c<columns;c++) {
        		XSSFCell cell = row.getCell(c);
        		switch(cell.getCellType())
        		{
        		case STRING: System.out.print(cell.getStringCellValue());break;
        		case NUMERIC: System.out.print(cell.getNumericCellValue());break;
        		case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;       		
        		}
        		
        	}
        	System.out.println();
        	System.out.println("------");
        }
	
	}

}
