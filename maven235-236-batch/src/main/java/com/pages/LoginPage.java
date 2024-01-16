package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.objRepo.LoginPageObjRepo;

public class LoginPage extends LoginPageObjRepo {

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyCorrectCred()
	{
		username.sendKeys("kiran@gmail.com");
		pass.sendKeys("123456");
		loginBtn.click();
		
	}
}
