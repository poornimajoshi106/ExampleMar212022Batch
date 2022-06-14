package com.sgtesting.tests;

public class ExecuteAtoITExeFileDemo {

	public static void main(String[] args) 
	{
		executeFile();

	}
	private static void executeFile()
	{
		try
		{
			Runtime obj=Runtime.getRuntime();
			obj.exec("E:\\SeleniumAutomation\\AutoIT\\FirstTestScript.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
