
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SecureAreaPage;

public class NewTest {
	private WebDriver driver;

	@Test
	public void sampleTest() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");

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
}
