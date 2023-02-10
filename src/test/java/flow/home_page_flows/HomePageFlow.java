package flow.home_page_flows;

import flow.BaseFlow;
import flow.home_page_flows.accounts_flow.AccountsOverviewFlow;
import flow.home_page_flows.accounts_flow.OpenNewAccountFlow;
import models.home_page_models.HomePageModel;
import org.openqa.selenium.WebDriver;

public class HomePageFlow extends BaseFlow {
    private final String URL = "https://parabank.parasoft.com/parabank/index.htm";
    private HomePageModel homePageModel;


    public HomePageFlow(WebDriver driver) {
        super(driver);
        driver.get(URL);
        homePageModel = new HomePageModel(driver);
    }

    public boolean isSignedIn() {
        return waitVisibility(homePageModel.getTextAfterSignUp()).isDisplayed();
    }

    public OpenNewAccountFlow getOpenAccountForm(){
        waitVisibility(homePageModel.getOpenNewAccountBtn()).click();
        return new OpenNewAccountFlow(driver);
    }

    public AccountsOverviewFlow clickAccountsOverviewBtn(){
        homePageModel.getAccountsOverviewBtn().click();
        return new AccountsOverviewFlow(driver);
    }

}