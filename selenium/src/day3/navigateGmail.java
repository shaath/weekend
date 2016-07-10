package day3;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;



public class navigateGmail 
{

        public static void main(String[] args) throws InterruptedException,IOException {

//                System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
                WebDriver driver = new FirefoxDriver();
                driver.get("http://google.com");
                Thread.sleep(5000);
                driver.manage().window().maximize();
                String OrgTitle = "Google";
                String ActTitle = driver.getTitle();
                if(OrgTitle.equalsIgnoreCase(ActTitle))
                {
                        //driver.navigate().to("http://youtube.com");
                        Sleeper.sleepTightInSeconds(5);
                        List<WebElement> links = driver.findElements(By.tagName("a"));
                        System.out.println(links.size());
                        int count = 0;
                        for(int i = 0;i<links.size();i++)
                        {
                                String linktext = links.get(i).getText();

                                
                                System.out.println(links.get(i).getText());
                                links.get(i).click();
                                File Srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                                FileUtils.copyFile(Srcfile, new File("F:\\weekend\\selenium\\src\\com\\gmail\\screenshot\\"+linktext+".png"));
                                driver.navigate().back();
                        count = count+1;
                        if(count>5)
                        {
                                break;
                        }

                                //C:\Users\407628\workspace\EclipseTutorials\src\com\youtube\screenshot


                        }


                }
        }
}