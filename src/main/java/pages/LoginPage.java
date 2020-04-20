package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	 WebDriver driver;
	 By usernameField = By.id("username");
	 By passwordField = By.id("password");
	 By loginButton = By.cssSelector("#login button");
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
		
	}
	
	public void setUsername(String username) {
		driver.findElement(usernameField).sendKeys(username);
	}
	public void setPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);

   }
	public SecureAreaPage ClickLoginButton() {
		driver.findElement(loginButton).click();
		return new SecureAreaPage(driver);
	}
	
}
