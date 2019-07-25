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

//open browser
WebUI.openBrowser('https://www.alibris.com/')

WebUI.maximizeWindow()

//verify search box is present
WebUI.verifyElementPresent(findTestObject('Object Repository/tc_0_2_1_SM_OR/Page_Alibris - Buy new and used books textbooks music and movies/input_Search by Title Author or ISBN_keyword'), 
    2)

//enter text
WebUI.setText(findTestObject('Object Repository/tc_0_2_1_SM_OR/Page_Alibris - Buy new and used books textbooks music and movies/input_Search by Title Author or ISBN_keyword'), 
    'Steam engine')

//click search
WebUI.click(findTestObject('Object Repository/tc_0_2_1_SM_OR/Page_Alibris - Buy new and used books textbooks music and movies/input_Select Book Format Menu_hs'))

//verify element is present
WebUI.verifyElementPresent(findTestObject('Object Repository/tc_0_2_1_SM_OR/Page_steam engine - Alibris/a_Building Simple Model Steam Engines'), 
    3)

//click Add to Cart
WebUI.click(findTestObject('Object Repository/tc_0_2_1_SM_OR/Page_steam engine - Alibris/button_Add to Cart'), FailureHandling.OPTIONAL)

//Verify correct item in cart
WebUI.verifyElementPresent(findTestObject('Object Repository/tc_0_2_1_SM_OR/Page_steam engine - Alibris/h2_Items Added to Cart'), 
    2, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/tc_0_2_1_SM_OR/Page_steam engine - Alibris/h2_Your cart summary'), 
    2, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/tc_0_2_1_SM_OR/Page_steam engine - Alibris/h3_Building Simple Model Steam'), 
    2, FailureHandling.OPTIONAL)

//close Browser
WebUI.closeBrowser()

