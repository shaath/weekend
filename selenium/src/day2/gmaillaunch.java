package day2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class gmaillaunch {

	public static void main(String[] args)
	{
		//launching the browser
		FirefoxDriver driver=new FirefoxDriver();
		//opening the application
		driver.get("http://facebook.com");
		//maximizing the window
		driver.manage().window().maximize();
		//to switch between the applications
		
		
	}

}
