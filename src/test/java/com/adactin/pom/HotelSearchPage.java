package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelSearchPage {
	public static WebDriver driver;

	@FindBy(xpath = "//select[@id='location']")
	public WebElement location;

	@FindBy(xpath = "//select[@id='hotels']")
	public WebElement hotel;

	@FindBy(xpath = "//select[@id='room_type']")
	public WebElement roomtype;

	@FindBy(xpath = "//select[@id='room_nos']")
	public WebElement numberOfRooms;

	@FindBy(xpath = "//input[@name ='datepick_in']")
	public WebElement checkindate;

	@FindBy(xpath = "//input[@name ='datepick_out']")
	public WebElement checkout;

	@FindBy(xpath = "//select[@id = 'adult_room']")
	public WebElement adultsperroom;

	@FindBy(xpath = "//select[@id = 'child_room']")
	public WebElement childroom;

	@FindBy(xpath = "//input[@id ='Submit']")
	public WebElement Searchbutton;

	public HotelSearchPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNumberOfRooms() {
		return numberOfRooms;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultsperroom() {
		return adultsperroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSearchbutton() {
		return Searchbutton;
	}

}
