package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowneg1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.khuranatravel.com/");
		driver.manage().window().maximize();
		
		WebElement fdrop=driver.findElement(By.id("fromCity"));
		
		Select s=new Select(fdrop);
		List<WebElement> flist=s.getOptions();
		System.out.println(flist.size());
		
		WebElement tdrop=driver.findElement(By.id("toCity"));
		Select t=new Select(tdrop);
		
		
		
		for (int i = 0; i < flist.size(); i++)
		{
			s.selectByIndex(i);
			String fctext=flist.get(i).getText();
			System.out.println(i+"--"+fctext);
			List<WebElement> tlist=t.getOptions();
			for (int j = 0; j < tlist.size(); j++)
			{
				t.selectByIndex(j);
				String tctext=tlist.get(j).getText();
				System.out.println(j+"--"+tctext);
				if (fctext.equalsIgnoreCase(tctext)) 
				{
					System.out.println(fctext+" is available in to drop down list"+tctext);
				}
				
				
			}
		}
	}

}
