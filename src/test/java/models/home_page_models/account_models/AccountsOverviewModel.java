package models.home_page_models.account_models;

import lombok.Getter;
import models.BaseModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class AccountsOverviewModel extends BaseModel {
    @FindBy(xpath = "//tbody/tr")
    private List<WebElement> elements;

    public AccountsOverviewModel(WebDriver driver) {
        super(driver);
    }


}
