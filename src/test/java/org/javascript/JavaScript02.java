package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScript02 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Selenium-Robot\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/");
		driver.manage().window().maximize();
		
		WebElement clkClose = driver.findElement(By.xpath("//a[@id='cookie_action_close_header']"));
		clkClose.click();

		WebElement scrollDown = driver.findElement(By.xpath("//a[@title='Facebook']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);

		Thread.sleep(2000);

		WebElement scrollUp = driver.findElement(By.xpath("(//span[text()='HOME'])[1]"));

		js.executeScript("arguments[0].scrollIntoView(true)", scrollUp);

	}
}
