package models.unverified_models;

import lombok.Getter;
import models.BaseModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class SignUpModel extends BaseModel {

    @FindBy(xpath = "//input[@id='customer.firstName']")
    private WebElement firstname;

    @FindBy(xpath = "//input[@id='customer.lastName']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='customer.address.street']")
    private WebElement address;

    @FindBy(xpath = "//input[@id='customer.address.city']")
    private WebElement city;

    @FindBy(xpath = "//input[@id='customer.address.state']")
    private WebElement state;

    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    private WebElement zipcode;

    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    private WebElement phoneNumber;

    @FindBy(xpath = "//input[@id='customer.ssn']")
    private WebElement ssn;

    @FindBy(xpath = "//input[@id='customer.username']")
    private WebElement userName;

    @FindBy(xpath = "//input[@id='customer.password']")
    private WebElement password;

    @FindBy(xpath = "//input[@id='repeatedPassword']")
    private WebElement confirmPassword;

    @FindBy(xpath = "//input[@value='Register']")
    private WebElement btnSubmitForm;

    public SignUpModel(WebDriver driver) {
        super(driver);
    }

}
