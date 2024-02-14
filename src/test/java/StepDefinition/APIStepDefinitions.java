package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

public class APIStepDefinitions {
	
	

	

	    private Response response;

	    @Given("^I make a GET request to \"([^\"]*)\"$")
	    public void iMakeAGetRequestTo(String url) {
	        response = RestAssured.get(url);
	    }

	    @Then("^the response status code should be (\\d+)$")
	    public void theResponseStatusCodeShouldBe(int expectedStatusCode) {
	        int actualStatusCode = response.getStatusCode();
	        Assert.assertEquals(expectedStatusCode, actualStatusCode);
	    }

	    @Then("^the response body should not be empty$")
	    public void theResponseBodyShouldNotBeEmpty() {
	        String responseBody = response.getBody().asString();
	        Assert.assertFalse(responseBody.isEmpty());
	    }
	}


