package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/API.feature",
                 glue = "stepDefinitions")

public class TestRunner_API {
	
	
	

	
	}

