package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage {
	
	public WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement selectRadiobutton_0;
	@FindBy(id = "continue")
	private WebElement continueSearch;
	
	public SelectPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}

    public WebElement getRadiobutton_0() {
		return selectRadiobutton_0;
	}
    public WebElement getcontinueSearch(){
		return continueSearch;
	}
}

