package com.demoQA.pages;

import com.demoQA.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BookDetailPage extends BasePage {

    WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(20));

    @FindBy(css = ".text-right #addNewRecordButton")
    public WebElement addToYourCollectionButton;

    public void assertTheSuccessMessage(String expectedMessage){
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = Driver.get().switchTo().alert();
        Assert.assertEquals("Wrong message is retrieved!", expectedMessage, alert.getText());
        alert.accept();
    }

    public void clickAddToCollectionButton(){
        scrollToElement(addToYourCollectionButton);
        addToYourCollectionButton.click();
    }

    public void clickProfilePageLink(){
        scrollToElement(addToYourCollectionButton);
        profilePageLink.click();
    }
}
