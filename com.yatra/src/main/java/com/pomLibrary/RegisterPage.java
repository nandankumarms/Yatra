package com.pomLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage {
	public RegisterPage(WebDriver driver) {
		super(driver);
	}


	
	@FindBy(id = "login-input") private WebElement emailIdPhoneNumberTextField;

	@FindBy(id = "login-continue-btn") private WebElement continueButton;

	@FindBy(id = "isd-selector") private WebElement isdSelectorDropDown;

	@FindBy(id = "signup-mobile-number") private WebElement
	mobileNumberTextFiled;

	@FindBy(id = "signup-password") private WebElement createPasswordTextField;

	@FindBy(id="signup-user-designation") private WebElement titleDropdown;

	@FindBy(id = "signup-user-first-name") private WebElement firstNameTextField;

	@FindBy(id="signup-user-last-name")
	private WebElement lastNameTextField;

	@FindBy(id = "specialPromoNotif")
	public WebElement notificationCheckBox;

	@FindBy(id = "whatsAppNotif")
	public WebElement whatsAppNotificationCheckBox;

	@FindBy(id = "signup-form-continue-btn")
	private WebElement createAccoutButton;

	@FindBy(xpath = "(//a[text()='Terms of Service'])[2]")
	private WebElement termsAndConditionsLink;

	@FindBy(xpath = " (//a[contains(text(),'Privacy Policy')] )[2]")
	private WebElement privacyPolicyLink;

	@FindBy(xpath = "(//a[text()='Master User Agreement.'])[2]")
	private WebElement userAgreementLink;

	/**
	 * @return the emailIdPhoneNumberTextField
	 */
	public WebElement getEmailIdPhoneNumberTextField() {
		return emailIdPhoneNumberTextField;
	}

	/**
	 * @param emailIdPhoneNumberTextField the emailIdPhoneNumberTextField to set
	 */
	public void setEmailIdPhoneNumberTextField(WebElement emailIdPhoneNumberTextField) {
		this.emailIdPhoneNumberTextField = emailIdPhoneNumberTextField;
	}

	/**
	 * @return the continueButton
	 */
	public WebElement getContinueButton() {
		return continueButton;
	}

	/**
	 * @param continueButton the continueButton to set
	 */
	public void setContinueButton(WebElement continueButton) {
		this.continueButton = continueButton;
	}

	/**
	 * @return the isdSelectorDropDown
	 */
	public WebElement getIsdSelectorDropDown() {
		return isdSelectorDropDown;
	}

	/**
	 * @param isdSelectorDropDown the isdSelectorDropDown to set
	 */
	public void setIsdSelectorDropDown(WebElement isdSelectorDropDown) {
		this.isdSelectorDropDown = isdSelectorDropDown;
	}

	/**
	 * @return the mobileNumberTextFiled
	 */
	public WebElement getMobileNumberTextFiled() {
		return mobileNumberTextFiled;
	}

	/**
	 * @param mobileNumberTextFiled the mobileNumberTextFiled to set
	 */
	public void setMobileNumberTextFiled(WebElement mobileNumberTextFiled) {
		this.mobileNumberTextFiled = mobileNumberTextFiled;
	}

	/**
	 * @return the createPasswordTextField
	 */
	public WebElement getCreatePasswordTextField() {
		return createPasswordTextField;
	}

	/**
	 * @param createPasswordTextField the createPasswordTextField to set
	 */
	public void setCreatePasswordTextField(WebElement createPasswordTextField) {
		this.createPasswordTextField = createPasswordTextField;
	}

	/**
	 * @return the titleDropdown
	 */
	public WebElement getTitleDropdown() {
		return titleDropdown;
	}

	/**
	 * @param titleDropdown the titleDropdown to set
	 */
	public void setTitleDropdown(WebElement titleDropdown) {
		this.titleDropdown = titleDropdown;
	}

	/**
	 * @return the firstNameTextField
	 */
	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	/**
	 * @param firstNameTextField the firstNameTextField to set
	 */
	public void setFirstNameTextField(WebElement firstNameTextField) {
		this.firstNameTextField = firstNameTextField;
	}

	/**
	 * @return the lastNameTextField
	 */
	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	/**
	 * @param lastNameTextField the lastNameTextField to set
	 */
	public void setLastNameTextField(WebElement lastNameTextField) {
		this.lastNameTextField = lastNameTextField;
	}

	/**
	 * @return the notificationCheckBox
	 */
	public WebElement getNotificationCheckBox() {
		return notificationCheckBox;
	}

	/**
	 * @param notificationCheckBox the notificationCheckBox to set
	 */
	public void setNotificationCheckBox(WebElement notificationCheckBox) {
		this.notificationCheckBox = notificationCheckBox;
	}

	/**
	 * @return the whatsAppNotificationCheckBox
	 */
	public WebElement getWhatsAppNotificationCheckBox() {
		return whatsAppNotificationCheckBox;
	}

	/**
	 * @param whatsAppNotificationCheckBox the whatsAppNotificationCheckBox to set
	 */
	public void setWhatsAppNotificationCheckBox(WebElement whatsAppNotificationCheckBox) {
		this.whatsAppNotificationCheckBox = whatsAppNotificationCheckBox;
	}

	/**
	 * @return the createAccoutButton
	 */
	public WebElement getCreateAccoutButton() {
		return createAccoutButton;
	}

	/**
	 * @param createAccoutButton the createAccoutButton to set
	 */
	public void setCreateAccoutButton(WebElement createAccoutButton) {
		this.createAccoutButton = createAccoutButton;
	}

	/**
	 * @return the termsAndConditionsLink
	 */
	public WebElement getTermsAndConditionsLink() {
		return termsAndConditionsLink;
	}

	/**
	 * @param termsAndConditionsLink the termsAndConditionsLink to set
	 */
	public void setTermsAndConditionsLink(WebElement termsAndConditionsLink) {
		this.termsAndConditionsLink = termsAndConditionsLink;
	}

	/**
	 * @return the privacyPolicyLink
	 */
	public WebElement getPrivacyPolicyLink() {
		return privacyPolicyLink;
	}

	/**
	 * @param privacyPolicyLink the privacyPolicyLink to set
	 */
	public void setPrivacyPolicyLink(WebElement privacyPolicyLink) {
		this.privacyPolicyLink = privacyPolicyLink;
	}

	/**
	 * @return the userAgreementLink
	 */
	public WebElement getUserAgreementLink() {
		return userAgreementLink;
	}

	/**
	 * @param userAgreementLink the userAgreementLink to set
	 */
	public void setUserAgreementLink(WebElement userAgreementLink) {
		this.userAgreementLink = userAgreementLink;
	}



}
