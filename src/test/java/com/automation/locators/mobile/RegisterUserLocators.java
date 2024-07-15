package com.automation.locators.mobile;

import com.bumblebee.bumble.wrappers.annotations.Android;
import com.bumblebee.bumble.wrappers.annotations.IOS;
import com.bumblebee.bumble.wrappers.element.IElement;

public class RegisterUserLocators {

    public RegisterUserLocators(){
    }

    @Android(accessibility = "startUserRegistrationCD")
    @IOS(accessibility = "startUserRegistrationCD")
    public IElement startUserRegBtn; //= new CustomElement(this);

    @Android(id = "io.selendroid.testapp:id/inputUsername")
    public IElement userNameText; // = new CustomElement(this);

    @Android(accessibility = "email of the customer")
    public IElement userEmailText; // = new CustomElement(this);

    @Android(id = "io.selendroid.testapp:id/inputPassword")
    public IElement passwordText; // = new CustomElement(this);

    @Android(id = "io.selendroid.testapp:id/inputName")
    public IElement nameText; // = new CustomElement(this);

    @Android(id = "io.selendroid.testapp:id/btnRegisterUser")
    public IElement regUserBtn; // = new CustomElement(this);

}

