package com.capg.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoofNavigationMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.navigate().to("https://www.google.com");
 WebElement element = driver.findElement(By.xpath("//*[@id='fakebox-input']"));
 element.sendKeys("selenium");
 
 driver.navigate().refresh();
 driver.navigate().back();
 driver.navigate().forward();
	}

}
