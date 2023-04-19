package utilsLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenersClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("test is started"+result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("test is succeeded "+result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("test is failed"+result.getMethod().getMethodName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("test is skipped"+result.getMethod().getMethodName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		System.out.println("test suite is started");
	}

	public void onFinish(ITestContext context) {
		System.out.println("test suite is ended");
	}

	
	
	
}
