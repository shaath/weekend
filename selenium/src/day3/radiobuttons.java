package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class radiobuttons 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
		Sleeper.sleepTightInSeconds(5);
		driver.manage().window().maximize();
		
//		WebElement block=driver.findElement(By.xpath(".//*[@id='SearchForm']/nav"));
		
		List<WebElement> radios=driver.findElements(By.xpath(".//*[@id='SearchForm']/nav/ul/li/label"));
		
		System.out.println(radios.size());
		
		for (int i = 0; i < radios.size(); i++)
		{
			String radiotext=radios.get(i).getAttribute("title");
			System.out.println(radiotext);
			if (radiotext.equalsIgnoreCase("multi-city")) 
			{
				radios.get(i).click();
				break;
			}
		}
		

	}

}
