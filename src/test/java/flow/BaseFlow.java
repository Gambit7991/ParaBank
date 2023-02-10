package flow;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BaseFlow {

    private final Duration TIME_OUT = Duration.ofSeconds(10);
    public WebDriver driver;
    private WebDriverWait wait;

    public BaseFlow(WebDriver driver) {
        this.driver = driver;
        driver.manage().window().maximize();
        this.wait = new WebDriverWait(driver, TIME_OUT);
        PageFactory.initElements(driver, this);
    }

    public void sendKeys(WebElement textField, String data){
        waitVisibility(textField).sendKeys(data);
    }

    public WebElement waitVisibility(WebElement element){
        return Assertions.assertDoesNotThrow(()->wait.until(ExpectedConditions.visibilityOf(element)));
    }

    public WebElement waitClickability(WebElement element){
        return Assertions.assertDoesNotThrow(()->wait.until(ExpectedConditions.elementToBeClickable(element)));
    }

    public void btnClick(WebElement element){
        waitClickability(element).click();
    }
}
