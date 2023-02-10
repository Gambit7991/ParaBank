package tests_configurations.steps.unverified_steps;

import flow.home_page_flows.HomePageFlow;
import flow.unverified_flows.SignInFlow;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import tests_configurations.hooks.Hooks;

public class LogInSteps {

    private final WebDriver driver = Hooks.driver;
    private SignInFlow signInFlow;
    private HomePageFlow homePageFlow;

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        signInFlow = new SignInFlow(driver);
    }

    @When("user enters UserName {string} on login page")
    public void userEntersUserNameOnLoginPage(String userName) {
        signInFlow.setUserName(userName);
    }


    @When("user enters Password {string} on login page")
    public void userEntersPasswordOnLoginPage(String password) {
        signInFlow.setPassword(password);
    }

    @And("clicks on login button")
    public void clicksOnLoginButton() {
        homePageFlow = signInFlow.submitForm();
    }


    @Then("user is navigate to the home page")
    public void userIsNavigateToTheHomePage() {
        homePageFlow.isSignedIn();
    }

}