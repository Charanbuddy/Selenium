package org.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ff12Facebook  {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\geckodriver.exe");
		WebDriver Driver = new FirefoxDriver();

		Driver.get("https://www.facebook.com/");

	}
}
