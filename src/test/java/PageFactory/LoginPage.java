package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {


	    WebDriver driver;

	    @Given("I am on the login page")
	    public void i_am_on_the_login_page() {
	        // Set up WebDriver
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();
	        
	        // Navigate to the login page
	        driver.get("https://demowebshop.tricentis.com/login");
	    }

	    @When("I enter valid username {string} and password {string}")
	    public void i_enter_valid_username_and_password(String username, String password) {
	        // Enter username and password
	        driver.findElement(By.id("Email")).sendKeys(username);
	        driver.findElement(By.id("Password")).sendKeys(password);
	    }

	    @When("I click on the login button")
	    public void i_click_on_the_login_button() {
	        // Click on the login button
	        driver.findElement(By.cssSelector("input[value='Log in']")).click();
	    }

	    @Then("I should be logged in successfully")
	    public void i_should_be_logged_in_successfully() {
	        // Assuming successful login redirects to a different page,
	        // you can assert the presence of some element on that page
	        boolean isLoggedIn = driver.findElement(By.cssSelector("a.ico-account")).isDisplayed();
	        assert(isLoggedIn);
	        
	        // Close the browser after the test
	        driver.quit();
	    }
	}





