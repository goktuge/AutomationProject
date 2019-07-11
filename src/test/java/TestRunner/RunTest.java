package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@CucumberOptions(features={"src/test/Features"}
					,glue={"StepDefinitions","Utility"}
					,plugin = {"pretty", "html:target/cucumber"}
					, tags ={"@appium"},
		format={
				"html:target/cucumber/cucumber-pretty",
				"json:target/cucumber/CucumberTestReport.json",
				"rerun:target/cucumber/re-run.txt"}
		)
@Test
public class RunTest extends AbstractTestNGCucumberTests {

}
