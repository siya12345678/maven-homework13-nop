package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utility {
    By selectProcessorDropDownBox = By.xpath("//select[@id='product_attribute_1']");
    By selectMemoryDropDownBox = By.id("product_attribute_2");
    By selectHddOption= By.id("product_attribute_3_7");
    By selectOsOption= By.id("product_attribute_4_9");
    By selectSoftwareOneOption =By.id("product_attribute_5_10");
    By selectSoftwarTwoOption = By.id("product_attribute_5_12");
    By verifyTotalAmountBox= By.id("price-value-1");
    By clickAddToCartButton= By.id("add-to-cart-button-1");
    By verifyAddToCart=By.xpath("//p[text()='The product has been added to your ']");
    By clickCloseOnButton =By.xpath("//span[@class='close']");
    By cartButton =By.xpath("//span[@class='cart-label']");
    By addToCartButton =By.xpath("//button[contains(text(),'Go to cart')]");

    public void setSelectProcessorDropDownBox(){
        selectByValueFromDropDown(selectProcessorDropDownBox,"1");
    }
    public void setSelectMemoryDropDownBox(){
        selectByValueFromDropDown(selectMemoryDropDownBox,"5");
    }
    public void setSelectHddOption(){
        clickOnElement(selectHddOption);
    }
    public void setSelectOsOption(){
        clickOnElement(selectOsOption);
    }
    public void setSelectSoftwareOneOption(){
        clickOnElement(selectSoftwareOneOption);
    }
    public void setSelectSoftwarTwoOption(){
        clickOnElement(selectSoftwarTwoOption);
    }
    public String setVerifyTotalAmountBox(){
        return getTextFromElement(verifyTotalAmountBox);
    }
    public void setClickAddToCartButton(){
        clickOnElement(clickAddToCartButton);
    }
    public String setVerifyAddToCart(){
        return getTextFromElement(verifyAddToCart);
    }
    public void setClickCloseOnButton(){
        clickOnElement(clickCloseOnButton);
    }
    public void mouseHoverandClickOnCart(){
        mouseHoverToElement(cartButton);
        clickOnElement(addToCartButton);
    }
}
