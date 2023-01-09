package com.automation.nopecommerce.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.nopecommerce.pages.HomePage;
import com.automation.nopecommerce.pages.SearchPage;
import com.automation.nopecommerce.pages.ShoppingCartPage;

import TestData.ExcelReader;

public class SearchForProductTest extends TestBase {
	HomePage homeObject;
	SearchPage searchObject;
	ShoppingCartPage cartObject;
	String productName = "Windows 8 Pro";
	@DataProvider(name = "testData")
	public static  Object[][] userData() throws IOException{
		ExcelReader excelreader = new ExcelReader();
		return excelreader.getExcelData("DataProvider",1,1);	 
	}
	
	@Test (dataProvider = "testData")
	public void usersearcForProduct(String product) throws InterruptedException{
		searchObject = new SearchPage(driver);
		searchObject.searchForProduct(product);
		Assert.assertEquals(searchObject.productname.getText(), productName);		
	}

}