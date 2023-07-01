package com.yatra.genericLibrary;

import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.geometry.spherical.twod.Edge;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;

public class BaseTest extends UtilityMethod {
	@BeforeSuite
	public void beforeSuit() {
		report=new ExtentReports(REPORT_PATH+getDateAndTime()+".html");
	}
	
	@BeforeClass
	
	public void browserSetUP() {
		browser=getProperty("browser");
		//Set System property for chromepath
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty(CHROME_KEY, CHROME_PATH);
		
		// Block all popups
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		//Launch chrome browser
		driver=new ChromeDriver(options);
		}
		else if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty(FIREFOX_KEY, FIREFOX_PATH);
		
		// Block all popups
		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--disable-notifications");
		
		//Launch chrome browser
		driver=new FirefoxDriver(options);
		}
		else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty(EDGE_KEY, EDGE_PATH);
			driver=new EdgeDriver();
			}
		
		//Maximize browser window
		driver.manage().window().maximize();
		
		//Use implicitlyWit for syncrhonization
		driver.manage().timeouts().implicitlyWait(waitseconds, TimeUnit.SECONDS);
		
		//Navigate to the website
		driver.get(getProperty("URL"));
		
		//
	}
	
	@AfterClass
	public void browserTermination() {
		driver.close();
	}
	
	@AfterSuite
	public void afterSuit() {
		report.endTest(test);
		report.flush();
	}

}
