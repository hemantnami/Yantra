package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Insert {
	WebDriver driver;
	By add=By.xpath("//A[@id='add']");
	By name=By.xpath("//INPUT[@id='name']");
	By introdate=By.xpath("//INPUT[@id='introduced']");
	By discdate=By.xpath("//INPUT[@id='discontinued']");
	By company=By.xpath("//SELECT[@id='company']");
	By create=By.xpath("//*[@id='main']/form/div/input");
	By cancel=By.xpath("//A[@href='http://computer-database.herokuapp.com/computers']");
	By total=By.cssSelector("#main > div.alert-message.warning");
	
	public Insert(WebDriver driver)
	{
	this.driver=driver;	
	}

	public void createuser() throws InterruptedException
	{
		
		driver.findElement(add).click();
		driver.findElement(name).sendKeys("yantra");
		driver.findElement(introdate).sendKeys("1999-05-08");
		driver.findElement(discdate).sendKeys("2017-05-08");
		driver.findElement(company).sendKeys("Apple");
		Thread.sleep(3000);
		driver.findElement(create).click();
String x=driver.findElement(total).getText();
if(x.contentEquals(driver.findElement(total).getText()))
{
	System.out.println("Test case passed");
}

		
	}
	public void canceluser() throws InterruptedException
	{
		
		driver.findElement(add).click();
		driver.findElement(name).sendKeys("yantra");
		driver.findElement(introdate).sendKeys("1999-05-08");
		driver.findElement(discdate).sendKeys("2017-05-08");
		driver.findElement(company).sendKeys("Apple");
		Thread.sleep(3000);
		driver.findElement(cancel).click();

	
	
	
	
	
	}
	
	
}
