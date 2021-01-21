package org.gettext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		WebElement txtUser = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		txtUser.click();
		
		Thread.sleep(2000);
		
		WebElement txtUser1 = driver.findElement(By.xpath("(//div[@class='IiD88i _351hSN'])[1]"));
		txtUser1.sendKeys("charanbuddy");

	}
}
