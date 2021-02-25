package com.adactin.runner;

import java.sql.Driver;

import org.apache.commons.io.filefilter.TrueFileFilter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.BaseClass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\Adactin.feature",
					glue = "com\\adactin\\stepDefinition",
					monochrome = true,
					strict = true)

public class Runner {
		public static WebDriver driver;
		@BeforeClass
		public static void setUp () {
			
		driver = BaseClass.getBrowser("Chrome");
		}
}
