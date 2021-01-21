package org.dropdown;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown06 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Selenium-Robot\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();

		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		Select s = new Select(country);

		List<WebElement> ts = s.getOptions();

		for (WebElement countryList : ts) {

			String text = countryList.getText();
			System.out.println(text);

		}

	}

}
