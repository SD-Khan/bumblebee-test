package com.automation.pages.mobile;

import com.automation.locators.mobile.RegisterUserLocators;
import com.bumblebee.bumble.wrappers.decorator.CustomElementDecorator;
import com.bumblebee.bumble.wrappers.driver.WrappedDriver;
import lombok.SneakyThrows;
import org.openqa.selenium.support.PageFactory;

public class RegisterUserPage extends MobilePage{

    private RegisterUserLocators registerUserElements = new RegisterUserLocators();

    public RegisterUserPage(WrappedDriver driver) {
        super(driver);
        PageFactory.initElements(new CustomElementDecorator(driver), registerUserElements);
    }

    public void clickStartRegisterBtn() {
        clickElement(registerUserElements.startUserRegBtn);
    }

    public void enterUsername(String text) {
        if(isElementDisplayed(registerUserElements.userNameText)) {
            registerUserElements.userNameText.clear();
            registerUserElements.userNameText.sendKeys(text);
        }
    }

    public void enterEmail(String text) {
        registerUserElements.userEmailText.clear();
        registerUserElements.userEmailText.sendKeys(text);
    }

    public void enterPassword(String text) {
        registerUserElements.passwordText.clear();
        registerUserElements.passwordText.sendKeys(text);
    }

    public void enterFullName(String text) {
        registerUserElements.nameText.clear();
        registerUserElements.nameText.sendKeys(text);
        driver.hideKeyboard();
    }

    @SneakyThrows
    public void clickSubmit() {
        clickElement(registerUserElements.startUserRegBtn);
    }
}
