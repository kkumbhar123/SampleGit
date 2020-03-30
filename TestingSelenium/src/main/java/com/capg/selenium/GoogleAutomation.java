package com.capg.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutomation {

	
	public static void main(String arg[])

	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();
	}
}
