package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class DigitalDownloadsPage extends Utility {
    By digitalDownloadsTitle = By.xpath("//h1[normalize-space()='Digital downloads']");
    public String getDigitalDownloadPageTitle(){
        return getTextFromElement(digitalDownloadsTitle);
    }
}