package com.pack.common.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pack.common.pageobjects.Computer;

public class VerifyPageAcess {
	@Test
	public void ComputersCount() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"E:\\auto\\geco\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://computer-database.herokuapp.com/computers?p=1");
				Computer c=new Computer(driver);
	c.CountofComputers();
Thread.sleep(3000);
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,1000)");

c.pagination();
		
		
		
	}
	
	
	
	

}
