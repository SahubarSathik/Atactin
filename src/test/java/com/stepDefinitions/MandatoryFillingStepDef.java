package com.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MandatoryFillingStepDef {

	@When("User Enters the Following Credentials as {string} and \"Standard\"and \"{int} {double} Two\"and \"{int}\\/{int}\\/{int}\" and \"{int}\\/{int}\\/{int}\" and \"{int} - Two\"")
	public void user_enters_the_following_credentials_as_and_standard_and_two_and_and_and_two(String string,
			Integer int1, Double double1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6,
			Integer int7, Integer int8) {

	}

	@Then("User Click the Search Button")
	public void user_click_the_search_button() {

	}

	@Then("Check for hotel is Available or Not")
	public void check_for_hotel_is_available_or_not() {

	}
}
