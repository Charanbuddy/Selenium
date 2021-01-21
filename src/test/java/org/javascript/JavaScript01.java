package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScript01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Selenium-Robot\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();

		WebElement txtSearch = driver.findElement(By.xpath("//input[@name='q']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','Iphone')", txtSearch);

		Thread.sleep(2000);
		
		WebElement clkSearch = driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click()", clkSearch);
		
		Thread.sleep(2000);

		WebElement printText = driver.findElement(By.xpath("(//div[@class='trainer-info'])[5]"));

		String s = printText.getText();

		System.out.println(s);

	}
}
