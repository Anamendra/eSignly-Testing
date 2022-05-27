package com.esignlyNew.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import com.esignly.common.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseSetUp extends ActionMethod implements TimeOuts{

	public static WebDriver driver = null;
	public static Properties prop;

	public WebDriver getDriver() {
		return driver;
	}

	public BaseSetUp() {

		try {
			prop = new Properties(); // Need to create object of Properties class
			FileInputStream ip = new FileInputStream("D:\\ws\\E$ignlyNew\\ESignlyNew\\ConfigFiles\\Sys.properties");
			// You create object FileInputStream class, Give path of config.properties
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@BeforeMethod()
	public void beforeMethod(Method method) {
		try {
			String browserName = prop.getProperty("browser");

			if (browserName.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (browserName.equals("FF")) {
				// System.setProperty("webdriver.gecko.driver",
				// "D:\\work\\esignlyNew\\geckodriver.exe");
				WebDriverManager.firefoxdriver().setup();
				// driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
			

		} catch (Exception e) {

		}

	}

	/*
	 * Below method will kill driver
	 */
	@AfterMethod(alwaysRun = true)
	public void afterMethod() {

		if (BaseSetUp.driver != null) {
			BaseSetUp.driver.quit();
		}

	}

	@AfterSuite(alwaysRun = true)
	public void afterTestSuite() {
		afterMethod();
	}
}
