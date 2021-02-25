package com.adactin.stepDefinition;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;

import com.adactin.BaseClass.BaseClass;
import com.adactin.pom.LoginPage;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class LoginStepdefinition extends BaseClass{
	public static WebDriver driver = Runner.driver;
	LoginPage lp = new LoginPage(driver);

	
	@Given("^User launch the application$")
	public void user_launch_the_application() throws Throwable {
		
	    getUrl("https://adactinhotelapp.com/index.php");
	}

	@When("^User enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
	    InputToElements(lp.getUsername(), arg1);
	}

	@When("^User enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable {
	   InputToElements(lp.getPassword(), arg1);
	}

	@Then("^Verify the valid username and valid password$")
	public void verify_the_valid_username_and_valid_password() throws Throwable {
	   ClickOnElement(lp.login);
	}

}
