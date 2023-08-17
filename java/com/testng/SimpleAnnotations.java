package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleAnnotations {

	private WebElement driver;
	
	@BeforeSuite
	private void setproperty() {
	WebDriverManager.chromedriver().setup();
   }
	@BeforeTest
	private void browserlaunch() {
		WebDriver driver=new ChromeDriver();	
	}
	@BeforeClass
	private String launchingUrl() {
	WebDriver driver = null;
	driver.get("https://adactinhotelapp.com/");
	}
	@BeforeMethod
	private void login() {
	WebElement login=driver.findElement(By.id("login"));
	driver.click();
	}
	@Test
	private void SelectHotel() {
		WebElement SH = driver.findElement(By.id(""));
		driver.sendKeys();
	}
	
	
	
	

	

	}
	
	

}
