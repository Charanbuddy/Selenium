package org.gettext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText02 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://greenstech.in/selenium-course-content.html");

		WebElement txtbtn = driver.findElement(By.xpath("//a[@id='home-tab']"));
		txtbtn.click();

		WebElement txtpara = driver.findElement(By.xpath("//p[contains(text(),'currently')]"));
		String t = txtpara.getText();
		System.out.println(t);

	}
}
