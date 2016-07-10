package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebooklogin {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("phaneendra23");
		
		driver.findElement(By.className("inputtext")).sendKeys("xyz");
}

}

