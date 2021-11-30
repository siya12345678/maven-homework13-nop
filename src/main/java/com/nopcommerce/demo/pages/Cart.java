package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Cart extends Utility {
    By verifyCartPage = By.xpath("//h1[normalize-space()='Shopping cart']");
    By quantityUpdate =By.xpath("//input[@class='qty-input']");
    By updateCart  =By.xpath("//button[normalize-space()='Update shopping cart']");
    By verifyValue =By.xpath("//span[@class='product-subtotal']");
    By termsCondition =By.id("termsofservice");
    By checkOutButton =By.id("checkout");
    By verifyQuantiy = By.xpath("//tbody/tr[1]/td[5]/input[1]");
    By verifyCreditCardText= By.xpath("//span[contains(text(),'Credit Card')]");
    By verify2ndDayAir = By.xpath("//span[normalize-space()='2nd Day Air']");

    public String setVerifyCartPage(){
        return getTextFromElement(verifyCartPage);
    }
    public void setQuantityUpdate(){

        doubleClickAndSendKeysOnElement(quantityUpdate,"2");
    }
    public void setUpdateCart(){
        clickOnElement(updateCart);
    }
    public String getValueofAmount(){
        return getTextFromElement(verifyValue);
    }
    public void setTermsCondition(){
        clickOnElement(termsCondition);
    }
    public void setCheckOutButton(){
        clickOnElement(checkOutButton);
    }
    public String getQuantityVerify(){
        return getTextFromAttribute(verifyQuantiy,"value");
    }
    public String setVerifyCreditCardText(){
        return getTextFromElement(verifyCreditCardText);
    }
    public String setVerify2ndDayAir(){
        return getTextFromElement(verify2ndDayAir);
    }
}
