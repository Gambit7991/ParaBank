package models.unverified_models;

import lombok.Getter;
import lombok.Setter;
import models.BaseModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
@Getter
@Setter
public class SignInModel extends BaseModel {

    @FindBy(xpath = "//input[@name='username']")
    private WebElement userNameTextField;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordTextField;
    @FindBy(xpath = "//input[@value='Log In']")
    private WebElement submitFormBtn;

    public SignInModel(WebDriver driver) {
        super(driver);
    }
}
