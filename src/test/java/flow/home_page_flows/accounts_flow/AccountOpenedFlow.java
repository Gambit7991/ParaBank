package flow.home_page_flows.accounts_flow;

import flow.BaseFlow;
import models.home_page_models.account_models.AccountOpenedModel;
import org.openqa.selenium.WebDriver;

public class AccountOpenedFlow extends BaseFlow {
    private AccountOpenedModel accountOpenedModel;

    public AccountOpenedFlow(WebDriver driver) {
        super(driver);
        accountOpenedModel = new AccountOpenedModel(driver);
    }

//    public AccountsOverviewFlow getAccounts(){
//        AccountsOverviewFlow accountsOverview = new AccountsOverviewFlow(driver);
//        return accountsOverview;
//    }

    public int getNewAccountId(){
//        String t = waitVisibility(accountOpenedModel.newAccountId).getText();
        return Integer.parseInt(waitVisibility(accountOpenedModel.newAccountId).getText());
    }
}

