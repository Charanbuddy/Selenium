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

public class WindowsHandling03 {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Selenium-Robot\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='headerSearch']")).sendKeys("Ceiling Fan");

		driver.findElement(By.xpath("//button[@id='headerSearchButton']")).click();

		driver.findElement(By.xpath(
				"(//span[text()='Kensgrove 72 in. LED Indoor/Outdoor Espresso Bronze Ceiling Fan with Remote Control'])[1]"))
				.click();

		String parId = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);

		for (String x : allWindows) {

			if (!parId.equals(x)) {

				driver.switchTo().window(x);
			}
			
			driver.findElement(By.xpath("(//button[@type='button'])[18]")).click();

		}

	}
}