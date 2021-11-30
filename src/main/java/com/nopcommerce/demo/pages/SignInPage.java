package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility{
    By verifySignInPg =By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By cickonCheckOutAsGuest =By.xpath("//button[normalize-space()='Checkout as Guest']");
    By clickOnRegisterTab=By.xpath("//button[normalize-space()='Register']");

    public String setVerifySignInPg(){
        return getTextFromElement(verifySignInPg);
    }
    public void setCickonCheckOutAsGuest(){
        clickOnElement(cickonCheckOutAsGuest);
    }
    public void setClickOnRegisterTab(){clickOnElement(clickOnRegisterTab);}

}
