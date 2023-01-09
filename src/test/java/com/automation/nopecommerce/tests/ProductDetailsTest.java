package com.automation.nopecommerce.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.nopecommerce.pages.ProductDetailsPage;
import com.automation.nopecommerce.pages.ShoppingCartPage;

public class ProductDetailsTest extends TestBase {

	ProductDetailsPage productObject;
	ShoppingCartPage shoppingCartObject;
	String productName = "Windows 8 Pro";

	@Test
	public void addProductToshoppingCart(){
		productObject = new ProductDetailsPage(driver);
		shoppingCartObject = new ShoppingCartPage(driver);
		productObject.addItemTocart();
		productObject.goToShoppingCart();
		Assert.assertTrue(shoppingCartObject.itemAddedToCart.getText().contains(productName));
	}

}
