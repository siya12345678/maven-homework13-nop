package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CellPhone extends Utility {
    By verifyCellTextonPage= By.xpath("//h1[normalize-space()='Cell phones']");
    By clickOnListView =By.xpath("//a[normalize-space()='List']");
    By clickOnNokiaLumia1020= By.xpath("//a[normalize-space()='Nokia Lumia 1020']");
    By verifyNokiaLumia1020Text =By.xpath("//h1[text()='Nokia Lumia 1020']");
    By verifyNokiaLumia1020Price =By.xpath("//span[@id='price-value-20']");
    By cellPhoneQuantity = By.id("product_enteredQuantity_20");
    By clickOnAddToCart =By.id("add-to-cart-button-20");
    By verifyTopMessage =By.xpath("//p[@class='content']");
    By closeTopMessage =By.xpath("//span[@class='close']");
    By shopingCartLink =By.xpath("//span[text()='Shopping cart']");
    By goCartButton =By.xpath("//button[@class='button-1 cart-button']");
    public String setVerifyCellTextOnPage(){
        return getTextFromElement(verifyCellTextonPage);
    }
    public void setClickOnListView(){
        clickOnElement(clickOnListView);
    }
    public void setClickOnNokiaLumia1020(){
        clickOnElement(clickOnNokiaLumia1020);
    }
    public String setVerifyNokiaLumia1020Text(){
        return getTextFromElement(verifyNokiaLumia1020Text);
    }
    public String setVerifyNokiaLumia1020Price(){
        return getTextFromElement(verifyNokiaLumia1020Price);
    }
    public void setCellPhoneQuantity(){
        doubleClickAndSendKeysOnElement(cellPhoneQuantity,"2");
    }
    public void setClickOnAddToCart(){
        clickOnElement(clickOnAddToCart);
    }
    public String setVerifyTopMessage(){
        return getTextFromElement(verifyTopMessage);
    }
    public void closeTopMessage(){
        clickOnElement(closeTopMessage);
    }
    public void mouseHoverShoppinCart(){
        mouseHoverToElement(shopingCartLink);
    }
    public void setGoCartButton(){
        movetoElementandSelect(goCartButton);
    }


}
