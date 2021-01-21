package org.actions;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions05 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions ab = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://www.shopclues.com/wholesale.html");

		Thread.sleep(2000);

		WebElement ClkMouse = driver.findElement(By.xpath("//li[@id='nav_45']"));
		ab.moveToElement(ClkMouse).perform();

		Thread.sleep(2000);
		
		WebElement txtWeight = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		ab.moveToElement(txtWeight).perform();
		txtWeight.click();

	}
}