package day4;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class multiplewindow 
{

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Privacy")).click();
		
//		driver.findElement(By.linkText("Terms of Service")).click();
		
		
		Set<String>  s=driver.getWindowHandles();

		Iterator<String> it=s.iterator();
		
		while (it.hasNext())
		{
			
			String windowid=it.next();
			driver.switchTo().window(windowid);
			try 
			{
				driver.findElement(By.linkText("Terms of Service")).click();
				Sleeper.sleepTightInSeconds(5);
				System.out.println(driver.getTitle());
			} 
			catch (Exception e) 
			{
				System.out.println(e.getMessage());
				System.out.println("Terms of Service link not available in this page");
			}
//			System.out.println(driver.getTitle()+"--"+windowid);
			
		}
	}

}
