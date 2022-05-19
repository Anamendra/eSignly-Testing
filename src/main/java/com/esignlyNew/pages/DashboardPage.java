package com.esignlyNew.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.esignly.common.ActionMethod;

public class DashboardPage extends LoginPage {

	LoginPage login = new LoginPage();

	// Page factory
	@FindBy(xpath = "//div[@class='title-row']")
	WebElement dashboardTitle;

	@FindBy(css = "#userToggle")
	WebElement verifyLogin;

//	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]")
//	WebElement clickProfiledropdown;

	@FindBy(linkText = "Start Signing")
	WebElement startSigning;

	@FindBy(xpath = "//body/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
	WebElement bulkSigning;

	@FindBy(xpath = "//body/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[3]/a[1]")
	WebElement inpersons;

	@FindBy(xpath = "//body/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[4]/a[1]")
	WebElement reuseTempalte;

	@FindBy(linkText = "My Documents")
	WebElement myDocument;

	@FindBy(partialLinkText = "Complet")
	WebElement complete;

	@FindBy(linkText = "Received")
	WebElement received;

	@FindBy(partialLinkText = "Sent")
	WebElement sent;

	@FindBy(partialLinkText = "Awaiti")
	WebElement awaiting;

	@FindBy(partialLinkText = "Schedul")
	WebElement schedule;

	@FindBy(xpath = "//body/div[1]/div[2]/ul[1]/li[4]/a[1]")
	WebElement myFolder;

	@FindBy(xpath = "//body/div[1]/div[2]/ul[1]/li[5]/a[1]")
	WebElement myTeam;

	@FindBy(xpath = "//body/div[1]/div[2]/ul[1]/li[6]/ul[1]/li[1]/a[1]")
	WebElement apiDashboard;

	@FindBy(linkText = "API Documents")
	WebElement apiDocument;

	@FindBy(linkText = "API Templates")
	WebElement apiTemplates;

	@FindBy(linkText = "API Settings")
	WebElement apiSettings;

	@FindBy(linkText = "API Website Widget")
	WebElement apiWebsiteWidget;

	@FindBy(linkText = "Help")
	WebElement help;

	@FindBy(xpath = "//a[contains(text(),'Upgrade Now')]")
	WebElement upgradeNow;

	@FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/div[1]/a[1]/*[1]")
	WebElement notificationBox;

	@FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[2]/ul[1]/li[2]/div[1]/a[1]/*[1]")
	WebElement messageBox;

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[3]/button[1]/span[1]")
	WebElement languageDropdown;

	@FindBy(xpath = "//div[@id='userToggle']")
	WebElement myprofileDropdown;

	@FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[3]/ul[1]/li[6]/a[1]")
	WebElement clicklogout;

	@FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[3]/ul[1]/li[1]/a[1]")
	WebElement clickMyprofile;

	@FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[3]/ul[1]/li[2]/a[1]")
	WebElement clickSettings;

	@FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[3]/ul[1]/li[3]/a[1]")
	WebElement clickTransaction;

	@FindBy(xpath = "//a[@id='add_sign']")
	WebElement clickAddsignature;

	@FindBy(xpath = "//a[@id='add_folder_modal']")
	WebElement clickMyFolder;

	@FindBy(xpath = "//body/div[1]/div[2]/ul[1]/li[1]/a[1]")
	WebElement sideMenu;

	// To check the verify dashboard title
	public boolean isDashboardTitlePresent() throws InterruptedException {
		login.validUserCredentials();
		return dashboardTitle.isDisplayed();

	}

	public void isUsernamePresentAfterLogin() throws InterruptedException {
		login.validUserCredentials();
		verifyLogin.isDisplayed();
		needToImplicitWait(2);
	}

	public void clickProfileDropdown() throws InterruptedException {
		verifyLogin.click();
		needToImplicitWait(2);

	}

	public void clickStartSigning() throws InterruptedException {
		login.validUserCredentials();
		needToWait(3);
		startSigning.click();
		needToWait(3);
	}

	public void clickBulkSigning() throws InterruptedException {
		login.validUserCredentials();
		needToWait(3);
		bulkSigning.click();
		needToWait(3);
	}

	public void inpersonSigning() throws InterruptedException {
		login.validUserCredentials();
		needToImplicitWait(2);
		inpersons.click();
	}

	public void reusableTemplate() throws InterruptedException {
		login.validUserCredentials();
		needToImplicitWait(2);
		reuseTempalte.click();
	}

	public void myDocument() throws InterruptedException {
		login.validUserCredentials();
		needToImplicitWait(2);
		myDocument.click();
	}

	public void compelete() throws InterruptedException {
		login.validUserCredentials();
		needToImplicitWait(2);
		complete.click();
	}

	public void received() throws InterruptedException {
		login.validUserCredentials();
		needToImplicitWait(2);
		received.click();
	}

	public void sent() throws InterruptedException {
		login.validUserCredentials();
		needToImplicitWait(2);
		sent.click();
	}

	public void awaiting() throws InterruptedException {
		login.validUserCredentials();
		needToImplicitWait(2);
		awaiting.click();
	}

	public void schedule() throws InterruptedException {
		login.validUserCredentials();
		needToImplicitWait(2);
		schedule.click();
	}

	public void myFolder() throws InterruptedException {
		
		myFolder.click();
		needToImplicitWait(3);

	}

	public void myTeam() throws InterruptedException {
		login.validUserCredentials();
		needToImplicitWait(2);
		WebElement elm = driver.findElement(By.xpath("//body/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[5]/a[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elm);
		myTeam.click();
	}

	public void apiDashboard() throws InterruptedException {
		login.validUserCredentials();
		needToImplicitWait(2);
		WebElement elm = driver.findElement(By.xpath("//body/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[2]/a[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elm);
		apiDashboard.click();
	}

	public void apiDocument() throws InterruptedException {
		login.validUserCredentials();
		needToImplicitWait(2);
		WebElement elm = driver.findElement(By.xpath("//body/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[5]/a[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elm);
		apiDocument.click();
	}

	public void apiTemplates() throws InterruptedException {
		login.validUserCredentials();
		needToImplicitWait(2);
		WebElement elm = driver.findElement(By.xpath("//body/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[5]/a[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elm);
		apiTemplates.click();
	}

	public void apiSettings() throws InterruptedException {
		login.validUserCredentials();
		needToImplicitWait(2);
		WebElement elm = driver.findElement(By.xpath("//body/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[5]/a[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elm);
		apiSettings.click();
	}

	public void apiWebsiteWidget() throws InterruptedException {
		login.validUserCredentials();
		needToImplicitWait(2);
		WebElement elm = driver.findElement(By.xpath("//body/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[5]/a[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elm);
		apiWebsiteWidget.click();
	}

	public void help() throws InterruptedException {
		login.validUserCredentials();
		needToImplicitWait(2);
		WebElement elm = driver.findElement(By.xpath("//body/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[5]/a[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elm);
		help.click();
	}

	public void upgradeNow() throws InterruptedException {
		login.validUserCredentials();
		needToImplicitWait(2);
		upgradeNow.click();
	}

	public void notificationBox() throws InterruptedException {
		login.validUserCredentials();
		needToImplicitWait(3);
		notificationBox.click();
	}

	public void messageBox() throws InterruptedException {
		login.validUserCredentials();
		needToImplicitWait(2);
		messageBox.click();
	}

	public void clickOnMyprofileDropdown() throws InterruptedException {
		login.validUserCredentials();
		myprofileDropdown.click();
		needToWait(3);

	}

	public void clickLogout() throws InterruptedException {
		login.validUserCredentials();
		needToWait(3);
		clicklogout.click();
		needToWait(3);

	}

	public void clickMyProfile() throws InterruptedException {
		clickOnMyprofileDropdown();
		clickMyprofile.click();
		needToWait(3);
	}

	public void clickSetting() throws InterruptedException {
		clickOnMyprofileDropdown();
		needToWait(3);
		clickSettings.click();

	}

	public void clickTransaction() throws InterruptedException {
		clickOnMyprofileDropdown();
		needToWait(3);
		clickTransaction.click();

	}

	public void clickAddSignature() throws InterruptedException {
		clickOnMyprofileDropdown();
		needToWait(3);
		clickAddsignature.click();
		needToWait(3);

	}

	public void clickMyFolder() throws InterruptedException {
		clickOnMyprofileDropdown();
		needToWait(3);
		clickMyFolder.click();
		needToWait(3);

	}

	public void clickSideMenu() throws InterruptedException {
		login.validUserCredentials();
		needToWait(3);
		sideMenu.click();
		needToWait(3);
	}
//	
//			public void languageDropdown() throws InterruptedException {
//				needToImplicitWait(2);
//				languageDropdown.click();
//			}

}
