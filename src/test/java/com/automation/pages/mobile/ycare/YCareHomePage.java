package com.automation.pages.mobile.ycare;

import com.automation.locators.ycare.YCareHomeLocators;
import com.automation.locators.ycare.YCareProfileLocators;
import com.automation.pages.mobile.MobilePage;
import com.bumblebee.bumble.wrappers.decorator.CustomElementDecorator;
import com.bumblebee.bumble.wrappers.driver.WrappedDriver;
import org.openqa.selenium.support.PageFactory;

public class YCareHomePage extends MobilePage {


    private YCareProfileLocators yCareProfileLocators = new YCareProfileLocators();
    private YCareHomeLocators yCareHomeLocators = new YCareHomeLocators();



    public YCareHomePage(WrappedDriver driver) {
        super(driver);
        PageFactory.initElements(new CustomElementDecorator(driver), yCareHomeLocators);
        PageFactory.initElements(new CustomElementDecorator(driver), yCareProfileLocators);

    }


    public void clickProfileBtn() {
        clickElement(yCareHomeLocators.profileBtn);

    }

    public void verifyHomeButton(){
        assert(yCareHomeLocators.homeBtn.isSelected() );
       // assert (yCareHomeLocators.patient.isDisplayed());

    }
}
