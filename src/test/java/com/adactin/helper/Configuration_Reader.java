package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p ;
	
	public  Configuration_Reader() throws Throwable{
		
		File f = new File("C:\\Users\\91999\\eclipse-workspace\\Adactin\\src\\test\\java\\com\\adactin\\properties\\Configuration.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		p.load(fis);
						
	}
	
	public String get_Browser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	
	public String get_Url() {
		String url = p.getProperty("url");
		return url;
	}
	
	public String card_Number() {
		String cardnumber = p.getProperty("cardnumber");
		return cardnumber;
	}
	
	public String expiry_Month() {
		String expirymonth = p.getProperty("expirymonth");
		return expirymonth;
	}
	
	public String expiry_Year() {
		String expiryyear = p.getProperty("expiryyear");
		return expiryyear;
	}
	
	public  String cvv() {
		String cvv = p.getProperty("cvv");
		return cvv;
	}
	
	
}
