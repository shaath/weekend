package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class methods {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
//		System.out.println(driver.getTitle());
//		
//		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
		
		
		
	}

}
