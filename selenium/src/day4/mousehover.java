package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class mousehover 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		
		WebElement link=driver.findElement(By.id("nav-link-shopall"));
		Actions act=new Actions(driver);
		
		act.moveToElement(link).build().perform();
		Sleeper.sleepTightInSeconds(5);
		WebElement books=driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[3]/span"));
		
		act.moveToElement(books).build().perform();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[3]/div[3]/div[1]/div/a[8]/span")).click();

	}

}
