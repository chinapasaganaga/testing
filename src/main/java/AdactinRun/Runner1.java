package AdactinRun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.baseclass.BaseClass;
import com.pom.BookHotelPage;
import com.pom.ConformationPage;
import com.pom.LoginPage;
import com.pom.SearchPage;
import com.pom.SelectPage;

public class Runner1 extends BaseClass {

	  static  WebDriver driver = browserlaunch("Chrome");

	public static void main(String[] args) throws Throwable {
		
		LoginPage lp=new LoginPage(driver);
		
		loginUrl("https://adactinhotelapp.com/");
		String username=logindata("C:\\Users\\user\\eclipse-workspace\\Maventask\\src\\NewXL\\Excel Sheets.xlsx", 0, 1, 0);
		inputValue(lp.getUsername(), username);
		String password=logindata("C:\\Users\\user\\eclipse-workspace\\Maventask\\src\\NewXL\\Excel Sheets.xlsx", 0, 1, 1);
	    inputValue(lp.getPassword(), password);
	    buttonClick(lp.getLogin());
	    
	   SearchPage SearchPage = new SearchPage(driver);
	    
	   selectOption(SearchPage.getLocation(), "byIndex", "2");
	   selectOption(SearchPage.getHotels(), "byIndex", "1");
	   selectOption(SearchPage.getRoom_type(),"byValue", "Standard");
	   selectOption(SearchPage.getRoom_nos(), "byIndex", "2");
	   inputValue(SearchPage.getDatepick_in(), "03/08/2023");
	   inputValue(SearchPage.getDatapick_out(), "06/08/2023");
	   selectOption(SearchPage.getAdult_room(), "byValue", "1");
	   selectOption(SearchPage.getChild_room(), "byVisible", "1");
	   buttonClick(SearchPage.getSubmit());
	   
	   SelectPage SelectPage = new SelectPage(driver);
	   
	   buttonClick(SelectPage.getRadiobutton_0());
	   buttonClick(SelectPage.getcontinueSearch());
	   
	   BookHotelPage BookHotelPage = new BookHotelPage(driver);
	   
	   inputValue(BookHotelPage.getFirst_name(), "Abinaya");
	   inputValue(BookHotelPage.getLast_name(), "Kannan");
	   inputValue(BookHotelPage.getAddress(), "hggfuhjiffsedhgcvjhghlkm");
	   inputValue(BookHotelPage.getCc_num(),"8789076543246788");
	   selectOption(BookHotelPage.getCc_type(), "byIndex", "1");
	   selectOption(BookHotelPage.getCc_exp_month(), "byIndex", "August");
	   selectOption(BookHotelPage.getCc_exp_year(), "byIndex", "2025");
	   inputValue(BookHotelPage.getCc_cvv(), "678");
	   buttonClick(BookHotelPage.getBook_now());
	   
	   waitTime(6);
	  
	   ConformationPage ConformationPage = new ConformationPage(driver);
	   
	   buttonClick(ConformationPage.getLogout());
	}
}

//	public static WebDriver browserlaunch(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static WebDriver driverlaunch(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	   
//	}

//	private static void getUrl(String string) {
//	// TODO Auto-generated method stub
//	
//}
//
//	private static void Select(WebElement location, String string, String string2) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void clickonelement(WebElement login) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void inputvalueElement(WebElement username, String username2) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static String lp(String string, int i, int j, int k) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
////	private static void LoginUrl(String string) {//
//		// TODO Auto-generated method stub
//		
//	
//
//	public static WebDriver browserLaunch(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	   
	   
	   
	   
	   
	   


