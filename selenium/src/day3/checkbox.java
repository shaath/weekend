package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkbox
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Email")).sendKeys("sharathqedge449");
		driver.findElement(By.id("next")).click();
		Thread.sleep(3000);
		
		if (driver.findElement(By.id("PersistentCookie")).isSelected())
		{
			driver.findElement(By.id("PersistentCookie")).click();
			
		}
		else
		{
			System.out.println("It is alreaddy in unchecked position");
		}
		

	}

}
