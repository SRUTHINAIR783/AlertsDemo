package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Practise4 {
	WebDriver driver;
	Select sel;
	
	@Test(priority=1)
    public void execute() {
		driver=new EdgeDriver();
		driver.get("C:/Users/AADI/Desktop/multipledropdown.html");
	}
	@Test(priority=2)
	public void select() {
		WebElement wb=driver.findElement(By.name("Selenium"));
	   sel=new Select(wb);
	  //  System.out.println(sel.getFirstSelectedOption().getText());
		sel.selectByIndex(2);
		//sel.selectByVisibleText("Anu");
		//sel.selectByValue("A");
	}
	@Test(priority=3,enabled=true) 
	public void deselect() 	{
		sel.deselectByIndex(2);
	     //sel.deselectByValue("Sruthi");
	     //sel.deselectByVisibleText("Sr");
	}
}
