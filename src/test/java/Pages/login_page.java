package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login_page {
	WebDriver driver;
	WebDriverWait wait;

	public login_page(WebDriver driver) {
		super();
		this.driver = driver;
	 wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			PageFactory.initElements(driver, this);
			
	}

	@FindBy(xpath="//input[@placeholder=\"Username\"]")
	WebElement Username;
	public void EnterUsername(String USN) {
	    wait.until(ExpectedConditions.visibilityOf(Username));
	    wait.until(ExpectedConditions.elementToBeClickable(Username));
	    Username.clear();
	    Username.sendKeys(USN);
	}

	
	@FindBy(xpath="//input[@placeholder=\"Password\"]")
	WebElement Password;
	public void EnterPassword(String PWD) {
	    wait.until(ExpectedConditions.visibilityOf(Password));
	    wait.until(ExpectedConditions.elementToBeClickable(Password));
	    Password.clear();
	    Password.sendKeys(PWD);
	}

	
	
@FindBy(xpath="//input[@id=\"login-button\"]")
	
	WebElement SubmitButton;

public void ClickSubmitButton(){
	  wait.until(ExpectedConditions.elementToBeClickable(SubmitButton));
	    SubmitButton.click();
}
	
}
