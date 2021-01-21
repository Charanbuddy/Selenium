package org.gettext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		WebElement closeClick = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closeClick.click();

		WebElement txtSrch = driver.findElement(By.xpath("//input[@name='q']"));
		txtSrch.sendKeys("redmi note 9");

		WebElement clkSrch = driver.findElement(By.xpath("//button[@type='submit']"));
		clkSrch.click();

		Thread.sleep(3000);

		WebElement clkSrch1 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
		clkSrch1.click();

	}
}
