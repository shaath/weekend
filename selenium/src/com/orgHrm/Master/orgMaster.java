package com.orgHrm.Master;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class orgMaster 
{
	//Global Variables
	public WebDriver driver;
	public static String expval,actval;
	public static String url="http://opensource.demo.orangehrm.com";
	//Launch
	
	public String org_Launch(String url)
	{
		expval="login";
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
		if (expval.equalsIgnoreCase(actval))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	
	//login
	public String org_Login(String u,String p)
	{
		expval="welcome";
		driver.findElement(By.id("txtUsername")).sendKeys(u);
		driver.findElement(By.id("txtPassword")).sendKeys(p);
		driver.findElement(By.id("btnLogin")).click();
		actval=driver.findElement(By.id("welcome")).getAttribute("id");
		if (expval.equalsIgnoreCase(actval))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
		
	}
	//logout
	
	public String org_Logout()
	{
		expval="login";
		driver.findElement(By.id("welcome")).click();
		
		driver.findElement(By.xpath(".//*[@id='welcome-menu']/ul/li[2]/a")).click();
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
		if (expval.equalsIgnoreCase(actval))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	
	//close
	public void org_Close()
	{
		driver.close();
	}
	
	//empreg
	public String org_Empreg(String f,String l)
	{
		expval=f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("btnSave")).click();
		
		actval=driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).getText();
		if (expval.equalsIgnoreCase(actval))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	//userreg
	public String org_Userreg(String ename,String uname,String pwd,String cpwd)
	{
		boolean flag=false;
		expval=uname;
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		
		driver.findElement(By.id("btnAdd")).click();
		
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(ename);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("systemUser_password")).sendKeys(pwd);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(cpwd);
		driver.findElement(By.id("btnSave")).click();
		
		List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
		
		for (int i = 0; i < rows.size(); i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			
			actval=cols.get(1).getText();
			if (actval.equalsIgnoreCase(expval)) 
			{
				flag=true;
				break;
			}	
		}
		if (flag) 
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
}
