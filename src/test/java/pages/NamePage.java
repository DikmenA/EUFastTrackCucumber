package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utility.*;

import java.util.*;

public class NamePage {

    public NamePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    public List<String> name(){
        String names = Driver.get().findElement(By.cssSelector("#user-menu a")).getText();
        names.trim();
        List<String> nameList = List.of(names.split(" "));
        return nameList;
    }
}
