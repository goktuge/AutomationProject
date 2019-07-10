package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@CucumberOptions(features={"src/test/Features"}
					,glue={"StepDefinitions","Utility"}
					,plugin = {"pretty", "html:target/cucumber"}
					, tags ={"@appium"}
		)
@Test
public class RunTest extends AbstractTestNGCucumberTests {

}
