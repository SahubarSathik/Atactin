package com.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchHotelPage {

	private static SearchHotelPage SeatchHotelInstance;

	private SearchHotelPage() {
	}

	public static SearchHotelPage getInstance() {
		if (SeatchHotelInstance == null) {
			SeatchHotelInstance = new SearchHotelPage();

		}

		return SeatchHotelInstance;
	}

	@FindBy(id = "username_show")
	private WebElement LOGIN_NAME;
	@FindBy(id = "location")
	private WebElement LOCATION;
	@FindBy(id = "hotels")
	private WebElement HOLTELS;
	@FindBy(id = "room_type")
	private WebElement ROOM_TYPE;
	@FindBy(id = "room_nos")
	private WebElement NO_OF_ROOMS;
	@FindBy(id = "datepick_in")
	private WebElement CHECK_IN_DATE;
	@FindBy(id = "datepick_out")
	private WebElement CHECK_OUT_DATE;
	@FindBy(id = "adult_room")
	private WebElement ADULS_PER_ROOM;
	@FindBy(id = "child_room")
	private WebElement CHILDRENS_PER_ROOM;

	public void toSelect(WebElement refName, String text) {

		Select s = new Select(refName);
		s.selectByVisibleText(text);

	}

	public WebElement getLOGIN_NAME() {
		return LOGIN_NAME;
	}

	public WebElement getLOCATION() {
		return LOCATION;
	}

	public WebElement getHOLTELS() {
		return HOLTELS;
	}

	public WebElement getROOM_TYPE() {
		return ROOM_TYPE;
	}

	public WebElement getNO_OF_ROOMS() {
		return NO_OF_ROOMS;
	}

	public WebElement getCHECK_IN_DATE() {
		return CHECK_IN_DATE;
	}

	public WebElement getCHECK_OUT_DATE() {
		return CHECK_OUT_DATE;
	}

	public WebElement getADULS_PER_ROOM() {
		return ADULS_PER_ROOM;
	}

	public WebElement getCHILDRENS_PER_ROOM() {
		return CHILDRENS_PER_ROOM;
	}

}
