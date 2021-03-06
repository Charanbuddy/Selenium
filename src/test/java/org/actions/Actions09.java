package org.actions;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions09 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions ab = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");

		WebElement ClkMouse = driver.findElement(By.xpath("//div[@title='Courses']"));
		ab.moveToElement(ClkMouse).perform();

		WebElement clkMouse2 = driver.findElement(By.xpath("//div[@title='RPA']"));
		ab.moveToElement(clkMouse2).perform();

		WebElement clkMouse3 = driver.findElement(By.xpath("//span[text()='Blue Prism Certification Training']"));
		ab.moveToElement(clkMouse3).perform();

		clkMouse3.click();

	}
}