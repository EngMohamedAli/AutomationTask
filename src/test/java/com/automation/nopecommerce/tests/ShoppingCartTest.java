package com.automation.nopecommerce.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.nopecommerce.pages.CheckoutPage;
import com.automation.nopecommerce.pages.ShoppingCartPage;

public class ShoppingCartTest extends TestBase {
	
	ShoppingCartPage cartObject;
	CheckoutPage checkoutObj;
	String checkoutMessage = "Checkout";
	
	@Test ()
	public void goToCheckoutProcess() throws InterruptedException {
		cartObject = new ShoppingCartPage(driver);
		checkoutObj = new CheckoutPage(driver);
		cartObject.goToCheckoutPage();
		Thread.sleep(2000);
		Assert.assertTrue(checkoutObj.checkout.getText().contains(checkoutMessage));
	}
}
