package com.sgtesting.pageobject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateDeleteUser {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createuser();
		DeleteUser();
		logout();
		closeApplication();

	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
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
	
	private static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser()
	{
		try {
			oPage.getuser().click();
			Thread.sleep(1000);
			oPage.getadduser().click();
			Thread.sleep(1000);
			oPage.getfirstName().sendKeys("Poornima");
			Thread.sleep(1000);
			oPage.getlastName().sendKeys("Joshi");
			Thread.sleep(1000);
			oPage.getemail().sendKeys("poornima@gmail.com");
			Thread.sleep(1000);
			oPage.getusername().sendKeys("User1");
			Thread.sleep(1000);
			oPage.getpwd().sendKeys("User1");
			Thread.sleep(1000);
			oPage.getpasswordCopy().sendKeys("User1");
			Thread.sleep(1000);
			oPage.getcreateuser().click();	
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void DeleteUser()
	{
		try {
			oPage.getusernameclick1().click();
			Thread.sleep(1000);
			oPage.getdeleteuser().click();
			Thread.sleep(1000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
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


}
