package AppRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resourcess\\resources\\AppFeatures\\Loginsettings.feature"},
		glue = {"AppStepDef", "AppHooks"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/",
				"rerun:FailedTestCases/FailedTc.txt"
				}, monochrome = true,stepNotifications=true)

public class MyTestRunner {
	

}