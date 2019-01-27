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
	 
	      driver.findElement(By.name("USER")).sendKeys("B0032308");
		 
	      driver.findElement(By.name("PASSWORD")).sendKeys("Kemper19!");
	 
	      driver.findElement(By.id("button")).click();
	 
	      System.out.println(" Login Successfully");
	 
	      Thread.sleep(10000);
	      
	      driver.findElement(By.id("menu-entry-get-started")).click();
	      Thread.sleep(20000);
	      driver.findElement(By.xpath("//*[@id='main-menu']/div/div[2]/ul[2]/li/ul/li[2]/a")).click();
	      Thread.sleep(20000);
	     
	      WebElement Producer = driver.findElement(By.id("AgencyProdCode"));
	      Select s=new Select(Producer);
	      List<WebElement> allvals = s.getOptions();
	      
	      for(int i=0;i<allvals.size();i++)
	      {
	       Thread.sleep(1000);
	       //System.out.println("CheckBox:"+ allvals.get(i).getAttribute("value"));
	       s.selectByIndex(i); //select one by one
	      }
	      
	  }
	 
	 @AfterMethod	 
	 public void afterMethod() {
	 
		  // Close the driver	 
	      driver.quit();
	 
	  }
}
