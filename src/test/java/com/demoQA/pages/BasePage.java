package com.demoQA.pages;

import com.demoQA.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//li[@id='item-3'])[5]//span")
    public WebElement profilePageLink;

    public void closeGoogleAdIframe(){
        Driver.get().switchTo().frame(Driver.get().findElement(By.xpath("//iframe[starts-with(@id,'google_ads_iframe')]")));
        Driver.get().findElement(By.id("cbb")).click();
        Driver.get().switchTo().parentFrame();
    }

    public static void scrollToElement(WebElement elementToScroll) {
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", elementToScroll);
    }
}
