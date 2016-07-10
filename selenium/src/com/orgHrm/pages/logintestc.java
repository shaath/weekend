package com.orgHrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class logintestc 
{
	@Test
	public void login()
	{
		WebDriver driver=new FirefoxDriver();
		loginpage lp=PageFactory.initElements(driver, loginpage.class);
		adminpage ap=PageFactory.initElements(driver, adminpage.class);
		driver.get(lp.url);
		if (lp.login.isDisplayed()) 
		{
			
		}
		lp.org_Login(lp.u, lp.p);
		if ((ap.welcome).isDisplayed())
		{
			
			
		}
		
		
		ap.welcomeadminclick();
		ap.logoutclick();
		
		driver.close();
		
		
	}

}
