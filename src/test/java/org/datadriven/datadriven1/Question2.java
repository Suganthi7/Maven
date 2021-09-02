package org.datadriven.datadriven1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Question2 extends BaseClass {
	
	
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\admin\\eclipse-workspace\\DataDriven\\ExcelSheet\\fb.login.xlsx");
		
		Workbook book=new XSSFWorkbook();
		
		Sheet sh = book.createSheet("Sheet1");
		
		Row r = sh.createRow(0);
		Row r1 = sh.getRow(0);
		
		Cell c = r.createCell(0);
		Cell c1 = r1.createCell(1);
		
		c.setCellValue("UserName");
	    c1.setCellValue("Password");
		
	    
	    Row r2 = sh.createRow(1);
	    Row r3 = sh.getRow(1);
		
	    Cell c2 = r2.createCell(0);
		 Cell c3 = r3.createCell(1);
		
		c2.setCellValue("Green");
		c3.setCellValue("Technology");
		
		FileOutputStream fo=new FileOutputStream(f);
		book.write(fo);
	
		

		
	}

}
