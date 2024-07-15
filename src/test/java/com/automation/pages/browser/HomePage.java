package com.automation.pages.browser;

import com.automation.locators.browser.YmlHomePageElements;
import com.automation.pages.browser.BrowserPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BrowserPage {

    YmlHomePageElements homePageElements = new YmlHomePageElements();

    public HomePage(WebDriver driver) {

        super(driver);

        PageFactory.initElements(driver, homePageElements);
    }

    public void clickMenuButton(){

        homePageElements.menuButton.click();
    }

    public void clickAboutLink(){

        homePageElements.aboutLink.click();
    }

    public void clickExpertiseLink(){

        homePageElements.expertiseLink.click();
    }

    public void clickWelcomeLink(){

        homePageElements.welcomeLink.click();
    }
}
