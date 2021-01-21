package org.dropdown;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown10 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Selenium-Robot\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("charanbuddy");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234567890");

		driver.findElement(By.xpath("//input[@name='login']")).click();

		Thread.sleep(3000);

		WebElement sltLocation = driver.findElement(By.xpath("//select[@name='location']"));
		Select s = new Select(sltLocation);
		List<WebElement> allOptions = s.getOptions();
		for (WebElement options : allOptions) {

			String t = options.getText();
			System.out.println(t);

		}

	}

}
