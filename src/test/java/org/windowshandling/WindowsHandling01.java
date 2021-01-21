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

public class WindowsHandling01 {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Selenium-Robot\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone x");

		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();

		WebElement prtProduct = driver
				.findElement(By.xpath("//span[text()='Apple iPhone XR, 64GB, Red - For AT&T (Renewed)']"));
		Actions s = new Actions(driver);
		s.contextClick(prtProduct).perform();

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

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

		WebElement productPrice = driver.findElement(By.xpath("//span[@id='priceblock_ourprice']"));
		String ty = productPrice.getText();
		System.out.println(ty);

	}
}