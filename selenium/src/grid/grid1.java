package grid;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class grid1 
{
	@Test
	public void gr() throws MalformedURLException
	{
		DesiredCapabilities cap=null;
//		cap=DesiredCapabilities.firefox();
//		
//		cap.setBrowserName("firefox");
//		cap.setPlatform(Platform.WINDOWS);
		
		cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.ANY);
		
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.59:4444/wd/hub"), cap);
	
		
//		driver.get("http://facebook.com");
		String date="18/november/2017";
		String[] split=date.split("/");
		
		String day=split[0];
		String month=split[1];
		String year=split[2];
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
