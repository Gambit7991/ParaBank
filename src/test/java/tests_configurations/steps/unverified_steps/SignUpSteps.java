package tests_configurations.steps.unverified_steps;


import flow.home_page_flows.HomePageFlow;
import flow.unverified_flows.SignUpFlow;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import tests_configurations.hooks.Hooks;

public class SignUpSteps {
    private WebDriver driver;
    private SignUpFlow signUpFlow;
    private HomePageFlow homePageFlow;

    @Given("user is on sign up page")
    public void userIsOnSignUpPage() {
        driver = Hooks.driver;
        signUpFlow = new SignUpFlow(driver);
    }


    @When("user enters first name {string} on signup page")
    public void userEntersFirstName(String str) {
        signUpFlow.setFirstname(str);
    }


    @And("user enters last name {string} on signup page")
    public void userEntersLastName(String str) {
        signUpFlow.setLastName(str);
    }

    @And("user enters address {string} on signup page")
    public void userEntersAddress(String str) {
        signUpFlow.setAddress(str);
    }

    @And("user enters city {string} on signup page")
    public void userEntersCity(String str) {
        signUpFlow.setCity(str);
    }

    @And("user enters state {string} on signup page")
    public void userEntersState(String str) {
        signUpFlow.setState(str);
    }

    @And("user enters zip code {string} on signup page")
    public void userEntersZipCode(String str) {
        signUpFlow.setZipcode(str);
    }

    @And("user enters phone number {string} on signup page")
    public void userEntersPhoneNumber(String str) {
        signUpFlow.setPhoneNumber(str);
    }

    @And("user enters social security number {string} on signup page")
    public void userEntersSocialSecurityNumber(String str) {
        signUpFlow.setSsn(str);
    }

    @And("user enters user name {string} on signup page")
    public void userEntersUserName(String str) {
        signUpFlow.setUserName(str);
    }

    @And("user enters password {string} on signup page")
    public void userEntersPassword(String str) {
        signUpFlow.setPassword(str);
    }

    @And("user enters confirm {string} on signup page")
    public void userEntersConfirm(String str) {
        signUpFlow.setConfirmPassword(str);
    }

    @And("click on signup button")
    public void clickOnSignupButton() {
        homePageFlow = signUpFlow.submitForm();
    }

    @Then("user is navigate to the signup successful message")
    public void userIsNavigateToTheSignupSuccessfulMessage() {
        homePageFlow.isSignedIn();
    }
}
