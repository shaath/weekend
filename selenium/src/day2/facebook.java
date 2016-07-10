package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("phaneendra23");
		
		driver.findElement(By.id("pass")).sendKeys("xyz");
		driver.findElement(By.id("u_0_m")).click();
	}
}
