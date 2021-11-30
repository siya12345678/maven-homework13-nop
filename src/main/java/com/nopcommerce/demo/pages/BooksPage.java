package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BooksPage extends Utility {
    By booksPageTitle = By.xpath("//h1[normalize-space()='Books']");
    public String getBooksTitleText(){
        return getTextFromElement(booksPageTitle);
    }
}
