package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.login_page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login_test {
	WebDriver driver;
	login_page lp;

	@BeforeTest
	public void setup() {
	 // Set the path to your ChromeDriver
    // Initialize the WebDriver
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://www.saucedemo.com/");
    driver.manage().window().maximize();
    lp = new login_page(driver);
	}
	 @Test(priority = 1, enabled = true)
	    public void testEmptyUsernamePassword() throws InterruptedException {
		 lp.EnterUsername("standard_user");
		 lp.EnterPassword("secret_sauce");
		 lp.ClickSubmitButton();
		 
	 }
	 @AfterTest
	 public void close() {
		 driver.close();
	 }
	 }
	 

