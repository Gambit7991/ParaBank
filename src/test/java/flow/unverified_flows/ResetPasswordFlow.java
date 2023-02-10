package flow.unverified_flows;

import bean.UserBean;
import flow.BaseFlow;
import flow.home_page_flows.HomePageFlow;
import models.unverified_models.ResetPasswordModel;
import org.openqa.selenium.WebDriver;

public class ResetPasswordFlow extends BaseFlow {
    private final String URL = "https://parabank.parasoft.com/parabank/lookup.htm";
    private ResetPasswordModel resetModel;
    private UserBean user;
    public ResetPasswordFlow(WebDriver driver) {
        super(driver);
        driver.get(URL);
        resetModel = new ResetPasswordModel(driver);
    }

    public HomePageFlow resetPassword(UserBean user){
        sendKeys(resetModel.getFirstName(), user.getFirstName());
        sendKeys(resetModel.getLastName(), user.getLastName());
        sendKeys(resetModel.getAddress(), user.getAddress());
        sendKeys(resetModel.getCity(), user.getCity());
        sendKeys(resetModel.getState(), user.getState());
        sendKeys(resetModel.getZipCode(), user.getZipCode());
        sendKeys(resetModel.getSsn(), user.getSsn());
        resetModel.getSubmitFormBtn().click();
        return new HomePageFlow(driver);
    }


}
