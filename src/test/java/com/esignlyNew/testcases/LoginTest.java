package com.esignlyNew.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.esignlyNew.pages.LoginPage;
import com.esignlyNew.pages.BaseSetUp;

public class LoginTest extends LoginPage {
	LoginPage loginPage;

	@Test(priority = 1)
	public void tc_001_withoutAnyInput() {
		loginPage = new LoginPage();
		try {
			loginPage.withoutAnyInput();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 2)
	public void tc_002_validUserWithOnlyEmail() {
		loginPage = new LoginPage();
		try {
			loginPage.validUserEmailOnly();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 3)
	public void tc_003_validUserWithOnlyPassword() {
		loginPage = new LoginPage();
		try {
			loginPage.validUserPasswordOnly();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 4)
	public void tc_004_invalids() {
		loginPage = new LoginPage();
		try {
			loginPage.invalidUserCredentials();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 5)
	public void tc_005_valids() {
		loginPage = new LoginPage();
		try {
			loginPage.validUserCredentials();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 6)
	public void tc_006_checkBox_click_to_Remember_Me() {
		loginPage = new LoginPage();
		try {
			loginPage.clickToRememberMe();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 7)
	public void tc_007_uncheckBox_click_to_Remove_from_Remember() {
		loginPage = new LoginPage();
		try {
			loginPage.removeFromRememberMe();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 8)
	public void tc_008_click_On_Forgot_Password() {
		loginPage = new LoginPage();
		try {
			loginPage.forgotPassword();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 9)
	public void tc_009_click_On_SignUp_Button() {
		loginPage = new LoginPage();
		try {
			loginPage.signUpButton();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 10)

	public void tc_010_login_Via_LinkedIn() {
		loginPage = new LoginPage();
		try {
			loginPage.linkedIn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 11)

	public void tc_011_login_Via_Google() {
		loginPage = new LoginPage();
		try {
			loginPage.google();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 12)

	public void tc_012_click_On_Login_btn() {
		loginPage = new LoginPage();
		try {
			loginPage.loginbtnNavigationBar();
			needToWait(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 13)

	public void tc_013_click_On_Feature_verification_dropdown() {
		loginPage = new LoginPage();
		try {
			loginPage.featureDropdown();
			needToWait(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 14)

	public void tc_014_eSignly_Logo() {
		loginPage = new LoginPage();
		try {
			Assert.assertTrue(loginPage.eSignlyLogo());
			needToWait(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 15)

	public void tc_015_verify_Industries_Insurance_Industries() {
		loginPage = new LoginPage();
		try {
			loginPage.insuranceIndustry();
			needToWait(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 16)

	public void tc_016_verify_How_It_Works() {
		loginPage = new LoginPage();
		try {
			loginPage.howItsWorking();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 17)

	public void tc_017_verify_Pricing_ESignly_Pricing() {
		loginPage = new LoginPage();
		try {
			loginPage.accountPricing();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 18)

	public void tc_018_verify_Pricing_eSignly_Api_Pricing() {
		loginPage = new LoginPage();
		try {
			loginPage.apiPricing();
			needToWait(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 19)

	public void tc_019_verify_FAQs() {
		loginPage = new LoginPage();
		try {
			loginPage.faqs();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 20)

	public void tc_020_verify_Free_Trial_Btn() {
		loginPage = new LoginPage();
		try {
			loginPage.freeTrialBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 21)

	public void tc_021_verify_Buy_Now_Btn() {
		loginPage = new LoginPage();
		try {
			loginPage.buyNowBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 22)

	public void tc_022_verify_Api_Api_Document() {
		loginPage = new LoginPage();
		try {
			loginPage.apiDocBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 23)

	public void tc_023_verify_Api_Api_Widget() {
		loginPage = new LoginPage();
		try {
			loginPage.apiWidgetBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 24)

	public void tc_024_verify_UI() {
		loginPage = new LoginPage();
		try {
			loginPage.loginUI();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
