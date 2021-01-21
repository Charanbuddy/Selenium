package org.gettext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText08 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://adactinhotelapp.com/");

		WebElement txtUser = driver.findElement(By.xpath("//input[@id='username']"));
		txtUser.sendKeys("charanbuddy");
		System.out.println(txtUser.getAttribute("value"));

		WebElement txtpass = driver.findElement(By.xpath("//input[@name='password']"));
		txtpass.sendKeys("123456789");
 		System.out.println(txtpass.getAttribute("value"));

	}
}
