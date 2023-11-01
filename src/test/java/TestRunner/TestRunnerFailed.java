package TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
        features = {"@target/failedrerun.txt"},
        glue = {"StepDefs"},
        plugin = {
        		"rerun:target/failedrerun.txt", 
        		"html:test-output/Failed Test Report/DStvWeb.html",
        		"junit:test-output/Failed Test Report/DStvWeb.xml"
        		},
        monochrome = true,
        tags = ("@RegressionTest")
)

public class TestRunnerFailed extends AbstractTestNGCucumberTests{
	 @Override
	 @DataProvider(parallel = false)
	 public Object[][] scenarios() {
	     return super.scenarios();
	 }
}
