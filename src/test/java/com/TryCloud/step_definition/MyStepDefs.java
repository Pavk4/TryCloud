package com.TryCloud.step_definition;

import com.TryCloud.pages.TryCloudPage;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {

    TryCloudPage tryCloudPage = new TryCloudPage();

    @Before
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        tryCloudPage.login(ConfigurationReader.getProperty("username1"), ConfigurationReader.getProperty("password"));
    }


    @Given("user is on the Files module")
    public void userIsOnTheFilesModule() {
        tryCloudPage.userIsOnTheFilesModule.click();

    }

    @When("the user selects add icon")
    public void theUserSelectsAddIcon() {
        tryCloudPage.addButton.click();
    }

    @And("user clicks in New folder option")
    public void userClicksInNewFolderOption() {
        tryCloudPage.newFolderButton.click();
    }

    @Then("user creates New folder")
    public void userCreatesNewFolder() {
        tryCloudPage.newFolderInput.click();
        tryCloudPage.folderInputRename.sendKeys("Pavlin folder");
        tryCloudPage.confirmButton.click();

    }


}
