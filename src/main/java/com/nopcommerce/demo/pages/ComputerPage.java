package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {
    By computerPageTitle = By.xpath("//h1[normalize-space()='Computers']");
    By selectDesktopOption =By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']");
    By selectComputerOption =By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    public String getComputerPageTitle(){
        return getTextFromElement(computerPageTitle);
    }


    public void selectDesktopOption(){
        mouseHoverToElement(selectComputerOption);
        clickOnElement(selectDesktopOption);
    }
}





