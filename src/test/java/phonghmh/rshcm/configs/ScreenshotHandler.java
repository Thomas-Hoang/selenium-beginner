package phonghmh.rshcm.configs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotHandler {
		
	public static String capture (WebDriver driver, String screenShotName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir") + "\\images\\" + screenShotName + ".png";
		File destination = new File(dest);
		FileUtils.copyFile(source, destination);
		
		return dest;
	}
	
}
