package com.automation.locators.ycare;

import com.bumblebee.bumble.wrappers.annotations.IOS;
import com.bumblebee.bumble.wrappers.element.IElement;


public class YCareSignInLocators {

    public YCareSignInLocators(){
    }




    @IOS(accessibility= "User Name")
    public IElement userNameText;



    @IOS(accessibility = "Password")
    public IElement passwordText;



    @IOS(xpath = "//XCUIElementTypeButton[@name=\"Sign In\"]")
    public IElement signInBtn;

    @IOS(accessibility = "")
    public IElement forgotPwdChk;


}

