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

public class Robot08 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Selenium-Robot\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		Actions ab = new Actions(driver);

		Thread.sleep(3000);

		WebElement clickClose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clickClose.click();

		Thread.sleep(3000);

		WebElement clkLogin = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		clkLogin.click();

		Thread.sleep(3000);

		WebElement txtLogin = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		txtLogin.sendKeys("email");
		Thread.sleep(2000);
		ab.moveToElement(txtLogin).perform();
		ab.doubleClick().perform();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}
}
