package com.capg.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://demo.guru99.com/selenium/deprecated.html");
	//	 driver.switchTo().frame("String name/index/WebElement")
   WebElement framelement= driver.findElement(By.xpath("//frame[@name='classFrame']"));
		
   		  //driver.switchTo().frame(framelement);
		 // or 		 driver.switchTo().frame(framelement);

		 driver.switchTo().frame("classFrame");
		 
		   WebElement ele= driver.findElement(By.xpath("//body/div[4]/ul/li[5]/a"));
		   ele.click();

	}

}
