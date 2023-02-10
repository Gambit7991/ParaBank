package flow.home_page_flows.accounts_flow;

import elements.AccountData;
import flow.BaseFlow;
import models.home_page_models.account_models.AccountsOverviewModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class AccountsOverviewFlow extends BaseFlow {
    private final AccountsOverviewModel accountsOverviewModel = new AccountsOverviewModel(driver);
    public ArrayList<AccountData> accountDataList = new ArrayList<>();

    public AccountsOverviewFlow(WebDriver driver) {
        super(driver);
        init();
    }
    public boolean isAccountCreated(int accountNumber){
//        ArrayList<String> temp = new ArrayList<>(); //accountDataList.stream().map(el-> Integer.parseInt(el.getAccountNumber().getText())).toList();
//        for (AccountData accountData : accountDataList) {
//            temp.add(accountData.getAccountNumber());
//        }
        for (int i = 0; i< accountDataList.size(); i++){
            if(Integer.parseInt(accountDataList.get(i).getAccountNumber()) == accountNumber){
                return true;
            }
        }
        return false;
//        return accountDataList.stream().anyMatch(el-> Integer.parseInt(el.getAccountNumber()) == accountNumber);
    }

    private void init(){
//        accountsOverviewModel.getElements().remove(accountsOverviewModel.getElements().size()-1);
//        accountsOverviewModel.getElements().forEach(el -> accountDataList.add(new AccountData(waitVisibility(el))));
        for(int i = 0, j = 0; i < accountsOverviewModel.getElements().size()-1; i++, j+=3){
            accountDataList.add(new AccountData(waitVisibility(accountsOverviewModel.getElements().get(i).findElements(By.xpath("//td")).get(j))));
        }

//        ArrayList<WebElement> list = (ArrayList<WebElement>) accountsOverviewModel.getElements().get(0).findElements(By.xpath( "//td"));
//        for(int i = 0; i< list.size(); i++){
//            accountDataList.add(new AccountData(waitVisibility(list.get(i))));
//        }
        //Проблема тут! Сейчас код работает, но я более чем уверен что это говнокод который нужно испавить
    }

}