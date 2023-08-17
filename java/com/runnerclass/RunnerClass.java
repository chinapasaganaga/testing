package com.runnerclass;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.baseclass.BaseClass;
import com.datadriven1.ReadData;
import com.datadriven1.ReadData1;
import com.pom.BookHotelPage;
import com.pom.ConformationPage;
import com.pom.LoginPage;
import com.pom.SearchPage;
import com.pom.SelectPage;

public class RunnerClass extends BaseClass {

	static WebDriver driver1 = browserLaunch("Chrome");

	public static void main(String[] args, Object AbinayaMari) throws IOException {
		
		LoginPage lp=new LoginPage(driver1);
		
		LoginUrl("https://adactinhotelapp.com/");
		String username=lp("C:\\Users\\user\\eclipse-workspace\\Maventask\\src\\NewXL\\Excel Sheets.xlsx", 0, 1, 0);
		inputvalueElement(lp.getUsername(), username);
		String password=lp("C:\\Users\\user\\eclipse-workspace\\Maventask\\src\\NewXL\\Excel Sheets.xlsx", 0, 1, 1);
	    inputvalueElement(lp.getPassword(), password);
	    clickonelement(lp.getLogin());
	    
	   SearchPage SearchPage = new SearchPage(driver1);
	    
	   Select(SearchPage.getLocation(), "byIndex", "2");
	   Select(SearchPage.getHotels(), "byIndex", "1");
	   Select(SearchPage.getRoom_type(),"byValue", "Standard");
	   Select(SearchPage.getRoom_nos(), "byIndex", "2");
	   inputvalueElement(SearchPage.getDatepick_in(), "03/08/2023");
	   inputvalueElement(SearchPage.getDatapick_out(), "06/08/2023");
	   Select(SearchPage.getAdult_room(), "byValue", "1");
	   Select(SearchPage.getChild_room(), "byVisible", "1");
	   clickonelement(SearchPage.getSubmit());
	   
	   SelectPage SelectPage = new SelectPage(driver1);
	   
	   clickonelement(SelectPage.getRadiobutton_0());
	   clickonelement(SelectPage.getcontinueSearch());
	   
	   BookHotelPage BookHotelPage = new BookHotelPage(driver1);
	   
	   inputvalueElement(BookHotelPage.getFirst_name(), "Abinaya");
	   inputvalueElement(BookHotelPage.getLast_name(), "Kannan");
	   inputvalueElement(BookHotelPage.getAddress(), "hggfuhjiffsedhgcvjhghlkm");
	   inputvalueElement(BookHotelPage.getCc_num(),"8789076543246788");
	   Select(BookHotelPage.getCc_type(), "byIndex", "1");
	   Select(BookHotelPage.getCc_exp_month(), "byIndex", "August");
	   Select(BookHotelPage.getCc_exp_year(), "byIndex", "2025");
	   inputvalueElement(BookHotelPage.getCc_cvv(), "678");
	   clickonelement(BookHotelPage.getBook_now());
	   
	   
	   ConformationPage ConformationPage = new ConformationPage(driver1);
	   
	   clickonelement(ConformationPage.getLogout());
	   
	   
	}


	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	  
	  
	  
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	

	private WebElement getLogin() {
		// TODO Auto-generated method stub
		return null;
	}















































	private WebElement getPassword() {
		// TODO Auto-generated method stub
		return null;
	}















































	private WebElement getUsername() {
		// TODO Auto-generated method stub
		return null;
	}















































	public static WebDriver browserLaunch(String string) {
		// TODO Auto-generated method stub
		return null;
	}















































	private static void clickonelement(WebElement login) {
		// TODO Auto-generated method stub
		
	}


	private static void inputvalueElement(WebElement username, String username2) {
		// TODO Auto-generated method stub
		
	}


	private static void Select(WebElement datepick_in) {
		// TODO Auto-generated method stub
		
	}


	private static void Select(WebElement location, String string, String string2) {
		// TODO Auto-generated method stub
		
	}


	private static String lp(String string, int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void LoginUrl(String string) {
		// TODO Auto-generated method stub
		
	}
}

	


		
	
	
	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
//		WebElement un = driver.findElement(By.id("username"));
//		un.sendKeys("AbinayaMari");
//        inputvalueElement(un, "AbinayaMari");	
//		WebElement pw = driver.findElement(By.id("password"));
//		pw.sendKeys("abimari");
//		inputvalueElement(pw, "abimari");
//		WebElement login = driver.findElement(By.id("login"));
//		login.click();
//		clickonelement(login);
//		
//	}
//
//	private static void getUrl(String string) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	}
//
//
//
//WebDriverManager.chromedriver().setup();
//WebDriver driver=new ChromeDriver();
////driver.get("https://adactinhotelapp.com/");
//driver.manage().window().maximize();
