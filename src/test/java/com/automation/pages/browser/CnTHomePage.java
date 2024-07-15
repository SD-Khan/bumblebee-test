package com.automation.pages.browser;

import com.automation.locators.browser.CnTHomePageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CnTHomePage extends BrowserPage{

    CnTHomePageElements cnTHomePageElements = new CnTHomePageElements();
    public CnTHomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, cnTHomePageElements);
    }


    public void clickCareersLink() {
        cnTHomePageElements.careers.click();
    }

    public void clickWwmLink() {
        cnTHomePageElements.whyWeMake.click();
    }

    public void clickTtwmLink() {
        cnTHomePageElements.theThingsWeMake.click();
    }

    public void clickSalLink() {
        cnTHomePageElements.saysALot.click();
    }

    public void clickAboutLink() {
        cnTHomePageElements.aboutUs.click();
    }

    public void clickContact() {
        cnTHomePageElements.contact.click();
    }

    public void clickCloseContact() {
        cnTHomePageElements.closeContact.click();
    }

    public void clickSearch() {
        cnTHomePageElements.search.click();
    }

    public void clickCloseSearch() {
        cnTHomePageElements.closeSearch.click();
    }
}
