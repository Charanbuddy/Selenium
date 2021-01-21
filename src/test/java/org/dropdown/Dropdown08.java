package org.dropdown;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown08 {

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
		s.selectByVisibleText("New York");

		WebElement sltHotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select s1 = new Select(sltHotel);
		s1.selectByVisibleText("Hotel Sunshine");

		WebElement roomType = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s5 = new Select(roomType);
		s5.selectByVisibleText("Double");

		WebElement numberRooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s2 = new Select(numberRooms);
		s2.selectByVisibleText("3 - Three");

		driver.findElement(By.xpath("//input[@name='datepick_in']")).sendKeys("23/12/2020");

		driver.findElement(By.xpath("//input[@name='datepick_out']")).sendKeys("28/12/2020");

		WebElement noOfpersonRoom = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select s3 = new Select(noOfpersonRoom);
		s3.selectByVisibleText("2 - Two");

		WebElement childRoom = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select s4 = new Select(childRoom);
		s4.selectByVisibleText("1 - One");

		driver.findElement(By.xpath("//input[@name='Submit']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("charan");

		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("kumar");

		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("America");

		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("6546768465461256");

		WebElement cardType = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select s6 = new Select(cardType);
		s6.selectByVisibleText("VISA");

		WebElement cardExpiry1 = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select s7 = new Select(cardExpiry1);
		s7.selectByVisibleText("April");

		WebElement cardExpiry2 = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select s8 = new Select(cardExpiry2);
		s8.selectByVisibleText("2022");

		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("456");

		driver.findElement(By.xpath("//input[@name='book_now']")).click();

		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.presenceOfElementLocated(By.id("order_no")));
		

		WebElement txtOrder = driver.findElement(By.id("order_no"));
		String t = txtOrder.getAttribute("value");
		System.out.println(t);

	}

}
