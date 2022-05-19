package com.esignlyNew.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class PricingPage extends DashboardPage {

	DashboardPage dash = new DashboardPage();

	@FindBy(xpath = "//button[@class=\"tablinks\"]")
	WebElement monthlyTab;// button[@class='tablinks']

	@FindBy(xpath = "//button[@class=\"tablinks active\"]")
	WebElement yearlyTab;

	@FindBy(xpath = "//h2[contains(text(),'Solo')] /following-sibling::h3[contains(text(),'5')]")
	WebElement yearlyContentForCheck;

	@FindBy(xpath = "/html[1]/body[1]/section[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/span[1]")
	WebElement monthlyContentForCheck;

	@FindBy(xpath = "//body/section[3]/div[1]/div[1]/div[2]/div[1]/div[5]/div[3]/a[1]")
	WebElement viewCardDetails;

	@FindBy(xpath = "//input[@id='cc_number']")
	WebElement cardATMNum;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[3]/div[1]/a[1]")
	WebElement cardChangeDetails;

	@FindBy(xpath = "//input[@id='cc_exp_month']")
	WebElement cardExpirationDate;

	@FindBy(xpath = "//input[@id='coupon_code']")
	WebElement cardCouponCode;

	@FindBy(xpath = "//a[@id='validate_coupon']")
	WebElement cardValidateLink;

	@FindBy(xpath = "//button[@id='continueButton']")
	WebElement cardContinueBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/span[2]/a[1]")
	WebElement cardViewAllPlansLink;

	@FindBy(xpath = "//body[1]/section[3]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/a[1]")
	WebElement professionalPlanFreeTrialBtn;

	@FindBy(xpath = "//body/section[3]/div[1]/div[1]/div[2]/div[1]/div[6]/div[2]/a[1]")
	WebElement enterpriseContactBtn;

	@FindBy(xpath = "//a[contains(text(),'Need API Pricing?')]")
	WebElement needToAPIPricingBtn;

	@FindBy(xpath = "//body/section[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")
	WebElement pricingquestion1Dropdown;

	@FindBy(xpath = "//body/section[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]")
	WebElement pricingquestion2Dropdown;

	@FindBy(xpath = "//body/section[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/button[1]")
	WebElement pricingquestion3Dropdown;

	@FindBy(xpath = "//body/section[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/button[1]")
	WebElement pricingquestion4Dropdown;

	@FindBy(xpath = "//body/section[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/button[1]")
	WebElement pricingquestion5Dropdown;

	@FindBy(xpath = "//body/section[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/button[1]")
	WebElement pricingquestion6Dropdown;

	@FindBy(xpath = "//body/section[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/button[1]")
	WebElement pricingquestion7Dropdown;

	@FindBy(xpath = "//body/section[5]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]")
	WebElement generalquestion1Dropdown;

	@FindBy(xpath = "//body/section[5]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/button[1]")
	WebElement generalquestion2Dropdown;

	@FindBy(xpath = "//body/section[5]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/button[1]")
	WebElement generalquestion3Dropdown;

	@FindBy(xpath = "//body/section[5]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/button[1]")
	WebElement generalquestion4Dropdown;

	@FindBy(xpath = "//body/section[5]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[5]/button[1]")
	WebElement generalquestion5Dropdown;

	@FindBy(xpath = "//body/section[5]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[6]/button[1]")
	WebElement generalquestion6Dropdown;

	@FindBy(xpath = "//body/section[5]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[7]/button[1]")
	WebElement generalquestion7Dropdown;

	@FindBy(xpath = "//a[contains(text(),'Features Page.')]")
	WebElement featuresPageLink;

	@FindBy(xpath = "//a[contains(text(),'eSignly API Pricing.')]")
	WebElement apiPricingLink;

	@FindBy(xpath = "//a[contains(text(),\"Let's talk\")]")
	WebElement letsTalkLink;

	@FindBy(xpath = "//body[1]/section[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2[1]")
	WebElement freePlanLabel;

	@FindBy(xpath = "//body[1]/section[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/h2[1]")
	WebElement soloPlanLabel;

	@FindBy(xpath = "//body[1]/section[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/h2[1]")
	WebElement professionPlanLabel;

	@FindBy(xpath = "//body[1]/section[3]/div[1]/div[1]/div[2]/div[1]/div[5]/div[2]/h2[1]")
	WebElement businessTeamLabel;

	@FindBy(xpath = "//body[1]/section[3]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/h2[1]")
	WebElement enterpriseLabel;

	@FindBy(xpath = "//body[1]/section[3]/div[1]/div[1]/div[2]/div[1]/div[5]/div[5]/div[1]/p[2]/a[1]/i[1]")
	WebElement getVolumeDiscountBusinessTeam;

	@FindBy(xpath = "//body[1]/section[3]/div[1]/div[1]/div[2]/div[1]/div[6]/div[4]/div[1]/p[2]/a[1]/i[1]")
	WebElement getVolumeDiscountEnterpriseTeam;

	@FindBy(xpath = "//body/section[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/a[1]")
	WebElement apiBasicStartNowBtn;

	@FindBy(xpath = "//body/section[3]/div[1]/div[1]/div[2]/div[1]/div[6]/div[2]/a[1]")
	WebElement apiEnterpriseContactUsBtn;

	@FindBy(xpath = "//a[contains(text(),'Need Account Pricing?')]")
	WebElement needAccountPricingBtn;

	@FindBy(xpath = "//div[contains(text(),'Please enter coupon code')]")
	WebElement validateLinkMessage;

	@FindBy(xpath = "//div[@class='modal-body']/form/div[@class='form-errors']")
	WebElement invalidCouponCodeMessage;

	@FindBy(xpath = "----------------------")
	WebElement validCouponCodeMessage;

	@FindBy(xpath = "//div[@class='modal-body']/p")
	WebElement samePlanMessage;

	@FindBy(xpath = "//body/section[3]/div[1]/div[1]/div[2]/div[1]/div[5]/div[3]/a[1]")
	WebElement advanceApiPlan;

	public void pricingUrl() throws InterruptedException {
		dash.validUserCredentials();
		dash.upgradeNow();
		needToImplicitWait(4);
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://server-acc.esignly.com/pricing");
		needToImplicitWait(2);
	}

	public void monthlyTab() throws InterruptedException {
		pricingUrl();
		needToWait(3);
		monthlyTab.click();
		needToImplicitWait(3);
		Assert.assertNotEquals(yearlyContentForCheck, monthlyContentForCheck);
		needToImplicitWait(2);
	}

	public void yearlyTab() throws InterruptedException {
		pricingUrl();
		needToWait(3);
		monthlyTab.click();
		yearlyTab.click();
		needToImplicitWait(3);
		Assert.assertNotEquals(monthlyContentForCheck, yearlyContentForCheck);
		needToImplicitWait(2);
	}

	public void viewCardDetails() throws InterruptedException {
		dash.validUserCredentials();
		dash.upgradeNow();
		needToImplicitWait(4);
		viewCardDetails.click();
		needToImplicitWait(2);
	}

	public void freeTrialCardDetailsUI() throws InterruptedException {
		dash.validUserCredentials();
		dash.upgradeNow();
		needToWait(2);
		viewCardDetails.click();
		needToWait(10);
		driver.switchTo().frame(driver.findElement(By.id("iframe_pricing")));
		needToWait(3);
		driver.findElement(By.xpath("//input[@id='cc_number']")).isDisplayed();
//		cardChangeDetails.isDisplayed();
//		cardExpirationDate.isDisplayed();
//		cardCouponCode.isDisplayed();
//		cardValidateLink.isDisplayed();
//		cardViewAllPlansLink.isDisplayed();
//		cardContinueBtn.isDisplayed();

		needToWait(4);
		// driver.switchTo().defaultContent();
	}

	public void changeDetailsLink() throws InterruptedException {
		dash.validUserCredentials();
		dash.upgradeNow();
		needToWait(10);
		professionalPlanFreeTrialBtn.click();
		needToWait(10);
		driver.findElement(By.xpath("//div[@class='inner_d_panel']"));
		driver.switchTo().frame("");
		WebElement frame1Heading = driver.findElement(By.id(""));
		needToWait(4);
		// driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/form[1]/div[2]/div[1]/a[1]")).click();
		// driver.switchTo().defaultContent();
		needToWait(5);

	}

	public void enterpriseContactUsBtn() throws InterruptedException {
		dash.validUserCredentials();
		dash.upgradeNow();
		needToImplicitWait(4);
		enterpriseContactBtn.click();
		needToImplicitWait(2);
	}

	public void needApiPricingBtn() throws InterruptedException {
		dash.validUserCredentials();
		dash.upgradeNow();
		needToImplicitWait(4);
		needToAPIPricingBtn.click();
		needToImplicitWait(4);
	}

	public void pricingFaq() throws InterruptedException {
		dash.validUserCredentials();
		dash.upgradeNow();
		needToImplicitWait(4);
		WebElement elm = driver.findElement(By.xpath("//button[contains(text(),\"Pricing FAQ's\")]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elm);
		needToImplicitWait(3);
		pricingquestion1Dropdown.click();
		needToImplicitWait(4);
		pricingquestion2Dropdown.click();
		needToImplicitWait(4);
		pricingquestion3Dropdown.click();
		needToImplicitWait(4);
		pricingquestion4Dropdown.click();
		needToImplicitWait(4);
		pricingquestion5Dropdown.click();
		needToImplicitWait(4);
		pricingquestion6Dropdown.click();
		needToImplicitWait(4);
		pricingquestion7Dropdown.click();
		needToImplicitWait(4);
	}

	public void generalFaq() throws InterruptedException {
		dash.validUserCredentials();
		dash.upgradeNow();
		needToImplicitWait(4);
		WebElement elm = driver.findElement(By.xpath("//h2[contains(text(),'Looking for more?')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elm);
		driver.findElement(By.xpath("/html[1]/body[1]/section[5]/div[1]/div[1]/div[1]/div[1]/button[2]")).click();
		needToWait(5);
		generalquestion1Dropdown.click();
		needToWait(4);
		generalquestion2Dropdown.click();
		needToWait(4);
		generalquestion3Dropdown.click();
		needToWait(4);
		generalquestion4Dropdown.click();
		needToImplicitWait(4);
		generalquestion5Dropdown.click();
		needToImplicitWait(4);
		generalquestion6Dropdown.click();
		needToImplicitWait(4);
		generalquestion7Dropdown.click();
		needToWait(4);
	}

	public void featuresLink() throws InterruptedException {
		dash.validUserCredentials();
		dash.upgradeNow();
		needToImplicitWait(4);
		WebElement elm = driver
				.findElement(By.xpath("//body[1]/section[3]/div[1]/div[1]/div[2]/div[1]/div[6]/div[4]/div[27]/p[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elm);
		driver.findElement(By.xpath("//a[contains(text(),'Features Page.')]")).click();
		needToWait(5);
	}

	public void apiPricingLink() throws InterruptedException {
		dash.validUserCredentials();
		dash.upgradeNow();
		needToImplicitWait(4);
		WebElement elm = driver
				.findElement(By.xpath("//body[1]/section[3]/div[1]/div[1]/div[2]/div[1]/div[6]/div[4]/div[27]/p[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elm);
		driver.findElement(By.xpath("//a[contains(text(),'eSignly API Pricing.')]")).click();
		needToWait(5);
	}

	public void letsTalkLink() throws InterruptedException {
		dash.validUserCredentials();
		dash.upgradeNow();
		needToImplicitWait(4);
		WebElement elm = driver
				.findElement(By.xpath("//body[1]/section[3]/div[1]/div[1]/div[2]/div[1]/div[6]/div[4]/div[27]/p[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elm);
		driver.findElement(By.xpath("/html[1]/body[1]/section[4]/div[1]/div[1]/div[1]/p[3]/a[1]")).click();
		needToWait(5);
	}

	public void accountPricingUI() throws InterruptedException {
		pricingUrl();
		needToImplicitWait(3);
		monthlyTab.isDisplayed();
		yearlyTab.isDisplayed();
		freePlanLabel.isDisplayed();
		soloPlanLabel.isDisplayed();
		professionPlanLabel.isDisplayed();
		businessTeamLabel.isDisplayed();
		enterpriseLabel.isDisplayed();
		needToAPIPricingBtn.isDisplayed();
		getVolumeDiscountBusinessTeam.isDisplayed();
		getVolumeDiscountEnterpriseTeam.isDisplayed();
		needToWait(5);
		WebElement elm = driver.findElement(By.xpath("//h2[contains(text(),'Looking for more?')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elm);
		//
		driver.findElement(By.xpath("//a[contains(text(),'eSignly API Pricing.')]")).isDisplayed();
		driver.findElement(By.xpath("//a[contains(text(),'Features Page.')]")).isDisplayed();
		driver.findElement(By.xpath("//a[contains(text(),\"Let's talk\")]")).isDisplayed();

		needToWait(5);
		WebElement elm1 = driver.findElement(By.xpath("//h2[contains(text(),'Looking for more?')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elm1);
		driver.findElement(By.xpath("/html[1]/body[1]/section[5]/div[1]/div[1]/div[1]/div[1]/button[2]")).isDisplayed();
		driver.findElement(By.xpath("//button[contains(text(),\"Pricing FAQ's\")]")).isDisplayed();
		needToWait(5);
	}

	public void apiPricingUrl() throws InterruptedException {
		needApiPricingBtn();
		needToImplicitWait(4);
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://server-acc.esignly.com/api-plan");
		needToImplicitWait(2);
	}

	public void apiMonthlyTab() throws InterruptedException {
		needApiPricingBtn();
		needToImplicitWait(4);
		monthlyTab.click();
		needToImplicitWait(3);
	}

	public void apiYearlyTab() throws InterruptedException {
		needApiPricingBtn();
		monthlyTab.click();
		needToImplicitWait(4);
		yearlyTab.click();
		needToImplicitWait(3);
	}

	public void apiViewCardDetails() throws InterruptedException {
		needApiPricingBtn();
		needToImplicitWait(2);
		apiBasicStartNowBtn.click();
		needToImplicitWait(3);
	}

	public void apiViewCardDetailsUI() throws InterruptedException {
		apiViewCardDetails();
		needToWait(2);
		driver.switchTo().frame(driver.findElement(By.id("api_yearly_basic")));
		needToWait(2);
		cardATMNum.isDisplayed();
		cardChangeDetails.isDisplayed();
		cardExpirationDate.isDisplayed();
		cardCouponCode.isDisplayed();
		cardValidateLink.isDisplayed();
		cardViewAllPlansLink.isDisplayed();
		cardContinueBtn.isDisplayed();
		needToWait(3);
	}

	public void apiChangeCardDetailsLink() throws InterruptedException {
		apiViewCardDetails();
		needToWait(2);
		driver.switchTo().frame(driver.findElement(By.id("api_yearly_basic")));
		needToWait(2);
		cardChangeDetails.click();
		needToWait(3);
	}

	public void apiValidateLink() throws InterruptedException {
		apiViewCardDetails();
		needToWait(2);
		driver.switchTo().frame(driver.findElement(By.id("api_yearly_basic")));
		needToWait(2);
		cardValidateLink.click();
		validateLinkMessage.isDisplayed();
		needToWait(3);
	}

	public void apiValidateInvalidCouponCode() throws InterruptedException {
		apiViewCardDetails();
		needToWait(2);
		driver.switchTo().frame(driver.findElement(By.id("api_yearly_basic")));
		needToWait(2);
		cardCouponCode.sendKeys("123@");
		cardValidateLink.click();
		invalidCouponCodeMessage.isDisplayed();
		needToWait(3);
	}

	public void apiValidCouponCode() throws InterruptedException {
		apiViewCardDetails();
		needToWait(2);
		driver.switchTo().frame(driver.findElement(By.id("api_yearly_basic")));
		needToWait(2);
		cardCouponCode.sendKeys("validCouponCode");
		cardValidateLink.click();
		validCouponCodeMessage.isDisplayed();
		needToWait(3);
	}

	public void apiViewAllPlansLink() throws InterruptedException {
		apiViewCardDetails();
		needToWait(2);
		driver.switchTo().frame(driver.findElement(By.id("api_yearly_basic")));
		needToWait(2);
		cardViewAllPlansLink.click();
		driver.switchTo().defaultContent();
		needToWait(3);
	}

	public void apiSamePlanMessage() throws InterruptedException {
		needApiPricingBtn();
		needToWait(2);
		professionalPlanFreeTrialBtn.click();
		driver.switchTo().frame(driver.findElement(By.id("api_yearly_stand")));
		needToWait(2);
		samePlanMessage.isDisplayed();
		needToWait(3);
	}

	public void apiUpgradePlan() throws InterruptedException {
		needApiPricingBtn();
		needToWait(2);
		advanceApiPlan.click();
		driver.switchTo().frame(driver.findElement(By.id("api_yearly_adv")));
		needToWait(2);
		cardContinueBtn.click();
		needToWait(3);
	}

	public void apiDowngradePlan() throws InterruptedException {
		needApiPricingBtn();
		needToWait(2);
		professionalPlanFreeTrialBtn.click();
		driver.switchTo().frame(driver.findElement(By.id("api_yearly_stand")));
		needToWait(2);
		cardContinueBtn.click();
		needToWait(3);
	}

	public void apiEnterpriseTeamContactUs() throws InterruptedException {
		needApiPricingBtn();
		needToImplicitWait(2);
		apiEnterpriseContactUsBtn.click();
		needToImplicitWait(3);
	}

	public void accountPricing() throws InterruptedException {
		needApiPricingBtn();
		needToImplicitWait(2);
		needAccountPricingBtn.click();
		needToImplicitWait(3);
	}

	public void apiPricingUI() throws InterruptedException {
		apiPricingUrl();
		needToImplicitWait(3);
		monthlyTab.isDisplayed();
		yearlyTab.isDisplayed();
		freePlanLabel.isDisplayed();
		soloPlanLabel.isDisplayed();
		professionPlanLabel.isDisplayed();
		businessTeamLabel.isDisplayed();
		enterpriseLabel.isDisplayed();
		needAccountPricingBtn.isDisplayed();
		apiEnterpriseContactUsBtn.isDisplayed();
		needToWait(5);
		WebElement elm = driver.findElement(By.xpath("//h2[contains(text(),'Looking for more?')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elm);
		driver.findElement(By.xpath("//a[contains(text(),'eSignly Pricing.')]")).isDisplayed();
		driver.findElement(By.xpath("//a[contains(text(),'Features Page.')]")).isDisplayed();
		driver.findElement(By.xpath("//a[contains(text(),\"Let's talk\")]")).isDisplayed();

		needToWait(5);
		WebElement elm1 = driver.findElement(By.xpath("//h2[contains(text(),'Looking for more?')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elm1);
		driver.findElement(By.xpath("/html[1]/body[1]/section[5]/div[1]/div[1]/div[1]/div[1]/button[2]")).isDisplayed();
		driver.findElement(By.xpath("//button[contains(text(),\"Pricing FAQ's\")]")).isDisplayed();
		needToWait(5);
	}

}
