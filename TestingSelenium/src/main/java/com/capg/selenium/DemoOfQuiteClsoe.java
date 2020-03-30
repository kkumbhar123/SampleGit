package com.capg.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOfQuiteClsoe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://www.popuptest.com/popuptest2.html");
		 driver.close();//close the current window
		 System.out.println("close");
		 
		 Thread.sleep(4000);
		 
		 //driver.navigate().to("http://www.popuptest.com/popuptest2.html");
		 driver.quit();// It would be terminate all window session--->quit

		

	}

}
