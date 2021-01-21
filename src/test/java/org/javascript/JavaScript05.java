package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScript05 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Selenium-Robot\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();

		WebElement txtUser = driver.findElement(By.xpath("//input[@id='username']"));

		WebElement txtPassWord = driver.findElement(By.xpath("//input[@id='password']"));

		WebElement btnLogin = driver.findElement(By.xpath("//input[@id='login']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('value','charanbuddy@gmail.com')", txtUser);

		Thread.sleep(2000);

		js.executeScript("arguments[0].setAttribute('value','12345678')", txtPassWord);

		js.executeScript("arguments[0].click()", btnLogin);

	}
}
