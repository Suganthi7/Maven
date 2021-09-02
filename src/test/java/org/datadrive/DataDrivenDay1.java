package org.datadrive;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class DataDrivenDay1 {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\admin\\eclipse-workspace\\MavenProject\\Excel Sheet\\excelwork.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook book =new XSSFWorkbook(fin);
		Sheet sh = book.getSheet("sheet1");
		int rowsCount = sh.getPhysicalNumberOfRows();
		System.out.println("No of Rows :"+rowsCount);
		for (int i = 0; i < rowsCount; i++) {
			Row row = sh.getRow(i);
			for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				if (cellType==1) {
					String string = cell.getStringCellValue();
					System.out.println(string);}
					else if (DateUtil.isCellDateFormatted(cell)) {
						Date date = cell.getDateCellValue();
						System.out.println(date);
						SimpleDateFormat form=new SimpleDateFormat("dd/MM/yy");
						String data = form.format(date);
						System.out.println(data);
			}
					else {
						double d = cell.getNumericCellValue();
						System.out.println(d);
						long lo=(long)d;
						String  stringdata = String.valueOf(lo);
						System.out.println(stringdata);
						
				
					
				}
				
			}
			
			
		
		
		}
		
		
		
		

		
	}
	

}
