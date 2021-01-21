package org.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ff1Greenstechnologys {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\acer\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\geckodriver.exe" );
		WebDriver drivers=new FirefoxDriver();
		
		drivers.get("http://www.greenstechnologys.com/");
		
		
		}
}
