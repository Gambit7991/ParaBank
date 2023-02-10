package tests_configurations.steps.virified_steps;

import flow.home_page_flows.HomePageFlow;
import flow.home_page_flows.accounts_flow.AccountOpenedFlow;
import flow.home_page_flows.accounts_flow.AccountsOverviewFlow;
import flow.home_page_flows.accounts_flow.OpenNewAccountFlow;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import tests_configurations.hooks.Hooks;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
public class OpenNewAccountSteps {
    private final WebDriver driver = Hooks.driver;
    private HomePageFlow homePageFlow;
    private OpenNewAccountFlow openNewAccount;
    private AccountOpenedFlow accountOpenedFlow;
    private AccountsOverviewFlow accountsOverviewFlow;
    private int newAccountId;

    @Given("user is on the home page")
    public void userIsOnTheHomePage() {
        homePageFlow = new HomePageFlow(driver);
    }
    @When("user clicks create new account")
    public void userClicksCreateNewAccount() {
        openNewAccount = homePageFlow.getOpenAccountForm();
    }
    @When("user choose a type of account {string}")
    public void userChooseATypeOfAccount(String  i) {
        openNewAccount.selectAccountType(Integer.parseInt(i));
    }
    @When("user clicks create account button")
    public void userClicksCreateAccountButton() {
        accountOpenedFlow = openNewAccount.clickSubmitButton();
    }
    @Then("navigate to the successful account created page")
    public void navigateToTheSuccessfulAccountCreatedPage() {
        newAccountId = accountOpenedFlow.getNewAccountId();
    }
    @When("user clicks accounts overview button and navigates to the accounts overview page")
    public void userClicksAccountsOverviewButton() {
        accountsOverviewFlow = homePageFlow.clickAccountsOverviewBtn();
    }
    @Then("account overview page contains account number from successful account created page")
    public void accountOverviewPageContainsAccountNumberFromSuccessfulAccountCreatedPage() {
//        accountsOverviewFlow.isAccountCreated(newAccountId);
        assertTrue(accountsOverviewFlow.isAccountCreated(newAccountId));
    }

}
