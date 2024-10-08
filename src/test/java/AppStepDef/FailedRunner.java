package AppStepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/",
				"rerun:FailedTestCases/FailedTc.txt"}, features = {"@FailedTestCases/FailedTc.txt"},
				glue = {"AppStepDef", "AppHooks"}, monochrome = true,stepNotifications=true)

public class FailedRunner {

}
