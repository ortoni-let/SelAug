package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
		features = "src/test/java/features/Story.feature",
		glue = {"steps", "myCucumberhooks"}, // where is our java code & mapped
		snippets =  SnippetType.CAMELCASE, // to get the code snippet in camel case
		monochrome = true, // to remove the junk chars
		//			plugin = {"pretty", "json:CucumberReports2"}, // report
		plugin = {"pretty", "html:CucumberReports"},
		dryRun = false// to get the code snippet
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
