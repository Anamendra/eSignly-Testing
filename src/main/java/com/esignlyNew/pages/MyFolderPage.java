package com.esignlyNew.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MyFolderPage extends DashboardPage {

	DashboardPage dash = new DashboardPage();

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/h1[1]")
	WebElement folderText;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
	WebElement createFolderBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/h4[1]")
	WebElement createFolderHeading;

	@FindBy(id = "folder_name")
	WebElement createFolderName;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/form[1]/button[1]")
	WebElement createBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/button[1]")
	WebElement createFolderCloseBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/a[1]")
	WebElement editFolderNameBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/a[2]")
	WebElement deleteFolderBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/form[1]/div[1]/label[1]")
	WebElement createfolderNameLabel;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/form[1]/div[1]/input[4]")
	WebElement enterFolderNameTextField;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/form[1]/button[1]")
	WebElement editFolderRenameBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/form[1]/div[1]/input[4]")
	WebElement editFolderTextField;

	@FindBy(xpath = "//body/div[@id='push_message']/div[1]/button[1]")
	WebElement editFolderCloseBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/h4[1]")
	WebElement deleteFolderHeading;

	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[2]/div[1]")
	WebElement deleteFolderConfirmMssg;

	@FindBy(xpath = "//input[@id='confirmYes']")
	WebElement deleteFolderOkBtn;

	@FindBy(xpath = "//body/div[5]/div[1]/div[3]/input[1]")
	WebElement deleteFolderCancelBtn;

	@FindBy(xpath = "//body/div[5]/div[1]/button[1]")
	WebElement deleteFolderCloseBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[1]/a[1]")
	WebElement documentIcon;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/th[1]")
	WebElement documentLabel;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/th[2]")
	WebElement folderNameLabel;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/th[3]")
	WebElement actionLabel;

	public void mfurl() throws InterruptedException {
		dash.myFolder();
		needToImplicitWait(4);
		String url = driver.getCurrentUrl();

		Assert.assertEquals(url, "https://server-acc.esignly.com/userFolder/userFolderList");
		needToImplicitWait(2);
	}

	// This method is to get Text of the My Folder Page
	public void myFolderText() throws InterruptedException {
		dash.myFolder();
		needToImplicitWait(3);
		Assert.assertEquals(folderText.getText(), "Folder");
		needToImplicitWait(3);
	}

	// This method is to create a new folder
	public void createFolder() throws InterruptedException {
		dash.myFolder();
		createFolderBtn.click();
		needToImplicitWait(3);
	}

	// This method is to verify Create Folder Heading
	public void createFolderHeading() throws InterruptedException {
		createFolder();
		createFolderHeading.click();
		needToImplicitWait(3);
	}

	// This method is to verify Create Folder
	public void createOneFolder() throws InterruptedException {
		createFolder();
		needToImplicitWait(3);
		createFolderName.sendKeys("TestFolder");
		createBtn.click();
		needToImplicitWait(3);
	}

	// This method is to create a new folder
	public void createFolderCloseButton() throws InterruptedException {
		createFolder();
		createFolderCloseBtn.click();
		needToImplicitWait(3);
	}

	// This method is to click on edit folder name
	public void editFolderNameBtn() throws InterruptedException {
		dash.myFolder();
		needToImplicitWait(2);
		editFolderNameBtn.click();
	}

	// This method is to delete a folder
	public void deleteFolder() throws InterruptedException {
		dash.myFolder();
		needToImplicitWait(3);
		deleteFolderBtn.click();
		needToImplicitWait(3);
	}

	// This method is to verify the Create Folder UI
	public void createFolderUI() throws InterruptedException {
		createFolder();
		needToImplicitWait(3);
		createFolderHeading.isDisplayed();
		folderNameLabel.isDisplayed();
		enterFolderNameTextField.isDisplayed();
		createFolderCloseBtn.isDisplayed();
		createBtn.isDisplayed();
		needToImplicitWait(2);
	}

	// This method is to edit the Folder Name
	public void editFoldrName() throws InterruptedException {
		editFolderNameBtn();
		needToImplicitWait(2);
		editFolderTextField.clear();
		editFolderTextField.sendKeys("TestingNew");
		editFolderRenameBtn.click();
		needToImplicitWait(3);
	}

	// This method is to check the presence of Rename Button in Edit Folder Card
	public void renameBtnExist() throws InterruptedException {
		editFolderNameBtn();
		needToImplicitWait(2);
		editFolderRenameBtn.isDisplayed();
	}

	// This method is to check Close Button in Edit Folder Card
	public void editFolderClsBtn() throws InterruptedException {
		editFolderNameBtn();
		needToImplicitWait(2);
		editFolderCloseBtn.click();
	}

	// This method is to check Delete Button in Heading
	public boolean deleteBtnHeading() throws InterruptedException {
		deleteFolder();
		deleteFolderHeading.click();
		needToImplicitWait(2);
		return true;
	}

	// This method is to check Delete Button confirmation message on delete folder
	public void deleteBtnConfirmationMssg() throws InterruptedException {
		deleteFolder();
		String confirmationMessage = deleteFolderConfirmMssg.getText();
		Assert.assertEquals(confirmationMessage, "Are you sure want to Delete ?");
		needToImplicitWait(3);
	}

	// This method is to check Delete Button Card UI
	public void deleteBtnCardUI() throws InterruptedException {
		deleteFolder();
		deleteFolderHeading.isDisplayed();
		String confirmationMessage = deleteFolderConfirmMssg.getText();
		Assert.assertEquals(confirmationMessage, "Are you sure want to Delete ?");
		deleteFolderCloseBtn.isDisplayed();
		deleteFolderCancelBtn.isDisplayed();
		deleteFolderOkBtn.isDisplayed();
		needToImplicitWait(3);
	}

	// This method is to check Delete Button close button
	public void deleteBtnClsBtn() throws InterruptedException {
		deleteFolder();
		deleteFolderCloseBtn.click();
		needToImplicitWait(3);
	}

	// This method is to check Delete Button cancel button
	public void deleteBtnCnclBtn() throws InterruptedException {
		deleteFolder();
		deleteFolderCancelBtn.click();
		needToImplicitWait(3);
	}

	// This method is to check Delete Button cancel button
	public void deleteBtnOKBtn() throws InterruptedException {
		deleteFolder();
		deleteFolderOkBtn.click();
		needToImplicitWait(3);
	}

	// This method is to check Folder Existance
	public void folderExistance() throws InterruptedException {
		dash.myFolder();
		needToImplicitWait(3);
		documentIcon.click();
		needToImplicitWait(3);
	}

	// This method is to check My Folder UI
	public void myFolderUI() throws InterruptedException {
		dash.myFolder();
		needToImplicitWait(3);
		folderText.isDisplayed();
		createFolderBtn.isDisplayed();
		documentIcon.isDisplayed();
		documentLabel.isDisplayed();
		folderNameLabel.isDisplayed();
		actionLabel.isDisplayed();
		editFolderNameBtn.isDisplayed();
		deleteFolderBtn.isDisplayed();
		needToImplicitWait(3);
	}
}
