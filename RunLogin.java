package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/java/features"} , glue = "steps", monochrome = true)
public class RunLogin extends AbstractTestNGCucumberTests{

}
