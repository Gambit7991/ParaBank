package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccountData{
    private final WebElement root;
    public WebElement accountNumber;
    private WebElement accountBalance;
    private WebElement accountAvailableAmount;

    public AccountData(WebElement root) {
        this.root = root;
    }

    public String getAccountNumber(){
        return root.getText();
    }

    public WebElement getAccountBalance(){
        return root.findElement(By.xpath("//tr[@ng-repeat]/td[2]"));
    }

    public WebElement getAccountAvailableAmount(){
        return root.findElement(By.xpath("//tr[@ng-repeat]/td[3]"));
    }

}
