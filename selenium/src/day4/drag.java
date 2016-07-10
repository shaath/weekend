package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement drag=driver.findElement(By.id("draggable"));
		
		Actions act =new Actions(driver);
		act.dragAndDropBy(drag, 50, 200).build().perform();
		
	}

}
