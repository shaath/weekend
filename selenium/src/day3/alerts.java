package day3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class alerts {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://irctc.co.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("loginbutton")).click();
		
		Alert alt=driver.switchTo().alert();
		Sleeper.sleepTightInSeconds(5);
		System.out.println(alt.getText());
		Sleeper.sleepTightInSeconds(5);
		alt.accept();
		

	}

}
