package com.demoQA.pages;

import com.demoQA.utilities.ConfigurationReader;
import com.demoQA.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

    @FindBy(id = "login")
    public WebElement loginButton;

    @FindBy(id = "userName-value")
    public WebElement actualUsername;

    @FindBy(id = "searchBox")
    public WebElement searchInputBox;

    @FindBy(css = "span>a")
    public WebElement actualListedBookName;

    public void verifyTheUserName(String expectedUserName){
        Assert.assertEquals("The username is not matched!", ConfigurationReader.get(expectedUserName), actualUsername.getText());
    }

    public void verifyTheListedBookName(String expectedBookName){
        scrollToElement(actualListedBookName);
        Assert.assertEquals("The selected book is not listed", expectedBookName, actualListedBookName.getText());
    }

    public void clickOnTheBook(String bookName){
        Driver.get().findElement(By.linkText(bookName)).click();
    }

}