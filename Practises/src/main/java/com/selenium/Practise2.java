package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Practise2 {
	@Test
     public static void run() throws InterruptedException {
		
	//public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("C:/Users/AADI/Desktop/Web.html");
		WebElement label=driver.findElement(By.id("un"));
		System.out.println(label.getText());
		WebElement first=driver.findElement(By.id("01"));
		//WebElement first=driver.findElement(By.name("name1"));
		//WebElement first=driver.findElement(By.class("username1"));
	      first.sendKeys("Sruthi");
		  //first.clear();
	      WebElement second=driver.findElement(By.id("02"));
			//WebElement first=driver.findElement(By.name("name2"));
			//WebElement first=driver.findElement(By.class("password1"));
	      second.sendKeys("Selenium");
		      
		      WebElement radiobutton1=driver.findElement(By.className("radio1"));  
		      radiobutton1.click();
		      WebElement radiobutton2=driver.findElement(By.className("radio2"));  
		      radiobutton2.click();
		      
		      WebElement checkbox=driver.findElement(By.name("box1"));  
		      checkbox.click();
		      
		      WebElement button1=driver.findElement(By.name("box2"));  
		      button1.click();
		      
		     WebElement link=driver.findElement(By.tagName("a"));  
		     link.click();
		     
		     
		     driver.navigate().back();
		     Thread.sleep(2000);
		     
		     driver.close();
		     
		   /*WebElement link1=driver.findElement(By.linkText("Click me")); 
		     link1.click();
		     
		     WebElement link2=driver.findElement(By.partialLinkText("me")); 
		     link2.click();*/
	}		      
		      
}		      
		      
		      
		
		

	


