package com.esignlyNew.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignUpPage extends LoginPage {

	@FindBy(id = "RegistrationForm_email")
	WebElement user_email;

	@FindBy(id = "RegistrationForm_password")
	WebElement password;

	@FindBy(id = "signup-btn")
	WebElement signupBtn;

	@FindBy(xpath = "//body/section[2]/div[2]/div[2]/form[1]/div[3]/label[1]/span[1]")
	WebElement checkboxOKSendME;

	@FindBy(xpath = "//a[@id='open_signup_panel']")
	WebElement signinBtn;

	@FindBy(xpath = "/html[1]/body[1]/section[2]/div[2]/div[2]/form[1]/div[4]/a[1]")
	WebElement terms_Conditions;

	@FindBy(xpath = "/html[1]/body[1]/section[2]/div[2]/div[2]/form[1]/div[4]/a[2]")
	WebElement privacyPolicy;

	@FindBy(xpath = "/html[1]/body[1]/section[2]/div[2]/div[1]/div[1]/a[1]")
	WebElement linkedIn;

	@FindBy(xpath = "/html[1]/body[1]/section[2]/div[2]/div[1]/div[1]/a[2]")
	WebElement google;

	@FindBy(xpath = "//h2[contains(text(),'Signup For a Free Trial')]")
	WebElement signupHeading;
	
	

	LoginPage login = new LoginPage();

	public void signup() throws InterruptedException {
		login.signUpButton();
		user_email.sendKeys("testesign003@mailinator.com");
		password.sendKeys("Test@123");
		signupBtn.click();
	}

	public void checkboxClick() throws InterruptedException {
		login.signUpButton();
		checkboxOKSendME.click();
	}

	public void signinNow() throws InterruptedException {
		login.signUpButton();
		signinBtn.click();
	}

	public void termAndConditions() throws InterruptedException {
		login.signUpButton();
		terms_Conditions.click();
		needToImplicitWait(3);
	}

	public void privacy_Policy() throws InterruptedException {
		login.signUpButton();
		privacyPolicy.click();
		needToImplicitWait(3);
	}

	public void socialLinkedIn() throws InterruptedException {
		login.signUpButton();
		linkedIn.click();
		needToImplicitWait(3);
	}

	public void socialGoogle() throws InterruptedException {
		login.signUpButton();
		google.click();
		needToImplicitWait(3);
	}

	public void signupUI() throws InterruptedException {
		login.signUpButton();
		signupHeading.isDisplayed();
		user_email.isDisplayed();
		password.isDisplayed();
		signupBtn.isDisplayed();
		signinBtn.isDisplayed();
		terms_Conditions.isDisplayed();
		privacyPolicy.isDisplayed();
		linkedIn.isDisplayed();
		google.isDisplayed();
		needToImplicitWait(4);
	}
	
	

}
