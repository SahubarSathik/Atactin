package com.webdriver_manager;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.constants.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	private static final Logger LOGGER = LogManager.getLogger(DriverManager.class);
	private static WebDriver driver = null;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void launchBrowser() {
		try {
			switch (Constants.BROWSER) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				LOGGER.info("Launching " + Constants.BROWSER);
				driver = new ChromeDriver();
				break;

			case "firefox":
				WebDriverManager.chromedriver().setup();
				LOGGER.info("Launching " + Constants.BROWSER);
				driver = new FirefoxDriver();
				break;
			case "edge":
				WebDriverManager.chromedriver().setup();
				LOGGER.info("Launching " + Constants.BROWSER);
				driver = new EdgeDriver();
				break;
			default:
				WebDriverManager.chromedriver().setup();
				LOGGER.info("Launching the default browser chrome");
				driver = new ChromeDriver();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
