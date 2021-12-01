package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonHomePageValidations {

	private WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver","/Users/alejandrolam/Documents/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com.mx/");
		
	}
	
	@Test
	public void validateFooterElements() {
		
		driver.findElement(By.id("nav-logo-sprites"));
		
	}
	
}
