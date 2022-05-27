package com.esignlyNew.testcases;

import org.testng.Assert;
import org.testng.annotations.*;

import com.esignlyNew.pages.BaseSetUp;
import com.esignlyNew.pages.DashboardPage;

public class DashboardTest extends DashboardPage {

	DashboardPage dashboardPage;

	public DashboardTest() {
		super(); // Need to create constructor to initialize properties file
	}

	@Test(priority = 1)
	public void tc_dash_001_verify_Dashboard_Heading() {
		dashboardPage = new DashboardPage();
		try {
			Assert.assertTrue(dashboardPage.isDashboardTitlePresent());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 2)
	public void tc_dash_002_verify_User_Name() {
		dashboardPage = new DashboardPage();
		try {
			dashboardPage.isUsernamePresentAfterLogin();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 2)
	public void tc_dash_035_check_DropdownMenu() {
		dashboardPage = new DashboardPage();
		try {
			dashboardPage.clickOnMyprofileDropdown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 3)
	public void tc_003_check_DropdownMenu_My_Profile() {
		dashboardPage = new DashboardPage();
		try {
			dashboardPage.clickMyProfile();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Test(priority = 4)
	public void tc_dash_004_check_DropdownMenu_Settings() {

		dashboardPage = new DashboardPage();
		try {
			dashboardPage.clickOnMyprofileDropdown();
			dashboardPage.clickSetting();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		;

	}

	@Test(priority = 5)
	public void tc_dash_005_check_DropdownMenu_My_Transactions() {

		dashboardPage = new DashboardPage();
		try {
			dashboardPage.clickOnMyprofileDropdown();
			dashboardPage.clickTransaction();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		;

	}

	@Test(priority = 6)
	public void tc_dash_006_check_DropdownMenu_Add_Signature() {

		dashboardPage = new DashboardPage();
		try {
			dashboardPage.clickOnMyprofileDropdown();
			dashboardPage.clickAddSignature();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		;

	}

	@Test(priority = 7)
	public void tc_dash_007_check_DropdownMenu_Myfolder() {

		dashboardPage = new DashboardPage();
		try {
			dashboardPage.clickOnMyprofileDropdown();
			dashboardPage.clickMyFolder();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		;

	}

	@Test(priority = 8)
	public void tc_dash_036_check_DropdownMenu_LogoutBtnr() {

		dashboardPage = new DashboardPage();
		try {
			dashboardPage.clickOnMyprofileDropdown();
			dashboardPage.clickLogout();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		;

	}

	@Test(priority = 8)
	public void tc_dash_008_click_On_Dashboard_side_panel() {

		dashboardPage = new DashboardPage();
		try {
			dashboardPage.clickSideMenu();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 9)
	public void tc_dash_009_click_On_Start_Signing() {

		dashboardPage = new DashboardPage();
		try {
			dashboardPage.clickStartSigning();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 10)
	public void tc_dash_010_click_On_Bulk_Signing() {

		dashboardPage = new DashboardPage();
		try {
			dashboardPage.clickBulkSigning();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 11)
	public void tc_dash_011_click_On_Inperson_Signing() {
		dashboardPage = new DashboardPage();
		try {
			dashboardPage.inpersonSigning();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 12)
	public void tc_dash_012_click_On_Reusable_Templates() {
		dashboardPage = new DashboardPage();
		try {
			dashboardPage.reusableTemplate();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 13)
	public void tc_dash_013_click_On_My_Documents() {
		dashboardPage = new DashboardPage();
		try {
			dashboardPage.myDocument();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 14)
	public void tc_dash_014_click_On_Completed() {
		dashboardPage = new DashboardPage();
		try {
			dashboardPage.compelete();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 15)
	public void tc_dash_015_click_On_Received() {
		dashboardPage = new DashboardPage();
		try {
			dashboardPage.received();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 16)
	public void tc_dash_016_click_On_Sent() {
		dashboardPage = new DashboardPage();
		try {
			dashboardPage.sent();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 17)
	public void tc_dash_017_click_On_Awaiting() {
		dashboardPage = new DashboardPage();
		try {
			dashboardPage.awaiting();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 18)
	public void tc_dash_018_click_On_Scheduled() {
		dashboardPage = new DashboardPage();
		try {
			dashboardPage.schedule();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 19)
	public void tc_dash_019_click_On_My_Folders() {
		dashboardPage = new DashboardPage();
		try {
			dashboardPage.myFolder();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 20)
	public void tc_dash_020_click_On_My_Team() {
		dashboardPage = new DashboardPage();
		try {
			dashboardPage.myTeam();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 21)
	public void tc_dash_021_Api_Dashboard() {
		dashboardPage = new DashboardPage();
		try {
			dashboardPage.apiDashboard();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 22)
	public void tc_dash_022_Api_Documents() {
		dashboardPage = new DashboardPage();
		try {
			dashboardPage.apiDocument();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 23)
	public void tc_dash_023_Api_Templates() {
		dashboardPage = new DashboardPage();
		try {
			dashboardPage.apiTemplates();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 24)
	public void tc_dash_024_Api_Settings() {
		dashboardPage = new DashboardPage();
		try {
			dashboardPage.apiSettings();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 25)
	public void tc_dash_025_Api_Website_Widget() {
		dashboardPage = new DashboardPage();
		try {
			dashboardPage.apiWebsiteWidget();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 26)
	public void tc_dash_026_Help() {
		dashboardPage = new DashboardPage();
		try {
			dashboardPage.help();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 27)
	public void tc_dash_027_Upgrade_Now() {
		dashboardPage = new DashboardPage();
		try {
			dashboardPage.validUserCredentials();
			dashboardPage.upgradeNow();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 28)
	public void tc_dash_028_Notification_Box() {
		dashboardPage = new DashboardPage();
		try {
			dashboardPage.notificationBox();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 29)
	public void tc_dash_029_Message_Box() {
		dashboardPage = new DashboardPage();
		try {
			dashboardPage.messageBox();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

//		@Test(priority =30)
//		public void tc_dash_030_Language_Dropdown() {
//			dashboardPage = new DashboardPage();
//			try {
//				dashboardPage.languageDropdown();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		
//		}
}
