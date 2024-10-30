import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.selectOptionByIndex(findTestObject('02_Make Appoinment/select_facility'), facility)

//WebUI.check(findTestObject('02_Make Appoinment/cb_hospital_readmission'))
if (hospital_checkbox == true) {
    WebUI.check(findTestObject('02_Make Appoinment/cb_hospital_readmission'))
}

//WebUI.click(findTestObject('02_Make Appoinment/rb_Medicaid_programs'))
def select_hc = hc_program

switch (select_hc) {
    case select_hc = 'Medicaid':
        WebUI.click(findTestObject('02_Make Appoinment/rb_Medicaid_programs'))

        break
    case select_hc = 'Medicare':
        WebUI.click(findTestObject('02_Make Appoinment/rb_Medicare_programs'))

        break
    case select_hc = 'None':
        WebUI.click(findTestObject('02_Make Appoinment/rb_None_programs'))

        break
}

WebUI.click(findTestObject('02_Make Appoinment/input_Visit Date'))

WebUI.click(findTestObject('02_Make Appoinment/datetable_10-10-2024'))

WebUI.click(findTestObject('02_Make Appoinment/textarea_Comment'))

WebUI.setText(findTestObject('02_Make Appoinment/textarea_Comment'), 'ayyy')

WebUI.click(findTestObject('02_Make Appoinment/button_Book Appointment'))

WebUI.verifyElementVisible(findTestObject('02_Make Appoinment/text_Appointment Confirmation'))

//WebUI.verifyElementText(findTestObject('02_Make Appoinment/Verify/p_facility'), facility)
def select_facility = facility

switch (select_facility) {
    case select_facility = 0:
        WebUI.verifyElementText(findTestObject('02_Make Appoinment/Verify/p_facility'), 'Tokyo CURA Healthcare Center')

        break
    case select_facility = 1:
        WebUI.verifyElementText(findTestObject('02_Make Appoinment/Verify/p_facility'), 'Hongkong CURA Healthcare Center')

        break
    case select_facility = 2:
        WebUI.verifyElementText(findTestObject('02_Make Appoinment/Verify/p_facility'), 'Seoul CURA Healthcare Center')

        break
}

//WebUI.verifyElementText(findTestObject('02_Make Appoinment/Verify/p_hcprogram'), hc_program)
switch (select_hc) {
    case select_hc = 'Medicaid':
        WebUI.verifyElementText(findTestObject('02_Make Appoinment/Verify/p_hcprogram'), 'Medicaid')

        break
    case select_hc = 'Medicare':
        WebUI.verifyElementText(findTestObject('02_Make Appoinment/Verify/p_hcprogram'), 'Medicare')

        break
    case select_hc = 'None':
        WebUI.verifyElementText(findTestObject('02_Make Appoinment/Verify/p_hcprogram'), 'None')

        break
}

//WebUI.verifyElementText(findTestObject('02_Make Appoinment/Verify/p_Yes'), hostpital_redmision)
if (hospital_checkbox == true) {
    WebUI.verifyElementText(findTestObject('02_Make Appoinment/Verify/p_Yes'), 'Yes')
} else {
    WebUI.verifyElementText(findTestObject('02_Make Appoinment/Verify/p_Yes'), 'No')
}

