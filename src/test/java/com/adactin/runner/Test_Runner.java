package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src//test//java//com//adactin//feature", glue = "com.adactin.stepdefinition",
monochrome =true,
dryRun = false,
strict = true,
tags = ("@SmokeTest , @SanityTest"),
plugin = {
		"html:Report/HTML_Report",
		"pretty",
		"json:Report/CucumberJSON_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html"
})
public class Test_Runner {
	public static WebDriver driver; //Null driver
	
	@BeforeClass
	public static void set_Up() throws Throwable {
		
		String browser = File_Reader_Manager.getinstance().getinstanceCR().get_Browser();
		driver = BaseClass.browserLaunch(browser);
	}
	
	@AfterClass
	public static void tear_Down() {
		//BaseClass.closeAllTheWindows();
	}

}
