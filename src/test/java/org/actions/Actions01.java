package org.actions;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions ab = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");

		Thread.sleep(1000);

		WebElement src = driver.findElement(By.xpath("//li[@id='credit2']"));
		WebElement des = driver.findElement(By.xpath("//ol[@id='bank']"));
		ab.dragAndDrop(src, des).perform();

		Thread.sleep(1000);

		WebElement src1 = driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
		WebElement des1 = driver.findElement(By.xpath("//ol[@id='amt7']"));
		ab.dragAndDrop(src1, des1).perform();

		Thread.sleep(1000);

		WebElement src2 = driver.findElement(By.xpath("//li[@id='credit1']"));
		WebElement des2 = driver.findElement(By.xpath("//ol[@id='loan']"));
		ab.dragAndDrop(src2, des2).perform();

		Thread.sleep(1000);

		WebElement src3 = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
		WebElement des3 = driver.findElement(By.xpath("//ol[@id='amt8']"));
		ab.dragAndDrop(src3, des3).perform();
		
	}
}