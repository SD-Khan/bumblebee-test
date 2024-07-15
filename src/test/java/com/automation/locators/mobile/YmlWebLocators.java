package com.automation.locators.mobile;

import com.bumblebee.bumble.wrappers.annotations.Android;
import com.bumblebee.bumble.wrappers.element.IElement;

public class YmlWebLocators {

    @Android(id = "btn-menu")
    public IElement menuBtn;

    @Android(accessibility = "Welcome")
    public IElement welcomeLink;

    @Android(accessibility = "Work")
    public IElement workLink;

    @Android(accessibility = "About")
    public IElement aboutLink;

    @Android(accessibility = "Expertise")
    public IElement expertiseLink;

    @Android(accessibility = "Impact")
    public IElement impactLink;

    @Android(accessibility = "Contact")
    public IElement contactLink;

    @Android(accessibility = "Careers")
    public IElement careersLink;
}
