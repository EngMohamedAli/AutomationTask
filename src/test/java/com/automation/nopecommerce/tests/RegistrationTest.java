package com.automation.nopecommerce.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.nopecommerce.pages.HomePage;
import com.automation.nopecommerce.pages.LoginPage;
import com.automation.nopecommerce.pages.RegistrationPage;

import TestData.ExcelReader;


public class RegistrationTest extends TestBase {
	HomePage homeObject;
	RegistrationPage useRegistrationOjc;
	LoginPage loginObject;
	String registrationComplete = "Your registration completed";
	@DataProvider(name = "testData")
	public static  Object[][] userData() throws IOException{
		ExcelReader excelreader = new ExcelReader();
		return excelreader.getExcelData("DataProvider",0,4);	 
	}

	@Test (priority = 0, dataProvider = "testData")
	public void userRegisterSuccessfully(String fName ,String lName,String email,String  password) throws InterruptedException{
		homeObject = new HomePage(driver);
		homeObject.openRegistrationPage();
		useRegistrationOjc= new RegistrationPage(driver);
		useRegistrationOjc.userRegistration(fName, lName, email, password);		
		Assert.assertTrue(useRegistrationOjc.successMassege.getText().contains(registrationComplete));
		homeObject.openLoginPage();
		loginObject= new LoginPage(driver);
		loginObject.userLogin(email, password);
		Assert.assertTrue(loginObject.myAccount.getText().contains("My account"));
	}
}
