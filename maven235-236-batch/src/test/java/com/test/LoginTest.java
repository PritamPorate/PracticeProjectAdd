package com.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.LoginPage;

public class LoginTest {

	WebDriver driver;
	LoginPage lp;
	public static Logger Log = Logger.getLogger(LoginTest.class);
	@BeforeMethod
	public void openBrowser()
	{
		Log.info("Browser open........");
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("E:/Selenium/Selenium Software all/Selenium Softwares/Offline Website/index.html");
		//driver.get("WebSiteToTest/index.html");

		driver.manage().window().maximize();
		lp=new LoginPage(driver);
	}
	@Test
	public void validateTitleOfDash()
	{
		lp.verifyCorrectCred();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
}
