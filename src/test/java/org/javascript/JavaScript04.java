package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScript04 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Selenium-Robot\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement txtUser = driver.findElement(By.xpath("//input[@id='email']"));

		WebElement txtPassWord = driver.findElement(By.xpath("//input[@id='pass']"));

		WebElement btnLogin = driver.findElement(By.xpath("//button[@name='login']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('value','charanbuddy@gmail.com')", txtUser);

		Thread.sleep(2000);

		js.executeScript("arguments[0].setAttribute('value','12345678')", txtPassWord);

		js.executeScript("arguments[0].click()", btnLogin);

	}
}
