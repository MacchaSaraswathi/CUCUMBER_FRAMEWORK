package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;


public class SearchStepDefs {
	
	    WebDriver driver;

	    @Given("I am on the DemoWebShop homepage")
	    public void iAmOnTheDemoWebShopHomepage() {
	        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
	        driver = new ChromeDriver();
	        driver.get("https://demowebshop.tricentis.com/");
	    }

	    @When("I search for product {string}")
	    public void iSearchForProduct(String productName) {
	        WebElement searchBox = driver.findElement(By.name("q"));
	        searchBox.sendKeys(productName);
	        searchBox.submit();
	    }

	    @Then("I should see search results for {string}")
	    public void iShouldSeeSearchResultsFor(String expectedProduct) {
	        WebElement searchResults = driver.findElement(By.cssSelector(".product-item"));
	        String actualProduct = searchResults.getText();
	        assertTrue(actualProduct.contains(expectedProduct));
	        driver.quit();
	    }

	    @Then("I should see no search results")
	    public void iShouldSeeNoSearchResults() {
	        WebElement noResultsMessage = driver.findElement(By.cssSelector(".no-result"));
	        assertTrue(noResultsMessage.isDisplayed());
	        driver.quit();
	    }
	}

	
	
	


