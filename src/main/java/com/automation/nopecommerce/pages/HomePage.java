package com.automation.nopecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText="Register")
	WebElement registerlink;
	
	@FindBy(className="ico-login")
	WebElement loginlink;
	
	public void openRegistrationPage(){
		clickONWebElement(registerlink);
	}
	
	public void openLoginPage(){
		clickONWebElement(loginlink);
	}	
}
