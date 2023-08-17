package com.datadriven1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData1 {
	    private static void writeData() throws IOException {
		File f=new File("C:\\Users\\user\\Desktop\\Excel Sheets.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);		
		
//		wb.createSheet("EmployeeDetails").createRow(0).createCell(0).setCellValue("Name");
		wb.getSheet("EmployeeDetails").getRow(0).createCell(1).setCellValue("Abinaya");
		wb.getSheet("EmployeeDetails").createRow(1).createCell(0).setCellValue("ContactNum");
	    wb.getSheet("EmployeeDetails").getRow(1).createCell(1).setCellValue("6380990802");
	    
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
//		System.exit(0);
    	System.out.println("Write Successfully");
		wb.close();
	}
	    public static void main(String[] args)throws IOException {
	    	writeData();
		
		}
} 
		 
		
	

	
		
	
	

	
			
	


