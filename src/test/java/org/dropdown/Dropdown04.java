package org.dropdown;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown04 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Selenium-Robot\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement clkNewAccout = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		clkNewAccout.click();

		Thread.sleep(3000);

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s = new Select(month);

		List<WebElement> mnthList = s.getOptions();

		for (WebElement mnthFullList : mnthList) {

			String t = mnthFullList.getText();
			System.out.println(t);

		}

	}
}