package com.esignlyNew.pages;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MyTeamPage extends DashboardPage {
	DashboardPage dashboardPage = new DashboardPage();
	@FindBy(xpath = "//h1[@class='page-title']")
	private WebElement verifyTitle;

	@FindBy(xpath = "//a[contains(text(),'Purchase license')]")
	private WebElement purchasebtn;

	@FindBy(xpath = "//td[contains(text(),'Please invite someone to create Team.')]")
	private WebElement verifyPleaseInviteSomeone;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement myTeamEmailID;

	@FindBy(xpath = "//button[@id='addbtn']")
	private WebElement invitePeopleFreeBtn;

	@FindBy(xpath = "//body/div[1]/div[1]")
	private WebElement emailnotcorrect;

	@FindBy(xpath = "//select[@id='billing_type']")
	private WebElement clickDropdownSelectPlanType;

	@FindBy(xpath = "//select[@id='plan_type']")
	private WebElement clickDropdownChoosePlan;

	@FindBy(xpath = "//select[@id='num_seats']")
	private WebElement clickDropdownNoOfUSers;

	@FindBy(xpath = "//a[contains(text(),'changeDetails')]")
	private WebElement clickChangeCardDetails;

	@FindBy(xpath = "//a[@id='validate_coupon']")
	private WebElement clickValidateBtn;

	@FindBy(xpath = "//div[contains(text(),'Please enter coupon code')]")
	private WebElement verifyMsgEntercode;

	@FindBy(xpath = "//input[@id='coupon_code']")
	private WebElement enterCode;

	@FindBy(xpath = "//div[contains(text(),'Invalid Coupon')]")
	private WebElement invalidCode;

	@FindBy(xpath = "//button[@id='continueButton']")
	private WebElement continueBtn;

	@FindBy(xpath = "//body/div[@id='user_sign_signup_popup']/div[1]/button[1]")
	private WebElement closePurchaseLicencePopup;

	@FindBy(xpath = "//h6[contains(text(),'Purchase license')]")
	private WebElement purchasePopupTitle;

	@FindBy(xpath = "//h4[contains(text(),'How many licenses do you need??')]")
	private WebElement noOfUsersLabel;

	@FindBy(xpath = "//input[@id='cc_number']")
	private WebElement cardDetails;

	@FindBy(xpath = "//input[@id='cc_exp_month']")
	private WebElement expiryDate;

	@FindBy(xpath = "//body[1]/div[1]/div[2]/div[3]/div[1]/em[1]")
	private WebElement billingMsg;

	@FindBy(xpath = "//span[contains(text(),'Project Team')]")
	private WebElement teamName;

	@FindBy(xpath = "//a[@id='edit_team_name_link']")
	private WebElement teamNameEditBtn;

	@FindBy(xpath = "//input[@id='team_name']")
	private WebElement teamText;

	@FindBy(xpath = "//a[@id='save_team_name_link']")
	private WebElement saveBtn;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement invitePeopleEmailid;

	@FindBy(xpath = "//div[@class='cust_alert text-muted cust_alert_error']")
	private WebElement alertMsg;

	@FindBy(xpath = "//td[contains(text(),'No Team Members yet.')]")
	private WebElement noMember;

////a[@class='btnrm btn action-btn']
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[6]/div[1]/a[1]")
	private WebElement removeBtn;

	@FindBy(xpath = "//a[contains(text(),'Public Inbox')]")
	private WebElement publicInbox;

	@FindBy(xpath = "//input[@id='inbox_field']")
	private WebElement mailinatorTextEmail;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[6]/div[1]/a[2]")
	private WebElement reusableTempBtn;

	@FindBy(xpath = "//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/button[1]")
	private WebElement clsBtnReusableTempBtn;

	@FindBy(xpath = "//tbody/tr[@id='row_188305645']/td[6]/div[1]/a[3]")
	private WebElement makeAdminBtn;

	@FindBy(xpath = "//tbody/tr[@id='row_188305645']/td[6]/div[1]/a[3]")
	private WebElement revokeAdminBtn;

	@FindBy(xpath = "//button[@id='nav']")
	private WebElement settingDropdownBtn;

	@FindBy(xpath = "//a[@id='btnleaveteamowner']")
	private WebElement leaveTheTeam;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/a[1]")
	private WebElement planDetails;

	@FindBy(xpath = "//a[@id='btnpaymentauth']")
	private WebElement deligatePaymentAuthority;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[3]/input[1]")
	private WebElement checkBoxPaymentAuthority;

	@FindBy(xpath = "//input[@id='confirmYes']")
	private WebElement okBtnPaymentAuthority;

	@FindBy(xpath = "//body/div[5]/div[1]/div[3]/input[1]")
	private WebElement cancelBtnPaymentAuthority;

	@FindBy(xpath = "//a[@id='btn-cancel']")
	private WebElement closeBtnConfirmationPaymentAuthority;

	@FindBy(xpath = "//a[@id='btn-authpayment']")
	private WebElement authorizeBtnPaymentAuthority;

	@FindBy(xpath = "//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]")
	private WebElement myTeamHeading;

	@FindBy(xpath = "//div[@id='table_team_member']")
	private WebElement myTeamTable;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[6]/div[1]/a[1]")
	private WebElement upgradeBtn;

	@FindBy(xpath = "//button[@id='continueButton']")
	private WebElement continueBtnUpgradeBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[5]/a[1]")
	private WebElement detailsBtn;

	@FindBy(xpath = "//button[@id='continueButton']")
	private WebElement submitBtn;

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	private WebElement okBtnSubmitBtn;

	@FindBy(xpath = "//a[contains(text(),'Downgrade')]")
	private WebElement downgradeBtn;

	@FindBy(xpath = "//body/div[5]/div[1]/div[3]/input[1]")
	private WebElement cancelDowngradeBtn;

	@FindBy(xpath = "//body/div[5]/div[1]/button[1]")
	private WebElement closeDowngradeBtn;

	@FindBy(xpath = "//input[@id='confirmYes']")
	private WebElement okDowngradeBtn;

	@FindBy(xpath = "//input[@value='Cancle']")
	WebElement cancelBtn;

	@FindBy(xpath = "//input[@id='confirmYes']")
	WebElement okBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[6]/div[1]/a[4]")
	WebElement removeBtn2;

	public boolean enterInMyTeam() throws InterruptedException {
		dashboardPage.myTeam();
		needToWait(3);
		Assert.assertEquals(driver.getCurrentUrl(), "https://server-acc.esignly.com/team");
		return true;
	}

	public boolean verifyTilepage() throws InterruptedException {

		dashboardPage.myTeam();
		needToWait(3);
		return verifyTitle.isDisplayed();
	}

	public boolean verifyPleaseInviteSomeone() throws InterruptedException {

		dashboardPage.myTeam();
		needToWait(3);
		return verifyPleaseInviteSomeone.isDisplayed();
	}

	public void myTeamPageTextemaildid() throws InterruptedException {

		dashboardPage.myTeam();
		myTeamEmailID.sendKeys("yamini@mailinator.com");
		needToWait(3);
	}

	public void invitePeopleFreeButton() throws InterruptedException {

		dashboardPage.myTeam();
		needToWait(2);
		myTeamEmailID.sendKeys("123abc@mailinator.com");
		invitePeopleFreeBtn.click();
		needToWait(2);
	}

	public void onlyInvitePeopleFreeButton() throws InterruptedException {

		dashboardPage.myTeam();
		invitePeopleFreeBtn.click();
		needToWait(2);
		alertMsg.isDisplayed();

	}

	public void clickOnPurchaseLicenceBtn() throws InterruptedException {

		dashboardPage.myTeam();
		purchasebtn.click();
		needToWait(3);
	}

	public void clickDropdownPlanTypeYearly() throws InterruptedException {

		dashboardPage.myTeam();
		purchasebtn.click();
		needToWait(2);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='team_licence']")));
		clickDropdownSelectPlanType.click();
		Select licenceYear = new Select(clickDropdownSelectPlanType);
		licenceYear.selectByVisibleText("Yearly");
		needToWait(5);
	}

	public void clickDropdownPlanTypeMonthly() throws InterruptedException {

		dashboardPage.myTeam();
		purchasebtn.click();
		needToWait(2);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='team_licence']")));
		clickDropdownSelectPlanType.click();
		Select licenceYear = new Select(clickDropdownSelectPlanType);
		licenceYear.selectByVisibleText("Monthly");
		needToWait(5);
	}

	public void clickDorpdownStandardPlan() throws InterruptedException {

		dashboardPage.myTeam();
		purchasebtn.click();
		needToWait(2);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='team_licence']")));
		clickDropdownChoosePlan.click();
		Select choosePlan = new Select(clickDropdownChoosePlan);
		choosePlan.selectByVisibleText("Standard Plan($20.00/license)");

		needToWait(5);
	}

	public void clickDorpdownAdvancedPlan() throws InterruptedException {

		dashboardPage.myTeam();
		purchasebtn.click();
		needToWait(2);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='team_licence']")));
		clickDropdownChoosePlan.click();
		Select choosePlan = new Select(clickDropdownChoosePlan);
		choosePlan.selectByVisibleText("Advanced Plan($30.00/license)");

		needToWait(5);
	}

	public void clickDorpdownNoOfUsers() throws InterruptedException {

		dashboardPage.myTeam();
		purchasebtn.click();
		needToWait(2);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='team_licence']")));
		clickDropdownNoOfUSers.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='num_seats']")));
		Select numberOfUsers = new Select(e);
		List<WebElement> NoOfSeats = numberOfUsers.getOptions();
		Random rand = new Random();
		numberOfUsers.selectByIndex(1 + rand.nextInt(NoOfSeats.size() - 1));
		e = numberOfUsers.getFirstSelectedOption();

		needToWait(5);
	}

	public void clickChangeCardDetails() throws InterruptedException {
		dashboardPage.myTeam();
		purchasebtn.click();
		needToWait(2);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='team_licence']")));
		clickChangeCardDetails.click();
		needToWait(5);
	}

	public boolean clickValidateBtnValidateMsg1() throws InterruptedException {
		dashboardPage.myTeam();
		purchasebtn.click();
		needToWait(2);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='team_licence']")));
		clickValidateBtn.click();
		needToWait(5);
		return verifyMsgEntercode.isDisplayed();
	}

	public boolean clickValidateBtnValidateMSg2() throws InterruptedException {
		dashboardPage.myTeam();
		purchasebtn.click();
		needToWait(2);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='team_licence']")));
		enterCode.sendKeys("45");
		clickValidateBtn.click();
		needToWait(5);
		return invalidCode.isDisplayed();
	}

	public void clickContinueBtn() throws InterruptedException {
		dashboardPage.myTeam();
		purchasebtn.click();
		needToWait(2);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='team_licence']")));
		continueBtn.click();
		needToWait(10);
	}

	public void closePurchaseLicence() throws InterruptedException {
		dashboardPage.myTeam();
		purchasebtn.click();
		needToWait(2);
		// driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='team_licence']")));
		closePurchaseLicencePopup.click();
		needToWait(3);
	}

	public void purchaseLicenceUI() throws InterruptedException {
		dashboardPage.myTeam();
		purchasebtn.click();
		needToWait(2);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='team_licence']")));
		needToWait(3);
		Assert.assertEquals(purchasePopupTitle.getText(), "Purchase license");
		clickDropdownSelectPlanType.isDisplayed();
		clickDropdownChoosePlan.isDisplayed();
		Assert.assertEquals(noOfUsersLabel.getText(), "How many licenses do you need??");
		clickDropdownNoOfUSers.isDisplayed();
		cardDetails.isDisplayed();
		clickChangeCardDetails.isDisplayed();
		expiryDate.isDisplayed();
		enterCode.isDisplayed();
		clickValidateBtn.isDisplayed();
		billingMsg.isDisplayed();
		needToWait(3);
	}

	public void teamName() throws InterruptedException {
		dashboardPage.myTeam();
		teamName.isDisplayed();

		needToWait(2);
	}

	public void teamNameEditBtn() throws InterruptedException {
		dashboardPage.myTeam();
		teamNameEditBtn.click();

		needToWait(2);
	}

	public void teamNameEditBtn_SaveBtn() throws InterruptedException {
		teamNameEditBtn();
		teamText.clear();
		needToWait(2);
		teamText.sendKeys("Project Team");
		saveBtn.click();
		needToWait(2);
	}

	public void verifyExistingMember() throws InterruptedException {
		dashboardPage.myTeam();
		needToWait(2);
		myTeamEmailID.sendKeys("123abc@mailinator.com");
		invitePeopleFreeBtn.click();
		needToWait(2);
		alertMsg.isDisplayed();
	}

	public void verifyOtherTeamMember() throws InterruptedException {
		dashboardPage.myTeam();
		needToWait(2);
		myTeamEmailID.sendKeys("esignly014@mailinator.com");
		invitePeopleFreeBtn.click();
		needToWait(2);
		alertMsg.isDisplayed();
	}

	public void ifMemberAccept() throws InterruptedException {
		dashboardPage.myTeam();
		needToWait(2);
		myTeamEmailID.sendKeys("qatest200@yopmail.com");
		invitePeopleFreeBtn.click();
		needToWait(2);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://yopmail.com/en/");
		driver.findElement(By.xpath("//input[@id='login']")).sendKeys("QATest200");
		driver.findElement(By.xpath("//button[@class='md']")).click();
		needToWait(3);
		driver.switchTo().frame(driver.findElement(By.id("ifmail")));
		needToWait(3);
		driver.findElement(By.xpath("//a[contains(text(),'Accept')]")).click();
		needToWait(4);
	}

	public void ifMemberReject() throws InterruptedException {
		dashboardPage.myTeam();
		needToWait(2);
		myTeamEmailID.sendKeys("qatest201@yopmail.com");
		invitePeopleFreeBtn.click();
		needToWait(2);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://yopmail.com/en/");
		driver.findElement(By.xpath("//input[@id='login']")).sendKeys("QATest201");
		driver.findElement(By.xpath("//button[@class='md']")).click();
		needToWait(3);
		driver.switchTo().frame(driver.findElement(By.id("ifmail")));
		needToWait(3);
		driver.findElement(By.xpath("//a[contains(text(),'Reject')]")).click();
		needToWait(4);
	}

	public void removeBrforeAcceptAndCancelBtn() throws InterruptedException {
		dashboardPage.myTeam();
		needToWait(2);
		removeBtn.click();
		needToWait(3);
		cancelBtn.click();
		needToWait(3);
		myTeamEmailID.sendKeys("qatest202@yopmail.com");
		invitePeopleFreeBtn.click();
		needToWait(4);
	}

	public void removeBrforeAcceptAndOkBtn() throws InterruptedException {
		dashboardPage.myTeam();
		needToWait(2);
		removeBtn.click();
		needToWait(3);
		okBtn.click();
		needToWait(3);
		myTeamEmailID.sendKeys("qatest202@yopmail.com");
		invitePeopleFreeBtn.click();

		needToWait(4);

	}

