package phonghmh.rshcm.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import phonghmh.rshcm.pages.ExchangeHomePage;

public class ExchangeLoginTest extends TestBase {
	@Test
	public void init() throws Exception {

		// driver.get("https:// www.gmail.com");
		ExchangeHomePage loginpage = PageFactory.initElements(driver, ExchangeHomePage.class);

		loginpage.setEmail("testautoqc002@gmail.com");
		loginpage.setPassword("Test@12345");
		loginpage.clickOnLoginButton();
		
		Thread.sleep(10000);
	}
}
