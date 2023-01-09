package com.automation.nopecommerce.tests;

import org.testng.annotations.Test;

import com.automation.nopecommerce.pages.HomePage;
import com.automation.nopecommerce.pages.LoginPage;

public class LoginTest extends TestBase{

	HomePage homeObj;
	LoginPage loginObj;
	
	@Test
	public void userLoginSuccessfully() throws InterruptedException{
		homeObj = new HomePage(driver);
		homeObj.openLoginPage();
		loginObj= new LoginPage(driver);
		loginObj.userLogin("", "");
	}
}
