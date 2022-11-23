package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//ul[@id='appmenu']//a)[1]")
    public WebElement dashboardBtn;

    @FindBy(xpath = "(//ul[@id='appmenu']//a)[2]")
    public WebElement fileBtn;

    @FindBy(linkText="Favorites")
    public WebElement favoritesBtn;

}
