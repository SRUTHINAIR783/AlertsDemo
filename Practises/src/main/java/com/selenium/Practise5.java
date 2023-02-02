package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Practise5 {
	@Test
	
	public void execute() {
		WebDriver driver=new EdgeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	    WebElement wb=driver.findElement(By.id("single-input-field"));
		wb.sendKeys("message");
		System.out.println("Selected or not" +wb.isSelected());
		System.out.println("Enabled or not " +wb.isEnabled());
		//wb.clear();
		System.out.println("Displayed or not" +wb.isDisplayed());
		System.out.println("Text is" +wb.getText());
		System.out.println("tag name is "  +wb.getTagName());
		System.out.println("Attribute name is "  +wb.getAttribute("id"));
		System.out.println("Css value  is "  +wb.getCssValue("color"));
		System.out.println("Size  is"  +wb.getSize());
		System.out.println("Location  is"  +wb.getLocation());
		
		
		
		
		
		
		
		
		
		
		
	}
}