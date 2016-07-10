package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkseg2 {

	public static void main(String[] args) {
		int count=0;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) 
		{
			String linktext=links.get(i).getText();
			if (linktext.equalsIgnoreCase("rajinikant")) 
			{
				System.out.println("Rjinikanth link is available in googlee page");
				count++;
			}
			
		}
		if (count==0) 
		{
			System.out.println("Ranjinikanth link is not available");
			
		}
		else
		{
			System.out.println("Ranjinikanth link is available "+count);
		}
	}

}
