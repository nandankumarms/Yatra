package TestScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.yatra.genericLibrary.BaseTest;
import com.yatra.genericLibrary.ReadTestData;

public class LoginTest extends BaseTest{
	@DataProvider(name="LoginData")
	public String[][] loginData() throws EncryptedDocumentException, IOException{
		return ReadTestData.readData("Login");
	}
	
	@Test(dataProvider = "LoginData")
	public void loginTest(String email, String password) {
		
	//Click on My Account Button	
	driver.findElement(By.partialLinkText("My Account")).click();
	
	//Click on Login Button
	driver.findElement(By.id("signInBtn")).click();
	
	//Enter email
	driver.findElement(By.id("login-input")).sendKeys(email);
	
	//Click on continue button
	driver.findElement(By.id("login-continue-btn")).click();
	
	//Enter password
	driver.findElement(By.id("login-password")).sendKeys(password);
	
	//Click on login button
	driver.findElement(By.id("login-submit-btn")).click();
	
	}
}
