package com.demoQA.pages;

import com.demoQA.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProfilePage extends BasePage{

    String deleteSuccessMessage = "";
    WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(10));

    @FindBy(css = ".select-wrap>select")
    public WebElement numberOfRowsSelector;

    @FindBy(css = ".rt-tbody .rt-tr")
    public List<WebElement> actualNumberOfRows;

    @FindBy(css = "#delete-record-undefined")
    public WebElement deleteBookButton;

    @FindBy(css = "#closeSmallModal-ok")
    public WebElement deleteConfirmationButton;

    @FindBy(css = ".rt-noData")
    public WebElement actualNoRowsFoundMessage;

    public void changeTheRowNumber(String expectedRowNumber){
        Select rowNumberDropDown = new Select(numberOfRowsSelector);
        rowNumberDropDown.selectByValue(expectedRowNumber);
    }

    public void verifyTheRowNumberChange(int expectedNumberOfRows){
        Assert.assertEquals(expectedNumberOfRows, actualNumberOfRows.size());
    }

    public void deleteAddedBook(){
        deleteBookButton.click();
        deleteConfirmationButton.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = Driver.get().switchTo().alert();
        deleteSuccessMessage = alert.getText();
        alert.accept();
    }

    public void confirmTheDelete(String expectedSuccessMessage){
        Assert.assertEquals(expectedSuccessMessage, deleteSuccessMessage);
    }

    public void verifyTheNoRowsFoundMessage(String expectedMessage){
        Assert.assertEquals(expectedMessage, actualNoRowsFoundMessage.getText());
    }
}
