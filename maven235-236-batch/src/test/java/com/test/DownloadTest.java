package com.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.DownloadPage;
import com.pages.LoginPage;

public class DownloadTest {

	WebDriver driver;
	LoginPage lp;
	DownloadPage dop;
	public static Logger Log = Logger.getLogger(DownloadTest.class);
	
	@BeforeMethod
	public void openBrowser()
	{
		Log.info("open Browser........");
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("E:/Selenium/Selenium Software all/Selenium Softwares/Offline Website/index.html");
		lp=new LoginPage(driver);
		dop= new DownloadPage(driver);
		
	}
	@Test
	public void verifyTitleOfDownloadPage()
	{
	    	lp.verifyCorrectCred();
	    	dop.openDownloadPage();
	    	Assert.assertEquals("JavaByKiran | Downloads", driver.getTitle());
	}
}
