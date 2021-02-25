package com.adactin.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver getBrowser(String BrowserName) {
		try {
			if (BrowserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "F:\\code\\javaworkspace\\SeleniumConcepts\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			}else if (BrowserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "F:\\code\\javaworkspace\\SeleniumConcepts\\Driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver(); 
			}else {
				System.out.println("Invalis BrowserName");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	} 
	public static void getUrl(String Url) {
		try {
			driver.get(Url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void ClickOnElement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void InputToElements (WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void actionsClass (WebElement element) {
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void DropDownBox(WebElement element, String value, String option) {
		Select s = new Select(element);
		if (option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (option.equalsIgnoreCase("Index")) {
			s.selectByIndex(Integer.parseInt(value));
		} else if (option.equalsIgnoreCase("VisibleText")) {
			s.selectByVisibleText(value);
		}
	}
	public static void CleartoElement(WebElement element){
		element.clear();
	}
	
}
