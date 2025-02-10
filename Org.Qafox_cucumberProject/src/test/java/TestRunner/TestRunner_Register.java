package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FeaturesFile", glue = "StepDefinition", tags= "@regressionTest",dryRun = false, monochrome = true, plugin = {
		"pretty", "html:target/CucumberReports/CucumberReport.html" }

)
public class TestRunner_Register {

}
