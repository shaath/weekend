package com.orgHrm.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider 
{
	@Test(dataProvider="data")
	public void test(String br,String url)
	{
		WebDriver driver = null;
		System.out.println(br+"-----"+url);
		
		if (br.equalsIgnoreCase("firefox")) 
		{
			driver=new FirefoxDriver();
		}
		else if (br.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		driver.get(url);
	}
	
	@DataProvider(parallel=true)
	public Object[][] data()
	{
		Object[][] d=new Object[2][2];
		
		d[0][0]="Firefox";
		d[0][1]="http://google.com";
		
		d[1][0]="chrome";
		d[1][1]="http://faccebook.com";
		return d;
		
	}
	

}
