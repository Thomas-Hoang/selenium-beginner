package phonghmh.rshcm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Using FindBy for locating elements
	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	WebElement username;

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	WebElement password;
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	WebElement loginButton;

	// Defining all the user actions (Methods)
	// This method is to set Email in the email text box
	public void enterUsername(String strUsername) {
		username.sendKeys(strUsername);
	}

	// This method is to set Password in the password text box
	public void enterPassword(String strPassword) {
		password.sendKeys(strPassword);
	}

	// This method is to click on Login Button
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public void login (String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickOnLoginButton();
	}
	
	
}
