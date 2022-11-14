package com.TryCloud.step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {
    @Given("user is on the Files module")
    public void userIsOnTheFilesModule() {
        System.out.println("user is on the Files module");
    }

    @When("the user selects add icon")
    public void theUserSelectsAddIcon() {
        System.out.println("the user selects add icon");
    }

    @And("user clicks in New folder option")
    public void userClicksInNewFolderOption() {
        System.out.println("user clicks in New folder option");
    }

    @And("user creates New folder")
    public void userCreatesNewFolder() {
        System.out.println("user creates New folder");
    }

    @Then("user can upload a file")
    public void userCanUploadAFile() {
        System.out.println("user can upload a file");
    }
}
