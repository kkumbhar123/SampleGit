package com.capg.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("file:///C:/Users/admin/workspace/TestingSelenium/src/main/resources/ComedyShow.html");
	
		 WebElement ele1= driver.findElement(By.id("Button4"));

		 	// Thread.sleep(5000);
	//Implisite wait for only one specific element
		 FluentWait<WebDriver> wait=new FluentWait <WebDriver> (driver).withTimeout(45,TimeUnit.SECONDS).pollingEvery(5,TimeUnit.SECONDS); 
		 wait.until(ExpectedConditions.elementToBeClickable(ele1));
	
		 
		 ele1.click();
	
	 driver.switchTo().alert().getText();
	 driver.switchTo().alert().accept();
    driver.close();

	}

}
