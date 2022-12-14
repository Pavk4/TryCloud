package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }
@FindBy(name="user")
    public WebElement usernameBox;

    @FindBy(name="password")
    public WebElement passwordBox ;

    @FindBy(className="wrongPasswordMsg")
    public WebElement failBox;

}
