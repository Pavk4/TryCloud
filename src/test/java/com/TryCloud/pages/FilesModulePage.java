package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesModulePage {

    public FilesModulePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "user")
    public WebElement inputUsername;

    @FindBy (id = "password")
    public WebElement inputPassword;

    @FindBy (id = "submit-form")
    public WebElement loginButton;

    @FindBy (xpath = "//a[*='Files']")
    public WebElement filesButton;

    public void login(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }

}
