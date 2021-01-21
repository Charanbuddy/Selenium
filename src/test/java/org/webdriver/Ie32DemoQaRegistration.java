package org.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Ie32DemoQaRegistration {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\IEDriverServer.exe");
		WebDriver drivers = new InternetExplorerDriver();

		drivers.get("http://demo.automationtesting.in/Register.html");

	}
}

