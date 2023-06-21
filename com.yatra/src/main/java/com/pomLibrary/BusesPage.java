package com.pomLibrary;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusesPage {
	private	WebDriver driver;
	public BusesPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//From Place text field
	@FindBy(id="BE_bus_from_station")
	private WebElement fromPlaceTextField;
	
	public void clickFromTextField() {
		fromPlaceTextField.sendKeys();
	}
	
	//To place textfield
	@FindBy(id = "BE_bus_to_station")
	private WebElement toPlaceTextField;
	
	public void clickToPlaceTextField() {
		toPlaceTextField.click();
	}
	
	
	//Paces list
	@FindBy(xpath = "//div[@class='viewport']/div//li")
	private List<WebElement> placeList;
	
	public void selectPlace(String placeName) {
		for(WebElement place: placeList) {
			if(place.getText().equals(placeName)) {
				place.click();
				break;
			}
			else {
				System.out.println("Invalid place name");
			}
		}
	}
	
	//Search buses button
	@FindBy(id = "BE_bus_search_btn")
	private WebElement searchBusesButton;
	
	public void clickSearchBusesButton() {
		searchBusesButton.click();
	}
	
}
