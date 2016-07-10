package day4;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class filedownload 
{

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://docs.seleniumhq.org/download/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("2.53.1")).click();
		Sleeper.sleepTightInSeconds(5);
//		Runtime.getRuntime().exec("C:\\Users\\Dell\\Desktop\\not.exe");
		Runtime.getRuntime().exec("C:\\Users\\Dell\\Desktop\\filedownload.exe");
		
	}

}
