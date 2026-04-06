package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.DriverFactory;


public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;

    @Given("user is on login page")
    public void user_on_login_page(){

        driver= DriverFactory.initDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");
        loginPage= new LoginPage(driver);
    }

    @When("user enters username {string} and password {string}")
    public void enter_credentials(String user, String pass) {
        loginPage.login(user,pass);
    }
    @Then("user should be logged in successfully")
    public void validate_login() {

        System.out.println(driver.getTitle());

        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
        driver.quit();
    }
        }
