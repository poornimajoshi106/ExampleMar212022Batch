package com.sgtesting.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyProject {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null; 
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createcustomer();
		createProject();
		modifyProject();
		deleteProject();
		DeleteCustomer();
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
			Thread.sleep(1000);
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
			Thread.sleep(1000);
			oPage.getPassword().sendKeys("manager");
			Thread.sleep(1000);
			oPage.getLogin().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createcustomer()
	{
		try {
			oPage.getclicktask().click();
			Thread.sleep(1000);
			oPage.getclickadduser().click();
			Thread.sleep(1000);
			oPage.getnewcustomer().click();
			Thread.sleep(1000);
			oPage.getenternewcustomer().sendKeys("Amezon");
			Thread.sleep(1000);
			oPage.getcreatecustomer().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createProject()
	{
		try
		{
			oPage.getclicktask1().click();
			Thread.sleep(1000);
			oPage.getaddNew().click();
			Thread.sleep(1000);
			oPage.addnewProject().click();
			Thread.sleep(1000);
			oPage.addnewProjectName().sendKeys("Mobile Application");
			Thread.sleep(1000);
			oPage.addtoProject().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyProject()
	{
		try
		{
			oPage.getModifyProject1().click();
			Thread.sleep(1000);
			oPage.getModifyProject11().click();
			Thread.sleep(1000);
			oPage.getModifyProject111().click();
			Thread.sleep(1000);
			oPage.getModifyProject1111().clear();
			Thread.sleep(1000);
			oPage.getModifyProject11111().sendKeys("Web application");
			Thread.sleep(1000);
			oPage.getAnywhereModify().click();
			Thread.sleep(1000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteProject()
	{
		try
		{
			oPage.getdeleteProject1().click();
			Thread.sleep(1000);
			oPage.getdeleteProject11().click();
			Thread.sleep(1000);
			oPage.getdeleteProject111().click();
			Thread.sleep(1000);
			oPage.getdeleteProject1111().click();
			Thread.sleep(1000);
			oPage.getdeleteProject11111().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void DeleteCustomer() {
		try {
			oPage.getgearclick().click();
			Thread.sleep(1000);
			oPage.getactions().click();
			Thread.sleep(1000);
			oPage.getdeletecuatomer().click();
			Thread.sleep(1000);
			oPage.getdeletepermanently().click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	private static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(1000);
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
