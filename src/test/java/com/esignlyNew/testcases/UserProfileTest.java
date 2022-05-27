package com.esignlyNew.testcases;

import org.testng.Assert;
import org.testng.annotations.*;

import com.esignlyNew.pages.UserProfilePage;

public class UserProfileTest extends UserProfilePage {

	UserProfilePage userProfilePage;

	@Test(priority = 1)
	public void tc_up_001_vp_Content() throws InterruptedException {
		userProfilePage = new UserProfilePage();
		userProfilePage.ClickOnMyprofileIcon();
		Assert.assertTrue(userProfilePage.isViewProfileTabPresent());
		Assert.assertTrue(userProfilePage.isLastUpdatedTextPresentOnViewProfileTab());
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
}
