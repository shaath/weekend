package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		
		int x=drop.getLocation().x;
		int y=drop.getLocation().y;
		
		System.out.println(x+"-----"+y);
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(drag, drop).build().perform();
		
		
	}

}
