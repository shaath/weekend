package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calandarops {

	public static void main(String[] args) 
	{
		String date="18/november/2016";
		String[] split=date.split("/");
		
		String day=split[0];
		String month=split[1];
		String year=split[2];
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		WebDriver driver=new FirefoxDriver();
		driver.get("Http://cleartrip.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("DepartDate")).click();
		
		String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while (!year.equals(calyear)) 
		{
			driver.findElement(By.className("nextMonth ")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}

		
		String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		
		while (!month.equalsIgnoreCase(calmonth)) 
		{
			driver.findElement(By.className("nextMonth ")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		
		List<WebElement> cols=driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td"));
		for (int i = 0; i < cols.size(); i++) 
		{
			String calday=cols.get(i).getText();
			if (calday.equals(day))
			{
				cols.get(i).click();
				break;
				
			}
			
		}
		
		
		
	}

}
