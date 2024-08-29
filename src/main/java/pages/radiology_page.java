package pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class radiology_page extends StartupPage {

	public By getPageBarFixedLocator(String navBarName) {
		if (navBarName.equalsIgnoreCase("list requests")) {
			navBarName = "ImagingRequisitionList";
		} else if (navBarName.equalsIgnoreCase("list reports")) {
			navBarName = "ImagingReportsList";
		} else if (navBarName.equalsIgnoreCase("edit doctors")) {
			navBarName = "EditDoctors";
		} else if (navBarName.equalsIgnoreCase("ward billing")) {
			navBarName = "InpatientList";
		}
		return By.xpath(" ");
	}
	
	public By getButtonLocatorsBytext(String buttonName) {
		return By.xpath(" ");
	}

	public radiology_page(WebDriver driver) {
		super(driver);
	}

	/**
	 * @Test1.1 about this method loginTohealthAppByGivenValidCredetial()
	 * 
	 * @param : Map<String, String>
	 * @description : fill usernameTextbox & passwordTextbox and click on sign in
	 *              button
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
		
		return false;
	}

	/**
	 * @Test1.2 and @Test15.1 about this method scrollDownAndClickRadiologyTab()
	 * 
	 * @param : null
	 * @description : verify the radiology tab, scroll to it, and click it
	 * @return : String
	 * @author : YAKSHA
	 */
	public void scrollDownAndClickRadiologyTab() throws Exception {
		
	}

	/**
	 * @Test1.3 about this method verifyRadiologyPageUrl()
	 * 
	 * @param : null
	 * @description : verify radiology page url
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyRadiologyPageUrl() throws Exception {
		return null;
	}

	/**
	 * @Test2 @Test4.2 @Test4.3 @Test4.4 @Test4.5 @Test4.6
	 * about this method highlightAndVerifyWhetherElementIsDisplayed
	 * 
	 * @param element : By - Locator of the element to be highlighted and verified
	 * @description : This method verifies whether an element is displayed on the
	 *              page, highlights it if displayed, and returns true if displayed.
	 * @return : boolean - true if the element is displayed, otherwise false
	 * @author : YAKSHA
	 */
	public boolean highlightAndVerifyWhetherElementIsDisplayed(By element) {
		return false;
	}

	/**
	 * @Test3 about this method verifyUrlRadiologyModule()
	 * 
	 * @description This method verifies that the "List Requests" tab is present in
	 *              the Radiology module and returns the current URL of the page.
	 * @return String - The current URL of the page after verifying the "List
	 *         Requests" tab.
	 * @throws Exception - If there is an issue locating the "List Requests" tab or
	 *                   verifying its text.
	 * @autor YAKSHA
	 */
	public String verifyUrlRadiologyModule() throws Exception {
		return null;
	}

	/**
	 * @Test4.1 about this method applyDateFilter()
	 * 
	 * @param : String, String
	 * @description : Applies the date filter with date range
	 * @return : void
	 * @throws : Exception - if there is an issue finding or filling the date fields
	 * @author : YAKSHA
	 */
	public boolean applyDateFilter(String fromDate, String toDate) throws Exception {
		
		return false;
	}

	/**
	 * @Test4.7 about this method verifySearchBarIsDisplayed()
	 * 
	 * @param : null
	 * @description : This method verifies if the search bar is visible
	 * @return : boolean
	 * @throws : Exception - if there is an issue finding the search bar or it is
	 *           not visible
	 * @author : YAKSHA
	 */
	public boolean verifySearchBarIsDisplayed() {
		return false;
	}

	/**
	 * @Test4.8 about this method verifyDateRangeButtonIsDisplayed()
	 * 
	 * @param : null
	 * @description : This method verifies if the date range button is visible
	 * @return : boolean
	 * @throws : Exception - if there is an issue finding the date range button or
	 *           it is not visible
	 * @author : YAKSHA
	 */
	public boolean verifyDateRangeButtonIsDisplayed() {
		return false;
	}

	/**
	 * @Test4.9 about this method verifyFilterDropdownIsDisplayed()
	 * 
	 * @param : null
	 * @description : This method verifies if the filter dropdown is visible
	 * @return : boolean
	 * @throws : Exception - if there is an issue finding the filter dropdown or it
	 *           is not visible
	 * @author : YAKSHA
	 */
	public boolean verifyFilterDropdownIsDisplayed() {
		return false;
	}

	/**
	 * @Test4.10 about this method verifyFromDateFieldIsDisplayed()
	 * 
	 * @param : null
	 * @description : This method verifies if the "from date" field is visible
	 * @return : boolean
	 * @throws : Exception - if there is an issue finding the "from date" field or
	 *           it is not visible
	 * @author : YAKSHA
	 */
	public boolean verifyFromDateFieldIsDisplayed() {
		return false;
	}

	/**
	 * @Test4.11 about this method verifyToDateFieldIsDisplayed()
	 * 
	 * @param : null
	 * @description : This method verifies if the "to date" field is visible
	 * @return : boolean
	 * @throws : Exception - if there is an issue finding the "to date" field or it
	 *           is not visible
	 * @author : YAKSHA
	 */
	public boolean verifyToDateFieldIsDisplayed() {
		return false;
	}

	/**
	 * @Test4.12 about this method verifyStarIconIsDisplayed()
	 * 
	 * @param : null
	 * @description : This method verifies if the start icon is visible
	 * @return : boolean
	 * @throws : Exception - if there is an issue finding the start icon or it is
	 *           not visible
	 * @author : YAKSHA
	 */
	public boolean verifyStarIconIsDisplayed() {
		return false;
	}

	/**
	 * @Test5 about this method
	 * verifySelectedTabIsActiveOrNot()
	 * 
	 * @param : element - the locator of the tab to be verified
	 * @description : This method verifies if the specified tab is displayed, clicks
	 *              it, and returns whether its "class" attribute contains "active".
	 *              This can be used to determine if the tab is active based on its
	 *              class attributes.
	 * @return : boolean - true if the "class" attribute of the tab contains
	 *         "active", false otherwise
	 * @throws : Exception - if there is an issue locating, highlighting, clicking
	 *           the tab, or getting its attribute
	 * @author : YAKSHA
	 */
	public boolean verifySelectedTabIsActiveOrNot(By element) throws Exception {
		return false;
	}

	/**
	 * @Test6 about this method performScrollOperation()
	 * @param : null
	 * @description : Scrolls till Radiology tab, selects it, and clicks "List
	 *              Requests" tab
	 * @return : boolean
	 * @throws : Exception - if there is an issue finding the tab
	 * @author : YAKSHA
	 */
	public boolean performScrollOperation() {
		return false;
	}

	/**
	 * @Test7 about this method verifyToolTipText()
	 * @param : null
	 * @description : Verify the text of the tooltip
	 * @return : String
	 * @throws : Exception - if there is an issue finding the text
	 * @author : YAKSHA
	 */
	public String verifyToolTipText() {
		return null;
	}

	/*
	 * @Test8 about this method verifyDatesAreRememberedCorrectly()
	 * 
	 * @param fromDate - the expected "from" date in the format "dd-MM-yyyy"
	 * 
	 * @param toDate - the expected "to" date in the format "dd-MM-yyyy"
	 * 
	 * @description : This method selects the "from" and "to" dates in the calendar,
	 * clicks the OK button, navigates away to another tab, returns to the original
	 * tab, and verifies if the dates are remembered correctly.
	 * 
	 * @return : boolean - true if the dates are remembered correctly, false
	 * otherwise
	 * 
	 * @throws : Exception - if there is an issue locating, highlighting, or
	 * clicking elements, or if there is an issue with date selection or
	 * verification
	 * 
	 * @author : YAKSHA
	 * 
	 * @throws Exception
	 */
	public boolean verifyDatesAreRememberedCorrectly(String fromDate, String toDate) throws Exception {
				return false;
	}

	/**
	 * @Test9.1 about this method clickDateRangeDropdownAndSelect()
	 * 
	 * @param : String - Text of the value to select from dropdown
	 * @description : This method clicks on the date range button and selects a
	 *              value by its text
	 * @return : boolean - true if successfully selected the intended value and
	 *         false if the value is not selected
	 * @throws : Exception - if there is an issue finding the dropdown or its values
	 * @author : YAKSHA
	 */
	public boolean clickDateRangeDropdownAndSelect(String valueToSelect) throws Exception {
		return false;
	}

	/**
	 * @Test9.2 about this method
	 * verifyToDataRangeBySelectOneWeekOptionFromDropdown()
	 * 
	 * @param : String, String - from date - to date
	 * @description : This method verifies whether the "Requested On" dates for all
	 *              the result requisitions are within the specified date range.
	 * @return : boolean - true if the actual dates fall within the specified date
	 *         and false if they don't.
	 * @throws : Exception - if there is an issue finding the actual data
	 * @author : YAKSHA
	 */

	public boolean verifyToDataRangeBySelectOneWeekOptionFromDropdown(String fromDate, String toDate) throws Exception {

		return false;
		}

	/**
	 * @Test10 about this method
	 *         verifyDataFromTabelByEnteringDataXRAYInSearchField() Verifies that
	 *         all records in the table match the entered text in the dropdown.
	 * 
	 * @param dropDownValue - The text to select from the dropdown.
	 * @return boolean - Returns true if all records match the selected text,
	 *         otherwise false.
	 * @throws Exception - If there is an issue locating or interacting with
	 *                   elements.
	 */
	public boolean verifyDataFromTabelByEnteringDataXRAYInSearchField(String dropDownValue) throws Exception {
		return false;
		}

	/**
	 * @Test11 about this method verifyRadiologyWardBillingCancellationPopup()
	 * 
	 * @param radiologyExpectedData - A map containing the expected data for the
	 *                              radiology test, such as patient name and
	 *                              expected cancellation remarks message.
	 * @description This method verifies that the Radiology Ward Billing modal opens
	 *              upon searching for a patient and clicking on the view details
	 *              button. It then clicks the cancel button and verifies that the
	 *              appropriate popup message "Please Write Cancellation Remarks"
	 *              appears.
	 * @return String - The actual failed remarks message displayed in the popup.
	 * @throws Exception - If there is an issue locating or interacting with
	 *                   elements.
	 * @autor YAKSHA
	 */
	public String verifyRadiologyWardBillingCancellationPopup(Map<String, String> radiologyExpectedData) {
		return null;
	}

	/**
	 * @Test12 about this method verifyToolTipText() Verifies that all records in
	 *         the table match the entered text in the search field.
	 * 
	 * @param textToEnter - The text to enter in the search field.
	 * @return boolean - Returns true if all records match the entered text,
	 *         otherwise false.
	 * @throws Exception - If there is an issue locating or interacting with
	 *                   elements.
	 */
	public boolean verifyDataFromTableByEnteringDataInSearchField(String textToEnter) throws Exception {
		return false;
		}

	/**
	 * @Test13 and @Test14 about this method verifyImageOrderCreation() Verifies the
	 *         creation of an imaging order for a specific patient in the In Patient
	 *         Department.
	 *
	 * @param radiologyExpectedData        - A map containing the expected data for
	 *                                     radiology, including the patient name.
	 * @param doYouWantToCancelTheNewOrder - A boolean indicating whether to cancel
	 *                                     the new order.
	 * @return String - Returns the actual success message if the order is created
	 *         successfully, otherwise returns "true" or "false" based on the cancel
	 *         action verification.
	 * @throws Exception - If there is an issue locating or interacting with
	 *                   elements.
	 */
	public String verifyImageOrderCreation(Map<String, String> radiologyExpectedData,
			boolean doYouWantToCancelTheNewOrder) {
		return null;
	}

	/**
	 * @Test15.2 about this method verifyScanDonePopupAndRequiredFieldMessage()
	 * 
	 * @param patientName - The name of the patient for whom the action is to be
	 *                    performed.
	 * @param actionName  - The name of the action button to be clicked (e.g., "scan
	 *                    done").
	 * @description : This method verifies that the "Scan Done" popup opens for the
	 *              specified patient and that the required field message appears on
	 *              the film type field when the "Done" button is clicked without
	 *              entering any details.
	 * @return : String - The error message text displayed on the film type field if
	 *         it is required.
	 * @throws : Exception - if there is an issue locating or interacting with
	 *           elements.
	 * @author : YAKSHA
	 */
	public String verifyScanDonePopupAndRequiredFieldMessage(String patientName, String actionName) {
		return null;
		}

	/**
	 * @Test16 about this method verifyScanDetailUpdatedSuccessPopup()
	 * 
	 * @param radiologyExpectedData - A map containing expected data for the
	 *                              radiology test case, including the patient name
	 *                              and expected success message.
	 * @param actionName            - The name of the action button to be clicked
	 *                              (e.g., "scan done").
	 * @description : This method verifies that the "Scan Done" popup opens for the
	 *              specified patient, enters the film type details, and verifies
	 *              that the success message appears after clicking the "Done"
	 *              button.
	 * @return : String - The success message text displayed after updating the scan
	 *         details.
	 * @throws : Exception - if there is an issue locating or interacting with
	 *           elements.
	 * @author : YAKSHA
	 */
	public String verifyScanDetailUpdatedSuccessPopup(Map<String, String> radiologyExpectedData, String actionName) {
		return null;
	}

	/**
	 * @Test17 about this method verifyAlertMessageOnClosingWithoutSaving()
	 * 
	 * @param patientName - The name of the patient for whom the action is to be
	 *                    performed.
	 * @param actionName  - The name of the action button to be clicked (e.g., "Add
	 *                    Report").
	 * @description : This method verifies that after clicking the "Add Report"
	 *              button, the "Add report of USG Chest (X-RAY)" popup opens. When
	 *              the popup is closed without saving, an alert message "Changes
	 *              will be discarded. Do you want to close anyway?" appears and is
	 *              accepted.
	 * @return : boolean - Returns true if the alert message is successfully
	 *         accepted, otherwise false.
	 * @throws : Exception - if there is an issue locating or interacting with
	 *           elements.
	 * @author : YAKSHA
	 */
	public boolean verifyAlertMessageOnClosingWithoutSaving(String patientName, String actionName) throws Exception {
		return false;
		}

	/**
	 * @Test18 and @Test19 about this method
	 *         verifyAddAndEditReportAndRequiredTextMessage()
	 * 
	 * @param patientName - The name of the patient for whom the action is to be
	 *                    performed.
	 * @param actionName  - The name of the action button to be clicked (e.g., "Add
	 *                    Report").
	 * @param popUpMeg    - The expected success message text after performing the
	 *                    action.
	 * @description : This method verifies that the "Add Report" popup opens for the
	 *              specified patient, enters text into the report field, and
	 *              verifies the success message when the "Save" button is clicked.
	 * @return : String - The success message text displayed after clicking the
	 *         "Save" button.
	 * @throws : Exception - if there is an issue locating or interacting with
	 *           elements.
	 * @author : YAKSHA
	 */
	public String verifyAddAndEditReportAndRequiredTextMessage(String patientName, String actionName, String popUpMeg) {
		return null;
		
	}

	/**
	 * @Test20 about this method takingScreenshotOfTheCurrentPage()
	 * @param : null
	 * @description : Taking screenshot of the current page.
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean takingScreenshotOfTheCurrentPage() throws Exception {
		return false;
		
	}

	/**
	 * @Test21.1 about this method clickAnchorButtonByText()
	 * 
	 * @param : null
	 * @description : Clicks Anchor button through its text
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public boolean clickAnchorButtonByText(String textOfAnchorButton) throws Exception {
		return false;
		}

	/**
	 * @Test21.2 @Test21.4 about this method verifyCurrentPageIs()
	 * 
	 * @param : String - expected current page
	 * @description : This method verifies whether the current page matches with the
	 *              expected current page
	 * @return : boolean - true if the current page matches with the expected
	 *         current page and false they don't match
	 * @throws : Exception - if there is an issue finding the element button
	 * @author : YAKSHA
	 */
	public boolean verifyCurrentPageIs(String expectedCurrentPage) throws Exception {
		return false;
	}

	/**
	 * @Test21.3 @Test21.5 about this method clickButtonByText()
	 * 
	 * @param buttonText : String - The text of the button to be clicked
	 * @description : This method locates a button using its text and performs a
	 *              click action on it. If the button is found and successfully
	 *              clicked, it highlights the button first. In case of failure
	 *              (e.g., button not found or click error), an error message is
	 *              printed and an exception is thrown.
	 * @return : void
	 * @throws : Exception - if there is an issue finding the button or performing
	 *           the click action
	 * @author : YAKSHA
	 */
	public boolean clickButtonByText(String buttonText) throws Exception {
		return false;
	}

}
