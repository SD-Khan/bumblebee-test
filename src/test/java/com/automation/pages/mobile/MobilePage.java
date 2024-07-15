package com.automation.pages.mobile;

import com.bumblebee.bumble.wrappers.actions.CustomActions;
import com.bumblebee.bumble.wrappers.driver.WrappedDriver;
import com.bumblebee.bumble.wrappers.element.IElement;
import com.bumblebee.bumble.wrappers.wait.ConditionWrapper;
import com.bumblebee.bumble.wrappers.wait.CustomDriverWait;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MobilePage {

    protected WrappedDriver driver;

    protected String platformName;

    protected Capabilities capabilities;

    protected WebDriverWait webDriverWait;

    private final int WAIT_FOR_ELEMENT_TIMEOUT = 10;

    public MobilePage(WrappedDriver driver){

        this.driver = driver;

        this.webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        capabilities = this.driver.getCapabilities();

        platformName = capabilities.getCapability("platformName").toString();
    }

    public void clickElement(IElement ele) {
        int count = 0;
        while (count < 3) {
            try {
                CustomDriverWait wait = new CustomDriverWait(driver, WAIT_FOR_ELEMENT_TIMEOUT);
                IElement element = wait.until(ConditionWrapper.visibilityOf(ele));
                if (element.isDisplayed()) {
                    element.click();
                    break;
                }
            } catch (StaleElementReferenceException e) {
                System.out.println("element is stale");
            }
            count++;
        }
    }

    public boolean isElementDisplayed(IElement ele) {
        boolean found = false;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_FOR_ELEMENT_TIMEOUT));
            IElement element = wait.until(ConditionWrapper.visibilityOf(ele));
            if (element.isDisplayed()) {
                found = true;
            }
        } catch (Exception e) {
            found = false;
        }
        return found;
    }

    public boolean isElementDisplayed(IElement ele, int waitTime) {
        boolean found = false;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
            IElement element = wait.until(ConditionWrapper.visibilityOf(ele));
            if (element.isDisplayed()) {
                found = true;
            }
        } catch (Exception e) {
            found = false;
        }
        return found;
    }

    public void scrollDown() {
        int pressX = driver.manage().window().getSize().width / 2;
        int bottomY = driver.manage().window().getSize().height * 4/5;
        int topY = driver.manage().window().getSize().height / 8;
        scroll(pressX, bottomY, pressX, topY);
    }

    public void scrollTop() {
        int pressX = driver.manage().window().getSize().width / 2;
        int bottomY = driver.manage().window().getSize().height * 4/5;
        int topY = driver.manage().window().getSize().height / 8;
        scroll(pressX, topY, pressX, bottomY);
    }

    public boolean scrollDownForElement(IElement element){
        for(int i = 0; i < 5; i ++ ) {
            try{
                if(element.isDisplayed()){
                    return true;
                }
            }catch (Exception e){}
            scrollDown();
        }
        return false;
    }

    public boolean scrollUpForElement(IElement element){
        for(int i = 0; i < 5; i ++ ) {
            try{
                if(element.isDisplayed()){
                    return true;
                }
            }catch (Exception e){}
            scrollDown();
        }
        return false;
    }

    public void scroll(int fromX, int fromY, int toX, int toY) {
        CustomActions touchAction = new CustomActions(driver);
        touchAction.longPress(fromX, fromY);
        touchAction.moveTo(toX, toY);
        touchAction.release();
        touchAction.perform();
    }

    public void swipeLeftOnElement(IElement element) {

        scroll(element.getCenter().getX(), element.getCenter().getY(), 0, element.getCenter().getY());
    }

//    public boolean containTextDisplayed(String text) {
//        //waitForLoadingComplete();
//        IElement element;
//        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
//            String iosText = "type == 'XCUIElementTypeStaticText' AND name CONTAINS "
//                    + "'"
//                    + text
//                    + "'";
//            element = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.iOSNsPredicateString(iosText)));
//            return false;
//        } else {
//            String selector = "new UiSelector().textContains(" + "\"" + text + "\"" + ")";
//            element = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator(selector)));
//            return (CustomElement) driver.findElement(FindBy.iOSNsPredicateString(String.format("label BEGINSWITH '%s'", text)));
//            return false;
//        }
//    }

}
