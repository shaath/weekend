package com.orgHrm.Master;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class testng 
{
	public WebDriver driver;
	public static String url="http://opensource.demo.orangehrm.com";
	public static String expval,actval;
	public static String u="Admin",p="admin";
	public static String f="Sharath123",l="Chandra";
	public static String ename=f+" "+l,uname="Sharath123456789";
	public static String pwd="Sharath123456",cpwd="Sharath123456";
	
  @BeforeTest
  public void beforeTest() 
  {
	  	expval="welcome";
		driver.findElement(By.id("txtUsername")).sendKeys(u);
		driver.findElement(By.id("txtPassword")).sendKeys(p);
		driver.findElement(By.id("btnLogin")).click();
		actval=driver.findElement(By.id("welcome")).getAttribute("id");
		Assert.assertEquals(actval, expval,"Login Failed");
  }

  @AfterTest
  public void afterTest() 
  {
	  	expval="LOGIN";
		driver.findElement(By.id("welcome")).click();
		
		driver.findElement(By.xpath(".//*[@id='welcome-menu']/ul/li[2]/a")).click();
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(actval, expval,"Logout Failed");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  expval="LOGIN";
	  driver=new FirefoxDriver();
	  driver.get(url);
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
	  Assert.assertEquals(actval, expval,"Launch Failed");
	  
  }

  @AfterSuite
  public void afterSuite()
  {
	  driver.close();
  }

}
