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

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/profile.php#login')

WebUI.maximizeWindow()

WebUI.click(findTestObject('tc_0_1_1_MM_OR/Page_CURA Healthcare Service/button_Login'))

WebUI.waitForElementPresent(findTestObject('tc_0_1_1_MM_OR/Page_CURA Healthcare Service/p_Login failed Please ensure the username and password are valid'), 
    2)

WebUI.setText(findTestObject('tc_0_1_1_MM_OR/Page_CURA Healthcare Service/input_Username_username'), Username)

WebUI.setText(findTestObject('tc_0_1_1_MM_OR/Page_CURA Healthcare Service/input_Password_password'), Password)

WebUI.click(findTestObject('tc_0_1_1_MM_OR/Page_CURA Healthcare Service/button_Login'))

WebUI.verifyTextPresent('Make Appointment', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

