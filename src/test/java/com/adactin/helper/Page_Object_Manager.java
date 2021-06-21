package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.Book_Hotel;
import com.adactin.pom.Booked_Itinerary;
import com.adactin.pom.Booking_Confirmation;
import com.adactin.pom.Login_Page;
import com.adactin.pom.Search_Hotel;
import com.adactin.pom.Select_Hotel;

public class Page_Object_Manager {
	
	public WebDriver driver;
	
	private Login_Page login;
	private Search_Hotel search; 
	private Select_Hotel select;
	private Book_Hotel book;
	private Booked_Itinerary itinerary;
	private Booking_Confirmation confirmation ;
	
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public Login_Page get_Instance_Login() {
		
		login = new Login_Page(driver);
		return login;

	}
	
	public Search_Hotel get_Instance_Search() {
		search = new Search_Hotel(driver);
		return search;
	}
	
	public Select_Hotel get_Instance_Select() {
		select = new Select_Hotel(driver);
		return select;
	}
	
	public Book_Hotel get_Instance_Book() {
		book = new Book_Hotel(driver);
		return book;
	}
	
	public Booked_Itinerary get_Instance_Itinerary() {
		itinerary = new Booked_Itinerary(driver);
		return itinerary;
	}
	
	public Booking_Confirmation get_Instance_Confirm() {
	confirmation  = new Booking_Confirmation(driver);
	return confirmation;
	}
	
	
	
	
	
	
	
	
	
	

}
