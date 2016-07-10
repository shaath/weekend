package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.os.WindowsUtils;

public class validations 
{
	public static void main(String[] args) 
	{
		String expval="google";
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		String actval=driver.getTitle();
		
		if (expval.equalsIgnoreCase(actval)) 
		{
			System.out.println("Pass");
			
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver.close();
		WindowsUtils.killByName("eclipse.exe");
	}

}
