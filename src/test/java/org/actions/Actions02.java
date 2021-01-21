package org.actions;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions02 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions ab = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in");

		WebElement mseOver = driver.findElement(By.xpath("//a[@id='nav-link-prime']"));
		ab.moveToElement(mseOver).perform();

		Thread.sleep(3000);
		WebElement mseOver1 = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
		ab.moveToElement(mseOver1).perform();
		mseOver.click();

	}
}