package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement selectRadioButton;

	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continueButton;
	
	public Select_Hotel(WebDriver Cdriver) {
		this.driver = Cdriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelectRadioButton() {
		return selectRadioButton;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

}
