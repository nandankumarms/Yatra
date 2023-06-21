package com.pomLibrary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	//My account link
	@FindBy(xpath = "//li[@id='userLoginBlock']/a")
	private WebElement myAccountLink;

	public void clickMyAccountLink() {
		myAccountLink.click();
	}

	//Login button
	@FindBy(id = "signInBtn")
	private WebElement logInButton;

	public void clickLoginButton() {
		logInButton.click();
	}


	//Signup button
	@FindBy(id = "SignUpBtn")
	private WebElement signUpButton;

	public void clickSignUpButton() {
		signUpButton.click();
	}

	//My Bookings link
	@FindBy(xpath = "//li[@id='userLoginBlock']//span/a[contains(text(),'My Bookings')]")
	private WebElement myBookingsLink;

	public void clickMyBookingsLink() {
		myBookingsLink.click();
	}


	//My refund link
	@FindBy(xpath = "//li[@id='userLoginBlock']//span/a[contains(text(),'My Refund')]")
	private WebElement myRefundLink;

	public void clickMyRefundLink() {
		myRefundLink.click();
	}


	//Yatra for business link
	@FindBy(xpath = "//li[@id='userLoginBlock']//li/a[contains(text(),'Yatra for Business')]")
	private WebElement yatrForBusinessLink;

	public void clickYatrForBusinessLink() {
		yatrForBusinessLink.click();
	}

	// Yatra for travel agents 
	@FindBy(xpath = "//li[@id='userLoginBlock']//li/a[contains(text(),'Yatra for Travel Agents')]")
	private WebElement yatrForTravelAgentsLink;

	public void clickYatrForTravelAgentsLink() {
		yatrForTravelAgentsLink.click();
	}

	//Flights link
	@FindBy(id = "booking_engine_flights")
	private WebElement flightsLink;

	public void clickFligtsLink() {
		flightsLink.click();
	}


	//Hotels link
	@FindBy(id = "booking_engine_hotels")
	private WebElement hotelsLink;

	public void clickHotelsLink() {
		hotelsLink.click();
	}


	//Holidays link
	@FindBy(id = "booking_engine_holidays")
	private WebElement holidaysLink;

	public void clickHolidaysLink() {
		holidaysLink.click();
	}


	//Buses link		
	@FindBy(id = "booking_engine_buses")
	private WebElement busesLink;

	public void clickBusesLink() {
		busesLink.click();
	}	
	
	
	
	//Villas and stays link		
		@FindBy(id = "booking_engine_homestays")
		private WebElement villasAndStaysLink;

		public void clickVillasandStaysLink() {
			villasAndStaysLink.click();
		}
	
		//Visa link
		@FindBy(id = "booking_engine_visa")
		private WebElement visaLink;

		public void clickVisaLink() {
			visaLink.click();
		}
	
}
