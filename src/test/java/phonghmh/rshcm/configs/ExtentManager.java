package phonghmh.rshcm.configs;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	private static ExtentReports extent;  
    private static ExtentTest logger;  

    public static ExtentReports createInstance(String fileName) {  
    	
    	String dir = System.getProperty("user.dir") + "\\custom-reports\\" + fileName;
    	
    	ExtentSparkReporter htmlReporter = new ExtentSparkReporter(dir);
        htmlReporter.config().setDocumentTitle("Automation Test Reports");
        htmlReporter.config().setReportName("Automation Test Results");  
        htmlReporter.config().setTheme(Theme.DARK); 

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        return extent;
    }  

    public static ExtentTest createTest(String testName, String testDescription) {
        logger = extent.createTest(testName, testDescription);
        return logger;
    }
}
