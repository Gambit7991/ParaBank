package flow.unverified_flows;

import bean.UserBean;
import flow.BaseFlow;
import flow.home_page_flows.HomePageFlow;
import models.unverified_models.SignInModel;
import org.openqa.selenium.WebDriver;

public class SignInFlow extends BaseFlow {
    private final String URL = "https://parabank.parasoft.com/parabank/index.htm";
    private SignInModel signInModel;

    public SignInFlow(WebDriver driver) {
        super(driver);
        driver.get(URL);
        signInModel = new SignInModel(driver);
    }

    public HomePageFlow signInUs(UserBean user){
        sendKeys(signInModel.getUserNameTextField(), user.getUserName());
        sendKeys(signInModel.getPasswordTextField(), user.getPassword());
        signInModel.getSubmitFormBtn().click();
        return new HomePageFlow(driver);
    }

    public void setUserName(String name){
        sendKeys(signInModel.getUserNameTextField(), name);
    }

    public void setPassword(String password){
        sendKeys(signInModel.getPasswordTextField(), password);
    }

    public HomePageFlow submitForm(){
        signInModel.getSubmitFormBtn().click();
        return new HomePageFlow(driver);
    }
}
