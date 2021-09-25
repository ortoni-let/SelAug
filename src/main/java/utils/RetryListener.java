package utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IAnnotationTransformer, IRetryAnalyzer{

	
	int maxRerun =1;
	@Override
	public boolean retry(ITestResult result) {
		if(maxRerun < 2) {
			maxRerun++;
			return true;
		}
		return false;
	}

	@Override
	public void transform(ITestAnnotation annotation, Class testClass,
			Constructor testConstructor, Method testMethod) {
		System.out.println("Name: "+testMethod.getName());
		String name = testMethod.getName();
		if(name.equals("myLoginTest")) {
//			annotation.setInvocationCount(2);
		}
		annotation.setRetryAnalyzer(this.getClass());
	}

}
