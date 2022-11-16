package com.TryCloud.pages;

import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.TryCloud.utilities.BrowserUtils.clickElement;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='user']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginBtn;


    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }
    public void login() {
        login(ConfigurationReader.getProperty("username1"), ConfigurationReader.getProperty("password"));
        clickElement(loginBtn);
    }

}
