package step_definitions;

import io.cucumber.java.en.*;
import org.junit.*;
import pages.*;
import utility.*;

public class LoginTest {

    Login login = new Login();

    @Given("user go to the login page")
    public void user_go_to_the_login_page() {
        Driver.get().get(ConfigurationReader.get("login_url"));
    }

    @When("user enters correct credentials")
    public void user_enters_correct_credentials() {
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");

        login.userNameInput.sendKeys(username);
        login.passwordInput.sendKeys(password);
        login.loginBtn.click();
    }

    @When("user enters wrong credentials")
    public void user_enters_wrong_credentials() {
        String username = ConfigurationReader.get("username") + "1";
        String password = ConfigurationReader.get("password") + "1";

        login.userNameInput.sendKeys(username);
        login.passwordInput.sendKeys(password);
        login.loginBtn.click();
    }

    @Then("user should be in {string}")
    public void user_should_be_in(String string) throws InterruptedException {
        Thread.sleep(1000);

        String actualTitle = login.title.getText();
        Assert.assertEquals(string, actualTitle);


    }

    @Then("user should be at {string}")
    public void user_should_be_at(String string) throws InterruptedException {
        Thread.sleep(1000);

        String actualTitle = login.title.getText();
        Assert.assertEquals(string, actualTitle);


    }
}
