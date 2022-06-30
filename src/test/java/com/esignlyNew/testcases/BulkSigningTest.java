package com.esignlyNew.testcases;

import org.testng.annotations.Test;

import com.esignlyNew.pages.BulkSigningPage;

public class BulkSigningTest extends BulkSigningPage {

	BulkSigningPage bulk;

	public BulkSigningTest() {
		super(); // Need to create constructor to intialize properties file
	}

	@Test(priority = 0)
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

	@Test(priority = 1 )
	public void tc_bsign_028_verify_BS_UI_withNoBS() {
		bulk = new BulkSigningPage();
		try {
			bulk.bulkSigningNoDocumentExist();
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

	@Test(priority = 6)
	public void tc_bsign_006_check_CreateBS_AddRecipientEmial_isClickedByDefault() {
		bulk = new BulkSigningPage();
		try {
			bulk.addRecipientEmailRadioBtnIsChecked();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 7)
	public void tc_bsign_007_verify_CreateBS_AddRecipientEmail_ToolTip() {
		bulk = new BulkSigningPage();
		try {
			bulk.addRecipientEmailToolTip();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 8)
	public void tc_bsign_008_check_CreateBS_UploadCsv_RadioBtn() {
		bulk = new BulkSigningPage();
		try {
			bulk.uploadCsvRadioBtnIsExist();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 9)
	public void tc_bsign_009_verify_CreateBS_UploadCsv_Tooltip() {
		bulk = new BulkSigningPage();
		try {
			bulk.uploadCsvToolTip();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 10)
	public void tc_bsign_010_verify_CreateBS_ProcessBtn() {
		bulk = new BulkSigningPage();
		try {
			bulk.processBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 11)
	public void tc_bsign_011_verify_CreateBS_SecurityWithDoc_isDisplay() {
		bulk = new BulkSigningPage();
		try {
			bulk.securityWithDocumentIsExist();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 12)
	public void tc_bsign_012_verify_CreateBS_SecurityWithDoc_EditButton() {
		bulk = new BulkSigningPage();
		try {
			bulk.securityWithDocumentEditBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 13)
	public void tc_bsign_013_verify_CreateBS_UploadCsv_DownloadSampleCsvFileBtn() {
		bulk = new BulkSigningPage();
		try {
			bulk.downloadSamepleCsvBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 14)
	public void tc_bsign_014_verify_CreateBS_UploadCsv_Process() {
		bulk = new BulkSigningPage();
		try {
			bulk.uploadCsvBtnProcessBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 15)
	public void tc_bsign_015_verify_BS_SignStatusBtn() {
		bulk = new BulkSigningPage();
		try {
			bulk.signStatusBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 16)
	public void tc_bsign_016_verify_BS_SignStatusCard_BackBtn() {
		bulk = new BulkSigningPage();
		try {
			bulk.signStatusBtnBackBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 17)
	public void tc_bsign_017_verify_BS_SignStatusCardUI() {
		bulk = new BulkSigningPage();
		try {
			bulk.signStatusBtnUI();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 18)
	public void tc_bsign_018_verify_BS_DeleteBtn() {
		bulk = new BulkSigningPage();
		try {
			bulk.deleteCreatedBulkSigningDoc();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 19)
	public void tc_bsign_019_verify_BS_DeleteBtn_CardUI() {
		bulk = new BulkSigningPage();
		try {
			bulk.deleteCardUI();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 20)
	public void tc_bsign_020_verify_BS_DeleteBtn_CancelBtn() {
		bulk = new BulkSigningPage();
		try {
			bulk.deleteCardCancleBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 21)
	public void tc_bsign_021_verify_BS_DeleteBtn_CloseBtn() {
		bulk = new BulkSigningPage();
		try {
			bulk.deleteCardCloseBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 22)
	public void tc_bsign_022_verify_BS_DeleteBtn_OkBtn() {
		bulk = new BulkSigningPage();
		try {
			bulk.deleteCardOkBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 15)
	public void tc_bsign_023_verify_BS_UI() {
		bulk = new BulkSigningPage();
		try {
			bulk.bulkSigningUIAfterAnyDoc();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 16)
	public void tc_bsign_024_verify_BS_DocumentIcon() {
		bulk = new BulkSigningPage();
		try {
			bulk.docIsVisibleViaIcon();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 17)
	public void tc_bsign_025_verify_BS_DocumentIcon_ForwardSwipeBtn() {
		bulk = new BulkSigningPage();
		try {
			bulk.docIconNextBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 18)
	public void tc_bsign_026_verify_BS_DocumentIcon_BackwardSwipeBtn() {
		bulk = new BulkSigningPage();
		try {
			bulk.docIconPreviousBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 19)
	public void tc_bsign_027_verify_BS_DocumentIcon_CloseBtn() {
		bulk = new BulkSigningPage();
		try {
			bulk.docIconCloseBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
