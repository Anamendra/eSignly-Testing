package com.esignlyNew.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BulkSigningPage extends DashboardPage {

	DashboardPage dash = new DashboardPage();

	@FindBy(xpath = "//div[@class='title-right']/a[@class='template-btn btn']")
	WebElement createBulkSigningBtn;

	@FindBy(xpath = "//div[@class='form-group custom-4']/select[@id='BulkSigningRequest_template_key']")
	WebElement selectTempDropdown;

	@FindBy(xpath = "//select[@class='chosen-select form-control']/option[@value='df725214549bdcf06fc3c650209cff6e']")
	WebElement tempFromDropdown;

	@FindBy(xpath = "//input[@id='BulkSigningRequest_title']")
	WebElement titleTextField;
	
	@FindBy(xpath = "//div[@class='form-group custom-8']/textarea[@id='BulkSigningRequest_description']")
	WebElement descriptionTextBox;

	public void bSigningUrl() throws InterruptedException {
		dash.clickBulkSigning();
		needToWait(4);
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://server-acc.esignly.com/bulkSignature/bulkSigningList");
		needToImplicitWait(2);
	}

	public void createBulkSigningButton() throws InterruptedException {
		dash.clickBulkSigning();
		needToWait(4);
		createBulkSigningBtn.click();
		needToImplicitWait(2);
	}

	public void selectTemplateFromDropdown() throws InterruptedException {
		createBulkSigningButton();
		selectTempDropdown.click();
		tempFromDropdown.click();
		needToImplicitWait(2);
		String selectedOption = new Select(driver.findElement(
				By.xpath("//div[@class='form-group custom-4']/select[@id='BulkSigningRequest_template_key']")))
						.getFirstSelectedOption().getText();

		Assert.assertEquals("testing by Anamendra", selectedOption);
		needToImplicitWait(2);
	}

	public void createTitleField() throws InterruptedException {
		createBulkSigningButton();
		titleTextField.sendKeys("Test1");
		needToImplicitWait(2);
		String Title = titleTextField.getText();
		//Assert.assertEquals(Title, "Test1");
		needToImplicitWait(2);
	}
	public void descTextBox() throws InterruptedException {
		createBulkSigningButton();
		descriptionTextBox.sendKeys("This is for testing purpose");
		needToImplicitWait(2);
		String Title = descriptionTextBox.getText();
		//Assert.assertEquals(Title, "Test1");
		needToImplicitWait(2);
	}
}
