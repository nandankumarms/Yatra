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

	//Login button
	@FindBy(id = "signInBtn")
	private WebElement logInButton;

	//Signup button
	@FindBy(id = "SignUpBtn")
	private WebElement signUpButton;

	//My Bookings link
	@FindBy(xpath = "//li[@id='userLoginBlock']//span/a[contains(text(),'My Bookings')]")
	private WebElement myBookingsLink;

	//My refund link
	@FindBy(xpath = "//li[@id='userLoginBlock']//span/a[contains(text(),'My Refund')]")
	private WebElement myRefundLink;

	//Yatra for business link
	@FindBy(xpath = "//li[@id='userLoginBlock']//li/a[contains(text(),'Yatra for Business')]")
	private WebElement yatrForBusinessLink;

	// Yatra for travel agents 
	@FindBy(xpath = "//li[@id='userLoginBlock']//li/a[contains(text(),'Yatra for Travel Agents')]")
	private WebElement yatrForTravelAgentsLink;

	//Flights link
	@FindBy(id = "booking_engine_flights")
	private WebElement flightsLink;

	//Hotels link
	@FindBy(id = "booking_engine_hotels")
	private WebElement hotelsLink;


	//Holidays link
	@FindBy(id = "booking_engine_holidays")
	private WebElement holidaysLink;

	//Buses link		
	@FindBy(id = "booking_engine_buses")
	private WebElement busesLink;

	//Villas and stays link		
	@FindBy(id = "booking_engine_homestays")
	private WebElement villasAndStaysLink;

	//Visa link
	@FindBy(id = "booking_engine_visa")
	private WebElement visaLink;

	/**
	 * @return the myAccountLink
	 */
	public WebElement getMyAccountLink() {
		return myAccountLink;
	}

	/**
	 * @param myAccountLink the myAccountLink to set
	 */
	public void setMyAccountLink(WebElement myAccountLink) {
		this.myAccountLink = myAccountLink;
	}

	/**
	 * @return the logInButton
	 */
	public WebElement getLogInButton() {
		return logInButton;
	}

	/**
	 * @param logInButton the logInButton to set
	 */
	public void setLogInButton(WebElement logInButton) {
		this.logInButton = logInButton;
	}

	/**
	 * @return the signUpButton
	 */
	public WebElement getSignUpButton() {
		return signUpButton;
	}

	/**
	 * @param signUpButton the signUpButton to set
	 */
	public void setSignUpButton(WebElement signUpButton) {
		this.signUpButton = signUpButton;
	}

	/**
	 * @return the myBookingsLink
	 */
	public WebElement getMyBookingsLink() {
		return myBookingsLink;
	}

	/**
	 * @param myBookingsLink the myBookingsLink to set
	 */
	public void setMyBookingsLink(WebElement myBookingsLink) {
		this.myBookingsLink = myBookingsLink;
	}

	/**
	 * @return the myRefundLink
	 */
	public WebElement getMyRefundLink() {
		return myRefundLink;
	}

	/**
	 * @param myRefundLink the myRefundLink to set
	 */
	public void setMyRefundLink(WebElement myRefundLink) {
		this.myRefundLink = myRefundLink;
	}

	/**
	 * @return the yatrForBusinessLink
	 */
	public WebElement getYatrForBusinessLink() {
		return yatrForBusinessLink;
	}

	/**
	 * @param yatrForBusinessLink the yatrForBusinessLink to set
	 */
	public void setYatrForBusinessLink(WebElement yatrForBusinessLink) {
		this.yatrForBusinessLink = yatrForBusinessLink;
	}

	/**
	 * @return the yatrForTravelAgentsLink
	 */
	public WebElement getYatrForTravelAgentsLink() {
		return yatrForTravelAgentsLink;
	}

	/**
	 * @param yatrForTravelAgentsLink the yatrForTravelAgentsLink to set
	 */
	public void setYatrForTravelAgentsLink(WebElement yatrForTravelAgentsLink) {
		this.yatrForTravelAgentsLink = yatrForTravelAgentsLink;
	}

	/**
	 * @return the flightsLink
	 */
	public WebElement getFlightsLink() {
		return flightsLink;
	}

	/**
	 * @param flightsLink the flightsLink to set
	 */
	public void setFlightsLink(WebElement flightsLink) {
		this.flightsLink = flightsLink;
	}

	/**
	 * @return the hotelsLink
	 */
	public WebElement getHotelsLink() {
		return hotelsLink;
	}

	/**
	 * @param hotelsLink the hotelsLink to set
	 */
	public void setHotelsLink(WebElement hotelsLink) {
		this.hotelsLink = hotelsLink;
	}

	/**
	 * @return the holidaysLink
	 */
	public WebElement getHolidaysLink() {
		return holidaysLink;
	}

	/**
	 * @param holidaysLink the holidaysLink to set
	 */
	public void setHolidaysLink(WebElement holidaysLink) {
		this.holidaysLink = holidaysLink;
	}

	/**
	 * @return the busesLink
	 */
	public WebElement getBusesLink() {
		return busesLink;
	}

	/**
	 * @param busesLink the busesLink to set
	 */
	public void setBusesLink(WebElement busesLink) {
		this.busesLink = busesLink;
	}

	/**
	 * @return the villasAndStaysLink
	 */
	public WebElement getVillasAndStaysLink() {
		return villasAndStaysLink;
	}

	/**
	 * @param villasAndStaysLink the villasAndStaysLink to set
	 */
	public void setVillasAndStaysLink(WebElement villasAndStaysLink) {
		this.villasAndStaysLink = villasAndStaysLink;
	}

	/**
	 * @return the visaLink
	 */
	public WebElement getVisaLink() {
		return visaLink;
	}

	/**
	 * @param visaLink the visaLink to set
	 */
	public void setVisaLink(WebElement visaLink) {
		this.visaLink = visaLink;
	}

}
