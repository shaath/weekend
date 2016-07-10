package com.orgHrm.Tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login 
{
	WebDriver driver; 
	FileInputStream fi;
	Properties pr;
	@BeforeTest
	public void launch() throws IOException
	{
		String prPath="F:\\weekend\\selenium\\src\\com\\orgHrm\\properties\\orange.properties";
		fi=new FileInputStream(prPath);
		pr=new Properties();
		pr.load(fi);
		driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com/");
	}
	@Test
	public void orglogin()
	{
		driver.findElement(By.id(pr.getProperty("uname"))).sendKeys("Admin");
		driver.findElement(By.id(pr.getProperty("pwd"))).sendKeys("admin");
		driver.findElement(By.id(pr.getProperty("login"))).click();
	}

}
