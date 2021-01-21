package org.gettext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText07 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com/");

		WebElement txtsearch = driver.findElement(By.xpath("//input[@name='q']"));
		txtsearch.sendKeys("greens velmurugan");
		
		Thread.sleep(3000);
		
		WebElement btnclk = driver.findElement(By.xpath("(//input[@value='Google Search'])[1]"));
		btnclk.click();

		WebElement txtclk = driver.findElement(By.xpath("(//h3[@class='LC20lb DKV0Md'])[1]"));
		txtclk.click();

	}
}
