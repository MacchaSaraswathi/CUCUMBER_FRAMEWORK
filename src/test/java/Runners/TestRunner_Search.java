package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Features", // Path to your feature files
    glue = "StepDefinition", // Package where your step definitions are located
    plugin = {"html:taget"}) // Optional: generate HTML reports


public class TestRunner_Search {
	
	}


