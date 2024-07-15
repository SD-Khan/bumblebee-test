package com.automation.locators.ycare;

import com.bumblebee.bumble.wrappers.annotations.IOS;
import com.bumblebee.bumble.wrappers.element.IElement;

public class YCareAppointmentLocators {


    public YCareAppointmentLocators(){
    }

    @IOS(accessibility = "appointments")
    public IElement appointmentsBtn;

    @IOS(xpath = "//XCUIElementTypeStaticText[@name=\"titleHeader\"]")
    public IElement appointmentsHeader;

    @IOS(accessibility = "ADD")
    public IElement addBtn;

    @IOS(xpath = "//XCUIElementTypeStaticText[@name=\"headerLabel\"]")
    public IElement findCareHeader;

    @IOS(xpath = "//XCUIElementTypeStaticText[@name=\"HELP ME FIND CARE\"]")
    public IElement helpMeFindCareBtn;

    @IOS(xpath = " //XCUIElementTypeStaticText[@name=\"Find Care\"]")
    public IElement findCareTitle;

    @IOS(xpath = "//XCUIElementTypeImage/XCUIElementTypeStaticText[@name=\"Pcp\"]")
    public IElement PCPBtn;

    @IOS(xpath = "//XCUIElementTypeStaticText[@name=\"titleLabel-PCP\"]")
    public IElement PCPTitle;

    @IOS(accessibility = "searchField")
    public IElement searchBtn;

    @IOS(accessibility = "searchTextField")
    public IElement searchfield;
    @IOS(xpath = "//XCUIElementTypeCell[@name=\"YCProviderTableViewCell-0-0\"]/\t\n" +
            "XCUIElementTypeStaticText[@name=\"providerNameLabel-\"]")
    public IElement firstProvider;

    @IOS(accessibility = "SCHEDULE APPOINTMENT")
    public IElement scheduleAppointmentBtn;

    @IOS(xpath = "//XCUIElementTypeStaticText[@name=\"headerTitleLabel\"]")
    public IElement reasonForVisitTitle;

    @IOS(xpath = " //XCUIElementTypeButton[@name=\"Back pain\"]")
    public IElement illnessBtn;

    @IOS(xpath = "//XCUIElementTypeStaticText[@name=\"headerTitleLabel\"]")
    public IElement appointmentTypeTitle;

    @IOS(accessibility = "Office Visit")
    public IElement officeVisitBtn;

    @IOS(accessibility = "Video Visit")
    public IElement videoVisitBtn;
    // @IOS(accessibility = "Location card for Measured Wellness Llc at 47 Seaverns Ave # 5 Brookline, MA 024463806 Attending hours: 8 AM - 2 PM - Mon, Tue, Wed, Thu, Fri")
    @IOS(xpath = "//XCUIElementTypeStaticText[@name=\"headerTitleLabel\"]/ancestor::XCUIElementTypeTable/XCUIElementTypeCell")
    public IElement facilityLocationOption;



    // @IOS(xpath="//XCUIElementTypeStaticText[@name=\"titleLabel-5\"and @label =\"WED\"]/following-sibling::XCUIElementTypeStaticText[@name=\"descriptionLabel-5\" and @label = \"19\"]" +
    //        "/ancestor::XCUIElementTypeCell/XCUIElementTypeCollectionView/descendant::XCUIElementTypeButton[@name=\"titleView-0\" and @label=\"6:00 AM\"]")
    @IOS(xpath="//XCUIElementTypeStaticText[@name=\"titleLabel-5\"]/following-sibling::XCUIElementTypeStaticText[@name=\"descriptionLabel-5\"]" +
            "/ancestor::XCUIElementTypeCell/XCUIElementTypeCollectionView/descendant::XCUIElementTypeButton[@name=\"titleView-0\"]")

    public IElement careTime;

    @IOS(accessibility = "scheduleAppointmentButton")
    public IElement scheduleAppointBtn;

    @IOS(accessibility = "DONE")
    public IElement doneBtn;

    @IOS(accessibility = "Appointment card for Back Pain with Dr.Leslie Crona, RN on Friday, Apr 21 at 6:00 AM at Measured Wellness Llc")
    public IElement appoitmentCard;

    @IOS(accessibility = "cancelAppointmentButton")
    public IElement cancelAppointmentBtn;

    @IOS(accessibility = "Reason for cancellation")
    public IElement reasontoCancel;
    @IOS(accessibility = "Reason for cancellation is Error")
    public IElement reasontoCancelSel;

    @IOS(accessibility = "titleLabel-Error")
    public IElement selReansontoCancel;

    @IOS(accessibility = "cancelAppointmentButton")
    public IElement cancelAppointBtn;

    @IOS(accessibility = "OK")
    public IElement cancelOkBtn;

    @IOS(accessibility = "cancelledLabel")
    public IElement cancelledLabel;

}
