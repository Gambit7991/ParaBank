package models.home_page_models.account_models;

import models.BaseModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenNewAccountModel extends BaseModel {
    @FindBy(xpath = "//input[@value='Open New Account']")
    public WebElement openNewAccountBtn;
    @FindBy(xpath = "//select[@id='type']")
    public WebElement accountType;


    public OpenNewAccountModel(WebDriver driver) {
        super(driver);
    }
}