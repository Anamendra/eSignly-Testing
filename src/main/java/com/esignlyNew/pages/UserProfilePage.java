package com.esignlyNew.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UserProfilePage extends DashboardPage {
	DashboardPage dash = new DashboardPage();

	// Page factory
	@FindBy(css = "div#userToggle")
	WebElement myProfileIcon;

	@FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[3]/ul[1]/li[1]/a[1]")
	WebElement myprofile;

	@FindBy(css = "ul.nav.nav-tabs li:nth-child(1)")
	WebElement viewProfileTab;

	@FindBy(xpath = "//div[contains(text(),'Last Updated At:')]")
	WebElement LastUpdatedText;

	@FindBy(xpath = "//span[contains(text(),'qamanish@mailinator.com')]")
	WebElement getUserEmail;

	@FindBy(xpath = "//input[@data-submit='firstname']")
	WebElement firstName;

	@FindBy(xpath = "//input[@data-submit='lastname']")
	WebElement lastName;

	@FindBy(css = "#cust_alert")
	WebElement userProfileUpdatedSuccessMsg;

	@FindBy(id = "ajaxSaveUser_8853460584")
	private WebElement selectGender;

	@FindBy(id = "ajaxSavedate_8853460584")
	private WebElement selectDate;

	@FindBy(id = "ajaxSaveUser_8853460585")
	private WebElement phoneNum;

	@FindBy(id = "ajaxSaveUser_8853460586")
	private WebElement timeZone;

	@FindBy(id = "ajaxSaveUser_8853460588")
	private WebElement companyName;

	@FindBy(id = "ajaxSaveUser_8853460588-1")
	private WebElement usingEsignly;

	@FindBy(id = "ajaxSaveUser_8853460589")
	private WebElement industryDrd;

	@FindBy(id = "ajaxSaveUser_88534605810")
	private WebElement DOB;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/a[1]")
	private WebElement selectDOB;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[5]/div[3]/input[1]")
	private WebElement address;

	@FindBy(xpath = "//div[@class='cust_alert text-muted cust_alert_error']/i[@class='icon-info-sign']")
	private WebElement addressErrorMsg;

	@FindBy(id = "is_send_audit_switch")
	private WebElement auditToggleBtn;

	@FindBy(id = "send_type_switch")
	private WebElement documentSettingToggleBtn;

	@FindBy(id = "email_subscription_on")
	private WebElement emailNewsLetterToggleBtn;

	@FindBy(id = "account_subscription_on")
	private WebElement weeklyAccountStatistics;

	@FindBy(id = "delete_account")
	private WebElement deleteAcc;

//	// Initialize page factory
//	public UserProfilePage() {
//		PageFactory.initElements(driver, this);
//	}

	// This function is used for click on the My profile icon
	public void ClickOnMyprofileIcon() throws InterruptedException {
		login.validUserCredentials();
		myProfileIcon.click();
		needToWait(4);
		myprofile.click();
		needToWait(4);

	}

	// This function is used for Verify the presence of View Profile tab
	public boolean isViewProfileTabPresent() {
		return viewProfileTab.isDisplayed();
	}

//	 This function is used for Verify the presence of Last Updated tab on View
//	 Profile tab
	public boolean isLastUpdatedTextPresentOnViewProfileTab() {
		return LastUpdatedText.isDisplayed();
	}

	// This function used for get email address
	public String getEmailAddress() {
		String getEmail = getUserEmail.getText();
		return getEmail;
	}

	// This function used for first name Clear and type
	public void firstNameClearAndType() {
		firstName.clear();
		firstName.sendKeys("qamanish");
		lastName.click();

	}

	// This function used for last name Clear and type
	public void lastNameClearAndType() {
		lastName.clear();
		lastName.sendKeys("porwal");
		lastName.click();

	}

	// This function is used for Verify the presence of Last Updated tab on View
	// Profile tab
	public boolean isUserProfileUpdatedSuccessMsg() {
		return userProfileUpdatedSuccessMsg.isDisplayed();
	}

	// This function used for select gender value
	public void selectGender() {
		Select gender = new Select(selectGender);
		gender.selectByVisibleText("Female");
		needToWait(1);
		gender.selectByVisibleText("Male");
		// gender.selectByIndex(2);
		needToWait(1);

	}

	// This function used for select gender value
	public void selectDate() {
		Select date = new Select(selectDate);
		date.selectByVisibleText("MM / DD /YYYY");
		date.selectByIndex(1);
		needToWait(2);
	}

	// This function used for phoneNum and type
	public void phoneNum() {
		phoneNum.clear();
		phoneNum.sendKeys("1234567");
		lastName.click();
	}

	// This function used for select Time Zone
	public void selectTimeZone() {
		Select date = new Select(timeZone);
		date.selectByIndex(1);
		date.selectByVisibleText("(05:30) Chennai, Kolkata, Mumbai, New");
		needToWait(2);

	}

	// This function used for Company name Clear and type
	public void companyNameClearAndType() {
		companyName.clear();
		companyName.sendKeys("CIS");
		companyName.click();
	}

	// This function used for select Using eSignly
	public void usingEsignlyDropdown() {
		Select usingEsignlydrp = new Select(usingEsignly);
		usingEsignlydrp.selectByIndex(1);
		usingEsignlydrp.selectByIndex(2);
		usingEsignlydrp.selectByIndex(3);
		usingEsignlydrp.selectByIndex(4);
		usingEsignlydrp.selectByIndex(1);
		needToWait(2);
	}

	// This function used for select industryDrd
	public void industryDrd() {
		Select industry = new Select(industryDrd);
		industry.selectByIndex(1);
		industry.selectByIndex(2);
		industry.selectByIndex(3);
		industry.selectByIndex(4);
		industry.selectByIndex(5);
		industry.selectByIndex(6);
		industry.selectByIndex(7);
		industry.selectByIndex(1);
		needToWait(2);
	}

	// This function used for select Date of birth
	public void selectDOB() {
		DOB.click();
		selectDOB.click();
		needToWait(2);
	}

	// This function used for first name Clear and type
	public void enterAddress() {
		WebElement elm = driver.findElement(By.xpath("//input[@id='ajaxSaveUser_8853460585']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elm);
		address.clear();
		addressErrorMsg.isDisplayed();
		address.sendKeys("indore");
		needToWait(5);
	}

	// This function used for audit Report
	public void auditReport() {
		auditToggleBtn.click();
		needToWait(3);
		auditToggleBtn.click();
	}

	// This function used for Document Setting Toggle Btn
	public void clickOnDocumentSettingToggleBtn() {
		documentSettingToggleBtn.click();
		needToWait(3);
		documentSettingToggleBtn.click();
	}

	// This function used for EmailNews Letter Toggle Btn
	public void clickOnEmailNewsLetterToggleBtn() {
		emailNewsLetterToggleBtn.click();
		needToWait(3);
		emailNewsLetterToggleBtn.click();
	}

	// This function used for EmailNews Letter Toggle Btn
	public void clickOnWeeklyAccountStatistics() {
		weeklyAccountStatistics.click();
		needToWait(3);
		weeklyAccountStatistics.click();
	}

	// This function used for Delete Button present
	public boolean isDeleteButtonPresent() {
		return deleteAcc.isDisplayed();
	}

}
