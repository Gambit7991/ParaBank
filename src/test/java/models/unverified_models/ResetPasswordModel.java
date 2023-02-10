package models.unverified_models;

import lombok.Getter;
import models.BaseModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
@Getter
public class ResetPasswordModel extends BaseModel {

    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement firstName;
    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement lastName;
    @FindBy(xpath = "//input[@id='address.street']")
    private WebElement address;
    @FindBy(xpath = "//input[@id='address.city']")
    private WebElement city;
    @FindBy(xpath = "//input[@id='address.state']")
    private WebElement state;
    @FindBy(xpath = "//input[@id='address.zipCode']")
    private WebElement zipCode;
    @FindBy(xpath = "//input[@id='ssn']")
    private WebElement ssn;
    @FindBy(xpath = "//input[@value='Find My Login Info']")
    private WebElement submitFormBtn;

    public ResetPasswordModel(WebDriver driver) {
        super(driver);
    }
}
