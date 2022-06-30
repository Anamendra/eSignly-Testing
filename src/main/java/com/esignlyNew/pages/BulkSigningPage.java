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

	@FindBy(xpath = "//li[@class='hover-active hover-relative']/input[@value='individual']")
	WebElement addRecipientEmailRdoBtn;

	@FindBy(xpath = "//li[@class='hover-active hover-relative']/input[@value='upload_csv']")
	WebElement uploadCsvRdoBtn;

	@FindBy(xpath = "//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/ul[1]/li[1]/a[1]")
	WebElement addRecipientEmailToolTip;

	@FindBy(xpath = "//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/ul[1]/li[2]/a[1]/*[1]")
	WebElement uploadCsvToolTip;

	@FindBy(xpath = "//div[@class='form-group csv_upload custom-8']/label[@class='btn action-btn btn_csv_upload']")
	WebElement uploadCsvBtn;

	@FindBy(xpath = "//div[@class='form-group csv_upload custom-8']/a[@class='btn action-btn']")
	WebElement downloadSampleCsvBtn;

	@FindBy(xpath = "//div[@class='form-group recip_email custom-8']/textarea[@id='BulkSigningRequest_recip_email']")
	WebElement emailAddressTextArea;

	@FindBy(xpath = "//div[@class='form-group custom-12']/input[@value='Process']")
	WebElement processBtn;

	@FindBy(xpath = "//div[@id='security_div']")
	WebElement securityWithDoc;

	@FindBy(xpath = "//div[@class='row-fluid']/h3/a[@title='edit template']")
	WebElement securityWithDocEditBtn;

	@FindBy(xpath = "//div[@class='template-table-box']/table/tbody/tr[2]/td[4]/a[1]")
	WebElement signStatusBtn;

	@FindBy(xpath = "//div[@class='title-right team-button ']/a[@class='template-btn btn']")
	WebElement signStatusBackBtn;

	@FindBy(xpath = "//h1[@class='page-title']")
	WebElement signStatusPageTitle;

	@FindBy(xpath = "//tbody/tr/th[1]")
	WebElement signStatusEmailLabel;

	@FindBy(xpath = "//tbody/tr/th[2]")
	WebElement signStatusViewDateLabel;

	@FindBy(xpath = "//tbody/tr/th[3]")
	WebElement signStatusSignDateLabel;

	@FindBy(xpath = "//tbody/tr/th[4]")
	WebElement signStatusStatusLabel;

	@FindBy(xpath = "//tbody/tr/th[5]")
	WebElement signStatusActionLabel;

	@FindBy(xpath = "//a[@class='action-btn btn del_recep']")
	WebElement deleteCreatedBSDoc;

	@FindBy(xpath = "//body/div[5]/div[1]/div[1]")
	WebElement deleteCardTitle;

	@FindBy(xpath = "//div[@id='confirmMessage']")
	WebElement deleteCardConfirmMssg;

	@FindBy(xpath = "//input[@id='confirmYes']")
	WebElement deleteCardOkBtn;

	@FindBy(xpath = "//input[@class='confirmNo btn action-btn']")
	WebElement deleteCardCancelBtn;

	@FindBy(xpath = "//button[@class='confirmNo button-close']")
	WebElement deleteCardCloseBtn;

	@FindBy(xpath = "//div[@class='title-row']/h1[@class='page-title']")
	WebElement bulkSigningTitle;

	@FindBy(xpath = "//tbody/tr/th[1]")
	WebElement bulkSigningDocumentLabel;

	@FindBy(xpath = "//tbody/tr/th[2]")
	WebElement bulkSigningTitleLabel;

	@FindBy(xpath = "//tbody/tr/th[3]")
	WebElement bulkSigningDescriptionLabel;

	@FindBy(xpath = "//tbody/tr/th[4]")
	WebElement bulkSigningActionLabel;

	@FindBy(xpath = "//div[@class='Document-image doc-image doc-image_list_view']/div/a[@class='btnpreview list-image-zoom list-image-zoom-custom']")
	WebElement bulkSigningDocumentIcon;

	@FindBy(xpath = "//button[@class='w3-button w3-black w3-display-right  preview-arrow-next']")
	WebElement documentIconNextBtn;

	@FindBy(xpath = "//button[@class=' w3-button w3-black w3-display-left preview-arrow-prev']")
	WebElement documentIconPreviousBtn;

	@FindBy(xpath = "//button[@class='sliderClose button-close ']")
	WebElement documentIconCloseBtn;

	@FindBy(xpath = "//div[@class='status-box']/div/h3")
	WebElement noBulkSigningLabel;
	
	@FindBy(xpath = "//div[@class='modal-footer']/a")
	WebElement okForLastConfirmation;

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
		// Assert.assertEquals(Title, "Test1");
		needToImplicitWait(2);
	}

	public void descTextBox() throws InterruptedException {
		createBulkSigningButton();
		descriptionTextBox.sendKeys("This is for testing purpose");
		needToImplicitWait(2);
		String Title = descriptionTextBox.getText();
		// Assert.assertEquals(Title, "Test1");
		needToImplicitWait(2);
	}

	public void addRecipientEmailRadioBtnIsChecked() throws InterruptedException {
		createBulkSigningButton();
		needToImplicitWait(2);
		addRecipientEmailRdoBtn.isSelected();
		needToImplicitWait(2);
	}

	public void addRecipientEmailToolTip() throws InterruptedException {
		createBulkSigningButton();
		needToImplicitWait(2);
		addRecipientEmailToolTip.click();
		needToImplicitWait(2);
	}

	public void uploadCsvRadioBtnIsExist() throws InterruptedException {
		createBulkSigningButton();
		needToImplicitWait(2);
		uploadCsvRdoBtn.click();
		needToImplicitWait(2);
		uploadCsvBtn.isDisplayed();
		downloadSampleCsvBtn.isDisplayed();
		needToImplicitWait(2);
	}

	public void uploadCsvToolTip() throws InterruptedException {
		createBulkSigningButton();
		needToImplicitWait(2);
		uploadCsvToolTip.click();
		needToImplicitWait(2);
	}

	public void processBtn() throws InterruptedException {
		createBulkSigningButton();
		needToImplicitWait(2);
		selectTempDropdown.click();
		tempFromDropdown.click();
		needToImplicitWait(2);
		titleTextField.sendKeys("Test1");
		descriptionTextBox.sendKeys("This is for testing purpose");
		needToImplicitWait(2);
		addRecipientEmailRdoBtn.isSelected();
		emailAddressTextArea.sendKeys("esignly014@mailinator.com");
		needToImplicitWait(2);
		processBtn.click();
		needToWait(5);
		deleteCreatedBSDoc.click();
		needToImplicitWait(3);
		deleteCardOkBtn.click();
		needToWait(5);
	}

	public void securityWithDocumentIsExist() throws InterruptedException {
		createBulkSigningButton();
		needToImplicitWait(2);
		selectTempDropdown.click();
		tempFromDropdown.click();
		needToImplicitWait(2);
		securityWithDoc.isDisplayed();
		needToImplicitWait(2);
	}

	public void securityWithDocumentEditBtn() throws InterruptedException {
		createBulkSigningButton();
		needToImplicitWait(2);
		selectTempDropdown.click();
		tempFromDropdown.click();
		needToWait(3);
		securityWithDocEditBtn.click();
		needToImplicitWait(5);
	}

	public void downloadSamepleCsvBtn() throws InterruptedException {
		createBulkSigningButton();
		needToImplicitWait(2);
		selectTempDropdown.click();
		tempFromDropdown.click();
		needToImplicitWait(2);
		uploadCsvRdoBtn.click();
		needToWait(2);
		downloadSampleCsvBtn.click();
		needToImplicitWait(4);
	}

	public void uploadCsvBtnProcessBtn() throws InterruptedException {
		createBulkSigningButton();
		needToImplicitWait(2);
		selectTempDropdown.click();
		tempFromDropdown.click();
		needToImplicitWait(2);
		titleTextField.sendKeys("Test2");
		descriptionTextBox.sendKeys("This is for testing purpose");
		needToWait(2);
		uploadCsvRdoBtn.click();
		needToWait(3);
		WebElement upload_file = driver.findElement(By.xpath("//input[@name='csv_file']"));
		needToWait(3);
		upload_file.sendKeys("C:\\Users\\anamendra.y(2420)\\Documents\\sample.csv");
		needToWait(3);
		processBtn.click();
		needToWait(5);
	}

	public void signStatusBtn() throws InterruptedException {
		bSigningUrl();
		needToImplicitWait(2);
		signStatusBtn.click();
		needToImplicitWait(2);
	}

	public void signStatusBtnBackBtn() throws InterruptedException {
		signStatusBtn();
		needToWait(4);
		signStatusBackBtn.click();
		needToImplicitWait(3);
	}

	public void signStatusBtnUI() throws InterruptedException {
		signStatusBtn();
		needToWait(4);
		signStatusPageTitle.isDisplayed();
		signStatusBackBtn.isDisplayed();
		signStatusEmailLabel.isDisplayed();
		signStatusViewDateLabel.isDisplayed();
		signStatusSignDateLabel.isDisplayed();
		signStatusStatusLabel.isDisplayed();
		signStatusActionLabel.isDisplayed();
		needToImplicitWait(3);
	}

	public void deleteCreatedBulkSigningDoc() throws InterruptedException {
		bSigningUrl();
		needToImplicitWait(2);
		deleteCreatedBSDoc.click();
		needToWait(3);
	}

	public void deleteCardUI() throws InterruptedException {
		deleteCreatedBulkSigningDoc();
		deleteCardTitle.isDisplayed();
		deleteCardConfirmMssg.isDisplayed();
		deleteCardCloseBtn.isDisplayed();
		deleteCardCancelBtn.isDisplayed();
		deleteCardOkBtn.isDisplayed();
		needToWait(2);
	}

	public void deleteCardCancleBtn() throws InterruptedException {
		deleteCreatedBulkSigningDoc();
		deleteCardCancelBtn.click();
		needToWait(2);
	}

	public void deleteCardCloseBtn() throws InterruptedException {
		deleteCreatedBulkSigningDoc();
		deleteCardCloseBtn.click();
		needToWait(2);
	}

	public void deleteCardOkBtn() throws InterruptedException {
		deleteCreatedBulkSigningDoc();
		deleteCardOkBtn.click();
		needToWait(2);
//		okForLastConfirmation.click();
//		needToWait(4);
	}

	public void bulkSigningUIAfterAnyDoc() throws InterruptedException {
		dash.clickBulkSigning();
		needToWait(4);
		bulkSigningTitle.isDisplayed();
		createBulkSigningBtn.isDisplayed();
		bulkSigningDocumentLabel.isDisplayed();
		bulkSigningTitle.isDisplayed();
		bulkSigningDescriptionLabel.isDisplayed();
		bulkSigningActionLabel.isDisplayed();
		signStatusBtn.isDisplayed();
		deleteCreatedBSDoc.isDisplayed();
		bulkSigningDocumentIcon.isDisplayed();
	}

	public void docIsVisibleViaIcon() throws InterruptedException {
		dash.clickBulkSigning();
		needToWait(4);
		bulkSigningDocumentIcon.click();
		needToWait(5);
	}

	public void docIconNextBtn() throws InterruptedException {
		docIsVisibleViaIcon();
		needToWait(4);
		documentIconNextBtn.click();
		needToWait(5);
	}

	public void docIconPreviousBtn() throws InterruptedException {
		docIconNextBtn();
		needToWait(4);
		documentIconPreviousBtn.click();
		needToWait(5);
	}

	public void docIconCloseBtn() throws InterruptedException {
		docIsVisibleViaIcon();
		needToWait(4);
		documentIconCloseBtn.click();
		needToWait(5);
	}

	public void bulkSigningNoDocumentExist() throws InterruptedException {
		dash.clickBulkSigning();
		needToWait(8);
		noBulkSigningLabel.isDisplayed();
		needToWait(5);
	}
}
