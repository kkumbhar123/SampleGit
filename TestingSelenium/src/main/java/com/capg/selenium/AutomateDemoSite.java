package com.capg.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateDemoSite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		
		 WebElement element = driver.findElement(By.linkText("Register here"));
		 Thread.sleep(4000);
		 WebElement firstName = driver.findElement(By.xpath("gvg"));
		 
	//	driver.close();

		
		
		
	}

}
