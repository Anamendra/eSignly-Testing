package com.esignlyNew.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.esignly.common.ActionMethod;

public class HelpPage extends DashboardPage {

	LoginPage login = new LoginPage();

	@FindBy(id = "help_menu_d")
	WebElement help;

	@FindBy(xpath = "/html[1]/body[1]/div[11]/div[2]/a[1]/span[1]")
	WebElement close;

	public void helpfunctionality() throws InterruptedException {
		login.validUserCredentials();
		needToImplicitWait(4);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,400)", "");

		WebElement elm = driver.findElement(By.xpath("//body/div[1]/div[2]/ul[1]/li[7]/a[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elm);
		help.click();
	}

	public void helpCloseBtn() throws InterruptedException {
		helpfunctionality();
		needToImplicitWait(2);
		close.click();
	}
}
