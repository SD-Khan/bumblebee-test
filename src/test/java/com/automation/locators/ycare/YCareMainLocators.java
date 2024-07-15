package com.automation.locators.ycare;
import com.bumblebee.bumble.wrappers.annotations.IOS;
import com.bumblebee.bumble.wrappers.element.IElement;

public class YCareMainLocators {


    public YCareMainLocators(){

    }
    @IOS(accessibility = "logInButton")
    public IElement loginBtn;

    @IOS(accessibility = "ymlLogoImageView")
    public IElement imgYMLLogo;

    @IOS(accessibility = "signUpButton")
    public IElement signUpBtn;


}
