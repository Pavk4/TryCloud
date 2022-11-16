package com.TryCloud.step_definition;

import com.TryCloud.pages.AccessMainModulesPage;
import com.TryCloud.pages.LoginPage;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class AccessMainModules {
    LoginPage loginPage = new LoginPage();

    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
   }
    @When("user  log in with valid credentials")
    public void user_log_in_with_valid_credentials() {
       loginPage.login();
    }

    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> expectedModuleNames) {
       //  List<String> actualModuleNames = new AccessMainModulesPage().getModulesText();
        //   Assert.assertEquals(expectedModuleNames,actualModuleNames);

       Assert.assertEquals(expectedModuleNames, BrowserUtils.getElementsText(new AccessMainModulesPage().modules));

    }
}