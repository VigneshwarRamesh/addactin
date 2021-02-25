package com.adactin.stepDefinition;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.BaseClass.BaseClass;
import com.adactin.pom.HotelSearchPage;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class SearchHotelStepDefinition extends BaseClass{
	public static WebDriver driver= Runner.driver;
	HotelSearchPage hs = new HotelSearchPage(driver);

	@Given("^User to ennte the search hotels details$")
	public void user_to_ennte_the_search_hotels_details() throws Throwable {
	}

	@When("^User to select the location as \"([^\"]*)\"$")
	public void user_to_select_the_location_as(String arg1) throws Throwable {
		DropDownBox(hs.getLocation(), "New York", "VisibleText");
	}

	@When("^User to select the hotel \"([^\"]*)\"$")
	public void user_to_select_the_hotel(String arg1) throws Throwable {
		DropDownBox(hs.getHotel(), "Hotel Sunshine", "VisibleText");
	}

	@When("^User to select the room type \"([^\"]*)\"$")
	public void user_to_select_the_room_typr(String arg1) throws Throwable {
	    DropDownBox(hs.getRoomtype(), "Double", "VisibleText");
	}

	@When("^User to enter the checkin date \"([^\"]*)\"$")
	public void user_to_enter_the_checkin_date(String arg1) throws Throwable {
		CleartoElement(hs.getCheckindate());
	   InputToElements(hs.getCheckindate(), arg1);
	}

	@When("^User to enter the checkout date \"([^\"]*)\"$")
	public void user_to_enter_the_checkout_date(String arg1) throws Throwable {
	   CleartoElement(hs.getCheckout());
	   InputToElements(hs.getCheckout(), arg1);
	}

	@When("^User to select adult per room \"([^\"]*)\"$")
	public void user_to_select_adult_per_room(String arg1) throws Throwable {
	   DropDownBox(hs.getAdultsperroom(), "1 - One", "VisibleText");
	}

	@When("^User to select chiid per room \"([^\"]*)\"$")
	public void user_to_select_chiid_per_room(String arg1) throws Throwable {
	    DropDownBox(hs.getChildroom(), "2 - Two", "VisibleText");
	}

	@Then("^User to verify the entered values and search$")
	public void user_to_verify_the_entered_values_and_search() throws Throwable {
		ClickOnElement(hs.getSearchbutton());
	   
	}
}
