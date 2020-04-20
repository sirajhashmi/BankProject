package login;

import base.BaseTests;

import pages.LoginPage;
import pages.SecureAreaPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

// extends BaseTests
public class LoginTests extends BaseTests{
	
	
	
	private WebDriver driver;
	@Test
		public void setUp() {
	 
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.get("https://the-internet.herokuapp.com/");
		
		//homePage = new HomePage(driver);
		
		WebElement inputsLink = driver.findElement(By.linkText("Form Authentication"));
		inputsLink.click();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUsername("tomsmith");
		loginPage.setPassword("SuperSecretPassword!");
		SecureAreaPage secureAreaPage = loginPage.ClickLoginButton();
		secureAreaPage.getAlertText();
		
		WebElement inputsLink2 = driver.findElement(By.linkText("Logout"));
		inputsLink2.click();
		
	
		
	}
	
	public static void main(String args []) {
		LoginTests test = new LoginTests();
		test.setUp();
	}

}
