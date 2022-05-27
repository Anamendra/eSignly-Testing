package com.esignlyNew.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.esignlyNew.pages.BulkSigningPage;
import com.esignlyNew.pages.PricingPage;

public class BulkSigningTest extends BulkSigningPage {

	BulkSigningPage bulk;

	public BulkSigningTest() {
		super(); // Need to create constructor to intilaze properties file
	}

	@Test(priority = 1)
	public void tc_bsign_001_verify_BulkSigning_Url() {
		bulk = new BulkSigningPage();
		try {
			bulk.bSigningUrl();
			needToWait(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 2)
	public void tc_bsign_002_verify_CreateBSBtn() {
		bulk = new BulkSigningPage();
		try {
			bulk.createBulkSigningButton();
			needToWait(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 3)
	public void tc_bsign_003_verify_CreateBS_SelectTemplateFromDropdown() {
		bulk = new BulkSigningPage();
		try {
			bulk.selectTemplateFromDropdown();
			needToWait(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 4)
	public void tc_bsign_004_verify_CreateBS_Title() {
		bulk = new BulkSigningPage();
		try {
			bulk.createTitleField();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(priority = 5)
	public void tc_bsign_005_verify_CreateBS_Description() {
		bulk = new BulkSigningPage();
		try {
			bulk.descTextBox();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
