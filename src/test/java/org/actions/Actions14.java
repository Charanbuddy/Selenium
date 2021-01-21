package org.actions;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions14 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions ab = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");

		WebElement ClkMouse = driver.findElement(By.xpath("//li[@navindex='7']"));
		//ab.moveToElement(ClkMouse).perform();

		WebElement clkMouse2 = driver.findElement(By.xpath("(//a[@data-index='1.1.10'])[7]"));
		ab.moveToElement(ClkMouse).moveToElement(clkMouse2).build().perform();

		Thread.sleep(2000);
		clkMouse2.click();

		Thread.sleep(2000);

		WebElement txtPincode = driver.findElement(By.xpath("(//input[@class='sd-input'])[2]"));
		txtPincode.sendKeys("600100");
		WebElement pinSearch = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		pinSearch.click();

		Thread.sleep(2000);

		WebElement clkMouse3 = driver.findElement(By.xpath("//div[text()='Heels']"));
		clkMouse3.click();

	}
}