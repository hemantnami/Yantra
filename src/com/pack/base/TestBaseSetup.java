package com.pack.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseSetup {
	
	private WebDriver driver;
	static String driverPath = "E://auto//geco//chromedriver.exe";
	
	public WebDriver getDriver() {
		return driver;
	}

	private static WebDriver initChromeDriver(String appURL) {
		System.setProperty("webdriver.chrome.driver", driverPath
				+ "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}
	
	
	
	

}
