package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Practise1 {

	public static void main(String[] args) throws InterruptedException {
	//WebDriver driver=new ChromeDriver();
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.google.com");
	/*System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());*/
	Thread.sleep(2000);
	//driver.navigate().to("https://www.flipkart.com");
	//driver.navigate().back();
	//driver.navigate().forward();
	driver.navigate().refresh();
    //driver.manage().window().minimize();
    Thread.sleep(2000);
 //driver.manage().window().maximize();
	//driver.manage().window().fullscreen();
	//driver.close();
       driver.quit(); 
	

	}

}
