package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty",
		"html:target/cucumber-reports" }, features = "./src/test/resources/features", glue = "step_definitions", dryRun = false, tags = "@Login_dataTable_withheadder")

public class CukesRunner {

}
