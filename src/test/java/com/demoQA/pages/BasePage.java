package com.demoQA.pages;

import com.demoQA.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }


}
