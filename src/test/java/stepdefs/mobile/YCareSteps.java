package stepdefs.mobile;

import com.automation.pages.mobile.ycare.YCareHomePage;
import com.automation.pages.mobile.ycare.YCareProfilePage;
import com.automation.pages.mobile.ycare.YCareSignInPage;
import com.bumblebee.bumble.core.managers.DriverManager;
import com.bumblebee.bumble.core.testdata.TestCaseData;
import com.bumblebee.bumble.wrappers.driver.WrappedDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class YCareSteps {

    WrappedDriver driver = (WrappedDriver) DriverManager.get(WrappedDriver.class);
    YCareSignInPage yCareSignInPage = new YCareSignInPage(driver);
    YCareHomePage yCareHomePage = new YCareHomePage(driver);
    YCareProfilePage yCareProfilePage = new YCareProfilePage(driver);

    @When("^Click on Sign In button$")
    public void clickSignInButton() {
        yCareSignInPage.clickStartRegisterBtn();
    }


    @When("^Click and enter the Username$")
    public void enterUsername() {
        yCareSignInPage.enterUsername(TestCaseData.get("UserName"));
    }


    @Then("^Click and enter the password$")
    public void enterPassword() {
        yCareSignInPage.enterPassword(TestCaseData.get("password"));
    }


    @Then("^Click on Sign In button to Sign In$")
    public void clickSignIn() {
        yCareSignInPage.clickSignIn();
    }

    @Then("^Verify you are on Home Page$")
    public void verifyHomeButton() {
        yCareHomePage.verifyHomeButton();
    }

    @Then("^Click on Profile button$")
    public void clickProfile() {

        try {
            Thread.sleep(30000);
            yCareHomePage.clickProfileBtn();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    @Then("^Click on Logout button to Logout$")
    public void clickLogout() {
        yCareProfilePage.clickLogoutBtn();
    }

    @Then("^Verify you have landed on the Login Screen$")
    public void verifySignInButton() {
        yCareSignInPage.verifySignInButton();
    }
}
