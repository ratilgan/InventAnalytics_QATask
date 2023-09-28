package com.demoQA.pages;

import com.demoQA.utilities.ConfigurationReader;
import com.demoQA.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "userName")
    public WebElement usernameInputBox;

    @FindBy(id = "password")
    public WebElement passwordInputBox;

    public void login(String username, String password){
        usernameInputBox.sendKeys(ConfigurationReader.get(username));
        passwordInputBox.sendKeys(ConfigurationReader.get(password), Keys.ENTER);
    }

    public void verifyLoginPageOpened(String expectedUrl){
        Assert.assertEquals("Login page is NOT opened!",expectedUrl,Driver.get().getCurrentUrl());
    }

    public void verifyUsernameAndPasswordInputBoxesAreVisible(){
        Assert.assertTrue("Input boxes are NOT visible!", usernameInputBox.isDisplayed() && passwordInputBox.isDisplayed());
    }
}
