package com.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;

public class DashTest {

	WebDriver driver;
	LoginPage lp;
	DashboardPage dbp;
	public static Logger Log=Logger.getLogger(DashTest.class);
	@BeforeMethod
	public void openBrowser()
	{
		Log.info("Open browser.....");
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("E:/Selenium/Selenium Software all/Selenium Softwares/Offline Website/index.html");
		driver.manage().window().maximize();
		lp=new LoginPage(driver);
		dbp=new DashboardPage(driver);
	}
	@Test
	public void validateNameOfCourse()
	{ Log.info("Verify Title.....");
		lp.verifyCorrectCred();
		Assert.assertTrue(dbp.vrifyCourses());
	}

}
