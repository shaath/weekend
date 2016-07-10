package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class gmaillogin {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://gmail.com");
		
		driver.manage().window().maximize();
		//entering the mail id in the textbox
		driver.findElement(By.id("Email")).sendKeys("sharathqedge449");
//		Thread.sleep(5000);
//		driver.findElement(By.id("Email")).clear();
//		
//		driver.findElement(By.id("Email")).click();
		
		//clicking on the next button
		driver.findElement(By.name("signIn")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("123456789");
		
		driver.findElement(By.cssSelector("#signIn")).click();
		
		

	}

}
