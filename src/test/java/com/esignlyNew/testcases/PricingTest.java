package com.esignlyNew.testcases;

import org.testng.annotations.Test;

import com.esignlyNew.pages.PricingPage;

public class PricingTest extends PricingPage {

	PricingPage price;

	public PricingTest() {
		super(); // Need to create constructor to intilaze properties file
	}

	@Test(priority = 1)
	public void tc_pricing_001_verify_Pricing_Url() {
		price = new PricingPage();
		try {
			price.pricingUrl();
			needToWait(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 2)
	public void tc_pricing_002_verify_Pricing_MonthlyTab() {
		price = new PricingPage();
		try {
			price.monthlyTab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 3)
	public void tc_pricing_003_verify_Pricing_YearlyTab() {
		price = new PricingPage();
		try {
			price.yearlyTab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 4)
	public void tc_pricing_004_verify_Pricing_FreeTrialBtn_ViewCardDetails() {
		price = new PricingPage();
		try {
			price.viewCardDetails();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 5)
	public void tc_pricing_005_verify_Pricing_FreeTrial_CardDetailsUI() {
		price = new PricingPage();
		try {
			price.freeTrialCardDetailsUI();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 6)
	public void tc_pricing_006_verify_Pricing_FreeTrial_ChangeDetailsLink() {
		price = new PricingPage();
		try {
			price.changeDetailsLink();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 16)
	public void tc_pricing_016_verify_NeedApiPricingBtn() {
		price = new PricingPage();
		try {
			price.needApiPricingBtn();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 17)
	public void tc_pricing_017_verify_PricingFAQ_Dropdown() {
		price = new PricingPage();
		try {
			price.pricingFaq();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 18)
	public void tc_pricing_018_verify_GeneralFAQ_Dropdown() {
		price = new PricingPage();
		try {
			price.generalFaq();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 19)
	public void tc_pricing_019_verify_FeaturesPageLink() {
		price = new PricingPage();
		try {
			price.featuresLink();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 20)
	public void tc_pricing_020_verify_eSignlyAPIPricingLink() {
		price = new PricingPage();
		try {
			price.apiPricingLink();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 21)
	public void tc_pricing_021_verify_LetsTalkLink() {
		price = new PricingPage();
		try {
			price.letsTalkLink();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 22)
	public void tc_pricing_022_verify_PricingUI() {
		price = new PricingPage();
		try {
			price.accountPricingUI();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 23)
	public void tc_apipricing_023_verify_ApiPricing_Url() {
		price = new PricingPage();
		try {
			price.apiPricingUrl();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 24)
	public void tc_apipricing_024_verify_ApiPricing_MonthlyTab() {
		price = new PricingPage();
		try {
			price.apiMonthlyTab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 25)
	public void tc_apipricing_024_verify_ApiPricing_YearlyTab() {
		price = new PricingPage();
		try {
			price.apiYearlyTab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 26)
	public void tc_apipricing_026_verify_ApiPricing_StartNowBtn_ViewCardDetails() {
		price = new PricingPage();
		try {
			price.apiViewCardDetails();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 27)
	public void tc_apipricing_027_verify_ApiPricing_StartNowBtn_CardDetailsUI() {
		price = new PricingPage();
		try {
			price.apiViewCardDetailsUI();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 28)
	public void tc_apipricing_028_verify_ApiPricing_StartNowBtn_ChangeDetailsLink() {
		price = new PricingPage();
		try {
			price.apiChangeCardDetailsLink();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 29)
	public void tc_apipricing_029_verify_ApiPricing_StartNowBtn_ValidateLink() {
		price = new PricingPage();
		try {
			price.apiValidateLink();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 30)
	public void tc_apipricing_030_verify_ApiPricing_StartNowBtn_InvalidCouponCode() {
		price = new PricingPage();
		try {
			price.apiValidateInvalidCouponCode();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 31)
	public void tc_apipricing_031_verify_ApiPricing_StartNowBtn_ValidCouponCode() {
		price = new PricingPage();
		try {
			price.apiValidCouponCode();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 32)
	public void tc_apipricing_032_verify_ApiPricing_StartNowBtn_ViewAllPlans() {
		price = new PricingPage();
		try {
			price.apiViewAllPlansLink();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 33)
	public void tc_apipricing_033_verify_ApiPricing_StartNowBtn_SamePlan() {
		price = new PricingPage();
		try {
			price.apiSamePlanMessage();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 34)
	public void tc_apipricing_034_verify_ApiPricing_UpgradePlan() {
		price = new PricingPage();
		try {
			price.apiUpgradePlan();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 35)
	public void tc_apipricing_035_verify_ApiPricing_DowngradePlan() {
		price = new PricingPage();
		try {
			price.apiDowngradePlan();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 36)
	public void tc_apipricing_036_verify_ApiPricing_EnterpriseTeam_ContactUsBtn() {
		price = new PricingPage();
		try {
			price.apiEnterpriseTeamContactUs();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 37)
	public void tc_apipricing_037_verify_NeedPricingBtn() {
		price = new PricingPage();
		try {
			price.accountPricing();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 38)
	public void tc_apipricing_038_verify_ApiPricingUI() {
		price = new PricingPage();
		try {
			price.apiPricingUI();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
