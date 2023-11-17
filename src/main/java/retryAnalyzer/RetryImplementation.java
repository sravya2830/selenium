package retryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryImplementation implements IRetryAnalyzer {

	
		int count;
		int maxRetries = 3;
		

	

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(count < maxRetries) {
			count++;
			return true;
			
		}
		return false;
	}

}
