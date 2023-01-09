package com.automation.nopecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="Email")
	WebElement emailtext;
	
	@FindBy(id="Password")
	WebElement passwordtext;
	
	@FindBy(className = "login-button")
	WebElement loginButton;
	
	@FindBy(linkText = "My account")
	WebElement MyAccountButton;
	
	@FindBy(linkText = "My account")
	public WebElement myAccount;

	
	public void userLogin(String email, String password) throws InterruptedException{
		Thread.sleep(2000);
		setTextElement(emailtext, email);
		setTextElement(passwordtext, password);
		Thread.sleep(2000);
		clickONWebElement(loginButton);
		
	}
	
	public void userAccount() throws InterruptedException{
		clickONWebElement(MyAccountButton);
	}
	
}
