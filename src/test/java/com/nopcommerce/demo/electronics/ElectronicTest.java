package com.nopcommerce.demo.electronics;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicTest extends TestBase {
    HomePage homePage = new HomePage();
    CellPhone cellPhone = new CellPhone();
    Cart cart = new Cart();
    SignInPage signInPage = new SignInPage();
    CheckOut checkOut = new CheckOut();
    Register register = new Register();
    LogOutPage logOutPage =new LogOutPage();
//Electronics electronics=new Electronics();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        homePage.mouseHoverOnElectronicMenu();
        homePage.setCellPhoneDropDownList();
        String expectedMsg1 = "Cell phones";
        String actualMsg1 = cellPhone.setVerifyCellTextOnPage();
        Assert.assertEquals(actualMsg1, expectedMsg1, "User is not on Cell Phone Page");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        homePage.mouseHoverOnElectronicMenu();
        Thread.sleep(1000);
        homePage.setCellPhoneDropDownList();
        String expectedMsg1 = "Cell phones";
        String actualMsg1 = cellPhone.setVerifyCellTextOnPage();
        Assert.assertEquals(actualMsg1, expectedMsg1, "User is not on Cell Phone Page");
        cellPhone.setClickOnListView();
        Thread.sleep(1000);
        cellPhone.setClickOnNokiaLumia1020();
        String expectedMsg2 = "Nokia Lumia 1020";
        String actualMsg2 = cellPhone.setVerifyNokiaLumia1020Text();
        Assert.assertEquals(actualMsg2, expectedMsg2, "User is not in nokia page");
        String expectedMsg3 = "$349.00";
        String actualMsg3 = cellPhone.setVerifyNokiaLumia1020Price();
        Assert.assertEquals(actualMsg3, expectedMsg3, "prize is not same");
        cellPhone.setCellPhoneQuantity();
        cellPhone.setClickOnAddToCart();
        String expectedMsg4 = "The product has been added to your shopping cart";
        String actualMsg4 = cellPhone.setVerifyTopMessage();
        Assert.assertEquals(actualMsg4, expectedMsg4, "User can not verify product is added or not");
        cellPhone.closeTopMessage();
        Thread.sleep(1000);
        cellPhone.mouseHoverShoppinCart();
        Thread.sleep(2000);
        cellPhone.setGoCartButton();
        String expectedMsg5 = "Shopping cart";
        String actualMsg5 = cart.setVerifyCartPage();
        Assert.assertEquals(expectedMsg5, actualMsg5, "You are not on Cart Page");
        Thread.sleep(1000);
        String expectedMsg6 = "2";
        String actualMsg6 = cart.getQuantityVerify();
        Assert.assertEquals(expectedMsg6, actualMsg6, "quantity is not 2");
        String expectedMsg7 = "$698.00";
        String actualMsg7 = cart.getValueofAmount();
        Assert.assertEquals(expectedMsg7, actualMsg7, "Your cart is not updated");
        cart.setTermsCondition();
        cart.setCheckOutButton();
        String expectedMsg8 = "Welcome, Please Sign In!";
        String actualMsg8 = signInPage.setVerifySignInPg();
        Assert.assertEquals(expectedMsg8, actualMsg8, "you are not on SignIn Page");
        Thread.sleep(1000);
        signInPage.setClickOnRegisterTab();
        Thread.sleep(1000);
        String expectedMsg9 = "Register";
        String actualMsg9 = register.setVerifyRegisterTitle();
        Assert.assertEquals(expectedMsg9, actualMsg9, "you are not on Register Page");
        register.fillBasicFormAndSubmit();
        String expectedMsg10 = "Your registration completed";
        String actualMsg10 = register.setVerifyCompleteRegisterPage();
        Assert.assertEquals(expectedMsg10, actualMsg10, "you are not on Register Page");
        register.clickOnContinueButton();
        Thread.sleep(1000);
        String expectedMsg11 = "Shopping cart";
        String actualMsg11 = cart.setVerifyCartPage();
        Assert.assertEquals(expectedMsg11, actualMsg11, "You are not on Cart Page");
        cart.setTermsCondition();
        cart.setCheckOutButton();
        Thread.sleep(1000);
        checkOut.basicFormWithoutEmail();
        Thread.sleep(1000);
        checkOut.setclickon2ndDayAirShippingAndContinue();
        checkOut.selectCreditCardOption();
        Thread.sleep(2000);
        checkOut.fillVisaCreditCardDetails();
        String expectedMsg12 = "Credit Card";
        String actualMsg12 = checkOut.setVerifyCreditCardPayment();
        Assert.assertEquals(expectedMsg12, actualMsg12, "Payment method is not card");
        String expectedMsg13 = "2nd Day Air";
        String actualMsg13 = checkOut.setVerify2ndDayAir();
        Assert.assertEquals(expectedMsg13, actualMsg13, "Check Shipping Method again");
        String expectedMsg14 = "$698.00";
        String actualMsg14=checkOut.setVerifyTotalAmount1();
        Assert.assertEquals(expectedMsg14,actualMsg14,"Amount not matched");
        checkOut.setClickOnConfirmOrder();
        String expectedMsg15="Thank you";
        String actualMsg15=checkOut.setVerifyThankyou();
        Assert.assertEquals(expectedMsg15,actualMsg15,"User can not see thank you message");
        String expectedMsg16="Your order has been successfully processed!";
        String actualMsg16=checkOut.setVerifyOrderSuccessfulMessage();
        Assert.assertEquals(expectedMsg16,actualMsg16,"User is not able to see any text about order conformation");
        checkOut.finalContinueButton();
        Thread.sleep(1000);
        String expectedMsg17="Welcome to our store";
        String actualMsg17=logOutPage.setverifyWelcomeMessage();
        Assert.assertEquals(expectedMsg17,actualMsg17,"User is not able to see welcome message");
        logOutPage.setClickLogOutLink();
        String url = driver.getCurrentUrl();
        String expectedMsg18="https://demo.nopcommerce.com/";
        String actualMsg18=url;
        Assert.assertEquals(expectedMsg18,actualMsg18,"User is unable to log out");





    }

}
