package stepdefs.browser;

import com.automation.pages.browser.CnTHomePage;
import com.bumblebee.bumble.core.managers.DriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CnTSteps {

    WebDriver driver = (WebDriver) DriverManager.get(RemoteWebDriver.class);

    private CnTHomePage homePage = new CnTHomePage(driver);

    @When("^Click on careers link$")
    public void clickCareersLink() {
        homePage.explicit_wait(2000);
        homePage.clickCareersLink();
        homePage.explicit_wait(2000);
    }

    @Then("^Click on Why We Make link$")
    public void clickWwmLink() {
        homePage.explicit_wait(2000);
        homePage.clickWwmLink();
        homePage.explicit_wait(2000);
    }

    @Then("^Click on The Things We Make link$")
    public void clickTtwmLink() {
        homePage.explicit_wait(2000);
        homePage.clickTtwmLink();
        homePage.explicit_wait(2000);
    }

    @Then("^Click on Says a Lot link$")
    public void clickSalLink() {
        homePage.explicit_wait(2000);
        homePage.clickSalLink();
        homePage.explicit_wait(2000);
    }

    @Then("^Click on About Us link$")
    public void clickAboutLink() {
        homePage.explicit_wait(2000);
        homePage.clickAboutLink();
        homePage.explicit_wait(2000);
    }

    @When("^Click on contact link$")
    public void clickContact() {
        homePage.explicit_wait(2000);
        homePage.clickContact();
        homePage.explicit_wait(2000);
    }

    @Then("^Click on close contact button to go to homepage$")
    public void clickCloseContact() {
        homePage.explicit_wait(2000);
        homePage.clickCloseContact();
        homePage.explicit_wait(2000);
    }

    @Then("^Click on close search button to go to homepage$")
    public void clickCloseSearch() {
        homePage.explicit_wait(2000);
        homePage.clickCloseSearch();
        homePage.explicit_wait(2000);
    }

    @When("^Click on Search link in nav menu$")
    public void clickSearch() {
        homePage.explicit_wait(2000);
        homePage.clickSearch();
        homePage.explicit_wait(2000);
    }
}
