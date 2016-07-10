package day2;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class navigateeg {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://facebook.com");
		driver.get("Http://google.com");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(5);
		driver.navigate().to("http://gmail.com");
		Sleeper.sleepTightInSeconds(5);
		driver.navigate().back();
		Sleeper.sleepTightInSeconds(5);
		driver.navigate().forward();
		Sleeper.sleepTightInSeconds(5);
		driver.navigate().refresh();

	}

}
