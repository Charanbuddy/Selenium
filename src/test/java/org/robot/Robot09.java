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

public class Robot09 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Selenium-Robot\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		Actions ab = new Actions(driver);

		Thread.sleep(3000);

		WebElement clkLogin = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		ab.moveToElement(clkLogin).perform();
		
		WebElement sltLogin = driver.findElement(By.xpath("(//a[@data-nav-role='signin'])[1]"));
		sltLogin.click();
		
		WebElement txtUser = driver.findElement(By.xpath("//input[@id='ap_email']"));
		txtUser.sendKeys("charanbuddy@gmail.com");
		ab.moveToElement(txtUser).perform();
		
		Robot r=new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		ab.contextClick(txtUser).perform();


		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	}