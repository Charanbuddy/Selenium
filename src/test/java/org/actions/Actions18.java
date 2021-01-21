package org.actions;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions18 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions ab = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		WebElement clkClose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clkClose.click();
		
		Thread.sleep(2000);

		WebElement ClkMouse1 = driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
		ab.moveToElement(ClkMouse1).perform();
		
		ClkMouse1.click();
		Thread.sleep(3000);

		WebElement ClkMouse = driver.findElement(By.xpath("//a[text()='Remote Control Toys']"));
		ab.moveToElement(ClkMouse).perform();
		ClkMouse.click();

	}
}