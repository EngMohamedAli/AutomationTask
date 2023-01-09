package com.automation.nopecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends PageBase{

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "BillingNewAddress_CountryId")
	WebElement counrtylist;

	public  void selectCountry(String countryValue) {
		Select drop = new Select(counrtylist);
		drop.selectByVisibleText("Egypt");
	}

	@FindBy(id = "BillingNewAddress_City")
	WebElement city;

	@FindBy(id = "BillingNewAddress_Address1")
	WebElement address;

	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	WebElement zipCode;

	@FindBy (id = "BillingNewAddress_PhoneNumber")
	WebElement phoneNumber;

	@FindBy(className = "new-address-next-step-button")
	WebElement billingSubmit;

	@FindBy(className = "shipping-method-next-step-button")
	WebElement shippingSubmit;

	@FindBy(xpath = ("//div[@class='page-title']/h1"))
	public WebElement checkout;

	@FindBy(className = "payment-method-next-step-button")
	WebElement paymentSubmit;

	@FindBy(className = "payment-info-next-step-button")
	WebElement paymentSubmit2;

	@FindBy(className = "confirm-order-next-step-button")
	WebElement confirm;

	public void checkoutProcess(String countryValue, String city1, String address1, String zipCode1, String phoneNumber1) throws InterruptedException{
		selectCountry(countryValue);
		setTextElement(city, city1);
		setTextElement(address, address1);
		setTextElement(zipCode, zipCode1);
		setTextElement(phoneNumber, phoneNumber1);
		Thread.sleep(1000);
		clickONWebElement(billingSubmit);
		Thread.sleep(1000);
		clickONWebElement(shippingSubmit);
		Thread.sleep(1000);
		clickONWebElement(paymentSubmit);
		Thread.sleep(1000);
		clickONWebElement(paymentSubmit2);
		Thread.sleep(1000);
		clickONWebElement(confirm);
		Thread.sleep(1000);
	}
}
