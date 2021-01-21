package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScript06 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Selenium-Robot\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		WebElement clseClick = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));

		WebElement btnLogin = driver.findElement(By.xpath("(//div[@class='go_DOp _2errNR'])[1]"));

		WebElement txtUser = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));

		WebElement txtPassWord = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));

		WebElement btnLogin2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click()", clseClick);

		Thread.sleep(4000);

		js.executeScript("arguments[0].click()", btnLogin);

		js.executeScript("arguments[0].setAttribute('value','charanbuddy@gmail.com')", txtUser);

		js.executeScript("arguments[0].setAttribute('value','12345678')", txtPassWord);

		js.executeScript("arguments[0].click()", btnLogin2);

	}
}
