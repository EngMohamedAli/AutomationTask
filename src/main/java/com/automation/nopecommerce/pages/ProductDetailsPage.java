package com.automation.nopecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase{

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy (id = "add-to-cart-button-11")
	WebElement addToCartButton;

	@FindBy (className = "cart-label")
	WebElement addCartIcon;

	public void addItemTocart(){
		clickONWebElement(addToCartButton);
	}

	public void goToShoppingCart(){
		clickONWebElement(addCartIcon);
	}
}
