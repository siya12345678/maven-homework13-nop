package com.nopcommerce.demo.homepage;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    ApparelPage apparelPage = new ApparelPage();
    BooksPage booksPage = new BooksPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    JewelryPage jewelryPage = new JewelryPage();
    DigitalDownloadsPage digitalDownloadsPage = new DigitalDownloadsPage();
    GiftCardsPage giftCardsPage = new GiftCardsPage();

    @Test
    public void verifyClickOnComputer() {
        homePage.clickOnComputerLink();
        //  homePage.clickOnDesktopMenuLink();
        String expectedText = "Computers";
        String actualText = computerPage.getComputerPageTitle();
        Assert.assertEquals(actualText, expectedText, "you are not on Computers Page");
    }

    @Test
    public void verifyClickOnApparel() {
        homePage.clickOnApparelLink();
        String expectedText = "Apparel";
        String actualText = apparelPage.getApparelPageTitle();
        Assert.assertEquals(actualText, expectedText, "you are not on Computer Page");
    }

    @Test
    public void verifyClickOnBooks() {
        homePage.clickOnBooksLink();
        String expectedText = "Books";
        String actualText = booksPage.getBooksTitleText();
        Assert.assertEquals(actualText, expectedText, "you are not on Books Page");
    }
    @Test
    public void verifyClickOnElectronicsPage() {
        homePage.clickOnElectronicsLink();
        String expectedText = "Electronics";
        String actualText = electronicsPage.getElectronicsPageTitle();
        Assert.assertEquals(actualText, expectedText, "you are not on Electronics Page");
    }
    @Test
    public void verifyClickOnJewelryPage() {
        homePage.clickOnJewleryLink();
        String expectedText = "Jewelry";
        String actualText = jewelryPage.getJewelryPageTitle();
        Assert.assertEquals(actualText, expectedText, "you are not on Jewelry Page");
    }
    @Test
    public void verifyClickOnDigitalDownloadsPage() {
        homePage.clickOnDigitalDownloadsLink();
        String expectedText = "Digital downloads";
        String actualText =digitalDownloadsPage.getDigitalDownloadPageTitle();
        Assert.assertEquals(actualText, expectedText, "you are not on Digital Downloads Page");
    }

    @Test
    public void verifyClickOnGiftCardsPagePage() {
        homePage.clickOnGiftCardsLink();
        String expectedText = "Gift Cards";
        String actualText = giftCardsPage.getGiftPageTitle();
        Assert.assertEquals(actualText, expectedText, "you are not on Gift Cards Page");
    }




}
