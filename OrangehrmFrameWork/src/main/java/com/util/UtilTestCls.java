package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.base.TestBase;

public class UtilTestCls extends TestBase
{
	public static String exceldata="./src/main/java/com/testdata/Orange_hrm.xlsx";
	public static XSSFWorkbook book;
	public static FileInputStream file;
	public static XSSFSheet sheet;
	
	
	public static String[][] getexceldata(String sheetname)
	{
		
		try 
		{
			file =new FileInputStream(exceldata);
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		try
		{
			book= new XSSFWorkbook(file);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		
		sheet = book.getSheet(sheetname);
		int row=sheet.getPhysicalNumberOfRows();
		int column=sheet.getRow(1).getLastCellNum();
		String[][] data = new String[row-1][column];
		for(int r=0;r<row-1;r++)
		{
			for(int k=0;k<column;k++)
			{
				DataFormatter df = new DataFormatter();
				data[r][k] = df.formatCellValue(sheet.getRow(r+1).getCell(k));
			}
		}
		return data;
		
	}
	

}
