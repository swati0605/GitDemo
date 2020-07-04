package resources1;

import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	
	static ExtentReports extent;
	
	
	public static ExtentReports getReporterObject()
	{
	//extentReports,ExtentSparkReporter- its a helper which help extent report
			String path=System.getProperty("user.dir")+"\\reports\\index.html";
			ExtentSparkReporter reporter=new ExtentSparkReporter(path);
			reporter.config().setReportName("WebAutomation");
			reporter.config().setDocumentTitle("Test Results");
			 extent=new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("tester", "Swati");
			
			return extent;

}
}
