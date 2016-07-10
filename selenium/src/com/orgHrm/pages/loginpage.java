package com.orgHrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage 
{
	public static String url="http://opensource.demo.orangehrm.com/";
	public static String u="Admin",p="admin";
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement pswd;
	
	@FindBy(id="btnLogin")
	WebElement login;
	
	public void org_Login(String u,String p)
	{
		username.sendKeys(u);
		pswd.sendKeys(p);
		login.click();
	}

}
