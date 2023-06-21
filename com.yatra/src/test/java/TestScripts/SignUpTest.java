package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.yatra.genericLibrary.BaseTest;
import com.yatra.genericLibrary.ReadTestData;

public class SignUpTest extends BaseTest{
	@DataProvider(name="SignUpdata")
	public String[][] signUpData() throws EncryptedDocumentException, IOException{
		return ReadTestData.readData("SignUp");
	}
	
	@Test(dataProvider = "SignUpdata")
	public void signUp(String email, String phoneNumber, String password, String title, String firstName, String lastName) {
		//Switch to iframe
//		driver.switchTo().frame("notification-frame-~10cb42c72");
		//Close notification window
//		driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
		
		//Come back to parent iframe
//		driver.switchTo().parentFrame();
		
		//Click on my account
		driver.findElement(By.partialLinkText("My Account")).click();
		
		//Click on sign up button
		driver.findElement(By.id("SignUpBtn")).click();
		
		//Enter email/password
		driver.findElement(By.id("login-input")).sendKeys(email);
		
		//Click on continue button
		driver.findElement(By.id("login-continue-btn")).click();
		
		//Enter your mobile number
		driver.findElement(By.id("signup-mobile-number")).sendKeys(phoneNumber);
		
		//Create password
		driver.findElement(By.id("signup-password")).sendKeys(password);
		
		//Select Prefix/ Title
		WebElement titleDropdown=driver.findElement(By.id("signup-user-designation"));
		Select sel=new Select(titleDropdown);
		sel.selectByVisibleText(title);
		
		//Enter your first name
		driver.findElement(By.id("signup-user-first-name")).sendKeys(firstName);
		
		//Enter last name
		driver.findElement(By.id("signup-user-last-name")).sendKeys(lastName);
		
		//click on create account
		driver.findElement(By.id("signup-form-continue-btn")).click();
		
	}

}
