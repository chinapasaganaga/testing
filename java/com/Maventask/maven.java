package com.Maventask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class maven {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\user\\eclipse-workspace\\Seleniumproject\\SeleniumDriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();                 
		driver.get("https://adactinhotelapp.com");              
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Abinayamari");
		driver.findElement(By.name("password")).sendKeys("abimari");
		WebElement login = driver.findElement(By.id("login" ));
		login.click();
		driver.findElement(By.id("location")).sendKeys("Sydney");
		driver.findElement(By.id("hotels")).sendKeys("Hotel Creek");
		driver.findElement(By.name("room_type")).sendKeys("Standard");
		driver.findElement(By.id("room_nos")).sendKeys("3");
		driver.findElement(By.id("datepick_in"));
		driver.findElement(By.id("datepick_out"));
		driver.findElement(By.id("adult_room")).sendKeys("4");
		driver.findElement(By.name("child_room")).sendKeys("2");
		WebElement select = driver.findElement(By.id("Submit"));
		select.click();
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		radio.click();
		WebElement conform = driver.findElement(By.id("continue"));
		conform.click();
		WebElement name = driver.findElement(By.id("first_name"));
		name.sendKeys("Abinaya");
		WebElement ln = driver.findElement(By.id("last_name"));
		ln.sendKeys("M");
	    WebElement address = driver.findElement(By.id("address"));
	    address.sendKeys("mdfuejkqnk689nundfm fjegfujskdn6nf jbmfnu");
	    WebElement cno = driver.findElement(By.id("cc_num"));
		cno.sendKeys("6387463892037386");
		driver.findElement(By.id("cc_type")).sendKeys("MAST");
		driver.findElement(By.id("cc_exp_month")).sendKeys("January");
		driver.findElement(By.id("cc_exp_year")).sendKeys("2026");
		driver.findElement(By.id("cc_cvv")).sendKeys("678");
		WebElement booknow= driver.findElement(By.id("book_now"));
		booknow.click();
		Thread.sleep(4000);
}
}



