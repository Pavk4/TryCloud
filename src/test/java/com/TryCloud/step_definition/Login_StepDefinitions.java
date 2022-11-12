package com.TryCloud.step_definition;

import com.TryCloud.pages.WebTableLoginPage;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class Login_StepDefinitions {
    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    @Given("user on the login page")
    public void user_on_the_login_page() {
       Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("user click the login button")
    public void user_click_the_login_button() {
        webTableLoginPage.loginButton.click();
    }
    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {
       Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard"));
    }

    @When("user use username {string} and passcode {string}")
    public void userUseUsernameAndPasscode(String username, String password) {
        webTableLoginPage.inputUsername.sendKeys(username);
        webTableLoginPage.inputPassword.sendKeys(password);
    }
}


