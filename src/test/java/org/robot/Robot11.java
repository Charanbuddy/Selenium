package org.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

public class Robot11 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Selenium-Robot\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		Actions ab = new Actions(driver);
		Robot r = new Robot();

		Thread.sleep(3000);
		
		WebElement clickClose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clickClose.click();


		WebElement txtSearch = driver.findElement(By.xpath("//input[@name='q']"));
		txtSearch.sendKeys("redmi note 9 pro");
		WebElement clkSearch = driver.findElement(By.xpath("//button[@type='submit']"));
		clkSearch.click();
		
		Thread.sleep(3000);

		WebElement sltPhone = driver.findElement(By.xpath("(//div[text()='Redmi Note 9 Pro (Glacier White, 128 GB)'])[1]"));
		ab.moveToElement(sltPhone).perform();
		ab.contextClick(sltPhone).perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
}