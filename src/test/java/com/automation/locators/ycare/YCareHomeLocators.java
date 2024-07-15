package com.automation.locators.ycare;

import com.bumblebee.bumble.wrappers.annotations.Android;
import com.bumblebee.bumble.wrappers.annotations.IOS;
import com.bumblebee.bumble.wrappers.element.IElement;

public class YCareHomeLocators {


    public YCareHomeLocators(){

    }

    @Android
    @IOS(accessibility = "home")
    public IElement homeBtn;

    @IOS(accessibility = "patientNameLabel")
    public IElement patient;

    @IOS(accessibility = "profile")
    public IElement profileBtn;
}
