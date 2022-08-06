package com.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.constants.Constants;
import com.utilities.CommonUtils;
import com.webdriver_manager.DriverManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Common_StepDefinitions {

	public static WebDriver driver;

	private static final Logger LOGGER = LogManager.getLogger(Common_StepDefinitions.class);

	@Before
	public void beforeScenario() {
//		LOGGER.info("Execution Started");
//		try {
//			LOGGER.info("Instantiation the CommonUtils");
//			CommonUtils commonUtils = new CommonUtils();
//			commonUtils.loadProperties();
//			LOGGER.info("Checking the Driver is NULL ot NOT?");
//			if (driver == null) {
//				LOGGER.info("Driver is NULL. Instantiatin it!");
//				DriverManager.launchBrowser();
//				commonUtils.initWebElements();
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

//	@After
//	public void afterScenario(Scenario s) {
//		if (s.isFailed()) {
//
//		}
//		driver.quit();
//	}

}
