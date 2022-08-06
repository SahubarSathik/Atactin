package com.utilities;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.constants.Constants;
import com.page_objects.LoginPage;
import com.page_objects.SearchHotelPage;
import com.webdriver_manager.DriverManager;

public class CommonUtils {

	public void loadProperties() {

		Properties properties = new Properties();
		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		Constants.APP_URL = properties.getProperty("APP_URL");
		Constants.BROWSER = properties.getProperty("BROWSER");
		Constants.USERNAME = properties.getProperty("USERNAME");
		Constants.PASSWORD = properties.getProperty("PASSWORD");

	}

	public void initWebElements() {
		PageFactory.initElements(DriverManager.getDriver(), LoginPage.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), SearchHotelPage.getInstance());
	}

}
