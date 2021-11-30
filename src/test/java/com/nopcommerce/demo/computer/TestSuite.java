package com.nopcommerce.demo.computer;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSuite extends TestBase {
    HomePage homePage =new HomePage();
    ComputerPage computerPage=new ComputerPage();
    DeskTopsPage desktopPage =new DeskTopsPage();
    BuildYourOwnComputer buildYourOwnComputer =new BuildYourOwnComputer();
    Cart cart = new Cart();
    SignInPage signInPage =new SignInPage();
    CheckOut checkOut = new CheckOut();
    @Test
    public void verifyProductArrangeInAlphaBaticalOrder(){
        homePage.clickOnComputerLink();
        computerPage.selectDesktopOption();
        desktopPage.selectformDropDownMenu("Name: Z to A");


    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully()throws InterruptedException{
        homePage.clickOnComputerLink();
        computerPage.selectDesktopOption();
        desktopPage.selectformDropDownMenu("Name: A to Z");
        Thread.sleep(2000);
        desktopPage.clickOnBuildYourOwnComputer();
        String expectedMsg="Build your own computer";
        String actualMsg =desktopPage.verifyBuildYourOwnComputer();
        Assert.assertEquals(actualMsg,expectedMsg,"you are not on expected page");
        buildYourOwnComputer.setSelectProcessorDropDownBox();
        buildYourOwnComputer.setSelectMemoryDropDownBox();
        Thread.sleep(1000);
        buildYourOwnComputer.setSelectHddOption();
        buildYourOwnComputer.setSelectOsOption();
        buildYourOwnComputer.setSelectSoftwareOneOption();
        Thread.sleep(1000);
        buildYourOwnComputer.setSelectSoftwareOneOption();
        Thread.sleep(1000);
        buildYourOwnComputer.setSelectSoftwarTwoOption();
        Thread.sleep(1000);
        String expectedMsg1="$1,475.00";
        String actualMsg2=buildYourOwnComputer.setVerifyTotalAmountBox();
        Assert.assertEquals(expectedMsg1,actualMsg2,"Check your Options again");
        buildYourOwnComputer.setClickAddToCartButton();
        String expectedMsg3="The product has been added to your shopping cart";
        String actualMsg3=buildYourOwnComputer.setVerifyAddToCart();
        Assert.assertEquals(expectedMsg3,actualMsg3,"Check your Options again");
        Thread.sleep(1000);
        buildYourOwnComputer.setClickCloseOnButton();
        Thread.sleep(1000);
        buildYourOwnComputer.mouseHoverandClickOnCart();
        String expectedMsg4="Shopping cart";
        String actualMsg4=cart.setVerifyCartPage();
        Assert.assertEquals(expectedMsg4,actualMsg4,"You are not on Cart Page");
        cart.setQuantityUpdate();
        cart.setUpdateCart();
        String expectedMsg5="$2,950.00";
        String actualMsg5=cart.getValueofAmount();
        Assert.assertEquals(expectedMsg5,actualMsg5,"Your cart is not updated");
        cart.setTermsCondition();
        cart.setCheckOutButton();
        String expectedMsg6="Welcome, Please Sign In!";
        String actualMsg6=signInPage.setVerifySignInPg();
        Assert.assertEquals(expectedMsg6,actualMsg6,"you are not on SignIn Page");
        Thread.sleep(1000);
        signInPage.setCickonCheckOutAsGuest();
        Thread.sleep(1000);
        checkOut.basicFormFillUp();
        Thread.sleep(1000);
        checkOut.setShippingMethodSelect();
        Thread.sleep(1000);
        checkOut.selectCreditCardOption();
        checkOut.fillCreditCardDetails();
        String expectedMsg7="Credit Card";
        String actualMsg7=checkOut.setVerifyCreditCardPayment();
        Assert.assertEquals(expectedMsg7,actualMsg7,"Payment method is not credit card");
        String expectedMsg8="Next Day Air";
        String actualMsg8=checkOut.setVerifyAirShippingMethod();
        Assert.assertEquals(expectedMsg8,actualMsg8,"you select different shipping method");
        String expectedMsg9="$2,950.00";
        String actualMsg9=checkOut.setVerifyTotalAmount();
        Assert.assertEquals(expectedMsg9,actualMsg9,"Amount not matched");
        checkOut.setClickOnConfirmOrder();
        String expectedMsg10="Thank you";
        String actualMsg10=checkOut.setVerifyThankyou();
        Assert.assertEquals(expectedMsg10,actualMsg10,"User can not see thank you message");
        String expectedMsg11="Your order has been successfully processed!";
        String actualMsg11=checkOut.setVerifyOrderSuccessfulMessage();
        Assert.assertEquals(expectedMsg11,actualMsg11,"User is not able to see any text about order conformation");
        checkOut.finalContinueButton();
        Thread.sleep(1000);
        String expectedMsg12="Welcome to our store";
        String actualMsg12=checkOut.setVerifyWelcomeMessage();
        Assert.assertEquals(expectedMsg12,actualMsg12,"User is not able to see welcome message");
    }


}
