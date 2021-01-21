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

public class WindowsHandling02 {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Selenium-Robot\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//input[@name='keyword'])[1]")).sendKeys("redmi note 9 pro");

		driver.findElement(By.xpath("(//span[text()='Search'])[1]")).click();

		Thread.sleep(5000);
		WebElement prtProduct = driver
				.findElement(By.xpath("//p[text()='Redmi Note 9 Pro ( 128GB , 4 GB ) Aurora Blue']"));
		prtProduct.click();
		
		String parId = driver.getWindowHandle();
		System.out.println(parId);

		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);

		for (String x : allWindows) {

			if (!parId.equals(x)) {

				driver.switchTo().window(x);
			}

		}
		

		Thread.sleep(3000);

		WebElement addToCart = driver.findElement(By.xpath("//span[text()='add to cart']"));
		addToCart.click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='View Cart']")).click();
		
		Thread.sleep(3000);
		WebElement txtPrint = driver.findElement(By.xpath("//span[@class='rfloat']"));
		String t= txtPrint.getText();
		System.out.println(t);
		
	}
}