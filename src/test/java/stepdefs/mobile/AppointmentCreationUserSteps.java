package stepdefs.mobile;


import com.automation.pages.mobile.ycare.YCareAppointmentPage;
import com.automation.pages.mobile.ycare.YCareHomePage;
import com.automation.pages.mobile.ycare.YCareProfilePage;
import com.automation.pages.mobile.ycare.YCareSignInPage;
import com.bumblebee.bumble.core.global.Context;
import com.bumblebee.bumble.core.managers.DriverManager;
import com.bumblebee.bumble.core.testdata.TestCaseData;
import com.bumblebee.bumble.wrappers.driver.WrappedDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Arrays;

public class AppointmentCreationUserSteps {

    Context context;

    WrappedDriver driver = (WrappedDriver) DriverManager.get(WrappedDriver.class);
    YCareSignInPage yCareSignInPage = new YCareSignInPage(driver);
    YCareHomePage yCareHomePage = new YCareHomePage(driver);
    YCareProfilePage yCareProfilePage = new YCareProfilePage(driver);
    YCareAppointmentPage yCareAppointmentPage = new YCareAppointmentPage(driver);

    public AppointmentCreationUserSteps(Context context) {

        this.context = context;

    }

    //Click on Appointments button from Home page
    @When("^Click on Appointments button$")
    public void clickAppointmentsBtn() {
        yCareAppointmentPage.clickAppointmentsBtn();
    }

    //Verify the presence of Appointments header after Appointments button tapped from Home page
    @Then("^Verify you are on Appointments Page$")
    public void verifyAppointmentsHeader() {
        yCareAppointmentPage.verifyAppointmentsHeader();
    }

    //Click on ADD button on Appointments page
    @When("^Click on ADD button$")
    public void clickAddBtn() {
        yCareAppointmentPage.clickAddBtn();
    }

    //Verify the presence of Find Care header with "Who would you like to see?" text
    @Then("^Verify you are on Find Care Page$")
    public void verifyFindCareHeader() {
        yCareAppointmentPage.verifyFindCareHeader();
    }

    //Click on HELP ME FIND CARE button on Find Care page
    @Then("^Click on HELP ME FIND CARE button$")
    public void clickHelpMeFindCareBtn() {
        yCareAppointmentPage.clickHelpMeFindCareBtn();
    }

    //Verify the presence of Find Care header with different Medical departments
    @Then("^Verify you are on Find Care Page with different Medical departments$")
    public void verifyFindCareTitle() {
        yCareAppointmentPage.verifyFindCareTitle();
    }

    //Click on PCP button on Find Care page
    @Then("^Click on PCP button$")
    public void clickPCPBtn() {
        yCareAppointmentPage.clickPCPBtn();
    }

    //Verify the presence of PCP header title after selecting on PCP option
    @Then("^Verify you are on PCP All Providers Page$")
    public void verifyPCPTitle() {
        yCareAppointmentPage.verifyPCPTitle();
    }

    //Click on First available PCP Provider on PCP page
    @Then("^Click on First available PCP Provider$")
    public void clickFirstProviderBtn() {
        yCareAppointmentPage.clickFirstProviderBtn();
    }

    @Then("^Click on Search Button and add PCP Name$")
    public void clickSearchBtn() {
        yCareAppointmentPage.clickSearchBtn();
    }

    @Then("^Enter PCP Name$")
    public void enterPCPName() {
        yCareAppointmentPage.enterPCPName(TestCaseData.get("PCPName"));
    }

    //Click on SCHEDULE APPOINTMENT button on PCP Selected Provider page
    @Then("^Click on SCHEDULE APPOINTMENT button$")
    public void clickScheduleAppointmentBtn() {
        yCareAppointmentPage.clickScheduleAppointmentBtn();
    }

    //Verify the presence of Schedule Appointment Page with reasons to visit title
    @Then("^Verify you are on Schedule Appointment Page with reasons to visit$")
    public void verifyReasonForVisitTitle() {
        yCareAppointmentPage.verifyReasonForVisitTitle();
    }

    //Click on Illness option from Appointment reason to visit page
    @Then("^Click on Illness visit reason$")
    public void clickIllnessBtn() {
        yCareAppointmentPage.clickIllnessBtn();
    }

    //Verify the presence of Schedule Appointment Page with appointment type title
    @Then("^Verify you are on Schedule Appointment Page with appointment type$")
    public void verifyAppointmentTypeTitle() {
        yCareAppointmentPage.verifyAppointmentTypeTitle();
    }

    //Click on Office Visit button
    @Then("^Click on Office Visit appointment type$")
    public void clickOfficeVisitBtn() {
        yCareAppointmentPage.clickOfficeVisitBtn();
    }

    //Verify the presence of Schedule Appointment Page with facility location details option
    @Then("^Verify you are on Schedule Appointment Page with facility location option$")
    public void verifyFacilityLocationOption() {
        yCareAppointmentPage.verifyFacilityLocationOption();
    }

    //Click the facility location option
    @Then("^Click on Facility location option$")
    public void clickFacilityLocationOption() {
        yCareAppointmentPage.clickFacilityLocationOption();
    }

    @Then("^Click for Proper Appointment Time$")
    public void clickAppointmentTime() {
        yCareAppointmentPage.clickAppointmentTime();
    }

    @Then("^Click on Scheduling the Appointment Button$")
    public void clickScheduleAppointment() {
        yCareAppointmentPage.clickScheduleAppointBtn();
    }

    @Then("^Click on Done Button$")
    public void clickDoneButton() {
        yCareAppointmentPage.clickDoneBtn();
    }


    @When("^Scroll to the Appointment Created$")
    public void scrolltoAppointmentCard() {
        yCareAppointmentPage.scrollToAppointmentCard();
    }

    @Then("^Click on the Appointment Created$")
    public void clickOnAppointmentCard() {
        yCareAppointmentPage.clickAppointmentCard();
    }

    @Then("^Click on Cancel Appointment Button$")
    public void clickCancelButton() {
        yCareAppointmentPage.clickCancelBtn();
    }


    @Then("^Select the Reason for Cancellation$")
    public void selReasonCancel() {
        yCareAppointmentPage.selReasonforCancellation();
        yCareAppointmentPage.selCancellationReason();
    }

    @Then("^Verify Cancellation reason is selected$")
    public void verifyReasonSel() {
        yCareAppointmentPage.reasonforCancellationSel();
    }

    @Then("^Click on Cancel Appointment Button after Providing Reason$")
    public void clickCanButton() {
        yCareAppointmentPage.clickCanBtn();
    }

    @Then("^Verify Cancelled Screen$")
    public void verifyCancelledScrn() {
        yCareAppointmentPage.verifyCancelScrn();
    }

    @Then("^Click on OK Button to Navigate back to Home Screen$")
    public void clickCancelOKButton() {
        yCareAppointmentPage.clickCancelOKBtn();
    }

    @Then("^Verify Appointment is Cancelled$")
    public void verifyAppointmentCancelled() {
        yCareAppointmentPage.scrollToAppointmentCard();
        yCareAppointmentPage.verifyAppointmentCardCancelled();
    }
}
