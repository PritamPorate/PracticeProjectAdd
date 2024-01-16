package com.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.pages.OperatorPage;

public class OperatorTest {

	WebDriver driver;
	LoginPage lp;
	OperatorPage op;
	public static Logger Log =Logger.getLogger(OperatorTest.class);
	//LoginTest lt;
	@BeforeMethod
	public void openBrowser()
	{
		Log.info("open Browser...........");
	System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	driver =new ChromeDriver();
	driver.get("E:/Selenium/Selenium Software all/Selenium Softwares/Offline Website/index.html");
		op= new OperatorPage(driver);
		lp = new LoginPage(driver);
	}
	@Test
	public void verifyTitleOfOperatorPage()
	{
		lp.verifyCorrectCred();
		op.openOperatorPage(driver);
		Assert.assertEquals("JavaByKiran | Operators", driver.getTitle());
		
		
	}
}
