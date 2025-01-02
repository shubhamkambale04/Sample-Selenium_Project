package day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {

	public ExtentSparkReporter htmlReporter; // UI of the report
	public ExtentReports extent;             // populate some common info on the report
	public ExtentTest test;                  // creating test case entries in the report and update status of the test methods

	@Override
	public void onStart(ITestContext context) {

		// UI of the report
		String reportPath = "Reports/ProjectReport.html";
		htmlReporter = new ExtentSparkReporter(reportPath);
		
		htmlReporter.config().setDocumentTitle("Automation Testing Report"); // Title of the report
		htmlReporter.config().setReportName("Functional Testing");    // name of the report
		htmlReporter.config().setTheme(Theme.DARK);
		
		// populate common info on the report
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("Computer Name", "localhost");
		extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("Tester Name","Shubham");
		extent.setSystemInfo("OS","Windows10");
		extent.setSystemInfo("Browser Name","Chrome");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.PASS, "test passed:" +result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, "test failed:" +result.getName());
		test.log(Status.FAIL, "test failed:" +result.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.SKIP, "test skipped:" +result.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}

}
