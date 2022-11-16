package com.TryCloud.pages;


import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TryCloudPage {
    public TryCloudPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='user']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginBtn;

    @FindBy(xpath = "(//li[@data-id='files']/a)[1]")
    public WebElement userIsOnTheFilesModule;

    @FindBy(css = "a[class='button new']")
    public WebElement addButton;

    @FindBy(xpath = "(//span[@class='displayname'])[2]")
    public WebElement newFolderButton;

    @FindBy(css = "input[id='view13-input-folder']")
    public WebElement newFolderInput;

    @FindBy(xpath = "//input[@id='view13-input-folder']")
    public WebElement folderInputRename;

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement confirmButton;


    public void login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
        // userIsOnTheFilesModule.click();
        //addButton.click();
        //newFolderButton.click();


    }
}

