package com.pomLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.yatra.genericLibrary.UtilityMethod;

public class BasePage extends UtilityMethod {
	public BasePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

}
