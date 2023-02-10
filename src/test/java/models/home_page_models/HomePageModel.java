package models.home_page_models;

import lombok.Getter;
import models.BaseModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HomePageModel extends BaseModel {

    @FindBy(xpath = "//a[contains(text(), 'Open New Account')]")
    private WebElement openNewAccountBtn;
    @FindBy(xpath = "//a[contains(text(), 'Accounts Overview')]")
    private WebElement accountsOverviewBtn;
    @FindBy(xpath = "//a[contains(text(), 'Log Out')]")
    private WebElement textAfterSignUp;

    public HomePageModel(WebDriver driver) {
        super(driver);
    }
}
