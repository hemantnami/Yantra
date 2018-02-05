package com.pack.common.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pack.common.pageobjects.Insert;

public class Createuser {
	@Test
	public void newuser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"E:\\auto\\geco\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://computer-database.herokuapp.com/computers?p=1");
		Insert i=new Insert(driver);
		i.createuser();
		//i.canceluser();
		
		
		
		
		
		
	}

}
