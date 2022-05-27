package com.esignlyNew.testcases;

import org.testng.annotations.Test;

import com.esignlyNew.pages.HelpPage;

public class HelpTest extends HelpPage {

	HelpPage hp;

	public HelpTest() {
		super(); // Need to create constructor to intilaze properties file
	}

//	@BeforeMethod
//	public void SetUp() {
//		initialization();
//
//	}

	@Test(priority = 1)
	public void tc_hlp_001_verifyHelpContent(){
		hp = new HelpPage();
		try {
			hp.helpfunctionality();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 2)
	public void tc_hlp_002_checkCloseButton_Functionality() {
		hp = new HelpPage();
		try {
			hp.helpCloseBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
