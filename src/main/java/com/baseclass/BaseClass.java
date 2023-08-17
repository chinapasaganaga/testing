package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriver browserlaunch(String browserType) {
		if (browserType.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browserType.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	    }
	   public static void loginUrl(String loginUrl) {
		  driver.get(loginUrl);
	}
	   public static String logindata(String filepath,int sheetIndex,int rowIndex,int cellIndex) throws Throwable {
		   File f=new File(filepath);
		   FileInputStream fis=new FileInputStream(f);
		   Workbook wb=new XSSFWorkbook(fis);
		   Sheet sheetAt=wb.getSheetAt(sheetIndex);
		   Row row=sheetAt.getRow(rowIndex);
		   Cell cell=row.getCell(cellIndex);
		   CellType celltype=cell.getCellType();
		   
		   String cellValue=null;
		   if (celltype.equals(CellType.STRING)) {
			   cellValue=cell.getStringCellValue();
		   }
			   else if(celltype.equals(CellType.NUMERIC)) {
				   double doubleaValue=cell.getNumericCellValue();
				   int intValue=(int)doubleaValue;
				   cellValue=String.valueOf(intValue);		   
		}
		   wb.close();
		   return cellValue;
	}
	public static void screenshot(String fileName) throws Throwable {
		TakesScreenshot tss=(TakesScreenshot) driver;
		File src=tss.getScreenshotAs(OutputType.FILE);
		File des=new File(fileName);
		FileUtils.copyFile(src, des);
	}
	public static void inputValue(WebElement element,String Value) {
		element.clear();
		element.sendKeys(Value);
	}
	public static void buttonClick(WebElement element) {
		element.click();
	}
	public static void selectOption(WebElement element,String selectType, String selectValue) {
		Select selt=new Select(element);
		switch (selectType) {
		case "byIndex":
			int intvalue = Integer.parseInt(selectValue);
			selt.selectByIndex(intvalue);
			break;
		case"byValue":
			selt.selectByValue(selectValue);
			break;
	}
}
	public static void waitTime(int duration) {
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
	}
	public static void scrollPage(String valueSg) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript(valueSg);
	}
}
		
		
		

	
		


		
		

	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
			
		
		

	
	
	
	
	
	
	
