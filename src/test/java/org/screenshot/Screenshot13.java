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


public class Screenshot13 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Selenium-Robot\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(3000);

		WebElement txtSearch = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		js.executeScript("arguments[0].setAttribute('value','HP Laptop')", txtSearch);

		
		WebElement clkSearch = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		js.executeScript("arguments[0].click()", clkSearch);
		js.executeScript("arguments[0].click()", clkSearch);
		js.executeScript("arguments[0].click()", clkSearch);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(
				"D:\\desktop files\\Green Technologies\\Selenium Workouts\\Day7 - Task - Screenshots\\screenshots\\SS13.jpg");
		FileUtils.copyFile(src, des);
	}
}