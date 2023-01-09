package com.automation.nopecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends PageBase{

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}
	@FindBy (linkText = "Windows 8 Pro")
	public WebElement itemAddedToCart;

	@FindBy (id = "checkout")
	WebElement checkoutButton;

	@FindBy (id = "termsofservice")
	WebElement termsOfServiceButton;

	public void goToCheckoutPage () throws InterruptedException{
		Thread.sleep(1000);
		clickONWebElement(termsOfServiceButton);
		clickONWebElement(checkoutButton);
	}
}
