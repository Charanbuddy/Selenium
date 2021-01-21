package org.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ff14GreensTechnologys {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\acer\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\geckodriver.exe");		
				WebDriver driver=new FirefoxDriver();
				
				driver.get("http://greenstech.in/selenium-course-content.html");
				
		
		
	}
}
