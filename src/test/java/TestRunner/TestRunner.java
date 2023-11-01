package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"StepDefs"},
        plugin = {
        		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
        		"rerun:target/failedrerun.txt"
        		},
        monochrome = true,
        tags = ("@RegressionTest")
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
