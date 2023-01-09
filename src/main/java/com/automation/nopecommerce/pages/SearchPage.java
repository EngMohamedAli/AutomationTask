package com.automation.nopecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase{

	public SearchPage(WebDriver driver) {
		super(driver);
	}

	@FindBy (id = "small-searchterms")
	WebElement searchText;

	@FindBy (css = "button-1.search-box-button")
	WebElement searchButton;

	@FindBy (className = "ui-menu-item-wrapper")
	WebElement autoValue;

	@FindBy(xpath = "//*[@class='product-name']/h1")
	public WebElement productname;

	public void searchForProduct(String productName){
		try {
			setTextElement(searchText, productName);
			Thread.sleep(2000);
			autoValue.click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
