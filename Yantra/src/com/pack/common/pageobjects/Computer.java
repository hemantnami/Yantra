package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Computer {
	 WebDriver driver;

	private By searchnametext = By.id("searchbox");
	private By search = By.cssSelector("#searchsubmit");
	private By totalnames = By.cssSelector("#main > h1");
	private By next = By.cssSelector("#pagination > ul > li.next > a");
	private By prev=By.cssSelector("#pagination > ul > li.prev > a");
	private By asc=By.xpath("//SECTION[@id='main']");
	
	public Computer(WebDriver driver)
	{
	this.driver=driver;	
	}

public void CountofComputers()
{
	System.out.println(driver.findElement(totalnames).getText());
}


public void sort()
{
	driver.findElement(asc).click();
}

public void pagination()
{
	driver.findElement(next).click();
}
	

}
