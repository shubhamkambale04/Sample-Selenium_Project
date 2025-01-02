package day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


// method 1 implements ITestListener
// method 2 extends TestListenerAdapter

public class Listener implements ITestListener {

	@Override
	public void onStart(ITestContext context) {
		System.out.println("test class started");
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("test class finish");
	}
}
