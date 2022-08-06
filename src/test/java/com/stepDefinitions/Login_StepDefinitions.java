package com.stepDefinitions;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.constants.Constants;
import com.page_objects.LoginPage;
import com.page_objects.SearchHotelPage;
import com.webdriver_manager.DriverManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {
	

	private static final Logger LOGGER = LogManager.getLogger(Login_StepDefinitions.class);

	@Given("User login in the url on chrome browser")
	public void user_login_in_the_url_on_chrome_browser() {
		DriverManager.getDriver().get(Constants.APP_URL);
	}

	@When("User Enters the username and password")
	public void user_enters_the_username_and_password() {
		LoginPage.getInstance().enterUserName(Constants.USERNAME);
		LoginPage.getInstance().enterPassword(Constants.PASSWORD);
	}

	@When("User Click the Login Button")
	public void user_click_the_login_button() {
		LoginPage.getInstance().clickLoginButton();

	}

	@Then("User Verify that is him or not")
	public void user_verify_that_is_him_or_not() {
		String loginName = SearchHotelPage.getInstance().getLOGIN_NAME().getAttribute("value");
		Assert.assertEquals(loginName, "Hello sahubarsathik!");
		System.out.println(loginName);
	}
}
