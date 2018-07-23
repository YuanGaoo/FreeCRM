package com.FreeCRM.CukeRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//tags = "@temp", 
		features = "src/test/resources/com/FreeCRM/Features/tagging.feature", 
		glue = "com/FreeCRM/step_Difinitions", 
		plugin = {
		"pretty", "html:HTML-test-output", "json:JSON-test-output",
		"junit:junit-test-output" }, 
		monochrome = true,
		strict = true
		,dryRun = true
		,tags= {"@RegressionTest"}

)

public class cukeRunners {

}
