package org.dropdown;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown07 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Selenium-Robot\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();

		WebElement txtFrstName = driver.findElement(By.xpath("//input[@name='firstName']"));
		txtFrstName.sendKeys("charan");

		WebElement txtLastName = driver.findElement(By.xpath("//input[@name='lastName']"));
		txtLastName.sendKeys("kumar");

		WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys("1234567890");

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("charanbuddy@gmail.com");

		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("pallikarnai");

		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("chennai");

		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("TamilNadu");

		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("600100");

		WebElement sltCountry = driver.findElement(By.xpath("//select[@name='country']"));

		Select s = new Select(sltCountry);
		s.selectByVisibleText("INDIA");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("charanbuddy@gmail.com");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234567890");

		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("1234567890");

		driver.findElement(By.xpath("//input[@name='submit']")).click();

	}

}
