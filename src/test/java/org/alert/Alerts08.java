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

public class Alerts08 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Selenium-Robot\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				" https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().window().maximize();

		
		WebElement txtUserId = driver.findElement(By.xpath("//input[@name='DUMMY1']"));
		txtUserId.sendKeys("Greens");
		String s = txtUserId.getAttribute("value");
		System.out.println(s);
		
		
		WebElement goAheadClick = driver.findElement(By.id("user-id-goahead"));
		goAheadClick.click();
		
	
		Thread.sleep(2000);

		WebElement txtPassword = driver.findElement(By.xpath("(//input[@type='password'])[4]"));
		txtPassword.sendKeys("123456789");
		String y = txtPassword.getAttribute("value");
		System.out.println(y);
		

		WebElement clkContinue = driver.findElement(By.xpath("(//input[@type='Submit'])[1]"));
		clkContinue.click();

		Alert a=driver.switchTo().alert();
		a.accept();
		
	}
}