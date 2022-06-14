package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class modifyUser {
	public static WebDriver oBrowser=null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigation();
		login();
		minimizeWindow();
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
			System.setProperty("webdriver.chrome.driver","E:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void navigation()
	{
		try
		{
			oBrowser.get("http://localhost:83/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void login()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void minimizeWindow()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Pooja");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("Joshi");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("pooja@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("User1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("user11");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user11");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='joshi, Pooja']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert x=oBrowser.switchTo().alert();
			String y=x.getText();
			System.out.println(y);
			x.accept();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void modifyUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Joshi, Pooja']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("joshi");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void logout()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void closeApplication()
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
