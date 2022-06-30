package com.esignlyNew.testcases;

import org.testng.Assert;
import org.testng.annotations.*;

import com.esignlyNew.pages.MyTeamPage;

public class MyTeamTest extends MyTeamPage {

	MyTeamPage myTeamPage;

	@Test(priority = 0)
	public void tc_myTeam_001_check_MyTeamUrl() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.enterInMyTeam();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 1)
	public void tc_myTeam_002_check_PageTitle() {
		myTeamPage = new MyTeamPage();

		try {
			Assert.assertTrue(myTeamPage.verifyTilepage());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 2)
	public void tc_myTeam_021_verify_MyTeam_InviterMssg() {
		myTeamPage = new MyTeamPage();

		try {
			Assert.assertTrue(myTeamPage.verifyPleaseInviteSomeone());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 3)
	public void tc_myTeam_EmailNotValid() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.onlyInvitePeopleFreeButton();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 4)
	public void tc_myTeam_verify_MyTeamPageEmailID() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.myTeamPageTextemaildid();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 5)
	public void tc_myTeam_018_verify_InvitePeopleFree() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.invitePeopleFreeButton();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 6)
	public void tc_myTeam_003_verify_PurchaseLicenseBtn() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.clickOnPurchaseLicenceBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 7)
	public void tc_myTeam_004_verify_PurchaseLicense_PlanType_Yearly() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.clickDropdownPlanTypeYearly();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 8)
	public void tc_myTeam_005_verify_PurchaseLicense_PlanType_Monthly() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.clickDropdownPlanTypeMonthly();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 9)
	public void tc_myTeam_006_verify_PurchaseLicense_Plan_StandardPlan() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.clickDorpdownStandardPlan();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 10)
	public void tc_myTeam_007_verify_PurchaseLicense_Plan_AdvancePlan() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.clickDorpdownAdvancedPlan();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 11)
	public void tc_myTeam_008_verify_PurchaseLicense_NoOfUsers() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.clickDorpdownNoOfUsers();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 12)
	public void tc_myTeam_009_check_Change_CardDetails() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.clickChangeCardDetails();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 13)
	public void tc_myTeam_010_check_ValidateBtn() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.clickValidateBtnValidateMsg1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 14)
	public void tc_myTeam_052_verify_MyTeam_InvalidEmailID() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.clickValidateBtnValidateMSg2();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 15)
	public void tc_myTeam_012_check_ContinueBtn() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.clickContinueBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 16)
	public void tc_myTeam_013_check_PurchaseLicense_CloseBtn() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.closePurchaseLicence();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 17)
	public void tc_myTeam_014_verify_PurchaseLicenseUI() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.purchaseLicenceUI();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 18)
	public void tc_myTeam_015_verify_TeamName() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.teamName();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 19)
	public void tc_myTeam_016_verify_TeamName_EditBtn() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.teamNameEditBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 20)
	public void tc_myTeam_017_verify_TeamNameEditBtn_SaveBtn() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.teamNameEditBtn_SaveBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 21)
	public void tc_myTeam_019_verify_ExistingMember() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.verifyExistingMember();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 22)
	public void tc_myTeam_020_verify_ExisitngMemberFromAnotherTeam() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.verifyOtherTeamMember();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 23)
	public void tc_myTeam_022_verify_IfMember_Accepts() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.ifMemberAccept();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 24)
	public void tc_myTeam_023_verify_IfMember_Rejects() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.ifMemberReject();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 25)
	public void tc_myTeam_024_verify_If_RemoveMemberBeforeAcceptAndCancelBtn() {
		myTeamPage = new MyTeamPage();
		try {
			myTeamPage.removeBrforeAcceptAndCancelBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 26)
	public void tc_myTeam_025_verify_If_RemoveMemberBeforeAcceptOkBtn() {
		myTeamPage = new MyTeamPage();
		try {
			myTeamPage.removeBrforeAcceptAndOkBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//					@Test(priority =23)
//					public void tc_myTeam_021_verify_MyTeam_NoMemberMssg() {
//						myTeamPage = new MyTeamPage();
//						
//						try {
//							myTeamPage.noTeamMemberYet();
//						} catch (InterruptedException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//					}

	@Test(priority = 27)
	public void tc_myTeam_027_verify_ActionUpgradeBtn() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.upgradeBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 27)
	public void tc_myTeam_039_verify_RemoveBtn() {
		myTeamPage = new MyTeamPage(); 

		try {
			myTeamPage.removeAfterAcceptAndRemoveBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 28)
	public void tc_myTeam_053_verify_ActionUpgradeBtn_ContinueBtn() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.continueBtnUpgradeBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 29)
	public void tc_myTeam_028_verify_ActionUpgradeBtn_DetailBtn() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.detailsBtnUpgradeBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 30)
	public void tc_myTeam_029_verify_ActionUpgradeBtn_SubmitBtn() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.submitBtnUpgradeBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 31)
	public void tc_myTeam_031_verify_ActionDowngradeBtn() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.downgradeBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 32)
	public void tc_myTeam_033_verify_ActionDowngradeBtn_CloseBtn() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.closeBtnDowngradeBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 33)
	public void tc_myTeam_034_verify_ActionDowngradeBtn_OkBtn() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.okBtnDowngradeBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 35)
	public void tc_myTeam_035_verify_ReusableTemplates() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.reusableTemplates();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 36)
	public void tc_myTeam_036_verify_ReusableTemplates_CloseBtn() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.closeBtnReusableTemplates();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 37)
	public void tc_myTeam_037_verify_MakeAdminBtn() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.makeAdminBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 38)
	public void tc_myTeam_038_verify_RevokeAdminBtn() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.revokeAdminBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 39)
	public void tc_myTeam_043_verify_Setting_LeaveTeam() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.leaveTheTeamDropdown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 40)
	public void tc_myTeam_044_verify_Setting_PlanDetails() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.planDetailsDropdown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 41)
	public void tc_myTeam_045_verify_DeligatePaymentAuthority() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.paymentAuthorityDropdown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 42)
	public void tc_myTeam_046_DeligatePaymentAuthority_ConfirmationCard_CancleBtn() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.cancelBtnPaymentAuthorityDropdown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 43)
	public void tc_myTeam_047_DeligatePaymentAuthority_CloseBtn() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.closeBtnPaymentAuthorityDropdown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 44)
	public void tc_myTeam_048_DeligatePaymentAuthority_AuthoriseBtn() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.authorizeBtnPaymentAuthority();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 45)
	public void tc_myTeam_049DeligatePaymentAuthority_UncheckCheckBox_OkBtn() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.uncheckOkBtnPaymentAuthorityDropdown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 46)
	public void tc_myTeam_050_verify_MyTeamPageUI() {
		myTeamPage = new MyTeamPage();

		try {
			myTeamPage.myTemUI();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
