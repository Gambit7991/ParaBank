package models.home_page_models.account_models;

import lombok.Getter;
import models.BaseModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class AccountOpenedModel extends BaseModel {

    @FindBy(xpath = "//a[@id='newAccountId']")
    public WebElement newAccountId;

    public AccountOpenedModel(WebDriver driver) {
        super(driver);
    }

    public WebElement getNewAccountId() {
        return newAccountId;
    }
}
