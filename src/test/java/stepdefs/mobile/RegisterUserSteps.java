package stepdefs.mobile;

import com.automation.pages.mobile.RegisterUserPage;
import com.bumblebee.bumble.core.managers.DriverManager;
import com.bumblebee.bumble.core.testdata.TestCaseData;
import com.bumblebee.bumble.wrappers.driver.WrappedDriver;
import io.cucumber.java.en.Then;

public class RegisterUserSteps {

    WrappedDriver driver = (WrappedDriver) DriverManager.get(WrappedDriver.class);
    RegisterUserPage registerUserPage = new RegisterUserPage(driver);


    @Then("^Click on start register button$")
    public void clickMenuButton() {
        registerUserPage.clickStartRegisterBtn();
    }

    @Then("^Click and enter the User$")
    public void enterUsername() {
        registerUserPage.enterUsername(TestCaseData.get("UserName"));
    }

    @Then("^Click and enter the email$")
    public void enterEmail() {
        registerUserPage.enterEmail(TestCaseData.get("Email"));
    }

    @Then("^Click and enter the password test app$")
    public void enterPassword() {
        registerUserPage.enterPassword(TestCaseData.get("password"));
    }

    @Then("^Click and enter the full name$")
    public void enterFullName() {
        registerUserPage.enterFullName(TestCaseData.get("FullName"));
    }

    @Then("^click on submit user button$")
    public void clickSubmit() {
        registerUserPage.clickSubmit();
    }
}
