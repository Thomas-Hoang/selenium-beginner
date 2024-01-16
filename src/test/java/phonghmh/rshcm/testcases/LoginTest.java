package phonghmh.rshcm.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import phonghmh.rshcm.configs.ExtentManager;
import phonghmh.rshcm.configs.ScreenshotHandler;
import phonghmh.rshcm.pages.DashboardPage;
import phonghmh.rshcm.pages.LoginPage;

public class LoginTest extends TestBase {
	
    ExtentReports extent;  
    ExtentTest logger;  

    @BeforeTest
    public void setup() {  
        extent = ExtentManager.createInstance("extent.html");
    }
    
    @BeforeMethod
    public void setupMethod() {
    	 logger = ExtentManager.createTest("SampleTest", "This is a sample test case");
    }
	
	@Test
	@Parameters({"username", "password"})
	public void login(String username, String password) throws Exception {

		// driver.get("https:// www.gmail.com");
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.login(username, password);
		
		Thread.sleep(10000);
		
		String destination = ScreenshotHandler.capture(driver, "login");
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
		logger.pass("SampleTest is passed");
		logger.addScreenCaptureFromPath(destination);
		
	}
	
	@Test
	public void logout() throws Exception {
		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.logout();
		
		Thread.sleep(3000);
		
		String destination = ScreenshotHandler.capture(driver, "logout");

		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		logger.pass("SampleTest is passed");
		logger.addScreenCaptureFromPath(destination);
		
	}
	
    @AfterTest
    public void tearDown() {  
        extent.flush();
    }  
	
}
