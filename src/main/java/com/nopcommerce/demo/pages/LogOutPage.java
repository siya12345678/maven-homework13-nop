package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LogOutPage extends Utility {
    By clickLogOutLink =By.xpath("//a[@class='ico-logout']");
    By verifyWelcomMessage=By.xpath("//h2[text()='Welcome to our store']");

    public String setverifyWelcomeMessage(){
        return getTextFromElement(verifyWelcomMessage);
    }
    public void setClickLogOutLink(){
        clickOnElement(clickLogOutLink);
    }
}
