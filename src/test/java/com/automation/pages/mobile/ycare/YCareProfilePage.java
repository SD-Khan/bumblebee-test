package com.automation.pages.mobile.ycare;

import com.automation.locators.ycare.YCareProfileLocators;
import com.automation.pages.mobile.MobilePage;
import com.bumblebee.bumble.wrappers.decorator.CustomElementDecorator;
import com.bumblebee.bumble.wrappers.driver.WrappedDriver;
import org.openqa.selenium.support.PageFactory;

public class YCareProfilePage extends MobilePage {

    private YCareProfileLocators yCareProfileLocators = new YCareProfileLocators();



    public YCareProfilePage(WrappedDriver driver) {
        super(driver);

        PageFactory.initElements(new CustomElementDecorator(driver), yCareProfileLocators);

    }


    public void clickLogoutBtn() {
//        IElement ele = (IElement) driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Logout\"]");
//        ele.click();
        clickElement(yCareProfileLocators.logoutBtn);

    }
}
