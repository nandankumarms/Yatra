package com.pomLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
     PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "login-input") private WebElement emailIdPhoneNumberTextField;

	@FindBy(id = "login-continue-btn") private WebElement continueButton;

	@FindBy(id = "fb-login-btn") private WebElement facebokSignInButton;
	
	@FindBy(id = "google-login-btn") private WebElement googleSignInButton;
	
	@FindBy(id = "otp-input") private WebElement otpButton;
	
	@FindBy(id = "verify-otp") private WebElement submitOtpButton;
	
	@FindBy(id = "resend-otp") private WebElement resendOtpLink;
	
	@FindBy(xpath = "(//div[@id='resend-mobileotp-block']/following-sibling::p)[1]") 
	private WebElement loginUsingAccoutPasswordLink;
		
	}
