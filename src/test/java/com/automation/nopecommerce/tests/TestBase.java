package com.automation.nopecommerce.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class TestBase {
	public static WebDriver driver;

	@BeforeSuite
	@Parameters ({"browser"})
	public void startDriver (){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
	}

	@AfterSuite
	public void stopDriver(){
		driver.quit();
	}
}
