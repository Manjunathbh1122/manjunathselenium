package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/FeatureFile",
		glue = "step")
public class TestRunner  extends AbstractTestNGCucumberTests{

}
