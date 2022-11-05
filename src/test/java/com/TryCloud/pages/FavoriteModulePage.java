package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FavoriteModulePage {
    public FavoriteModulePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-action='menu']")
    public List<WebElement> fileActionBtn;

    @FindBy(xpath = "//span[.='Add to favorites']")
    public WebElement addToFavoriteBtn;


    @FindBy(xpath = "//td[@class='filename']//span[@class='innernametext']")
    public List<WebElement> fileInFavoriteModule;

    // //td[@class='filename']//span[@class='innernametext']

    ////td[@class='filename ui-draggable ui-draggable-handle']//span[@class='innernametext']



}
