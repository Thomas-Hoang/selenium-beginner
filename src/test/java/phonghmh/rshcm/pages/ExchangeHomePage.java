package phonghmh.rshcm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ExchangeHomePage {
	WebDriver driver;

	public ExchangeHomePage(WebDriver driver) {
		this.driver = driver;
	}

	// Using FindBy for locating elements
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='email']")
	WebElement emailTextBox;

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='password']")
	WebElement passwordTextBox;
	
	@FindBy(how = How.XPATH, using = "//button[@type = 'submit' and starts-with(@class, 'login-btn')]")
	WebElement loginButton;

	// Defining all the user actions (Methods)
	// This method is to set Email in the email text box
	public void setEmail(String strEmail) {
		emailTextBox.sendKeys(strEmail);
	}

	// This method is to set Password in the password text box
	public void setPassword(String strPassword) {
		passwordTextBox.sendKeys(strPassword);
	}

	// This method is to click on Login Button
	public void clickOnLoginButton() {
		loginButton.click();
	}
}
