package org.actions;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions15 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions ab = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		WebElement ClkMouse1 = driver.findElement(By.xpath("(//a[@id='nav-link-accountList'])[1]"));
		ab.moveToElement(ClkMouse1).perform();

		WebElement ClkMouse = driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"));
		ClkMouse.click();

		Thread.sleep(3000);

		WebElement txtUserName = driver.findElement(By.xpath("//input[@id='ap_email']"));
		txtUserName.sendKeys("charanbuddy@gmail.com");
		WebElement txtCtnue = driver.findElement(By.xpath("//input[@id='continue']"));
		txtCtnue.click();

		WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
		txtPassword.sendKeys("123456789");

		WebElement clkLogin = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		clkLogin.click();
				
	}
}