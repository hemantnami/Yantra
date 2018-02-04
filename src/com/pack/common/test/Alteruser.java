package com.pack.common.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pack.common.pageobjects.Alter;

public class Alteruser {
	@Test
	public void alter() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"E:\\auto\\geco\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://computer-database.herokuapp.com/computers?p=1");
		Alter a=new Alter(driver);
		a.alteruser();
		
	

}}
