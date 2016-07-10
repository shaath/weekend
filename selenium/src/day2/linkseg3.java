package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkseg3 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://192.168.1.100/primusbank1/sitemap.html");
		driver.manage().window().maximize();
		//method1
//		driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td/ul/li[1]/a")).click();
		
		//method2
		WebElement block=driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td/ul"));
		
		List<WebElement> links=block.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++) 
		{
			String linktext=links.get(i).getText();
			if (linktext.equalsIgnoreCase("home"))
			{
				links.get(i).click();
				break;
				
			}
			
		}
	}

}
