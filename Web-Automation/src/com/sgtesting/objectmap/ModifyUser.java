package com.sgtesting.objectmap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyUser {
	public static WebDriver oBrowser=null;
	public static String filename=null;
	public static ObjectMap objectmap=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		minimizewindow();
		createUser();
		modifyUser();
		deleteUser();
		logout();
		closeApplication();

	}
	public static void launchBrowser()
	{
		try
		{
			filename="E:\\SeleniumAutomation\\Automation\\Web-Automation\\ObjectMap\\ObjectMap.properties";
			System.setProperty("webdriver.chrome.driver","E:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			objectmap=new ObjectMap(filename);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:83/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("manager");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizewindow()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepageflyoutwindow")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepagelogoutlink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepageuserclicklink")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("userpageadduserclicklink")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addfirstname")).sendKeys("Pooja");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addlastname")).sendKeys("Joshi");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addemail")).sendKeys("pooja@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("adduser1")).sendKeys("User1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addpassword")).sendKeys("user11");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addpasswordcopy")).sendKeys("user11");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("createuserbtn")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyUser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("user1clickonit")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addlastname")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addlastname")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addlastname")).sendKeys("joshi");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("savechangesclikcbtn")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("user1clickonitagain")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("deleteuser1")).click();
			Thread.sleep(1000);
			Alert x=oBrowser.switchTo().alert();
			String y=x.getText();
			System.out.println(y);
			x.accept();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
