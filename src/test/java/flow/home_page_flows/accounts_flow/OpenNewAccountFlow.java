package flow.home_page_flows.accounts_flow;

import flow.BaseFlow;
import models.home_page_models.account_models.OpenNewAccountModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenNewAccountFlow extends BaseFlow {

    private OpenNewAccountModel openNewAccount;

    public OpenNewAccountFlow(WebDriver driver) {
        super(driver);
        openNewAccount = new OpenNewAccountModel(driver);
    }

    public AccountOpenedFlow clickSubmitButton(){
        openNewAccount.openNewAccountBtn.click();
        return new AccountOpenedFlow(driver);
    }

    public void selectAccountType(int i){
        Select select = new Select(openNewAccount.accountType);
        select.selectByIndex(i);
    }
}
