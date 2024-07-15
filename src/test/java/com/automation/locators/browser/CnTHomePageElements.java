package com.automation.locators.browser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CnTHomePageElements {


    @FindBy(xpath = "//a[normalize-space()='Careers']")
    public WebElement careers;

    @FindBy(xpath = "//a[normalize-space()='Why We Make']")
    public WebElement whyWeMake;

    @FindBy(xpath = "//a[normalize-space()='The Things We Make']")
    public WebElement theThingsWeMake;

    @FindBy(xpath = "//a[normalize-space()='Says a Lot']")
    public WebElement saysALot;

    @FindBy(xpath = "//a[normalize-space()='About Us']")
    public WebElement aboutUs;

    @FindBy(id = "contact-ip")
    public WebElement contact;

    @FindBy(id = "nav-search-btn")
    public WebElement search;

    @FindBy(xpath = "//button[@aria-label='Close Contact Overlay']")
    public WebElement closeContact;

    @FindBy(xpath = "//button[@aria-label='Close Search Overlay']")
    public WebElement closeSearch;
}
