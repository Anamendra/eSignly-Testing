package com.esignlyNew.testcases;

import org.testng.Assert;
import org.testng.annotations.*;

import com.esignlyNew.pages.UserProfilePage;

public class UserProfileTest extends UserProfilePage {

	UserProfilePage userProfilePage;

	@Test(priority = 1)
	public void tc_up_001_vp_Content() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.ClickOnMyprofileIcon();
			Assert.assertTrue(userProfilePage.isViewProfileTabPresent(1));
			Assert.assertTrue(userProfilePage.isLastUpdatedTextPresentOnViewProfileTab());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 2)
	public void tc_up_002_vp_Email_Id() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.ClickOnMyprofileIcon();
			String getEmail = userProfilePage.getEmailAddress();
			Assert.assertEquals(getEmail, "qamanish@mailinator.com");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 3)
	public void tc_mp_003_vp_FirstName() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.ClickOnMyprofileIcon();
			userProfilePage.firstNameClearAndType();
			Assert.assertTrue(userProfilePage.isUserProfileUpdatedSuccessMsg());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 4)
	public void tc_mp_004_vp_LastName() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.ClickOnMyprofileIcon();
			userProfilePage.lastNameClearAndType();
			Assert.assertTrue(userProfilePage.isUserProfileUpdatedSuccessMsg());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 5)
	public void tc_mp_005_vp_Gender() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.ClickOnMyprofileIcon();
			userProfilePage.selectGender();
			Assert.assertTrue(userProfilePage.isUserProfileUpdatedSuccessMsg());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 6)
	public void tc_mp_006_vp_Date_Format_Signer() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.ClickOnMyprofileIcon();
			userProfilePage.selectDate();
			Assert.assertTrue(userProfilePage.isUserProfileUpdatedSuccessMsg());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 7)
	public void tc_mp_007_vp_Phone() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.ClickOnMyprofileIcon();
			userProfilePage.phoneNum();
			Assert.assertTrue(userProfilePage.isUserProfileUpdatedSuccessMsg());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 8)
	public void tc_mp_008_vp_Timezone_dropdown() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.ClickOnMyprofileIcon();
			userProfilePage.selectTimeZone();
			Assert.assertTrue(userProfilePage.isUserProfileUpdatedSuccessMsg());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 9)
	public void tc_mp_009_vp_AutoDetect_Timezone_Btn() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.ClickOnMyprofileIcon();
			userProfilePage.selectTimeZone();
			userProfilePage.clickOnAutoDetectTimeZone();
			Assert.assertTrue(userProfilePage.isUserProfileUpdatedSuccessMsg());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 10)
	public void tc_mp_010_vp_Company() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.ClickOnMyprofileIcon();
			userProfilePage.companyNameClearAndType();
			Assert.assertTrue(userProfilePage.isUserProfileUpdatedSuccessMsg());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 11)
	public void tc_mp_011_vp_Using_eSignly_for() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.ClickOnMyprofileIcon();
			userProfilePage.usingEsignlyDropdown();
			Assert.assertTrue(userProfilePage.isUserProfileUpdatedSuccessMsg());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 12)
	public void tc_mp_012_vp_Industry() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.ClickOnMyprofileIcon();
			userProfilePage.industryDrd();
			Assert.assertTrue(userProfilePage.isUserProfileUpdatedSuccessMsg());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 13)
	public void tc_mp_013_vp_DateOfBirth() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.ClickOnMyprofileIcon();
			userProfilePage.selectDOB();
			Assert.assertTrue(userProfilePage.isUserProfileUpdatedSuccessMsg());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 14)
	public void tc_mp_014_Address() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.ClickOnMyprofileIcon();
			userProfilePage.enterAddress();
			Assert.assertTrue(userProfilePage.isUserProfileUpdatedSuccessMsg());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 15)
	public void tc_mp_015_Audit_Report() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.ClickOnMyprofileIcon();
			userProfilePage.auditReport();
			Assert.assertTrue(userProfilePage.isUserProfileUpdatedSuccessMsg());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 16)
	public void tc_mp_016_Document_Setting() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.ClickOnMyprofileIcon();
			userProfilePage.clickOnDocumentSettingToggleBtn();
			Assert.assertTrue(userProfilePage.isUserProfileUpdatedSuccessMsg());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 17)
	public void tc_mp_017_Email_News_Letter() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.ClickOnMyprofileIcon();
			userProfilePage.clickOnEmailNewsLetterToggleBtn();
			Assert.assertTrue(userProfilePage.isUserProfileUpdatedSuccessMsg());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 18)
	public void tc_mp_018_Weekly_Account_Statistics() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.ClickOnMyprofileIcon();
			userProfilePage.clickOnWeeklyAccountStatistics();
			Assert.assertTrue(userProfilePage.isUserProfileUpdatedSuccessMsg());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 19)
	public void tc_mp_019_Delete_Account() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.ClickOnMyprofileIcon();
			Assert.assertTrue(userProfilePage.isDeleteButtonPresent());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 20)
	public void tc_mp_029_verify_ChangePassword_Tab() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.changePasswordTab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 21)
	public void tc_mp_030_Verify_Mssg_On_NewPassword() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.mssgOnNewPassword();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 22)
	public void tc_mp_031Verify_Mssg_On_ConfirmPassword() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.mssgOnConfirmPassword();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 23)
	public void tc_mp_032_Verify_Mssg_On_Different_Password() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.passwordMismatch();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 24)
	public void tc_mp_033_Verify_Save_Btn() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.saveButton();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 25)
	public void tc_sets_034_verify_ImportContacts() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.importContactTab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 26)
	public void tc_sets_035_verify_ImportContacts_ImportMoreLink() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.importMoreLink();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 27)
	public void tc_sets_036_verify_ImportContacts_DownloadSampleCSVBtn() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.downloadCsvFile();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 28)
	public void tc_sets_037_verify_ImportContacts_UploadCSVBtn() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.uploadCsvFile();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 29)
	public void tc_settings_042_verify_ClearAllBtn() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.clearAllBtn();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 30)
	public void tc_settings_043_verify_ClearAll_CancelBtn() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.cancleBtnClearAllBtn();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 31)
	public void tc_settings_044_verify_ClearAll_CloseBtn() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.closeBtnClearAllBtn();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 32)
	public void tc_settings_045_verify_ClearAll_OkBtn() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.okBtnClearAllBtn();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 33)
	public void tc_settings_046_verify_ImportContactsUI() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.importContactsUI();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 34)
	public void tc_sets_038_verify_ImportContacts_UploadCSVBtn_TellYourFriendsBtn() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.tellYourFriendsBtn();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 35)
	public void tc_plan_047_verify_OnPlanTab() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.planTab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 36)
	public void tc_plan_048_verify_OnPlan_PlanDetailsUI() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.planDetailUI();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 37)
	public void tc_plan_049_verify_OnPlan_PlanDetails_DowngradeBtn() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.planDetailDowngradeBtn();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 38)
	public void tc_plan_051_verify_OnPlan_PlanDetails_DowngradeBtn_OkBtn() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.planDetailDowngradeBtnOkBtn();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 39)
	public void tc_plan_052_verify_OnPlan_FeatureDetail() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.planDetailFeatureUI();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 40)
	public void tc_plan_053_verify_OnPlan_myCurrentApiPlanDetails() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.apiPlanDetails();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 41)
	public void tc_plan_054_verify_OnPlan_myCurrentApiPlanDetails_DowngradeBtn() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.downgradeBtnWithCancelBtnApiPlanDetails();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 42)
	public void tc_plan_056_verify_OnPlan_myCurrentApiPlanDetails_DowngradeBtn_OkBtn() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.downgradeBtnWithOkBtnApiPlanDetails();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 43)
	public void tc_plan_057_verify_OnPlan_myCurrentApiPlanDetails_ApiFeatureDetails() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.apiFeaturesUI();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 44)
	public void tc_plan_058_verify_PlanUI() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.planUI();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 45)
	public void tc_tl_059_verify_TeamLicenseUI() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.teamLicenseTab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 46)
	public void tc_tl_060_verify_TeamLicense_DropLicensesBtn() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.dropLicensesBtn();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 47)
	public void tc_tl_063_verify_TeamLicense_DropLicensesBtn_CloseBtn() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.closeBtnDropLicenseBtn();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 48)
	public void tc_tl_061_verify_TeamLicense_DropLicensesBtn_DropBtn() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.okBtnDropLicenseBtn();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 49)
	public void tc_branding_064_verify_BrandingTab() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.brandingTab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 50)
	public void tc_branding_065_verify_BrandingToggleBtn() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.toggleBtnBrandingTab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 51)
	public void tc_trans_066_verify_Transaction_Tab() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.transactionTab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 52)
	public void tc_trans_067_verify_PlanTrans_IsSelectedByDefault() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.planTransToggleBtnTransactionTab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 53)
	public void tc_trans_068_verify_PlanTrans_UI() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.planTransactionUI();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 53)
	public void tc_trans_069_verify_PlanTrans_SeachBtn() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.planTransactionSearchBtn();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 54)
	public void tc_trans_070_verify_TempTransTab() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.tempTransactionToggleBtn();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 55)
	public void tc_trans_071_verify_TempTransUI() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.tempTransactionUI();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 56)
	public void tc_updcrd_072_verify_UpdateCardDetailsTab() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.updateCardDetTab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 57)
	public void tc_updcrd_073_verify_CardNumMssg() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.updateCardNumMssg();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 58)
	public void tc_updcrd_074_verify_CvcMssg() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.updateCardCvcNumMssg();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 59)
	public void tc_updcrd_075_checkExpDateMssg() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.updateCardExpiryDateMssg();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 60)
	public void tc_updcrd_076_checkExpYearMssg() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.updateCardExpiryYearMssg();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 61)
	public void tc_updcrd_077_verify_ContinueBtn() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.updateCardContinueBtn();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 62)
	public void tc_updcrd_078_verify_UpdateCardDetailsUI() {
		userProfilePage = new UserProfilePage();
		try {
			userProfilePage.updateCardUI();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
