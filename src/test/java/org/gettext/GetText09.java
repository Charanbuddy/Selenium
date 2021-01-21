package org.gettext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText09 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.snapdeal.com/ ");

		WebElement txtSrch = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		txtSrch.sendKeys("redmin note 9 pro");

		WebElement txtPass = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		txtPass.click();
		
		Thread.sleep(3000);

		WebElement pinCode = driver.findElement(By.xpath("//input[@placeholder='Enter your pincode']"));
		pinCode.sendKeys("600100");

		WebElement pinClk = driver.findElement(By.xpath("//button[@class='pincode-check']"));
		pinClk.click();
		
		Thread.sleep(3000);

		WebElement imgClk = driver.findElement(By.xpath("(//div[@class='product-tuple-description '])[1]"));
		imgClk.click();

	}
}
