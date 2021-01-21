package org.gettext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.shopclues.com/wholesale.html");

		WebElement clckSrch = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		clckSrch.sendKeys("redmi note 9");

		WebElement clckSrch1 = driver.findElement(By.xpath("//a[@onclick='searchTrigger()']"));
		clckSrch1.click();

		WebElement selPhne = driver.findElement(By.xpath("(//div[@class='column col3 search_blocks'])[1]"));
		selPhne.click();

	}
}
