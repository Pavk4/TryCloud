package com.TryCloud.step_definition;

import com.TryCloud.pages.LoginPage;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class TestStepDef {

    LoginPage loginPage = new LoginPage();


    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
        Driver.getDriver().get("http://qa2.trycloud.net/index.php/login");
    }


    @Given("I am on the home page again")
    public void iAmOnTheHomePage2() {

        Driver.getDriver().get("http://qa2.trycloud.net/index.php/login");
    }



    @When("I enter my username")
    public void iEnterMyUsername() {
        int min = 1;
        int max = 4;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);

        String Username = "";

        if (random_int == 1)
        {
            Username = "User6";
        }

        if (random_int == 2)
        {
            Username = "User36";
        }

        if (random_int == 3)
        {
            Username = "User66";
        }

        if (random_int == 4)
        {
            Username = "User96";
        }

        loginPage.usernameBox.sendKeys(Username + Keys.ENTER);
    }

    @When("I enter my password")
    public void iEnterMyPassword() {
        loginPage.passwordBox.sendKeys("Userpass123"+ Keys.ENTER);
    }

    @Then("I should be on the dashboard")
    public void iShouldBeOnTheDashboard() {
        String expectedTitle = "Dashboard - Trycloud";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("The login with the correct credentials worked",expectedTitle,actualTitle);

        Driver.getDriver().close();

    }

    @Then("I should get a fail message")
    public void iShouldGetAFailMessage() {
        Boolean actualResult = loginPage.failBox.isDisplayed();

        Boolean expectedResult = true;

        Assert.assertEquals("The login with the wrong credentials failed.",expectedResult,actualResult);

        Driver.getDriver().close();
    }

    @When("I enter the wrong username")
    public void iEnterTheWrongUsername() {
        loginPage.usernameBox.sendKeys("UserZero"+ Keys.ENTER);

    }

    @When("I enter the wrong password")
    public void iEnterTheWrongPassword() {
        loginPage.passwordBox.sendKeys("0000"+ Keys.ENTER);
    }
}
