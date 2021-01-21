package org.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshot09 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Selenium-Robot\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.flipkart.com/");
		driver.manage().window().maximize();

		WebElement closeClk = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", closeClk);

		Thread.sleep(3000);

		WebElement txtSearch = driver.findElement(By.xpath("//input[@type='text']"));
		js.executeScript("arguments[0].setAttribute('value','Iphone12')", txtSearch);

		Thread.sleep(2000);

		WebElement clkSearch = driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click()", clkSearch);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(
				"D:\\desktop files\\Green Technologies\\Selenium Workouts\\Day7 - Task - Screenshots\\screenshots\\SS09.jpg");
		FileUtils.copyFile(src, des);
	}
}