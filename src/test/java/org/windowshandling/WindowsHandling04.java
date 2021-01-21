package org.windowshandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WindowsHandling04 {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Selenium-Robot\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/python-training.html");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='Curricu-accordiannn1']")).click();

//		String parId = driver.getWindowHandle();
//		Set<String> allWindows = driver.getWindowHandles();
//		System.out.println(allWindows);
//
//		for (String x : allWindows) {
//
//			if (!parId.equals(x)) {
//
//				driver.switchTo().window(x);
//			}
//			
//			
//		}

	}
}