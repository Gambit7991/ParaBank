package flow.unverified_flows;

import bean.UserBean;
import flow.BaseFlow;
import flow.home_page_flows.HomePageFlow;
import models.unverified_models.SignUpModel;
import org.openqa.selenium.WebDriver;

public class SignUpFlow extends BaseFlow {
    private final String BASE_URL = "https://parabank.parasoft.com/parabank/register.htm";
    private final SignUpModel signUpModel;

    public SignUpFlow(WebDriver driver) {
        super(driver);
        driver.get(BASE_URL);
        signUpModel = new SignUpModel(driver);
    }

    public HomePageFlow signUpAs(UserBean user) {
        sendKeys(signUpModel.getFirstname(), user.getFirstName());
        sendKeys(signUpModel.getLastName(), user.getLastName());
        sendKeys(signUpModel.getAddress(), user.getAddress());
        sendKeys(signUpModel.getCity(), user.getCity());
        sendKeys(signUpModel.getState(), user.getState());
        sendKeys(signUpModel.getZipcode(), user.getZipCode());
        sendKeys(signUpModel.getPhoneNumber(), user.getPhoneNumber());
        sendKeys(signUpModel.getSsn(), user.getSsn());
        sendKeys(signUpModel.getUserName(), user.getUserName());
        sendKeys(signUpModel.getPassword(), user.getPassword());
        sendKeys(signUpModel.getConfirmPassword(), user.getPassword());
        btnClick(signUpModel.getBtnSubmitForm());
        return new HomePageFlow(driver);
    }


    public void setFirstname(String firstName) {
        sendKeys(signUpModel.getFirstname(), firstName);
    }

    public void setLastName(String lastName) {
        sendKeys(signUpModel.getLastName(), lastName);
    }

    public void setAddress(String address) {
        sendKeys(signUpModel.getAddress(), address);
    }

    public void setCity(String city) {
        sendKeys(signUpModel.getCity(), city);
    }

    public void setState(String state) {
        sendKeys(signUpModel.getState(), state);
    }

    public void setZipcode(String zipcode) {
        sendKeys(signUpModel.getZipcode(), zipcode);
    }

    public void setPhoneNumber(String phoneNumber) {
        sendKeys(signUpModel.getPhoneNumber(), phoneNumber);
    }

    public void setSsn(String ssn) {
        sendKeys(signUpModel.getSsn(), ssn);
    }

    public void setUserName(String userName) {
        sendKeys(signUpModel.getUserName(), userName);
    }

    public void setPassword(String password) {
        sendKeys(signUpModel.getPassword(), password);
    }

    public void setConfirmPassword(String password) {
        sendKeys(signUpModel.getConfirmPassword(), password);

    }

    public HomePageFlow submitForm() {
        btnClick(signUpModel.getBtnSubmitForm());
        return new HomePageFlow(driver);
    }


}
