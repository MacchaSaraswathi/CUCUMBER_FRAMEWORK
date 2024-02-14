package PageFactory;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SearchPage {

	    WebDriver driver;

	    @Given("I am on the search page")
	    public void i_am_on_the_search_page() {
	        // Set up WebDriver
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();
	        
	        // Navigate to the search page
	        driver.get("https://demowebshop.tricentis.com/search");
	    }

	    @When("I enter {string} in the search bar")
	    public void i_enter_in_the_search_bar(String query) {
	        // Enter search query
	        driver.findElement(By.id("small-searchterms")).sendKeys(query);
	    }

	    @When("I click on the search button")
	    public void i_click_on_the_search_button() {
	        // Click on the search button
	        driver.findElement(By.cssSelector("button[type='submit']")).click();
	    }

	    @Then("I should see search results for {string}")
	    public void i_should_see_search_results_for(String query) {
	        // Implement assertion for search results
	        boolean hasResults = !driver.findElements(By.className("product-item")).isEmpty();
	        assert(hasResults);
	        
	        // Close the browser after the test
	        driver.quit();
	    }
	}

	

