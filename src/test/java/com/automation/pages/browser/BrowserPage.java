package com.automation.pages.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserPage {

    protected WebDriver driver;

    public BrowserPage(WebDriver driver){

        this.driver = driver;
    }

    public void explicit_wait(long timeOut) {
        try {
            Thread.sleep(timeOut);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
