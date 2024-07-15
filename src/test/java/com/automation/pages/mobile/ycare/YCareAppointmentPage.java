package com.automation.pages.mobile.ycare;


import com.automation.locators.ycare.YCareAppointmentLocators;
import com.automation.pages.mobile.MobilePage;
import com.bumblebee.bumble.wrappers.decorator.CustomElementDecorator;
import com.bumblebee.bumble.wrappers.driver.WrappedDriver;
import org.openqa.selenium.support.PageFactory;

public class YCareAppointmentPage extends MobilePage {

    private YCareAppointmentLocators yCareAppointmentLocators = new YCareAppointmentLocators();


    public YCareAppointmentPage(WrappedDriver driver) {
        super(driver);

        PageFactory.initElements(new CustomElementDecorator(driver), yCareAppointmentLocators);
    }

    public void clickAppointmentsBtn() {
        clickElement(yCareAppointmentLocators.appointmentsBtn);
    }

    public void verifyAppointmentsHeader() {
        assert (yCareAppointmentLocators.appointmentsHeader.isDisplayed());
    }

    public void clickAddBtn() {
        clickElement(yCareAppointmentLocators.addBtn);
    }

    public void verifyFindCareHeader() {
        assert (yCareAppointmentLocators.findCareHeader.isDisplayed());
    }

    public void clickHelpMeFindCareBtn() {
        clickElement(yCareAppointmentLocators.helpMeFindCareBtn);
    }

    public void verifyFindCareTitle() {
        assert (yCareAppointmentLocators.findCareTitle.isDisplayed());
    }

    public void clickPCPBtn() {
        clickElement(yCareAppointmentLocators.PCPBtn);
    }

    public void verifyPCPTitle() {
        assert (yCareAppointmentLocators.PCPTitle.isDisplayed());
    }

    public void clickSearchBtn() {
        clickElement(yCareAppointmentLocators.searchBtn);
    }

    public void enterPCPName(String text) {
        yCareAppointmentLocators.searchfield.sendKeys(text);
    }

    public void clickFirstProviderBtn() {
        clickElement(yCareAppointmentLocators.firstProvider);
    }

    public void clickScheduleAppointmentBtn() {
        clickElement(yCareAppointmentLocators.scheduleAppointmentBtn);
    }

    public void verifyReasonForVisitTitle() {
        assert (yCareAppointmentLocators.reasonForVisitTitle.isDisplayed());
    }

    public void clickIllnessBtn() {
        clickElement(yCareAppointmentLocators.illnessBtn);
    }

    public void verifyAppointmentTypeTitle() {
        assert (yCareAppointmentLocators.appointmentTypeTitle.isDisplayed());
    }

    public void clickOfficeVisitBtn() {
        clickElement(yCareAppointmentLocators.officeVisitBtn);
    }

    public void verifyFacilityLocationOption() {
        assert (yCareAppointmentLocators.facilityLocationOption.isDisplayed());
    }

    public void clickFacilityLocationOption() {
        clickElement(yCareAppointmentLocators.facilityLocationOption);
    }

    public void clickAppointmentTime(){
        clickElement(yCareAppointmentLocators.careTime);
    }
    public void clickScheduleAppointBtn(){
        clickElement(yCareAppointmentLocators.scheduleAppointBtn);

    }
    public void clickDoneBtn(){
        clickElement(yCareAppointmentLocators.doneBtn);

    }

    public void scrollToAppointmentCard(){
        scrollDownForElement(yCareAppointmentLocators.appoitmentCard);

    }

    public void clickCancelBtn(){
        clickElement(yCareAppointmentLocators.cancelAppointmentBtn);

    }

    public void selReasonforCancellation(){
        clickElement(yCareAppointmentLocators.reasontoCancel);
    }
    public void selCancellationReason(){
        clickElement(yCareAppointmentLocators.selReansontoCancel);
    }
    public void reasonforCancellationSel(){
        clickElement(yCareAppointmentLocators.reasontoCancelSel);
    }

    public void clickCanBtn(){
        clickElement(yCareAppointmentLocators.cancelAppointBtn);

    }


    public void verifyCancelScrn(){
        clickElement(yCareAppointmentLocators.cancelledLabel);

    }
    public void clickCancelOKBtn(){
        clickElement(yCareAppointmentLocators.cancelOkBtn);


    }




    public void verifyAppointmentCardCancelled(){
        assert(!yCareAppointmentLocators.appoitmentCard.isDisplayed());
    }

    public void clickAppointmentCard(){
        clickElement(yCareAppointmentLocators.appoitmentCard);
    }


}
