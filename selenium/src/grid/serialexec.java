package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class serialexec 
{
	@Parameters("browser")
	@Test
	public void serial(String br) throws MalformedURLException
	{
		DesiredCapabilities cap=null;
		
		if (br.equalsIgnoreCase("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);	
		}
		else if (br.equalsIgnoreCase("chrome")) 
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.MAC);
		}
		
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.59:4444/wd/hub"), cap);
	
		driver.get("http://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> check=block.findElements(By.tagName("input"));
		System.out.println(check.size());
		
		for (int i = 0; i < check.size(); i++)
		{
			String checktext=check.get(i).getAttribute("value");
			System.out.println(checktext);
			if (check.get(i).isSelected())
			{
				check.get(i).click();
				
			}
			
			if (checktext.equalsIgnoreCase("cheese"))
			{
				check.get(i).click();
			}
		}
		
	}

}
