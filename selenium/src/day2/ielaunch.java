package day2;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class ielaunch {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Dell\\Downloads\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		
	}

}
