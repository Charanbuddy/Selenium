package org.gettext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.greenstechnologys.com ");

		WebElement txt = driver
				.findElement(By.xpath("//u[text()='Greens Technologys Software Training Centers in Chennai']"));
		System.out.println(txt.getText());

	}
}
