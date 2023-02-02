package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Alerts {

	WebDriver driver;
	@BeforeClass
	public void prerun()
	{
		driver=new EdgeDriver();
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node0p8itd9msi33f12nojlpav2vk414578.node0");
	}
	@Test
	public void alert()
	{
		WebElement first=driver.findElement(By.xpath("//span[text()=('Show')][1]"));
		first.click();
		Alert popup=driver.switchTo().alert();
		System.out.println(popup.getText());
		popup.accept();
		//popup.sendKeys("ghh");
		//popup.dismiss();
		
		
	}
	
}
