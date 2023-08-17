package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConformationPage {
	
	public WebDriver driver;
	
	@FindBy(id = "logout")
	private WebElement logout;
	
	public ConformationPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	public WebElement getLogout() {
		return logout;
	}

}
