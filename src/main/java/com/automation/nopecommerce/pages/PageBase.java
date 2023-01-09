package com.automation.nopecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	protected WebDriver driver;
	public PageBase (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	protected static void clickONWebElement(WebElement element){
		element.click();
	}

	protected static void setTextElement(WebElement element, String text){
		element.sendKeys(text);
	}

}
