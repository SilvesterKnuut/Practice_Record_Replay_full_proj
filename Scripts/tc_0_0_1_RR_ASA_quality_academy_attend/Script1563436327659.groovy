import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.asaquality.ee/')

WebUI.click(findTestObject('tc_0_0_1_RR_OR/Page_Avaleht - ASA Quality Services/button_EST'))

WebUI.click(findTestObject('tc_0_0_1_RR_OR/Page_Avaleht - ASA Quality Services/a_ENG'))

WebUI.click(findTestObject('tc_0_0_1_RR_OR/Page_About Us - ASA Quality/a_Academy'))

WebUI.click(findTestObject('tc_0_0_1_RR_OR/Page_Academy - ASA Quality/button_Attend'))

WebUI.click(findTestObject('tc_0_0_1_RR_OR/Page_Academy - ASA Quality/input_Error on form submit_btn btn-primary w-100 my-0'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementAttributeValue(findTestObject('tc_0_0_1_RR_OR/Page_Academy - ASA Quality/div_First and last name'), 'class', 
    'form-group has-error', 2)

WebUI.click(findTestObject('tc_0_0_1_RR_OR/Page_Academy - ASA Quality/button_close'))

WebUI.closeBrowser()

