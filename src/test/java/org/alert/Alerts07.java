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

public class Alerts07 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Selenium-Robot\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();

		WebElement frame = driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(frame);
		
		Thread.sleep(2000);
		
		WebElement txtUser = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		txtUser.sendKeys("charan123");
		
		WebElement clkContinue1 = driver.findElement(By.xpath("(//img[@alt='continue'])[1]"));
		clkContinue1.click();
		
		WebElement txtPass = driver.findElement(By.xpath("//input[@name='fldPassword']"));
		txtPass.sendKeys("123456789");
		
		WebElement clkContinue = driver.findElement(By.xpath("//img[@alt='Login']"));
		clkContinue.click();
		
		Alert a=driver.switchTo().alert();
		a.accept();
	}
}