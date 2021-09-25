package week6.day1;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ReadExcel {

	public static void main(String[] args) throws IOException {

		// Locate the excel file
		XSSFWorkbook wbook = new XSSFWorkbook("./data/tc001.xlsx");
		// workbook (collections of sheet)
		// sheet (0)
		XSSFSheet sheet = wbook.getSheetAt(0);
		// how many rows & cols are there
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("Rows: "+ lastRowNum);
		
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("including header: "+ physicalNumberOfRows);
		
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("Columns: "+lastCellNum);
		// convert the cell to string
		DataFormatter dft = new DataFormatter();		
		// row & col => cell
		for (int i = 1; i <= lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j =0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				String value = dft.formatCellValue(cell);
				
//				String value = cell.getStringCellValue();
				
				System.out.println(value);
			}
		}
		
		wbook.close();
		
	

	}

}
