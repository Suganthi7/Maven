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

public class Question1 {
	
	public static void getSheet() throws IOException {
		File f=new File("C:\\Users\\admin\\eclipse-workspace\\DataDriven\\ExcelSheet\\Question.xlsx");
		
		Workbook book=new XSSFWorkbook();
		Sheet sheet = book.createSheet("Sheet1");
		
		FileOutputStream fo=new FileOutputStream(f);
		book.write(fo);

	}
	
	public static Sheet getRow(int rowNo) throws IOException {
File f=new File("C:\\Users\\admin\\eclipse-workspace\\DataDriven\\ExcelSheet\\Question.xlsx");
		
		FileInputStream fin=new FileInputStream(f);
		Workbook book=new XSSFWorkbook(fin);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.createRow(rowNo);
		FileOutputStream fo=new FileOutputStream(f);
		book.write(fo);
		return sheet;
		

	}
	public static  void FileWrite(int rowNo,int cellNo,String name) throws IOException {
		File f=new File("C:\\Users\\admin\\eclipse-workspace\\DataDriven\\ExcelSheet\\Question.xlsx");
		
		FileInputStream fin=new FileInputStream(f);
		Workbook book=new XSSFWorkbook(fin);
		Sheet sheet = book.getSheet("Sheet1");
		
		Row row = sheet.getRow(rowNo);
        Cell cell = row.createCell(cellNo);
		cell.setCellValue(name);
		FileOutputStream fo=new FileOutputStream(f);
		book.write(fo);
		
		}
	public static void main(String[] args) throws IOException {
//		FileWrite(0, 0, "No");
//		FileWrite(0, 1, "Name");
//		FileWrite(0, 2, "Courses");
//		FileWrite(0, 3, "Adrresss");
//		getRow(1);
//		FileWrite(1, 0, "1");
//		FileWrite(1, 1, "Nisha");
//		FileWrite(1, 2, "Java");
//		FileWrite(1, 3, "Tvl");
//		getRow(2);
//		FileWrite(2, 0, "2");
//		FileWrite(2, 1, "Mathi");
//		FileWrite(2, 2, "Python");
//		FileWrite(2, 3, "Tvl");
//		getRow(3);
//		FileWrite(3, 0, "3");
//		FileWrite(3, 1, "Raji");
//		FileWrite(3, 2, "Selenium");
//		FileWrite(3, 3, "Sivaganga");
//		getRow(4);
//		FileWrite(4, 0, "4");
//		FileWrite(4, 1, "Bala");
//		FileWrite(4, 2, "Java");
//		FileWrite(4, 3, "Peraiyur");
//		getRow(5);
//		FileWrite(5, 0, "5");
//		FileWrite(5, 1, "Valli");
//		FileWrite(5, 2, "Python");
//		FileWrite(5, 3, "Covai");
//		getRow(6);
//		FileWrite(6, 0, "6");
//		FileWrite(6, 1, "Priya");
//		FileWrite(6, 2, "Java");
//		FileWrite(6, 3, "chennai");
//		getRow(7);
//		FileWrite(7, 0, "7");
//		FileWrite(7, 1, "Janu");
//		FileWrite(7, 2, "Python");
//		FileWrite(7, 3, "chennai");
//		getRow(8);
//		FileWrite(8, 0, "8");
//		FileWrite(8, 1, "kalai");
//		FileWrite(8, 2, "Selenium");
//		FileWrite(8, 3, "Chennai");
//		getRow(9);
//		FileWrite(9, 0, "9");
//		FileWrite(9, 1, "Naga");
//		FileWrite(9, 2, "Java");
//		FileWrite(9, 3, "Peraiyur");
//		getRow(10);
//		FileWrite(10, 0, "10");
//		FileWrite(10, 1, "Vasuki");
//		FileWrite(10, 2, "Python");
//		FileWrite(10, 3, "Viru");
File f=new File("C:\\Users\\admin\\eclipse-workspace\\DataDriven\\ExcelSheet\\Question.xlsx");
		
		FileInputStream fin=new FileInputStream(f);
		Workbook book=new XSSFWorkbook(fin);
		Sheet sheet = book.getSheet("Sheet1");
		int noOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("No of Rows:"+noOfRows);
		for (int i = 0; i < noOfRows; i++) {
			Row r = sheet.getRow(i);
			int cell = r.getPhysicalNumberOfCells();
			System.out.println(cell);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				System.out.println(c);
				
			}
			
		}
		
		
		
		
		
	}

}
