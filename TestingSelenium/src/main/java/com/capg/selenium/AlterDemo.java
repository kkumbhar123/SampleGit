package com.capg.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlterDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("file:///C:/Users/admin/workspace/TestingSelenium/src/main/resources/ComedyShow.html");
	
		 WebElement ele1= driver.findElement(By.id("Button4"));

		 	// Thread.sleep(5000);
	//Implisite wait for only one specific element
		 WebDriverWait wait=new WebDriverWait(driver, 10); 
		 wait.until(ExpectedConditions.elementToBeClickable(ele1));
	
		 
		 ele1.click();
	
	 driver.switchTo().alert().getText();
	 driver.switchTo().alert().accept();
     driver.close();
	}

}
