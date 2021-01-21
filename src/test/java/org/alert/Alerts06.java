package org.alert;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts06 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Selenium-Robot\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://retail.onlinesbi.com/retail/login.htm");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//a[@class='login_button'])[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@id='Button2'])[1]")).click();
		
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		
		Thread.sleep(2000);
		a.accept();

	}
}