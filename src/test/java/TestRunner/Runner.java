package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = ".\\Features\\TextBoxFeature.feature",
		glue = "StepDefinitions",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty"}
		)

public class Runner extends AbstractTestNGCucumberTests{
}
