package com.esignlyNew.testcases;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.esignlyNew.pages.SignUpPage;

public class SignUpTest extends SignUpPage {
	SignUpPage signup;

	public SignUpTest() {
		super(); // Need to create constructor to intilaze properties file
	}


	@Test(priority = 1)
	public void tc_signup_001_verify_signup_Via_Email() {
		signup = new SignUpPage();
		try {
			signup.signup();
			driver.get(prop.getProperty("https://www.mailinator.com/"));
			((JavascriptExecutor) driver).executeScript("window.open()");
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(0));
			System.out.println("00000");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	@Test(priority = 2)
	public void tc_signup_002_checkOn_OkSendMeOffersAndTrainingEmails() {
		signup = new SignUpPage();
		try {
			signup.checkboxClick();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 3)
	public void tc_signup_003_verify_SigninNowBtn() {
		signup = new SignUpPage();
		try {
			signup.signinNow();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 4)
	public void tc_signup_004_check_TermsAndConditions(){
		signup = new SignUpPage();
		try {
			signup.termAndConditions();
			needToWait(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 5)
	public void tc_signup_005_check_PrivacyPolicy(){
		signup = new SignUpPage();
		try {
			signup.privacy_Policy();
			needToWait(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 6)
	public void tc_signup_006_check_SocialLinks_LinkedIn() {
		signup = new SignUpPage();
		try {
			signup.socialLinkedIn();
			needToWait(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 7)
	public void tc_signup_007_check_SocialLinks_Google() {
		signup = new SignUpPage();
		try {
			signup.socialGoogle();
			needToWait(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 8)
	public void tc_signup_008_verifySignupPageUI(){
		signup = new SignUpPage();
		try {
			signup.signupUI();
			needToWait(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
