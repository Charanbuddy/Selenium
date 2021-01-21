package org.actions;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions03 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions ab = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");

		WebElement ClkClose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		ClkClose.click();

		Thread.sleep(3000);

		WebElement mseOverHf = driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[6]"));
		ab.moveToElement(mseOverHf).perform();

		Thread.sleep(3000);

		WebElement mseOver2 = driver.findElement(By.xpath("//a[text()='Bath Towels'][1]"));
		mseOver2.click();
		WebElement mseClick = driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[3]"));
		mseClick.click();

		Thread.sleep(2000);

		WebElement txtPrint = driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[3]"));
		String t = txtPrint.getAttribute("title");
		System.out.println(t);

	}
}