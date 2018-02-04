package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Delete {
		WebDriver driver;
		private By searchnametext = By.id("searchbox");
		private By search = By.cssSelector("#searchsubmit");
		By select=By.cssSelector("#main > table > tbody > tr:nth-child(1) > td:nth-child(1) > a");
		By name=By.xpath("//INPUT[@id='name']");
		By introdate=By.xpath("//INPUT[@id='introduced']");
		By discdate=By.xpath("//INPUT[@id='discontinued']");
		By company=By.xpath("//SELECT[@id='company']");
		By delete=By.cssSelector("#main > form.topRight > input");
		By cancel=By.xpath("//A[@href='http://computer-database.herokuapp.com/computers']");
		By total=By.cssSelector("#main > div.alert-message.warning");
		
		public Delete(WebDriver driver)
		{
		this.driver=driver;	
		}
		public void deleteuser() throws InterruptedException
		{
			driver.findElement(searchnametext).sendKeys("yantra");
			driver.findElement(search).click();
			driver.findElement(select).click();
			Thread.sleep(3000);
			driver.findElement(delete).click();
			String s=driver.findElement(By.cssSelector("#main > div.alert-message.warning")).getText();
			if(s.contentEquals(driver.findElement(By.cssSelector("#main > div.alert-message.warning")).getText()))
			{
				System.out.println("Testcase passed");
			}
		}
		
		
		
		
		

}
