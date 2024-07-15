package com.automation.locators.browser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class YmlHomePageElements {

    @FindBy(xpath = "//lottie-player[@src='https://yml.co/images/btn-menu.json']//*[name()='svg']")
    public WebElement menuButton;

    @FindBy(xpath = "//span[@data-letter='About']")
    public WebElement aboutLink;

    @FindBy(xpath = "//span[@data-letter='Expertise']")
    public WebElement expertiseLink;

    @FindBy(xpath = "//span[@data-letter='Welcome']")
    public WebElement welcomeLink;
}
