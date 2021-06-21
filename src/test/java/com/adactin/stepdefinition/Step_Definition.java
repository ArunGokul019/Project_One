package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.File_Reader_Manager;
import com.adactin.helper.Page_Object_Manager;
import com.adactin.pom.Book_Hotel;
import com.adactin.pom.Booked_Itinerary;
import com.adactin.pom.Booking_Confirmation;
import com.adactin.pom.Login_Page;
import com.adactin.pom.Search_Hotel;
import com.adactin.pom.Select_Hotel;
import com.adactin.runner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends BaseClass {
	
	public static WebDriver driver = Test_Runner.driver;
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url = File_Reader_Manager.getinstance().getinstanceCR().get_Url();
		getUrl(url);
	    
	}

	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String userName) throws Throwable {
		enterValues(pom.get_Instance_Login().getUserName(), userName);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String passWord) throws Throwable {
		enterValues(pom.get_Instance_Login().getPassWord(), passWord);
	}

	@Then("^user Click On The Login Button And It Navigate To Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page() throws Throwable {
	    clickOnElement(pom.get_Instance_Login().getLogin());
	}

	@When("^user Select The Location In The Location Dropdown$")
	public void user_Select_The_Location_In_The_Location_Dropdown() throws Throwable {
		selectDropDownByValues(pom.get_Instance_Search().getLocation(), "Brisbane");
		
	}

	@When("^user Select The Hotel In The Hotels Dropdown$")
	public void user_Select_The_Hotel_In_The_Hotels_Dropdown() throws Throwable {
	    selectDropDownByIndex(pom.get_Instance_Search().getHotels(), 1);
	}

	@When("^user Select The Room Type In The Room Type Dropdown$")
	public void user_Select_The_Room_Type_In_The_Room_Type_Dropdown() throws Throwable {
	    selectDropDownByValues(pom.get_Instance_Search().getRoomType(), "Standard");
	}

	@When("^user Select The Number Of Rooms In The Number Of Rooms Dropdown$")
	public void user_Select_The_Number_Of_Rooms_In_The_Number_Of_Rooms_Dropdown() throws Throwable {
	    selectDropDownByValues(pom.get_Instance_Search().getNumberOfRooms(), "3");
	}

	@When("^user Enter The Check In Date In The Check In Date Field$")
	public void user_Enter_The_Check_In_Date_In_The_Check_In_Date_Field() throws Throwable {
	    enterValues(pom.get_Instance_Search().getCheckInDate(), "18/06/2021");
	}

	@When("^user Enter The Check Out Date In The Check Out Date Field$")
	public void user_Enter_The_Check_Out_Date_In_The_Check_Out_Date_Field() throws Throwable {
	    enterValues(pom.get_Instance_Search().getCheckOutDate(), "20/06/2021");
	}

	@When("^user Select The Adults Per Room In The Adults Per Room Dropdown$")
	public void user_Select_The_Adults_Per_Room_In_The_Adults_Per_Room_Dropdown() throws Throwable {
	    selectDropDownByValues(pom.get_Instance_Search().getAdultsPerRoom(), "2");
	}

	@When("^user Select The Children Per Room In The Children Per Room Dropdown$")
	public void user_Select_The_Children_Per_Room_In_The_Children_Per_Room_Dropdown() throws Throwable {
	    selectDropDownByValues(pom.get_Instance_Search().getChildPerRoom(), "3");
	}

	@Then("^user Click On Search and Navigate To Select Hotel Page$")
	public void user_Click_On_Search_and_Navigate_To_Select_Hotel_Page() throws Throwable {
	    clickOnElement(pom.get_Instance_Search().getSearch());
	}

	@When("^user Click On Select Radio Button$")
	public void user_Click_On_Select_Radio_Button() throws Throwable {
	    clickOnElement(pom.get_Instance_Select().getSelectRadioButton());
	}

	@Then("^user Click On Continue Button And Navigate To Book Hotel Page$")
	public void user_Click_On_Continue_Button_And_Navigate_To_Book_Hotel_Page() throws Throwable {
	    clickOnElement(pom.get_Instance_Select().getContinueButton());
	}

	@When("^user Enter FirstName In FirstName Field$")
	public void user_Enter_FirstName_In_FirstName_Field() throws Throwable {
		implicitWait("5");
		enterValues(pom.get_Instance_Book().getFirstName(), "Arun");
	   
	}

	@When("^user Enter LastName In LastName Field$")
	public void user_Enter_LastName_In_LastName_Field() throws Throwable {
	    enterValues(pom.get_Instance_Book().getLastName(), "Gokul");
	}

	@When("^user Enter Address In Billing Address Field$")
	public void user_Enter_Address_In_Billing_Address_Field() throws Throwable {
	    enterValues(pom.get_Instance_Book().getBillingAddress(), "204 North Street,4130");
	}

	@When("^user Enter Card Number In Credit Card Field$")
	public void user_Enter_Card_Number_In_Credit_Card_Field() throws Throwable {
		String card_Number = File_Reader_Manager.getinstance().getinstanceCR().card_Number();
	    enterValues(pom.get_Instance_Book().getCardNumber(), card_Number);
	}

	@When("^User Select Card Type In Credit Card Type Field$")
	public void user_Select_Card_Type_In_Credit_Card_Type_Field() throws Throwable {
		selectDropDownByValues(pom.get_Instance_Book().getCardType(), "VISA");
	}

	@When("^user Select Month In Expiry Month Dropdown$")
	public void user_Select_Month_In_Expiry_Month_Dropdown() throws Throwable {
		String expiry_Month = File_Reader_Manager.getinstance().getinstanceCR().expiry_Month();
		selectDropDownByValues(pom.get_Instance_Book().getExpiryMonth(), expiry_Month);
	}

	@When("^user Select Year In Expiry Year Dropdown$")
	public void user_Select_Year_In_Expiry_Year_Dropdown() throws Throwable {
		String expiry_Year = File_Reader_Manager.getinstance().getinstanceCR().expiry_Year();
		selectDropDownByValues(pom.get_Instance_Book().getExpiryYear(), expiry_Year);
	}

	@When("^user Enter Cvv In Cvv Number Field$")
	public void user_Enter_Cvv_In_Cvv_Number_Field() throws Throwable {
		String cvv = File_Reader_Manager.getinstance().getinstanceCR().cvv();
	    enterValues(pom.get_Instance_Book().getCvvNumber(), cvv);
	}

	@Then("^user Click Booknow Button and Navigate To Booking Confirmation Page$")
	public void user_Click_Booknow_Button_and_Navigate_To_Booking_Confirmation_Page() throws Throwable {
	    clickOnElement(pom.get_Instance_Book().getBookNow());
	}	
	
	
	

	@Then("^user Click On MyItinerary And Navigate To Booked Itinerary Page$")
	public void user_Click_On_MyItinerary_And_Navigate_To_Booked_Itinerary_Page() throws Throwable {
	    scroll(pom.get_Instance_Confirm().getMyItinerary());
		clickOnElement(pom.get_Instance_Confirm().getMyItinerary());
	    
	}

	@Then("^user Click On Logout$")
	public void user_Click_On_Logout() throws Throwable {
		clickOnElement(pom.get_Instance_Itinerary().getLogOut());
	    
	}

	


}
