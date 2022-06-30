package com.esignlyNew.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class UserProfilePage extends DashboardPage {
	DashboardPage dash = new DashboardPage();
	PricingPage price = new PricingPage();

	// Page factory
	@FindBy(css = "div#userToggle")
	WebElement myProfileIcon;

	@FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[3]/ul[1]/li[1]/a[1]")
	WebElement myprofile;

	@FindBy(css = "ul.nav.nav-tabs li:nth-child(num)")
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

	@FindBy(id = "auto_set_timezone")
	private WebElement autoSetTimezone;

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

	@FindBy(id = "ajaxSaveUser_88534605811")
	private WebElement address;

	@FindBy(xpath = "//div[@class='cust_alert text-muted cust_alert_error']")
	private WebElement addressErrorMsg;

	@FindBy(xpath = "//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]")
	private WebElement cardErrorMsg;

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

	@FindBy(xpath = "//ul[@class='nav nav-tabs']/li[2]")
	private WebElement changePassTab;

	@FindBy(xpath = "//ul[@class='nav nav-tabs']/li[3]")
	private WebElement importContactsTab;

	@FindBy(xpath = "//input[@class='span12 form-control'][@id='nespassword']")
	private WebElement newPasswordTextField;

	@FindBy(xpath = "//div[@class='field-col']/button[@id='change_pwd_btn']")
	private WebElement saveBtn;

	@FindBy(xpath = "//div[@class='field-col']/input[@id='cnewpassword']")
	private WebElement confirmPasswordTextField;

	@FindBy(xpath = "//div[@class=' span7 cnts-link']/a[@class='import_contact_link link']")
	private WebElement importMore;

	@FindBy(xpath = "//h4[contains(text(),'Import your contacts')]")
	private WebElement importMoreCardHeading;

	@FindBy(xpath = "//a[@id='downloadbt_csv']")
	private WebElement downloadSampleCsvFileBtn;

	@FindBy(xpath = "//div[@class='btn btn-lar btn-primary btn_csv_upload']")
	private WebElement uploadCsvFileBtn;

	@FindBy(xpath = "//a[contains(text(),'Clear all')]")
	private WebElement clearAllContactsBtn;

	@FindBy(xpath = "//div[@id='confirmMessage']")
	private WebElement confirmMessageClearAllBtn;

	@FindBy(xpath = "//body/div[5]/div[1]/button[1]")
	private WebElement closeBtnClearAllBtn;

	@FindBy(xpath = "//body/div[5]/div[1]/div[3]/input[1]")
	private WebElement cancleBtnClearAllBtn;

	@FindBy(xpath = "//input[@id='confirmYes']")
	private WebElement okBtnClearAllBtn;

	@FindBy(xpath = "//label[contains(text(),'Address Book')]")
	private WebElement addressBook;

	@FindBy(xpath = "//div[@class=' span7 cnts-link']/a[@class='open_contact_list']")
	private WebElement youHaveContacts;

	@FindBy(xpath = "//div[@class='contact']/label[@for='contact_36105025e8cc8c500b4fb5782c0308aa']")
	private WebElement userEmailCheckBox;

	@FindBy(xpath = "//input[@id='tellYourFriends']")
	private WebElement tellYourFriendsBtn;

	@FindBy(xpath = "//a[@id='closeWindow']")
	private WebElement continueBtnTellYourFriendsBtn;

	@FindBy(xpath = "//ul[@class='nav nav-tabs']/li[4]")
	private WebElement planTab;

	@FindBy(xpath = "//div[@class='tab4']/div/span[1]")
	private WebElement signingAndTemplateRequestsWithCounts;

	@FindBy(xpath = "//button[@class='btndowngrade btn action-btn']")
	private WebElement downgradeBtnPlanTab;

	@FindBy(xpath = "//input[@class='confirmNo btn action-btn']")
	private WebElement cancelBtnDowngradeBtnPlanTab;

	@FindBy(xpath = "//input[@class='btn action-btn']")
	private WebElement okBtnDowngradeBtnPlanTab;

	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[3]/table[1]/tbody[1]/tr[1]/th[1]")
	private WebElement planFeatureNameLabel;

	@FindBy(xpath = "//th[contains(text(),'Quota left')]")
	private WebElement quotaLeftLabel;

	@FindBy(xpath = "//th[contains(text(),'Documents:')]")
	private WebElement documentsLabel;

	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[3]/table[1]/tbody[1]/tr[2]/td[1]")
	private WebElement countOfDocumentAssigned;

	@FindBy(xpath = "//th[contains(text(),'Signing request:')]")
	private WebElement signingRequestLabel;

	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[3]/table[1]/tbody[1]/tr[3]/td[1]")
	private WebElement countOfSigningRequestAssigned;

	@FindBy(xpath = "//th[contains(text(),'Template:')]")
	private WebElement templatesLabel;

	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[3]/table[1]/tbody[1]/tr[4]/td[1]")
	private WebElement countOfTemplatesAssigned;

	@FindBy(xpath = "//th[contains(text(),'Audit Trail:')]")
	private WebElement auditTrialLabel;

	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[3]/table[1]/tbody[1]/tr[5]/td[1]")
	private WebElement auditTrialIsAllowed;

	@FindBy(xpath = "//th[contains(text(),'Status notifications:')]")
	private WebElement statusNotificationLabel;

	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[3]/table[1]/tbody[1]/tr[6]/td[1]")
	private WebElement statusNotificationIsAllowed;

	@FindBy(xpath = "//th[contains(text(),'Cloud:')]")
	private WebElement cloudLabel;

	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[3]/table[1]/tbody[1]/tr[7]/td[1]")
	private WebElement cloudIsAllowed;

	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[3]/table[1]/tbody[1]/tr[8]/th[1]")
	private WebElement addMoreRecipientLabel;

	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[3]/table[1]/tbody[1]/tr[8]/td[1]")
	private WebElement addMoreRecipientCount;

	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[3]/table[1]/tbody[1]/tr[9]/th[1]")
	private WebElement sendDocsLabel;

	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[3]/table[1]/tbody[1]/tr[9]/th[1]")
	private WebElement sendDocsCount;

	@FindBy(xpath = "//th[contains(text(),'Real time email signing notification:')]")
	private WebElement realTimeEmailSignNotificationLabel;

	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[3]/table[1]/tbody[1]/tr[10]/td[1]")
	private WebElement realTimeEmailSignNotificationCount;

	@FindBy(xpath = "//b[contains(text(),'Template signing consume:')]")
	private WebElement apiTemplatesSigningConsumes;

	@FindBy(xpath = "//button[@class='btndowngradeApi btn action-btn btn-xs']")
	private WebElement apiDowngradeBtn;

	@FindBy(xpath = "//input[@class='confirmNo btn action-btn']")
	private WebElement cancleBtnDowngradeBtnApiPlanDetails;

	@FindBy(xpath = "//input[@class='btn action-btn']")
	private WebElement okBtnDowngradeBtnApiPlanDetails;

	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[5]/table[1]/tbody[1]/tr[1]/th[1]")
	private WebElement featureNameApiPlanDetailsLabel;
	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[5]/table[1]/tbody[1]/tr[1]/th[2]")
	private WebElement quotaApiPlanLabel;
	@FindBy(xpath = "//th[contains(text(),'Template Signing')]")
	private WebElement templateSigningApiPlanLabel;
	@FindBy(xpath = "//td[contains(text(),'100 / month')]")
	private WebElement countOfTemplateSigningAssigned;
	@FindBy(xpath = "//th[contains(text(),'API Sign Status')]")
	private WebElement apiSignStatusLabel;
	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[5]/table[1]/tbody[1]/tr[3]/td[1]")
	private WebElement countOfApiSignStatus;
	@FindBy(xpath = "//th[contains(text(),'Get Template Data')]")
	private WebElement getTemplateDataLabel;
	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[5]/table[1]/tbody[1]/tr[4]/td[1]")
	private WebElement countOfGetTemplateData;
	@FindBy(xpath = "//th[contains(text(),'API Document signing')]")
	private WebElement apiDocumentSigningLabel;
	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[5]/table[1]/tbody[1]/tr[5]/td[1]")
	private WebElement countOfApiDocumentSigning;
	@FindBy(xpath = "//th[contains(text(),'Cancel signing request')]")
	private WebElement cancelSigningRequestLabel;
	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[5]/table[1]/tbody[1]/tr[6]/td[1]")
	private WebElement countOfCancelSigningRequest;
	@FindBy(xpath = "//th[contains(text(),'Api delete recipient request')]")
	private WebElement apiDeleteRecipientRequestLabel;
	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[5]/table[1]/tbody[1]/tr[7]/td[1]")
	private WebElement countOfApiDeleteRecipientRequest;
	@FindBy(xpath = "//th[contains(text(),'Delete signing request')]")
	private WebElement deleteSigningRequestLabel;
	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[5]/table[1]/tbody[1]/tr[8]/td[1]")
	private WebElement countOfDeleteSigningRequest;
	@FindBy(xpath = "//th[contains(text(),'Edit recipient email id')]")
	private WebElement editRecipientEmailIdLabel;
	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[5]/table[1]/tbody[1]/tr[9]/td[1]")
	private WebElement countOfEditRecipientEmailId;
	@FindBy(xpath = "//th[contains(text(),'Get user account balance')]")
	private WebElement getUserAccBalLabel;
	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[5]/table[1]/tbody[1]/tr[10]/td[1]")
	private WebElement countOfGetUserAccBal;
	@FindBy(xpath = "//th[contains(text(),'Download api doc')]")
	private WebElement downloadApiDocLabel;
	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[5]/table[1]/tbody[1]/tr[11]/td[1]")
	private WebElement countOfDownloadApiDoc;
	@FindBy(xpath = "//th[contains(text(),'Auto attach signature')]")
	private WebElement autoAttachSignatureLabel;
	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[5]/table[1]/tbody[1]/tr[12]/td[1]")
	private WebElement countOfAutoAttachSignature;
	@FindBy(xpath = "//th[contains(text(),'List signature request')]")
	private WebElement listSignatureRequestLabel;
	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[5]/table[1]/tbody[1]/tr[13]/td[1]")
	private WebElement countOfListSignatureRequest;
	@FindBy(xpath = "//th[contains(text(),'List template')]")
	private WebElement listTemplatesLabel;
	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[5]/table[1]/tbody[1]/tr[14]/td[1]")
	private WebElement countOfListTemplates;
	@FindBy(xpath = "//th[contains(text(),'Api send reminder request')]")
	private WebElement apiSendReminderRequestLabel;
	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[5]/table[1]/tbody[1]/tr[15]/td[1]")
	private WebElement countOfApiSendReminderRequest;
	@FindBy(xpath = "//th[contains(text(),'Api for user account')]")
	private WebElement apiForUserAccLabel;
	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[5]/table[1]/tbody[1]/tr[16]/td[1]")
	private WebElement countOfApiForUserAcc;
	@FindBy(xpath = "//th[contains(text(),'Api for delete template')]")
	private WebElement apiForDeleteTemplate;
	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[5]/table[1]/tbody[1]/tr[17]/td[1]")
	private WebElement countOfApiForDeleteTemplate;
	@FindBy(xpath = "//tbody/tr[18]/th[1]")
	private WebElement cloudIntegrationLabel;
	@FindBy(xpath = "//tbody/tr[18]/td[1]")
	private WebElement cloudIntegrationIsAllowed;
	@FindBy(xpath = "//tbody/tr[19]/th[1]")
	private WebElement securityLabel;
	@FindBy(xpath = "//tbody/tr[19]/th[1]")
	private WebElement securityIsAllowed;
	@FindBy(xpath = "//tbody/tr[20]/th[1]")
	private WebElement chainingLabel;
	@FindBy(xpath = "//tbody/tr[20]/td[1]")
	private WebElement chainingIsAllowed;
	@FindBy(xpath = "//tbody/tr[21]/th[1]")
	private WebElement apiCommonFeaturesLabel;
	@FindBy(xpath = "//tbody/tr[21]/td[1]")
	private WebElement apiCommonFeaturesIsAllowed;
	@FindBy(xpath = "//tbody/tr[22]/th[1]")
	private WebElement apiSecurityLabel;
	@FindBy(xpath = "//tbody/tr[22]/td[1]")
	private WebElement apiSecurityIsAllowed;
	@FindBy(xpath = "//tbody/tr[23]/th[1]")
	private WebElement apiBrandingLabel;
	@FindBy(xpath = "//tbody/tr[23]/td[1]")
	private WebElement apiBrandingIsAllowed;
	@FindBy(xpath = "//tbody/tr[24]/th[1]")
	private WebElement apiCloudIntegrationLabel;
	@FindBy(xpath = "//tbody/tr[24]/td[1]")
	private WebElement apiCloudIntegrationIsAllowed;
	@FindBy(xpath = "//tbody/tr[25]/th[1]")
	private WebElement apiInpersonSigningLabel;
	@FindBy(xpath = "//tbody/tr[25]/td[1]")
	private WebElement apiInpersonSigningIsAllowed;
	@FindBy(xpath = "//tbody/tr[26]/th[1]")
	private WebElement placeDynamicFieldsApiLabel;
	@FindBy(xpath = "//tbody/tr[26]/td[1]")
	private WebElement placeDynamicFieldApiIsAllowed;
	@FindBy(xpath = "//tbody/tr[27]/th[1]")
	private WebElement realTimeEmailNotificationApiLabel;
	@FindBy(xpath = "//tbody/tr[27]/td[1]")
	private WebElement realTimeEmailNotificationApiIsAllowed;
	@FindBy(xpath = "//tbody/tr[28]/th[1]")
	private WebElement allowAttachmentApiLabel;
	@FindBy(xpath = "//tbody/tr[28]/td[1]")
	private WebElement allowAttachmentApiIsAllowed;
	@FindBy(xpath = "//tbody/tr[29]/th[1]")
	private WebElement createTemplatesApiLabel;
	@FindBy(xpath = "//tbody/tr[29]/td[1]")
	private WebElement countOfCreateTemplatesApi;

	@FindBy(xpath = "//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[3]/div[1]/table[1]")
	private WebElement planDetails;

	@FindBy(xpath = "//div[contains(text(),'Feature details.')]")
	private WebElement featureDetails;

	@FindBy(xpath = "//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[1]")
	private WebElement myCurrentApiDetails;

	@FindBy(xpath = "//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[1]")
	private WebElement apiFeatureDetails;

	@FindBy(xpath = "//label[contains(text(),'Team Licenses')]")
	private WebElement teamLicensesTab;

	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[1]/button[1]")
	private WebElement dropLicenseBtn;

	@FindBy(xpath = "//div[@class='modal-footer']/button[@id='dropping_cancel']")
	private WebElement cancelBtnDropLicenseBtn;

	@FindBy(xpath = "//body/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/button[1]")
	private WebElement closeBtnDropLicenseBtn;

	@FindBy(xpath = "//button[@id='drop_agree']")
	private WebElement dropBtnDropLicenseBtn;

	@FindBy(xpath = "//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[8]")
	private WebElement brandingTab;

	@FindBy(xpath = "//input[@id='brand-toggle']")
	private WebElement toggleBtnBrandingTab;

	@FindBy(xpath = "//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/ul[1]/li[1]")
	private WebElement planTransactionToggleBtnTransactionTab;

	@FindBy(xpath = "//label[contains(text(),'Purchased Templates')]")
	private WebElement tempTransactionToggleBtnTransactionTab;

	@FindBy(xpath = "//div[@class='field-col']//input[@class='search-fld form-control']")
	private WebElement planTransactionSearchTextField;

	@FindBy(xpath = "//button[contains(text(), 'Search')]")
	private WebElement planTransactionSearchBtn;

	@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]")
	private WebElement planTransactionPlanNameLabel;

	@FindBy(xpath = "//th[contains(text(),'Amount paid')]")
	private WebElement planTransactionAmountPaidLabel;

	@FindBy(xpath = "//th[contains(text(),'Discount')]")
	private WebElement planTransactionDiscountLabel;

	@FindBy(xpath = "//th[contains(text(),'Pay Status')]")
	private WebElement planTransactionPayStatusLabel;

	@FindBy(xpath = "//th[contains(text(),'Payment date')]")
	private WebElement planTransactionPaymentDateLabel;

	@FindBy(xpath = "//thead/tr/th[6]")
	private WebElement planTransactionResendInvoiceLabel;

	@FindBy(xpath = "//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
	private WebElement tempTransactionLabelText;

	@FindBy(xpath = "//th[contains(text(),'Template title')]")
	private WebElement tempTransactionTemplateTitleLabel;

	@FindBy(xpath = "//th[contains(text(),'Description')]")
	private WebElement tempTransactionDescriptionLabel;

	@FindBy(xpath = "//th[contains(text(),'Category')]")
	private WebElement tempTransactionCategoryLabel;

	@FindBy(xpath = "//th[contains(text(),'Amount ($)')]")
	private WebElement tempTransactionAmountLabel;

	@FindBy(xpath = "//th[contains(text(),'Purchased date')]")
	private WebElement tempTransactionPurchasedLabel;

	@FindBy(xpath = "//label[contains(text(),'Update Card Details')]")
	private WebElement updateCardDetailsTab;

	@FindBy(xpath = "//button[@id='continueButton']")
	private WebElement updateCardContinueBtn;

	@FindBy(xpath = "//input[@id='cc_number']")
	private WebElement updateCardNumberTextField;

	@FindBy(xpath = "//input[@id='cc_security_code']")
	private WebElement updateCardCVCTextField;

	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement updateCardMonthDropdown;

	@FindBy(xpath = "//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/select[1]/option[6]")
	private WebElement updateCardMonth;

	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement updateCardYearDropdown;

	@FindBy(xpath = "//option[contains(text(),'2024')]")
	private WebElement updateCardYear;

	@FindBy(xpath = "//p[contains(text(),'Note: We do not save any of your card information ')]")
	private WebElement updateCardNoteMssg;

	// Initialize page factory
	public UserProfilePage() {
		PageFactory.initElements(driver, this);
	}

	// This function is used for click on the My profile icon
	public void ClickOnMyprofileIcon() throws InterruptedException {
		login.validUserCredentials();
		myProfileIcon.click();
		needToWait(4);
		myprofile.click();
		needToWait(4);

	}

	// This function is used for Verify the presence of View Profile tab
	public boolean isViewProfileTabPresent(int num) {
		return driver.findElement(By.cssSelector("ul.nav.nav-tabs li:nth-child(num)".replace("num", num + "")))
				.isDisplayed();
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
		Assert.assertTrue(addressErrorMsg.isDisplayed());
		firstName.sendKeys("qamanish");
		lastName.click();

	}

	// This function used for last name Clear and type
	public void lastNameClearAndType() {
		lastName.clear();
		Assert.assertTrue(addressErrorMsg.isDisplayed());
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
		gender.selectByVisibleText("Please Select Gender");
		Assert.assertTrue(addressErrorMsg.isDisplayed());
		gender.selectByVisibleText("Female");
		gender.selectByVisibleText("Male");
		// gender.selectByIndex(2);
		needToWait(1);

	}

	// This function used for select gender value
	public void selectDate() {
		Select date = new Select(selectDate);
		date.selectByVisibleText("Please Select Date Format");
		Assert.assertTrue(addressErrorMsg.isDisplayed());
		date.selectByVisibleText("MM / DD /YYYY");
		date.selectByIndex(1);
		needToWait(2);
	}

	// This function used for phoneNum and type
	public void phoneNum() {
		phoneNum.clear();
		Assert.assertTrue(addressErrorMsg.isDisplayed());
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

	// This function used for select Time Zone
	public void clickOnAutoDetectTimeZone() {

		autoSetTimezone.click();
	}

	// This function used for Company name Clear and type
	public void companyNameClearAndType() {
		companyName.clear();
		Assert.assertTrue(addressErrorMsg.isDisplayed());
		companyName.sendKeys("CIS");
		companyName.click();
	}

	// This function used for select Using eSignly
	public void usingEsignlyDropdown() {
		Select usingEsignlydrp = new Select(usingEsignly);
		usingEsignlydrp.selectByVisibleText("Please Select");
		Assert.assertTrue(addressErrorMsg.isDisplayed());
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
		industry.selectByVisibleText("Please Select Industry");
		Assert.assertTrue(addressErrorMsg.isDisplayed());

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
		address.clear();
		Assert.assertTrue(addressErrorMsg.isDisplayed());
		address.sendKeys("indore");
		lastName.click();

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

	// This function used for verify Change Password Tab
	public void changePasswordTab() throws InterruptedException {
		ClickOnMyprofileIcon();
		changePassTab.click();
		needToWait(2);
	}

	// This function used for verify new password alert message
	public void mssgOnNewPassword() throws InterruptedException {
		changePasswordTab();
		saveBtn.click();
		needToWait(1);
		Assert.assertTrue(addressErrorMsg.isDisplayed());
		needToWait(2);
	}

	// This function used for verify confirm password alert message
	public void mssgOnConfirmPassword() throws InterruptedException {
		changePasswordTab();
		newPasswordTextField.sendKeys("123123");
		saveBtn.click();
		needToWait(1);
		Assert.assertTrue(addressErrorMsg.isDisplayed());
		needToWait(2);
	}

	// This function used for verify confirm password alert message
	public void passwordMismatch() throws InterruptedException {
		changePasswordTab();
		newPasswordTextField.sendKeys("123123");
		confirmPasswordTextField.sendKeys("789789");
		saveBtn.click();
		needToWait(1);
		Assert.assertTrue(addressErrorMsg.isDisplayed());
		needToWait(2);
	}

	// This function used for verify save button
	public void saveButton() throws InterruptedException {
		changePasswordTab();
		newPasswordTextField.sendKeys("Test@123");
		confirmPasswordTextField.sendKeys("Test@123");
		saveBtn.click();
		needToWait(2);
	}

	// This function used for verify import contacts tab
	public void importContactTab() throws InterruptedException {
		clickSetting();
		needToWait(2);
		importContactsTab.click();
		importContactsTab.isEnabled();
		needToWait(2);
	}

	// This function used for verify import more link
	public void importMoreLink() throws InterruptedException {
		importContactTab();
		needToWait(2);
		importMore.click();
		Assert.assertTrue(importMoreCardHeading.isDisplayed());
		needToWait(2);
	}

	// This function used for verify download sample csv file
	public void downloadCsvFile() throws InterruptedException {
		importMoreLink();
		needToWait(2);
		downloadSampleCsvFileBtn.click();
		needToWait(2);
	}

	// This function used for verify upload csv file
	public void uploadCsvFile() throws InterruptedException {
		importMoreLink();
		needToWait(2);
//		uploadCsvFileBtn.click();
		needToWait(3);
		WebElement upload_file = driver.findElement(By.xpath("//input[@name='csv_file']"));
		needToWait(5);
		upload_file.sendKeys("C:\\Users\\anamendra.y(2420)\\Documents\\sample.csv");
		needToWait(3);
	}

	// This function used for verify clear all button & checking all buttons &
	// message
	public void clearAllBtn() throws InterruptedException {
		importContactTab();
		needToWait(2);
		clearAllContactsBtn.click();
		confirmMessageClearAllBtn.isDisplayed();
		cancleBtnClearAllBtn.isDisplayed();
		closeBtnClearAllBtn.isDisplayed();
		okBtnClearAllBtn.isDisplayed();
		needToWait(3);
	}

	// This function used for verify cancel button on clear all button
	public void cancleBtnClearAllBtn() throws InterruptedException {
		importContactTab();
		needToWait(2);
		clearAllContactsBtn.click();
		cancleBtnClearAllBtn.click();
		needToWait(3);
	}

	// This function used for verify close button on clear all button
	public void closeBtnClearAllBtn() throws InterruptedException {
		importContactTab();
		needToWait(2);
		clearAllContactsBtn.click();
		closeBtnClearAllBtn.click();
		needToWait(3);
	}

	// This function used for verify ok button on clear all button
	public void okBtnClearAllBtn() throws InterruptedException {
		importContactTab();
		needToWait(2);
		clearAllContactsBtn.click();
		okBtnClearAllBtn.click();
		needToWait(3);
	}

	// This function used for verify ok button on clear all button
	public void importContactsUI() throws InterruptedException {
		importContactTab();
		needToWait(2);
		addressBook.isDisplayed();
		youHaveContacts.isDisplayed();
		importMore.isDisplayed();
		needToWait(3);
	}

	// This function used for verify import new contacts to list via tell your
	// friends button
	public void tellYourFriendsBtn() throws InterruptedException {
		importContactTab();
		needToWait(2);
		youHaveContacts.click();
		needToWait(1);
		userEmailCheckBox.click();
		tellYourFriendsBtn.click();
		needToWait(2);
		continueBtnTellYourFriendsBtn.click();
		needToWait(4);
	}

	// This function used for verify plan tab
	public void planTab() throws InterruptedException {
		clickSetting();
		needToWait(2);
		planTab.click();
		planTab.isEnabled();
		needToWait(2);
	}

	// This function used for verify plan tab Plan Details UI
	public void planDetailUI() throws InterruptedException {
		clickSetting();
		needToWait(2);
		planTab.click();
		planTab.isEnabled();
		signingAndTemplateRequestsWithCounts.isDisplayed();
		downgradeBtnPlanTab.isDisplayed();
		needToWait(2);
	}

	// This function used for verify Plan details downgrade button then cancel the
	// downgrading request
	public void planDetailDowngradeBtn() throws InterruptedException {
		clickSetting();
		needToWait(2);
		planTab.click();
		downgradeBtnPlanTab.click();
		needToWait(2);
		cancleBtnClearAllBtn.click();
		needToWait(2);
	}

	// This function used for verify Plan details downgrading via ok button
	public void planDetailDowngradeBtnOkBtn() throws InterruptedException {
		clickSetting();
		needToWait(2);
		planTab.click();
		downgradeBtnPlanTab.click();
		needToWait(2);
		okBtnDowngradeBtnPlanTab.click();
		needToWait(2);
	}

	// This function used for verify Plan details features UI
	public void planDetailFeatureUI() throws InterruptedException {
		clickSetting();
		needToWait(2);
		planTab.click();
		needToWait(2);
		Assert.assertTrue(planFeatureNameLabel.isDisplayed());
		Assert.assertTrue(quotaLeftLabel.isDisplayed());
		Assert.assertTrue(documentsLabel.isDisplayed());
		Assert.assertTrue(countOfDocumentAssigned.isDisplayed());
		Assert.assertTrue(signingRequestLabel.isDisplayed());
		Assert.assertTrue(countOfSigningRequestAssigned.isDisplayed());
		Assert.assertTrue(templatesLabel.isDisplayed());
		Assert.assertTrue(countOfTemplatesAssigned.isDisplayed());
		Assert.assertTrue(auditTrialLabel.isDisplayed());
		Assert.assertTrue(auditTrialIsAllowed.isDisplayed());
		Assert.assertTrue(statusNotificationLabel.isDisplayed());
		Assert.assertTrue(statusNotificationIsAllowed.isDisplayed());
		Assert.assertTrue(cloudLabel.isDisplayed());
		Assert.assertTrue(cloudIsAllowed.isDisplayed());
		Assert.assertTrue(addMoreRecipientLabel.isDisplayed());
		Assert.assertTrue(addMoreRecipientCount.isDisplayed());
		Assert.assertTrue(sendDocsLabel.isDisplayed());
		Assert.assertTrue(sendDocsCount.isDisplayed());
		Assert.assertTrue(realTimeEmailSignNotificationLabel.isDisplayed());
		Assert.assertTrue(realTimeEmailSignNotificationCount.isDisplayed());
		needToWait(5);
	}

	// This function used for verify current api Plan details
	public void apiPlanDetails() throws InterruptedException {
		clickSetting();
		needToWait(2);
		planTab.click();
		WebElement elm = driver.findElement(By.xpath(
				"//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elm);
		needToImplicitWait(3);
		apiTemplatesSigningConsumes.isDisplayed();
		apiDowngradeBtn.isDisplayed();
		needToWait(2);
	}

	// This function used for verify downgrade button of current api Plan details
	// with Cancle button
	public void downgradeBtnWithCancelBtnApiPlanDetails() throws InterruptedException {
		clickSetting();
		needToWait(2);
		planTab.click();
		WebElement elm = driver.findElement(By.xpath(
				"//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elm);
		needToImplicitWait(3);
		apiDowngradeBtn.click();
		needToWait(2);
		cancleBtnDowngradeBtnApiPlanDetails.click();
		needToWait(4);
	}

	// This function used for verify downgrade button of current api Plan details
	// with OK button
	public void downgradeBtnWithOkBtnApiPlanDetails() throws InterruptedException {
		clickSetting();
		needToWait(2);
		planTab.click();
		WebElement elm = driver.findElement(By.xpath(
				"//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elm);
		needToImplicitWait(3);
		apiDowngradeBtn.click();
		needToWait(2);
		okBtnDowngradeBtnApiPlanDetails.click();
		needToWait(4);
	}

	// This function used for verify current api details UI
	public void apiFeaturesUI() throws InterruptedException {
		clickSetting();
		needToWait(2);
		planTab.click();
		WebElement elm = driver.findElement(By.xpath(
				"//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elm);
		needToImplicitWait(5);
		featureNameApiPlanDetailsLabel.isDisplayed();
		quotaApiPlanLabel.isDisplayed();
		templateSigningApiPlanLabel.isDisplayed();
		countOfTemplateSigningAssigned.isDisplayed();
		apiSignStatusLabel.isDisplayed();
		countOfApiSignStatus.isDisplayed();
		getTemplateDataLabel.isDisplayed();
		countOfGetTemplateData.isDisplayed();
		apiDocumentSigningLabel.isDisplayed();
		countOfApiDocumentSigning.isDisplayed();
		cancelSigningRequestLabel.isDisplayed();
		countOfCancelSigningRequest.isDisplayed();
		apiDeleteRecipientRequestLabel.isDisplayed();
		countOfApiDeleteRecipientRequest.isDisplayed();
		deleteSigningRequestLabel.isDisplayed();
		countOfDeleteSigningRequest.isDisplayed();
		editRecipientEmailIdLabel.isDisplayed();
		countOfEditRecipientEmailId.isDisplayed();
		getUserAccBalLabel.isDisplayed();
		countOfGetUserAccBal.isDisplayed();
		downloadApiDocLabel.isDisplayed();
		countOfDownloadApiDoc.isDisplayed();
		autoAttachSignatureLabel.isDisplayed();
		countOfAutoAttachSignature.isDisplayed();
		listSignatureRequestLabel.isDisplayed();
		countOfListSignatureRequest.isDisplayed();
		listTemplatesLabel.isDisplayed();
		countOfListTemplates.isDisplayed();
		needToWait(5);
		apiSendReminderRequestLabel.isDisplayed();
		countOfApiSendReminderRequest.isDisplayed();
		apiForUserAccLabel.isDisplayed();
		countOfApiForUserAcc.isDisplayed();
		apiForDeleteTemplate.isDisplayed();
		countOfApiForDeleteTemplate.isDisplayed();
		cloudIntegrationLabel.isDisplayed();
		cloudIntegrationIsAllowed.isDisplayed();
		securityLabel.isDisplayed();
		securityIsAllowed.isDisplayed();
		chainingLabel.isDisplayed();
		chainingIsAllowed.isDisplayed();
		apiCommonFeaturesLabel.isDisplayed();
		apiCommonFeaturesIsAllowed.isDisplayed();
		apiSecurityLabel.isDisplayed();
		apiSecurityIsAllowed.isDisplayed();
		apiBrandingLabel.isDisplayed();
		apiBrandingIsAllowed.isDisplayed();
		apiCloudIntegrationLabel.isDisplayed();
		apiCloudIntegrationIsAllowed.isDisplayed();
		apiInpersonSigningLabel.isDisplayed();
		apiInpersonSigningIsAllowed.isDisplayed();
		placeDynamicFieldsApiLabel.isDisplayed();
		placeDynamicFieldApiIsAllowed.isDisplayed();
		realTimeEmailNotificationApiLabel.isDisplayed();
		realTimeEmailNotificationApiIsAllowed.isDisplayed();
		allowAttachmentApiLabel.isDisplayed();
		allowAttachmentApiIsAllowed.isDisplayed();
		createTemplatesApiLabel.isDisplayed();
		countOfCreateTemplatesApi.isDisplayed();
		needToWait(5);
	}

	// This function used for verify downgrade button of current api Plan details
	// with OK button
	public void planUI() throws InterruptedException {
		clickSetting();
		needToWait(2);
		planTab.click();
		needToWait(2);
		planDetails.isDisplayed();
		featureDetails.isDisplayed();
		WebElement elm = driver.findElement(By.xpath(
				"//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elm);
		myCurrentApiDetails.isDisplayed();
		apiFeatureDetails.isDisplayed();
		needToWait(4);
	}

	// This function used for verify Team License Tab
	public void teamLicenseTab() throws InterruptedException {
		clickSetting();
		needToWait(2);
		teamLicensesTab.click();
		needToWait(2);
	}

	// This function used for verify Team License Tab drop licenses button with
	// cancel button
	public void dropLicensesBtn() throws InterruptedException {
		clickSetting();
		needToWait(2);
		teamLicensesTab.click();
		needToWait(2);
		dropLicenseBtn.click();
		cancelBtnDropLicenseBtn.click();
		needToWait(2);
	}

	// This function used for verify Team License Tab drop licenses close Button
	public void closeBtnDropLicenseBtn() throws InterruptedException {
		clickSetting();
		needToWait(2);
		teamLicensesTab.click();
		needToWait(2);
		dropLicenseBtn.click();
		closeBtnDropLicenseBtn.click();
		needToWait(2);
	}

	// This function used for verify Team License Tab drop licenses Drop Button
	public void okBtnDropLicenseBtn() throws InterruptedException {
		clickSetting();
		needToWait(2);
		teamLicensesTab.click();
		needToWait(2);
		dropLicenseBtn.click();
		dropBtnDropLicenseBtn.isDisplayed();
		needToWait(2);
	}

	// This function used for verify Branding tab
	public void brandingTab() throws InterruptedException {
		clickSetting();
		needToWait(2);
		brandingTab.click();
		needToWait(2);
	}

	// This function used for verify Branding tab toggle button of ON/OFF
	public void toggleBtnBrandingTab() throws InterruptedException {
		clickSetting();
		needToWait(2);
		brandingTab.click();
		toggleBtnBrandingTab.click();
		needToWait(2);
		toggleBtnBrandingTab.click();
		needToWait(4);
	}

	// This function used for verify Transaction Tab
	public void transactionTab() throws InterruptedException {
		clickTransaction();
		needToWait(2);
	}

	// This function used for verify Transaction Tab
	public void planTransToggleBtnTransactionTab() throws InterruptedException {
		clickTransaction();
		needToWait(2);
		planTransactionToggleBtnTransactionTab.isEnabled();
	}

	// This function used for verify Plan Transaction UI
	public void planTransactionUI() throws InterruptedException {
		clickTransaction();
		needToWait(2);
		planTransactionToggleBtnTransactionTab.isEnabled();
		planTransactionSearchTextField.isDisplayed();
		planTransactionSearchBtn.isDisplayed();
		planTransactionPlanNameLabel.isDisplayed();
		planTransactionAmountPaidLabel.isDisplayed();
		planTransactionDiscountLabel.isDisplayed();
		planTransactionPayStatusLabel.isDisplayed();
		planTransactionPaymentDateLabel.isDisplayed();
		planTransactionResendInvoiceLabel.isDisplayed();
		needToWait(3);
	}

	// This function used for verify Plan Transaction Search Button
	public void planTransactionSearchBtn() throws InterruptedException {
		clickTransaction();
		needToWait(2);
		planTransactionToggleBtnTransactionTab.isEnabled();
		needToWait(2);
		planTransactionSearchTextField.sendKeys("Business Plan");
		planTransactionSearchBtn.click();
		needToWait(3);
	}

	// This function used for verify Templates Transaction toggle Button
	public void tempTransactionToggleBtn() throws InterruptedException {
		clickTransaction();
		needToWait(2);
		tempTransactionToggleBtnTransactionTab.click();
		needToWait(2);
		Assert.assertTrue(tempTransactionLabelText.isDisplayed());
		needToWait(2);
	}

	// This function used for verify Templates Transaction UI
	public void tempTransactionUI() throws InterruptedException {
		clickTransaction();
		needToWait(2);
		tempTransactionToggleBtnTransactionTab.click();
		needToWait(2);
		Assert.assertTrue(tempTransactionLabelText.isDisplayed());
		tempTransactionTemplateTitleLabel.isDisplayed();
		tempTransactionDescriptionLabel.isDisplayed();
		tempTransactionCategoryLabel.isDisplayed();
		tempTransactionAmountLabel.isDisplayed();
		tempTransactionPurchasedLabel.isDisplayed();
		needToWait(2);
	}

	// This function used for verify Update Card Details Tab
	public void updateCardDetTab() throws InterruptedException {
		clickMyProfile();
		needToWait(2);
		updateCardDetailsTab.click();
		needToWait(2);
	}

	// This function used for verify Update Card Details card number alert message
	public void updateCardNumMssg() throws InterruptedException {
		updateCardDetTab();
		needToWait(2);
		updateCardContinueBtn.click();
		Assert.assertTrue(cardErrorMsg.isDisplayed());
		needToWait(2);
	}

	// This function used for verify Update Card Details CVC number alert message
	public void updateCardCvcNumMssg() throws InterruptedException {
		updateCardDetTab();
		needToWait(2);
		updateCardNumberTextField.sendKeys("4242424242424242");
		updateCardContinueBtn.click();
		Assert.assertTrue(cardErrorMsg.isDisplayed());
		needToWait(2);
	}

	// This function used for verify Update Card Details expiry date alert message
	public void updateCardExpiryDateMssg() throws InterruptedException {
		updateCardDetTab();
		needToWait(2);
		updateCardNumberTextField.sendKeys("4242424242424242");
		updateCardCVCTextField.sendKeys("121");
		updateCardContinueBtn.click();
		Assert.assertTrue(cardErrorMsg.isDisplayed());
		needToWait(2);
	}

	// This function used for verify Update Card Details expiry year alert message
	public void updateCardExpiryYearMssg() throws InterruptedException {
		updateCardDetTab();
		needToWait(2);
		updateCardNumberTextField.sendKeys("4242424242424242");
		updateCardCVCTextField.sendKeys("121");
		updateCardMonthDropdown.click();
		updateCardMonth.click();
		updateCardContinueBtn.click();
		Assert.assertTrue(cardErrorMsg.isDisplayed());
		needToWait(2);
	}

	// This function used for verify Update Card Details expiry year alert message
	public void updateCardContinueBtn() throws InterruptedException {
		updateCardDetTab();
		needToWait(2);
		updateCardNumberTextField.sendKeys("4242424242424242");
		updateCardCVCTextField.sendKeys("121");
		updateCardMonthDropdown.click();
		updateCardMonth.click();
		updateCardYearDropdown.click();
		updateCardYear.click();
		updateCardContinueBtn.click();
		needToWait(2);
	}

	// This function used for verify Update Card Details UI
	public void updateCardUI() throws InterruptedException {
		updateCardDetTab();
		needToWait(2);
		updateCardNumberTextField.isDisplayed();
		updateCardCVCTextField.isDisplayed();
		updateCardMonthDropdown.isDisplayed();
		updateCardYearDropdown.isDisplayed();
		updateCardContinueBtn.isDisplayed();
		updateCardNoteMssg.isDisplayed();
		needToWait(2);
	}
}
