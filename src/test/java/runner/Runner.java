package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/test/java/feature"},
		glue = {"steps"}
				)
public class Runner extends AbstractTestNGCucumberTests{
	// 
	
	// modified by Santhosh
}