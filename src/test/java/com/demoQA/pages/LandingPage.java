package com.demoQA.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

    @FindBy(id = "login")
    public WebElement loginButton;


}