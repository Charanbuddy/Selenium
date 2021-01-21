package org.gettext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText06 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("charanbuddy");

		String t = txtuser.getAttribute("value");
		System.out.println(t);

		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("1234567890");

		System.out.println(txtPass.getAttribute("value"));

	}
}
