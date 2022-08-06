package com.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	private static LoginPage loginInstance;

	private LoginPage() {
	}

	public static LoginPage getInstance() {
		if (loginInstance == null) {
			loginInstance = new LoginPage();

		}
		return loginInstance;

	}

	@FindBy(id = "username")
	private WebElement USERNAME;
	@FindBy(id = "password")
	private WebElement PASSWORD;
	@FindBy(id = "login")
	private WebElement LOGIN_BUTTON;

//	public WebElement getUSERNAME() {
//		return USERNAME;
//	}
//
//	public WebElement getPASSWORD() {
//		return PASSWORD;
//	}
//
//	public WebElement getLOGIN_BUTTON() {
//		return LOGIN_BUTTON;
//	}

	public void enterUserName(String username) {
		USERNAME.sendKeys(username);
	}

	public void enterPassword(String password) {
		PASSWORD.sendKeys(password);
	}

	public void clickLoginButton() {
		LOGIN_BUTTON.click();
	}

}
