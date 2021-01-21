package org.gettext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText05 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.greenstechnologys.com/");

		WebElement txtpara = driver.findElement(By.xpath("(//p[@style='text-align:justify; font-size:18px;'])[2]"));
		String t = txtpara.getText();
		System.out.println(t);
		

	}
}
