package com.demo.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class K_AutoTest {

	public WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {

		// Create a new instance of the Firefox driver
		System.out.println("launching Chrome browser");

		System.setProperty("webdriver.chrome.driver", "..//Kemper//src//test//resources//Drivers//chromedriver.exe");

		driver = new ChromeDriver();

		// Put a Implicit wait, this means that any search for elements on the
		// page could take the time the implicit wait is set for before throwing
		// exception

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launch the Online Store Website

		driver.get("https://learn.letskodeit.com/p/practice");

	}

	@Test
	public void Login() throws Exception {

		Thread.sleep(5000);

		driver.findElement(By.name("USER")).click();
		driver.findElement(By.name("USER")).clear();
		driver.findElement(By.name("USER")).sendKeys("qaqaqa");
		driver.findElement(By.name("PASSWORD")).clear();
		driver.findElement(By.name("PASSWORD")).sendKeys("qaqaqa");
		driver.findElement(By.id("button")).click();

		System.out.println(" Login Successfully");

		Thread.sleep(10000);

	}

	@AfterMethod
	public void afterMethod() {

		// Close the driver
		driver.quit();

	}
}
