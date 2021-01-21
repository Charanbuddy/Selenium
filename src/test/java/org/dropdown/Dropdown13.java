package org.dropdown;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown13 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Selenium-Robot\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();

		

		WebElement allFruits = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select s = new Select(allFruits);
		List<WebElement> allOptions = s.getOptions();
		s.selectByIndex(0);
		s.selectByValue("apple");
		s.selectByVisibleText("Orange");
		s.selectByValue("grape");
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String t = firstSelectedOption.getText();
		System.out.println(t);

		

	}

}
