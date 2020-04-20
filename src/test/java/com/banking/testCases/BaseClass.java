package com.banking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseURL = "http://demo.guru99.com/V1/index.php/";
	public String username = "mngr256662";
	public String password = "agujYtu";
	public static WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
	}
	
	@AfterClass
	

	public void tearDown()
	{
		driver.quit();
	}
	

}
