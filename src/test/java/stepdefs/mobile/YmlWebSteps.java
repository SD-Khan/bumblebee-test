package stepdefs.mobile;

import com.automation.pages.mobile.YmlWebPage;
import com.bumblebee.bumble.core.managers.DriverManager;
import com.bumblebee.bumble.wrappers.driver.WrappedDriver;
import io.cucumber.java.en.Then;
import java.util.Set;

public class YmlWebSteps {

    WrappedDriver driver = (WrappedDriver) DriverManager.get(WrappedDriver.class);
    YmlWebPage ymlWebPage = new YmlWebPage(driver);

    @Then("^Click on yml menu icon$")
    public void clickMenuButton() {
        Set<String> contexts = driver.getContextHandles();
        driver.setContext(contexts.toArray()[1].toString());
        ymlWebPage.clickMenuBtn();
    }

    @Then("^Click on yml About Link in menu$")
    public void clickAboutButton() {
        ymlWebPage.clickAboutLink();
    }

    @Then("^Click on yml Expertise Link in menu$")
    public void clickExpertiseButton() {
        ymlWebPage.clickExpertiseLink();
    }

    @Then("^Navigate to yml welcome screen$")
    public void clickWelcomeButton() {
        ymlWebPage.clickWelcomeLink();
    }
}
