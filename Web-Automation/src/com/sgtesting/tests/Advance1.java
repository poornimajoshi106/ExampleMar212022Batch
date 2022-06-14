package com.sgtesting.tests;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advance1 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigation();
		login();
		minimizeWindow();
		CreateUser();
		logout();
		login1();
		logout();
		login2();
		logout();
		login3();
		logout();
		login();
		modifyUserPassword();
		logout();
		loginWithChangePassword1();
		logout();
		loginWithChangePassword2();
		logout();
		loginWithChangePassword3();
		logout();
		login();
		deleteUsers();
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
	public static void CreateUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Poornima");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("Joshi");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("poornima@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("User1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("user11");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user11");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Poorva");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("Joshi");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("poorva@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("User2");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("user22");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user22");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Priya");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("Joshi");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("priya@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("User3");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("user33");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user33");
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
	public static void login1()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("User1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("user11");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click(); 
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void login2()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("User2");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("user22");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click(); 
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void login3()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("User3");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("user33");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click(); 
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void modifyUserPassword()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Joshi, Poornima']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("user111");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user111");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Joshi, Poorva']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("user222");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user222");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Joshi, Priya']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("user333");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user333");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void loginWithChangePassword1()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("User1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("user111");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(5000);
			//oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[2]")).click(); 
			//Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void loginWithChangePassword2()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("User2");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("user222");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(5000);
			//oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[2]")).click(); 
			//Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void loginWithChangePassword3()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("User3");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("user333");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(5000);
			//oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[2]")).click(); 
			//Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deleteUsers()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//span[text()='Joshi, Poornima']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert x=oBrowser.switchTo().alert();
			String y=x.getText();
			System.out.println(y);
			x.accept();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//span[text()='Joshi, Poorva']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert a=oBrowser.switchTo().alert();
			String b=a.getText();
			System.out.println(y);
			x.accept();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//span[text()='Joshi, Priya']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert p=oBrowser.switchTo().alert();
			String q=p.getText();
			System.out.println(y);
			x.accept();
			
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
