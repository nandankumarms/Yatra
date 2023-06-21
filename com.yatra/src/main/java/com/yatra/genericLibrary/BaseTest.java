package com.yatra.genericLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {
	public WebDriver driver;
	@BeforeClass
	@Parameters(value="URL")
	public void browserSetUP(String url) {
		//Set System property
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		
		// Block all popups
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		//Launch chrome browser
		driver=new ChromeDriver(options);
		
		//Use implicitlyWit for syncrhonization
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Navigate to the website
		driver.get(url);
		
		//
	}
	
	@AfterClass
	public void browserTermination() {
		driver.close();
	}

}
