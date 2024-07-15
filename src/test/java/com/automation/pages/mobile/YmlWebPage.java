package com.automation.pages.mobile;

import com.automation.locators.mobile.YmlWebLocators;
import com.bumblebee.bumble.wrappers.decorator.CustomElementDecorator;
import com.bumblebee.bumble.wrappers.driver.WrappedDriver;
import org.openqa.selenium.support.PageFactory;

public class YmlWebPage extends MobilePage{

    YmlWebLocators ymlWebLocators = new YmlWebLocators();

    public YmlWebPage(WrappedDriver driver) {
        super(driver);
        PageFactory.initElements(new CustomElementDecorator(driver), ymlWebLocators);
    }

    public void clickMenuBtn(){

        clickElement(ymlWebLocators.menuBtn);
    }

    public void clickWelcomeLink(){

        clickElement(ymlWebLocators.welcomeLink);
    }

    public void clickWorkLink(){

        clickElement(ymlWebLocators.workLink);
    }

    public void clickAboutLink(){

        clickElement(ymlWebLocators.aboutLink);
    }

    public void clickExpertiseLink(){

        clickElement(ymlWebLocators.expertiseLink);
    }

    public void clickImpactLink(){

        clickElement(ymlWebLocators.impactLink);
    }

    public void clickContactLink(){

        clickElement(ymlWebLocators.contactLink);
    }

    public void clickCareersLink(){

        clickElement(ymlWebLocators.careersLink);
    }
}
