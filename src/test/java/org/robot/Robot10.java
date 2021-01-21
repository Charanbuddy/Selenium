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

public class Robot10 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Selenium-Robot\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/offers/quirky");
		driver.manage().window().maximize();

		Actions ab = new Actions(driver);
		Robot r = new Robot();

		Thread.sleep(3000);

		WebElement txtSearch = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		txtSearch.sendKeys("redmi note 9 pro");
		WebElement clkSearch = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		clkSearch.click();

		WebElement txtPincode = driver.findElement(By.xpath("//input[@class='sd-input']"));
		txtPincode.sendKeys("600100");

		WebElement txtPincode1 = driver.findElement(By.xpath("//button[@class='pincode-check']"));
		txtPincode1.click();
		
		Thread.sleep(3000);

		WebElement sltPhone = driver.findElement(By.xpath("//p[text()='Redmi Note 9 Pro ( 128GB , 4 GB ) Black']"));
		ab.moveToElement(sltPhone).perform();
		ab.contextClick(sltPhone).perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
}