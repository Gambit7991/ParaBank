package models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseModel {
    public WebDriver driver;

    public BaseModel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
