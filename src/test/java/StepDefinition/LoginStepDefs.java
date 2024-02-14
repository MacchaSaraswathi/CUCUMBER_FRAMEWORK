package StepDefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;
public class LoginStepDefs {
	
	    WebDriver driver;

	    @Given("I am on the DemoWebShop login page")
	    public void iAmOnTheDemoWebShopLoginPage() {
	        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
	        driver = new ChromeDriver();
	        driver.get("https://demowebshop.tricentis.com/login");
	    }

	    @When("I enter valid username {string} and password {string}")
	    public void iEnterValidUsernameAndPassword(String username, String password) {
	        WebElement emailField = driver.findElement(By.id("Email"));
	        emailField.sendKeys(username);

	        WebElement passwordField = driver.findElement(By.id("Password"));
	        passwordField.sendKeys(password);
	    }

	    @When("I click on the login button")
	    public void iClickOnTheLoginButton() {
	        WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log in']"));
	        loginButton.click();
	    }

	    @Then("I should be logged in successfully")
	    public void iShouldBeLoggedInSuccessfully() {
	        WebElement logoutLink = driver.findElement(By.linkText("Log out"));
	        assertTrue(logoutLink.isDisplayed());
	        driver.quit();
	    }

	    @Then("I should see an error message")
	    public void iShouldSeeAnErrorMessage() {
	        WebElement errorMessage = driver.findElement(By.cssSelector(".message-error"));
	        assertTrue(errorMessage.isDisplayed());
	        driver.quit();
	    }
	}




