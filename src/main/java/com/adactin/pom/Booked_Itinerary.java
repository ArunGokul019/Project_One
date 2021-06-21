package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Itinerary {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement checkBox;
	
	@FindBy(xpath = "//input[@id='logout']")
	private WebElement logOut;

	public Booked_Itinerary(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getLogOut() {
		return logOut;
	}


}
