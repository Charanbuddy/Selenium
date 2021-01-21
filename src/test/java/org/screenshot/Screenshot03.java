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

public class Screenshot03 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Selenium-Robot\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/");
		driver.manage().window().maximize();

		
		WebElement sclDown = driver.findElement(By.xpath("(//div[@class='blog-content wf-td'])[1]"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView('True')", sclDown);		
		
		
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);

		File des = new File(
				"D:\\desktop files\\Green Technologies\\Selenium Workouts\\Day7 - Task - Screenshots\\screenshots\\SS03.jpg");

		FileUtils.copyFile(src, des);
		
		
		WebElement printText = driver.findElement(By.xpath("(//span[text()='Selenium Training Benefit'])[1]"));
		String t = printText.getText();
		System.out.println(t);
	
	}

}

