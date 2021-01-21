package org.actions;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions ab = new Actions(driver);
		driver.manage().window().maximize();
		driver.get(" https://www.homedepot.com/");

		WebElement ClkMouse = driver.findElement(By.xpath("(//a[@data-id='departmentsFlyout'])[1]"));
		ab.moveToElement(ClkMouse).perform();

		WebElement clkMouse2 = driver.findElement(By.xpath("(//a[@title='Heating & Cooling'])[1]"));
		ab.moveToElement(clkMouse2).perform();

		WebElement clkMouse3 = driver.findElement(By.xpath("(//a[@title='Air Conditioners'])[1]"));
		ab.moveToElement(clkMouse3).perform();
		
		WebElement clkMouse4 = driver.findElement(By.xpath("(//a[@title='Portable Air Conditioners'])[1]"));
		clkMouse4.click();
		
	}
}