package com.esignlyNew.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.esignlyNew.pages.MyFolderPage;

public class MyFolderTest extends MyFolderPage {

	MyFolderPage myFold;

	public MyFolderTest() {
		super(); // Need to create constructor to intilaze properties file
	}

	@Test(priority = 1)
	public void tc_myFoldr_001_check_My_Folder_Url() {
		myFold = new MyFolderPage();
		try {
			myFold.mfurl();
			needToWait(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 2)
	public void tc_myFoldr_002_check_Page_Title() {
		myFold = new MyFolderPage();
		try {
			myFold.myFolderText();
			needToWait(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 3)
	public void tc_myFoldr_003_verify_Create_Folder_Page() {
		myFold = new MyFolderPage();
		try {
			myFold.createFolder();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 4)
	public void tc_myFoldr_004_verify_Edit_FolderName() {
		myFold = new MyFolderPage();
		try {
			myFold.editFolderNameBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 5)
	public void tc_myFoldr_005_verify_Delete_Folder_ConfirmationCard() {
		myFold = new MyFolderPage();
		try {
			myFold.deleteFolder();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 6)
	public void tc_myFoldr_006_verify_CreateFolder_CardTitle() {
		myFold = new MyFolderPage();
		try {
			myFold.createFolderHeading();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 7)
	public void tc_myFoldr_007_verify_Create_A_Folder() {
		myFold = new MyFolderPage();
		try {
			myFold.createOneFolder();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 8)
	public void tc_myFoldr_008_verify_Create_A_Folder_CloseButton() {
		myFold = new MyFolderPage();
		try {
			myFold.createFolderCloseButton();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 9)
	public void tc_myFoldr_009_verify_Create_A_Folder_UI() {
		myFold = new MyFolderPage();
		try {
			myFold.createFolderUI();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 10)
	public void tc_myFoldr_010_verify_EditFolderName() {
		myFold = new MyFolderPage();
		try {
			myFold.editFoldrName();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 11)
	public void tc_myFoldr_011_verify_Edit_Folder_RenameBtn() {
		myFold = new MyFolderPage();
		try {
			myFold.renameBtnExist();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 12)
	public void tc_myFoldr_012_verify_Edit_Folder_CloseBtn() {
		myFold = new MyFolderPage();
		try {
			myFold.editFolderClsBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 13)
	public void tc_myFoldr_013_verify_Delete_Folder_CardHeading() {
		myFold = new MyFolderPage();
		try {
			Assert.assertTrue(myFold.deleteBtnHeading());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 14)
	public void tc_myFoldr_014_Check_Confirmation_Message() {
		myFold = new MyFolderPage();
		try {
			myFold.deleteBtnConfirmationMssg();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 15)
	public void tc_myFoldr_015_Check_DeleteFolder_CardUI() {
		myFold = new MyFolderPage();
		try {
			myFold.deleteBtnCardUI();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 16)
	public void tc_myFoldr_016_Check_DeleteFolder_CloseBtn() {
		myFold = new MyFolderPage();
		try {
			myFold.deleteBtnClsBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 17)
	public void tc_myFoldr_017_verify_DeleteFolder_CancleBtn() {
		myFold = new MyFolderPage();
		try {
			myFold.deleteBtnCnclBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 18)
	public void tc_myFoldr_018_verify_DeleteFolder_OkBtn() {
		myFold = new MyFolderPage();
		try {
			myFold.deleteBtnOKBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 19)
	public void tc_myFoldr_019_verify_FolderExistance() {
		myFold = new MyFolderPage();
		try {
			myFold.folderExistance();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 20)
	public void tc_myFoldr_020_verify_MyFolder_UI() {
		myFold = new MyFolderPage();
		try {
			myFold.myFolderUI();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
