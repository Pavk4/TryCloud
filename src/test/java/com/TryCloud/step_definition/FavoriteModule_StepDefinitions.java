package com.TryCloud.step_definition;

import com.TryCloud.pages.BasePage;
import com.TryCloud.pages.FavoriteModulePage;
import com.TryCloud.pages.LoginPage;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FavoriteModule_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();
    FavoriteModulePage favoriteModulePage = new FavoriteModulePage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        loginPage.login(ConfigurationReader.getProperty("username1"), ConfigurationReader.getProperty("password"));

    }
    @When("the user clicks the Files module")
    public void the_user_clicks_the_files_module() {
       // basePage.fileBtn.click();
        BrowserUtils.sleep(2);
    }
    @When("the user clicks action-icon from any file on the page")
    public void the_user_clicks_action_icon_from_any_file_on_the_page() {

        for(int i=0; i<favoriteModulePage.fileActionBtn.size(); i++ ){
         favoriteModulePage.fileActionBtn.get(i).click();
         favoriteModulePage.addToFavoriteBtn.click();

        }


    }
    @When("user choose the Add to favorites option")
    public void user_choose_the_add_to_favorites_option() {

    }

    @When("user click the Favorites sub-module on the left side")
    public void user_click_the_favorites_sub_module_on_the_left_side() {

        basePage.favoritesBtn.click();
    }

    @Then("Verify the chosen file is listed on the table")
    public void verify_the_chosen_file_is_listed_on_the_table(List<String>expectedFileInFavorites) {

        List<String> actualFileInFavorite = new ArrayList<>();

        for (int i=0; i<favoriteModulePage.fileInFavoriteModule.size(); i++) {
            actualFileInFavorite.add(favoriteModulePage.fileInFavoriteModule.get(i).getText());

        }
        System.out.println(actualFileInFavorite);

    Collections.sort(actualFileInFavorite);


//        String actualFiles = String.join(",", actualFileInFavorite);


        Assert.assertEquals(expectedFileInFavorites,actualFileInFavorite);
    }

}
