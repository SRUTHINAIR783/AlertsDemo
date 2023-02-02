package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Practise3 {
	@Test
    public void execute() {
		WebDriver driver=new EdgeDriver();
		driver.get("C:/Users/AADI/Desktop/dropdown.html");
	    WebElement wb=driver.findElement(By.name("Selenium"));
		Select sel=new Select(wb);
		//sel.selectByIndex(2);
		//sel.selectByVisibleText("Anu");
		sel.selectByValue("A");
	}
}
