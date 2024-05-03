package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = {".//Features//TextBoxFeature.feature", 
				".//Features//CheckBoxFeature.feature", 
				".//Features//RadioButtonFeature.feature", 
				".//Features//WebTablesFeature.feature", 
				".//Features//ButtonsFeature.feature"},
		glue = "StepDefinitions",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:Reports/CucumberReports/HTMLReport.html", "json:Reports/CucumberReports/JSONReport.json", "junit:Reports/CucumberReports/XMLReport.xml"}
		)

public class Runner extends AbstractTestNGCucumberTests{
	
}