package phonghmh.rshcm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {
	
	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//span[@class='oxd-userdropdown-tab']//p[@class='oxd-userdropdown-name']")
	private WebElement userDropdown;

	@FindBy(how = How.XPATH, using = "//a[@href='#'][text()='About']")
	private WebElement about;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/web/index.php/help/support'][text()='Support']")
	private WebElement support;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/web/index.php/pim/updatePassword'][text()='Change Password']")
	private WebElement changePassword;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/web/index.php/auth/logout']")
	private WebElement logout;
	
	//methods
	private void clickDropdownUser() {
		userDropdown.click();
	}
	
	private void clickAbout() {
		about.click();
	}
	
	private void clickSupport() {
		support.click();
	}
	
	private void clickChangePassword() {
		changePassword.click();
	}
	
	private void clickLogout() {
		logout.click();
	}
		
	public void openAboutPage() {
		clickDropdownUser();
		clickAbout();
	}
	
	public void openSupportPage() {
		clickDropdownUser();
		clickSupport();
	}
	
	public void openChangePasswordPage() {
		clickDropdownUser();
		clickChangePassword();
	}
	
	public void logout() {
		clickDropdownUser();
		clickLogout();
	}
	
}
