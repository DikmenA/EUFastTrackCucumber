package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utility.*;

public class VyTrackLoginPage {

    public VyTrackLoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "prependedInput")
    public WebElement userName;


    @FindBy(id = "prependedInput2")
    public WebElement password;

    @FindBy(name = "_submit")
    public WebElement submit;

    public void logIn(String username, String password1){
        userName.sendKeys(username);
        password.sendKeys(password1);
        submit.click();
    }
}
