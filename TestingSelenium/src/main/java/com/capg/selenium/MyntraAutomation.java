package com.capg.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.corba.se.spi.orbutil.fsm.Action;

public class MyntraAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
	
		 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("https://www.myntra.com/");
		 driver.manage().window().maximize();
      
		 Actions action = new Actions(driver);
		 
		 WebElement mens= driver.findElement(By.xpath("//*[@id='desktop-header-cnt']/div[2]/nav/div/div[1]/div/a"));
		action.moveToElement(mens).perform();
		 
		 WebElement bag=driver.findElement(By.xpath("//*[@id='desktop-header-cnt']/div[2]/nav/div/div[1]/div/div/div/div/li[5]/ul/li[14]/a"));
		 bag.click();
		 System.out.println("close the window");
		 
		 //driver.close();
	}

}
