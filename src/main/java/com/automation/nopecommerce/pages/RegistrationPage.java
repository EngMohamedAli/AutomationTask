package com.automation.nopecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends PageBase{

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "gender-female")
	WebElement gender;

	@FindBy(id = "FirstName")
	WebElement firstNametxt;

	@FindBy(id = "LastName")
	WebElement lastNametxt;

	@FindBy(id = "Email")
	WebElement emailtxt;

	@FindBy(id = "Password")
	WebElement passwordtxt;

	@FindBy(id = "ConfirmPassword")
	WebElement confirmPassword;

	@FindBy(id = "register-button")
	WebElement registerButton;


	public @FindBy(className = "result")
	WebElement successMassege;

	public void userRegistration(String firstName, String lastName, String email,String password) throws InterruptedException{
		Thread.sleep(2000);
		gender.click();
		setTextElement(firstNametxt, firstName);
		setTextElement(lastNametxt, lastName);
		setTextElement(emailtxt, email);
		setTextElement(passwordtxt, password);
		setTextElement(confirmPassword, password);
		Thread.sleep(2000);
		clickONWebElement(registerButton);
	}

}
