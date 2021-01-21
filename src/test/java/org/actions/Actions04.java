package org.actions;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions04 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions ab = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://www.shopclues.com/wholesale.html");

		Thread.sleep(2000);

		WebElement ClkMouse = driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
		ab.moveToElement(ClkMouse).perform();

		WebElement txtPhone = driver.findElement(By
				.xpath("//a[@alt='Home|CT3P1|Mobiles & |NA|Smartphones & Tablet|NA|NA|NA|CT@Smartphones & Tablets']"));
		txtPhone.click();

	}
}