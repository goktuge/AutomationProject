package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@CucumberOptions(features={"src/test/Features"}
					,glue={"StepDefinitions","Utility"}
					,plugin = {"pretty", "html:target/cucumber"}
					, tags ={"@appium"},
		format={"pretty",
				"html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/CucumberTestReport.json",
				"rerun:target/cucumber-reports/re-run.txt"}
		)
@Test
public class RunTest extends AbstractTestNGCucumberTests {

}
