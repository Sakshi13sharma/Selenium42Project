package VerifyTestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Listener implements ITestListener{
 
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	System.out.print("Its called when any test starts ");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.print("Its called on sucess of any test  ");
	//	System.out.println("I successfully executed Listeners Pass code");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//screenshot code 
		//response if API is failed
		
		System.out.println("I failed executed Listeners Pass code" +result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.print("Its called on skipped any test  ");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.print("Its called each time the test fails but is wthin sucess percentage  ");
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.print("Its called when any test starts ");
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.print("Its called after all test are executed  ");
	}

}

