package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.pages.UsefulLinkPage;

public class UsefulLinkTest {

	WebDriver driver;
	LoginPage lp;
	UsefulLinkPage ulp;
	@BeforeMethod
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("E:/Selenium/Selenium Software all/Selenium Softwares/Offline Website/index.html");
		lp= new LoginPage(driver);
		ulp=new UsefulLinkPage(driver);
		
	}
	@Test
	public void verifyUsefulLinkPageTilte()
	{
		lp.verifyCorrectCred();
		ulp.openUsefulLinkPAge(driver);
		Assert.assertEquals("JavaByKiran | Useful Links", driver.getTitle());
	}
}
