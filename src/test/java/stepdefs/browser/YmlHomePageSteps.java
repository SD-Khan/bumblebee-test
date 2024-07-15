package stepdefs.browser;

import com.automation.pages.browser.HomePage;
import com.bumblebee.bumble.core.managers.DriverManager;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class YmlHomePageSteps {

    WebDriver driver = (WebDriver) DriverManager.get(RemoteWebDriver.class);

    private HomePage homePage = new HomePage(driver);

    @Then("^Click on menu icon$")
    public void clickMenuButton() {
        homePage.explicit_wait(2000);

        homePage.clickMenuButton();

        homePage.explicit_wait(2000);
    }

    @Then("^Click on About Link in menu$")
    public void clickAboutButton() {
        homePage.explicit_wait(2000);

        homePage.clickAboutLink();

        homePage.explicit_wait(2000);
    }

    @Then("^Click on Expertise Link in menu$")
    public void clickExpertiseButton() {
        homePage.explicit_wait(2000);

        homePage.clickExpertiseLink();

        homePage.explicit_wait(2000);
    }

    @Then("^Navigate to welcome screen$")
    public void clickWorkButton() {
        homePage.explicit_wait(2000);

        homePage.clickWelcomeLink();

        homePage.explicit_wait(2000);
    }

    @Then("the scenario is intentionally failed")
    public void theScenarioIsIntentionallyFailed() {
        Assert.assertFalse("Failing this step intentionally !!!", true);
    }
}