package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pomLibrary.RegisterPage;
import com.pomLibrary.WelcomePage;
import com.relevantcodes.extentreports.LogStatus;
import com.yatra.genericLibrary.BaseTest;
import com.yatra.genericLibrary.ReadTestData;

public class SignUpTest extends BaseTest{
	@DataProvider(name="SignUpdata")
	public String[][] signUpData() throws EncryptedDocumentException, IOException{
		return ReadTestData.readData("SignUp");
	}
	
	@Test(dataProvider = "SignUpdata")
	public void signUp(String email, String phoneNumber, String password, String title, String firstName, String lastName) {
		initObjects();
		WelcomePage welcome=new WelcomePage(driver);
		RegisterPage register=new RegisterPage(driver);
		test=report.startTest("Register");
		//Switch to iframe
//		driver.switchTo().frame("notification-frame-~10cb42c72");
		//Close notification window
//		driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
		
		//Come back to parent iframe
//		driver.switchTo().parentFrame();
		
		//Click on my account
		clickOnTheElement(welcome.getMyAccountLink()); 
		test.log(LogStatus.INFO, "Clicked on My account link");
				
		//Click on sign up button
		clickOnTheElement(welcome.getSignUpButton());
		
				
		//Enter email/phone number
		enterValueToTextfield(register.getEmailIdPhoneNumberTextField(), email);
		test.log(LogStatus.INFO, test.addScreenCapture(takescreenShot()));		
		//Click on continue button
		clickOnTheElement(register.getContinueButton());
				
		//Enter your mobile number
		enterValueToTextfield(register.getMobileNumberTextFiled(), phoneNumber);
				///test.log(LogStatus.INFO, scree);
		//Create password
		enterValueToTextfield(register.getCreatePasswordTextField(), password);
		test.log(LogStatus.PASS, "signed in");		
		//Select Prefix/ Title
		selectOptionByVisibleText(register.getTitleDropdown(), title);
				
		//Enter your first name
		enterValueToTextfield(register.getFirstNameTextField(), firstName);
				
		//Enter last name
		enterValueToTextfield(register.getLastNameTextField(), lastName);
				
		//click on create account
		clickOnTheElement(register.getCreateAccoutButton());
		
		
		
	}

}
