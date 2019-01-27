package com.demo.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class K_LoginTest {

	public WebDriver driver;
	
	@BeforeMethod	 
	public void beforeMethod() {
	 
		// Create a new instance of the Firefox driver
		System.out.println("launching Chrome browser");
	
		System.setProperty("webdriver.chrome.driver",
				"..//Kemper//src//test//resources//Drivers//chromedriver.exe");
		
	    driver = new ChromeDriver();
	 
	      //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
	 
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	      //Launch the Online Store Website
	 
	    driver.get("https://www1int.kemper.com/agencyportal/");
	 
	  }
	 @Test	 
	 public void Login() throws Exception {
	 
	      // Enter Username on the element found by above desc.
	 
	      driver.findElement(By.name("USER")).sendKeys("B0032308");
	
	      // Enter Password on the element found by the above desc.
	 
	      driver.findElement(By.name("PASSWORD")).sendKeys("Kemper19!");
	 
	      // Now submit the form. WebDriver will find the form for us from the element
	 
	      driver.findElement(By.id("button")).click();
	 
	      // Print a Log In message to the screen
	 
	      System.out.println(" Login Successfully");
	 
	      Thread.sleep(10000);
	  }
	 
	 @AfterMethod	 
	 public void afterMethod() {
	 
		  // Close the driver	 
	      driver.quit();
	 
	  }
}
