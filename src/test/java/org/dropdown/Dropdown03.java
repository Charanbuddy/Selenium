package org.dropdown;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown03 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Selenium-Robot\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement clkSignUp = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		clkSignUp.click();

		Thread.sleep(3000);
		WebElement year = driver.findElement(By.id("year"));
		Select s = new Select(year);

		List<WebElement> fullYear = s.getOptions();

		for (WebElement fulloption : fullYear) {
			String t = fulloption.getAttribute("value");
			System.out.println(t);
		}

	}
}