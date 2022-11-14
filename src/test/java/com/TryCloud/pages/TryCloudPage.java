package com.TryCloud.pages;


import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TryCloudPage {
    public TryCloudPage() {
    PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (className = "button new")
    public WebElement addButton;

}