//public void noTeamMemberYet() throws InterruptedException
//{
//	dashboardPage.myTeam();
//	needToWait(2);
//	removeBtn.click();
//	needToWait(2);
//	noMember.isDisplayed();
//	needToWait(2);
//}

	public void upgradeBtn() throws InterruptedException {
		dashboardPage.myTeam();
		needToWait(2);
		upgradeBtn.click();
		needToWait(2);
	}

	public void continueBtnUpgradeBtn() throws InterruptedException {
		upgradeBtn();
		needToWait(2);
		driver.switchTo().frame(driver.findElement(By.id("team_distr")));
		needToWait(2);
		continueBtnUpgradeBtn.click();
		needToWait(2);
	}

	public void detailsBtnUpgradeBtn() throws InterruptedException {
		upgradeBtn();
		needToWait(2);
		driver.switchTo().frame(driver.findElement(By.id("team_distr")));
		needToWait(2);
		detailsBtn.click();
		needToWait(4);
	}

	public void submitBtnUpgradeBtn() throws InterruptedException {
		detailsBtnUpgradeBtn();
		needToWait(2);
		submitBtn.click();
		needToWait(2);
		okBtnSubmitBtn.click();
		needToWait(2);
	}

	public void reusableTemplates() throws InterruptedException {
		dashboardPage.myTeam();
		needToWait(2);
		reusableTempBtn.click();
		needToWait(2);
	}

	public void downgradeBtn() throws InterruptedException {
		dashboardPage.myTeam();
		needToWait(2);
		downgradeBtn.click();
		needToWait(2);
		cancelDowngradeBtn.click();
		needToWait(4);
	}

	public void closeBtnDowngradeBtn() throws InterruptedException {
		dashboardPage.myTeam();
		needToWait(2);
		downgradeBtn.click();
		needToWait(2);
		closeDowngradeBtn.click();
		needToWait(4);
	}

	public void okBtnDowngradeBtn() throws InterruptedException {
		dashboardPage.myTeam();
		needToWait(2);
		downgradeBtn.click();
		needToWait(2);
		okDowngradeBtn.click();
		needToWait(4);
	}

	public void closeBtnReusableTemplates() throws InterruptedException {
		reusableTemplates();
		needToWait(2);
		clsBtnReusableTempBtn.click();
		needToWait(2);
	}

	public void makeAdminBtn() throws InterruptedException {
		dashboardPage.myTeam();
		needToWait(2);
		makeAdminBtn.click();
		needToWait(2);
	}

	public void revokeAdminBtn() throws InterruptedException {
		dashboardPage.myTeam();
		needToWait(2);
		revokeAdminBtn.click();
		needToWait(2);
	}

	public void leaveTheTeamDropdown() throws InterruptedException {
		dashboardPage.myTeam();
		needToWait(2);
		settingDropdownBtn.click();
		leaveTheTeam.isDisplayed();
		needToWait(2);
	}

	public void planDetailsDropdown() throws InterruptedException {
		dashboardPage.myTeam();
		needToWait(2);
		settingDropdownBtn.click();
		planDetails.isDisplayed();
		needToWait(2);
	}

	public void paymentAuthorityDropdown() throws InterruptedException {
		dashboardPage.myTeam();
		needToWait(2);
		settingDropdownBtn.click();
		deligatePaymentAuthority.click();
		needToWait(2);
		checkBoxPaymentAuthority.click();
		needToWait(3);
		okBtnPaymentAuthority.click();
		needToWait(2);
	}

	public void cancelBtnPaymentAuthorityDropdown() throws InterruptedException {
		dashboardPage.myTeam();
		needToWait(2);
		settingDropdownBtn.click();
		deligatePaymentAuthority.click();
		needToWait(2);
		checkBoxPaymentAuthority.click();
		needToWait(3);
		cancelBtnPaymentAuthority.click();
		needToWait(2);
	}

	public void closeBtnPaymentAuthorityDropdown() throws InterruptedException {
		dashboardPage.myTeam();
		needToWait(2);
		settingDropdownBtn.click();
		deligatePaymentAuthority.click();
		needToWait(2);
		closeBtnConfirmationPaymentAuthority.click();
		needToWait(3);
	}

	public void authorizeBtnPaymentAuthority() throws InterruptedException {
		dashboardPage.myTeam();
		needToWait(2);
		settingDropdownBtn.click();
		deligatePaymentAuthority.click();
		needToWait(2);
		authorizeBtnPaymentAuthority.click();
		needToWait(3);
	}

	public void uncheckOkBtnPaymentAuthorityDropdown() throws InterruptedException {
		dashboardPage.myTeam();
		needToWait(2);
		settingDropdownBtn.click();
		deligatePaymentAuthority.click();
		needToWait(2);
		checkBoxPaymentAuthority.click();
		needToWait(3);
		checkBoxPaymentAuthority.click();
		needToWait(2);
		okBtnPaymentAuthority.click();
		needToWait(2);
	}

	public void myTemUI() throws InterruptedException {
		dashboardPage.myTeam();
		needToWait(2);
		Assert.assertTrue(myTeamHeading.isDisplayed());
		Assert.assertTrue(purchasebtn.isDisplayed());
		Assert.assertTrue(invitePeopleFreeBtn.isDisplayed());
		Assert.assertTrue(myTeamEmailID.isDisplayed());
		Assert.assertTrue(settingDropdownBtn.isDisplayed());
		Assert.assertTrue(myTeamTable.isDisplayed());
		needToWait(2);
	}

	public void removeAfterAcceptAndRemoveBtn() throws InterruptedException {
		ifMemberAccept();
		needToWait(5);
		removeBtn2.click();
		needToWait(3);
	}
}
