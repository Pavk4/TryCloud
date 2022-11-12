package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {
    @FindBy(id ="user")
    public WebElement inputUsername;

    @FindBy(id ="password")
    public WebElement inputPassword;

    @FindBy(id="submit-form")
    public WebElement loginButton;


public WebTableLoginPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}

    }

