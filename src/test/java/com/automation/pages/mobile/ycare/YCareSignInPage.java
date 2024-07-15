package com.automation.pages.mobile.ycare;


import com.automation.locators.ycare.YCareHomeLocators;
import com.automation.locators.ycare.YCareMainLocators;
import com.automation.locators.ycare.YCareSignInLocators;
import com.automation.pages.mobile.MobilePage;
import com.bumblebee.bumble.wrappers.decorator.CustomElementDecorator;
import com.bumblebee.bumble.wrappers.driver.WrappedDriver;
import org.openqa.selenium.support.PageFactory;

public class YCareSignInPage extends MobilePage {

    private YCareSignInLocators yCareSignInLocators = new YCareSignInLocators();
    private YCareMainLocators yCareMainLocators = new YCareMainLocators();
    private YCareHomeLocators yCareHomeLocators = new YCareHomeLocators();

    public YCareSignInPage(WrappedDriver driver) {
        super(driver);
        PageFactory.initElements(new CustomElementDecorator(driver), yCareSignInLocators);
        PageFactory.initElements(new CustomElementDecorator(driver), yCareMainLocators);
        PageFactory.initElements(new CustomElementDecorator(driver), yCareHomeLocators);
    }

    public void clickStartRegisterBtn() {

        clickElement(yCareMainLocators.loginBtn);
    }

    public void enterUsername(String text) {
        if(isElementDisplayed(yCareSignInLocators.userNameText)) {
            yCareSignInLocators.userNameText.clear();
            yCareSignInLocators.userNameText.sendKeys(text);
        }
    }



    public void enterPassword(String text) {
        yCareSignInLocators.passwordText.clear();
        yCareSignInLocators.passwordText.sendKeys(text);
    }



    public void clickSignIn() {
        clickElement(yCareSignInLocators.signInBtn);

    }


    public void verifySignInButton(){

        assert (yCareMainLocators.loginBtn.isDisplayed());
    }




}
