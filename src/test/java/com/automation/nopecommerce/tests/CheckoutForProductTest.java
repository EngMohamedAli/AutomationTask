package com.automation.nopecommerce.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.nopecommerce.pages.CheckoutPage;
import com.automation.nopecommerce.pages.ThankYouPage;

import TestData.ExcelReader;

public class CheckoutForProductTest extends TestBase{
	CheckoutPage checkoutObject;
	ThankYouPage thankYouObject;
	String thankYouMessage = "Thank you";
	@DataProvider(name = "testData")
	public static  Object[][] userData() throws IOException{
		ExcelReader excelreader = new ExcelReader();
		return excelreader.getExcelData("DataProvider",2,5);	 
	}

	@Test (dataProvider = "testData")
	public void userCheckoutForOrder(String countryValue, String city, String address, String zipCode, String phoneNumber) throws InterruptedException {
		checkoutObject = new CheckoutPage(driver);
		thankYouObject = new ThankYouPage(driver);
		checkoutObject.checkoutProcess(countryValue,city,address,zipCode,phoneNumber);
		Assert.assertTrue(thankYouObject.thankYou.getText().contains(thankYouMessage));
		
	}

}
