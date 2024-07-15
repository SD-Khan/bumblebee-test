package com.automation.locators.mobile;

import com.bumblebee.bumble.wrappers.driver.WrappedDriver;

public class CommonLocator {

    protected WrappedDriver driver;

    protected String platformName;

    public CommonLocator(WrappedDriver driver, String platformName){

        this.driver = driver;

        this.platformName = platformName;
    }
}
