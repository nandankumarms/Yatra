package com.yatra.genericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class UtilityMethod implements FrameworkConstants {
	
	public static WebDriver driver;
	
	public static String url;
	
	public static String browser;
	
	public static Actions action;
		
	public static JavascriptExecutor jse;
	
	public static TakesScreenshot screenshot;
	
	public static ExtentReports report;
	
	public static ExtentTest test; 
	
	public static FileInputStream fis;
	
	public static int waitseconds=20;
	

	
	//Method to get the title of the web page
	public String getTitleOfWebPage(WebDriver driver) {
		return driver.getTitle();
	}
	
	//Method to get the url of he page
	public String getUrlOfPage(WebDriver driver) {
		return driver.getCurrentUrl();
	}
	
	//Method to click on the webelement
	public void clickOnTheElement(WebElement element) {
		element.click();
	}
	
	//Method to enter value to the textfield
	public void enterValueToTextfield(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	//Method to get the text of the element
	public String getTextOfTheElement(WebElement element) {
		return element.getText();
	}
	
	//Method to get the attribute of the element
	public String getAributeOfElement(WebElement element, String attribute) {
		return element.getAttribute(attribute);
	}
	
	//Method to select option from dropdown
	public void selectOptionByIndex(WebElement dropdown, int index) {
		Select select=new Select(dropdown);
		select.selectByIndex(index);
	}
	
	//Method to Select option by value
	public void selectOptionByValue(WebElement dropdown, String value) {
		Select select=new Select(dropdown);
		select.selectByValue(value);
	}
	
	//Method to Select option by visible text
		public void selectOptionByVisibleText(WebElement dropdown, String text) {
			Select select=new Select(dropdown);
			select.selectByVisibleText(text);
		}
		
	//Method to move mouse to any web element
		public void moveMouseTo(WebElement element) {
			action.moveToElement(element).perform();
		}
		
	//Method to move mouse to element
		public void moveMouseTo(WebElement from,int x, int y) {
			action.moveToElement(from, x, y).perform();;
		}
		
		//Method to simulate mouse click action
		public void clickMouse(Actions actions) {
			actions.click().perform();
		}
		
		//Method to send any keys from keyboard
		public void sendKeyFromKeyBoard(CharSequence keys) {
			action.sendKeys(keys).perform();
		}
		
		//Method to right click on any element
		public void rightClick(WebElement element) {
			action.contextClick(element).perform();
		}
		
		//Method to perform double click
		public void doubleClickOnElement(WebElement element) {
			action.doubleClick(element).perform();
		}
		
		//Method to click And Hold the element
		public void clickAndOldElement(WebElement element) {
			action.clickAndHold(element).perform();
		}
		
		//Method to release the holding webelement
		public void releaseHoldElement(WebElement element) {
			action.release(element).perform();
		}
		
		//Method to drag and drop web element
		public void dragAndDropElement(WebElement from, WebElement to) {
			action.dragAndDrop(from, to).perform();
		}
		
		//Initialize objects of Js, Actions and Takescreenshot
		public static void initObjects() {
			jse=(JavascriptExecutor) driver;
			
			screenshot=(TakesScreenshot) driver;
			
			action=new Actions(driver);
		}
		
		//method to   getDateAndTime()
		public String getDateAndTime() {
			LocalDateTime systemDate=LocalDateTime.now();
			String now=systemDate.toString().replace(':', '-');
			return now;
		}
		
		//method to take screenshot
		public String takescreenShot() {
			String imagePath=SCREENSHOTS_PATH+getDateAndTime()+".png";
			File temp= screenshot.getScreenshotAs(OutputType.FILE);
			File dest=new File(imagePath);
			try {
				FileHandler.copy(temp, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "."+imagePath;
		}
		
		//Method to check webelement screenshot
		public String takeWebelementscreenShot(WebElement element) {
			String imagePath=SCREENSHOTS_PATH+getDateAndTime()+".png";
			File temp= element.getScreenshotAs(OutputType.FILE);
			File dest=new File(imagePath);
			try {
				FileHandler.copy(temp, dest);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			return "."+imagePath;
		}
		
		//Method to switch  to windows with title
		public void switchToWindow(String title) {
			String parentWindow=driver.getWindowHandle();
			
			Set<String> allWindowIds=driver.getWindowHandles();
			allWindowIds.remove(parentWindow);
			for(String child:allWindowIds) {
				driver.switchTo().window(child);
				if(driver.getTitle().equalsIgnoreCase(title)) {
					break;
				}
			}
		}
		
		//Method to switch to window with webelement
		public void switchToWindow(WebElement element) {
			String parentWindow=driver.getWindowHandle();
			
			Set<String> allWindowIds=driver.getWindowHandles();
			allWindowIds.remove(parentWindow);
			for(String child:allWindowIds) {
				driver.switchTo().window(child);
				if(element.isDisplayed()) {
					break;
				}
			}
		}
		
		//Get value property from properties file
		public String getProperty(String key) {
			
			try {
				fis = new FileInputStream(PROPERTY_PATH);
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			Properties prop=new Properties();
			try {
				prop.load(fis);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			return prop.getProperty(key);
		}
		
		
}
