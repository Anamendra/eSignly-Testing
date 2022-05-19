package com.esignlyNew.pages;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginPage extends BaseSetUp {

// Page factory 
	@FindBy(id = "LoginForm_email")
	WebElement username;

	@FindBy(id = "LoginForm_password")
	WebElement password;

	@FindBy(xpath = "//input[@name='yt2']")
	WebElement loginBtn;

	@FindBy(xpath = "/html[1]/body[1]/section[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/label[1]/span[1]")
	WebElement rememberMeCheckbox;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/button[1]")
	WebElement logoutBtn;

	@FindBy(xpath = "/html[1]/body[1]/section[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[2]/button[1]")
	WebElement forgetPass;

	@FindBy(xpath = "//a[@id='open_signup_panel']")
	WebElement signupBtn;

	@FindBy(xpath = "/html/body/section[2]/div/div[1]/div/a[1]")
	WebElement linkedIn;

	@FindBy(xpath = "/html[1]/body[1]/section[2]/div[1]/div[1]/div[1]/a[2]")
	WebElement google;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[10]/a[1]")
	WebElement loginNavigationBtn;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[1]")
	WebElement featureOptions;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	WebElement features;

	@FindBy(xpath = "//body/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]/*[1]")
	WebElement logo;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")
	WebElement industriesOptions;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
	WebElement insuranceIndustry;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/a[1]")
	WebElement howItWorks;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[5]/a[1]/span[1]")
	WebElement pricingOptions;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[5]/ul[1]/li[1]/a[1]")
	WebElement pricing;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[5]/ul[1]/li[2]/a[1]")
	WebElement apipricing;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]")
	WebElement faqpage;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]")
	WebElement trialbutton;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[9]/a[1]")
	WebElement buyNowBtn;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[6]/a[1]/span[1]")
	WebElement apiOptions;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[6]/ul[1]/li[1]/a[1]")
	WebElement apiDocuments;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[6]/ul[1]/li[2]/a[1]")
	WebElement apiWidget;

	@FindBy(xpath = "/html[1]/body[1]/section[2]/div[1]/div[2]/div[1]")
	WebElement loginSectionUI;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]")
	WebElement navigationBar;

	@FindBy(xpath = "/html[1]/body[1]/section[2]/div[1]/div[1]/div[1]")
	WebElement socialIcons;

	@FindBy(xpath = "/html[1]/body[1]/section[2]/div[1]/div[1]/h4[1]")
	WebElement socialIconText;

 //Intialize page factory 
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
// Actions 
	public String validUserCredentials() throws InterruptedException {
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		needToWait(5);
		loginBtn.click();
		needToWait(5);
		return null;

	}

	public void invalidUserCredentials() throws InterruptedException {
		needToImplicitWait(2);
		username.sendKeys(prop.getProperty("invalidUser"));
		password.sendKeys(prop.getProperty("invalidPass"));
		loginBtn.click();
		needToImplicitWait(3);
	}

	public void validUserEmailOnly() throws InterruptedException {
		needToImplicitWait(2);
		username.sendKeys(prop.getProperty("username"));
		loginBtn.click();
		needToImplicitWait(2);
	}

	public void validUserPasswordOnly() throws InterruptedException {
		needToImplicitWait(2);
		password.sendKeys(prop.getProperty("password"));
		loginBtn.click();
		needToImplicitWait(2);
	}

	public void withoutAnyInput() throws InterruptedException {
		needToImplicitWait(2);
		loginBtn.click();
		needToImplicitWait(5);
	}

	public void clickToRememberMe() throws InterruptedException {
		needToImplicitWait(2);
		validUserCredentials();
		rememberMeCheckbox.click();
		loginBtn.click();
		needToImplicitWait(3);
	}

	// This method is used for unchecking the checked box of RememberMe
	public void removeFromRememberMe() throws InterruptedException {
		needToImplicitWait(4);
		clickToRememberMe();
		logoutBtn.click();
		logoutBtn.click();
		needToImplicitWait(2);
		rememberMeCheckbox.click();
	}

	// This method is used for forgot password having email address
	public void forgotPassword() throws InterruptedException {
		needToImplicitWait(2);
		validUserEmailOnly();
		needToImplicitWait(2);
		forgetPass.click();
		needToImplicitWait(4);
	}

	// This method is for sign up to eSignly
	public void signUpButton() throws InterruptedException {
		needToImplicitWait(2);
		signupBtn.click();
	}

	// This method is for login via linkedIn
	public void linkedIn() throws InterruptedException {
		needToImplicitWait(2);
		linkedIn.click();
	}

	// This method is for login via Google
	public void google() throws InterruptedException {
		needToImplicitWait(2);
		google.click();
	}

	// This method is for login from Navigation Bar
	public void loginbtnNavigationBar() throws InterruptedException {
		needToImplicitWait(2);
		loginNavigationBtn.click();
	}

	// This method is to verify feature dropdown from Navigation bar
	public void featureDropdown() throws InterruptedException {
		needToImplicitWait(2);
		featureOptions.click();
		features.click();
	}

	// This method is for checking presence of eSignly LOGO
	public boolean eSignlyLogo() throws InterruptedException {
		needToImplicitWait(2);
		return logo.isDisplayed();
	}

	// This method is to verify insurance industries page
	public void insuranceIndustry() throws InterruptedException {
		needToImplicitWait(2);
		industriesOptions.click();
		insuranceIndustry.click();
	}

	// This method is to verify How it works page
	public void howItsWorking() throws InterruptedException {
		needToImplicitWait(2);
		howItWorks.click();
	}

	// This method is to verify Pricing page
	public void accountPricing() throws InterruptedException {
		needToImplicitWait(2);
		pricingOptions.click();
		pricing.click();
	}

	// This method is to verify Api Pricing page
	public void apiPricing() throws InterruptedException {
		needToImplicitWait(3);
		pricingOptions.click();
		apipricing.click();
	}

	// This method is to verify FAQ button
	public void faqs() throws InterruptedException {
		needToImplicitWait(3);
		faqpage.click();
	}

	// This method is to verify Free Trial button
	public void freeTrialBtn() throws InterruptedException {
		needToImplicitWait(3);
		trialbutton.click();
	}

	// This method is to verify Buy Now button
	public void buyNowBtn() throws InterruptedException {
		needToImplicitWait(3);
		buyNowBtn.click();
	}

	// This method is to verify Api Dropdown Api Document section
	public void apiDocBtn() throws InterruptedException {
		needToImplicitWait(3);
		apiOptions.click();
		apiDocuments.click();
	}

	// This method is to verify Api Dropdown Api Widget section
	public void apiWidgetBtn() throws InterruptedException {
		needToImplicitWait(3);
		apiOptions.click();
		apiWidget.click();
	}

	// This method is to verify presence of Login Section
	public boolean loginSection() throws InterruptedException {
		needToImplicitWait(3);
		return loginSectionUI.isDisplayed();
	}

	// This method is to verify presence of Navigation Bar
	public boolean navBar() throws InterruptedException {
		needToImplicitWait(3);
		return navigationBar.isDisplayed();
	}

	// This method is to verify presence of SignUp link
	public boolean signUpLink() throws InterruptedException {
		needToImplicitWait(3);
		return signupBtn.isDisplayed();
	}

	// This method is to verify presence of SignUp link
	public boolean socialIcons() throws InterruptedException {
		needToImplicitWait(3);
		return socialIcons.isDisplayed();
	}

	// This method is to verify presence of SignUp link
	public boolean forgotPassLink() throws InterruptedException {
		needToImplicitWait(3);
		return forgetPass.isDisplayed();
	}

	// This method is to get Text of the Social media
	public void getIconsText() throws InterruptedException {
		needToImplicitWait(3);
		Assert.assertEquals(socialIconText.getText(), "With your social media account");
	}

	// This method is to verify UI of Login Page
	public void loginUI() throws InterruptedException {
		needToImplicitWait(3);
		eSignlyLogo();
		loginSection();
		navBar();
		signUpLink();
		socialIcons();
		forgotPassLink();
		getIconsText();
	}

}
