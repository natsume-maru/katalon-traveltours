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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.phptravels.net/')

WebUI.click(findTestObject('Object Repository/Page_PHPTRAVELS  Travel Technology Partner/b_My Account_lightcaret mt-2 go-left'))

WebUI.click(findTestObject('Object Repository/Page_PHPTRAVELS  Travel Technology Partner/a_Sign Up'))

WebUI.setText(findTestObject('Object Repository/Page_Register/input_First Name_firstname'), 'Kim')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Last Name_lastname'), 'Deraco')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Mobile Number_phone'), '09178888888')

/**WebUI.setText(findTestObject('Object Repository/Page_Register/input_Email_email'), 'testemail01@domain.com')
WebUI.setText(findTestObject('Object Repository/Page_Register/input_Email_email'), 'testemail01@domain.com')**/
WebUI.setText(findTestObject('Page_Register/input_Email_email'), CustomKeywords.'registrationKeys.generateKeys.generateEmailAddress'())

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input_Password_password'), 'JGIEwOYvw6knScGcLm237Q==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input_Confirm Password_confirmpassword'), 'JGIEwOYvw6knScGcLm237Q==')

WebUI.click(findTestObject('Object Repository/Page_Register/button_Sign Up'))

WebUI.click(findTestObject('Object Repository/Page_My Account/b_Kim_lightcaret mt-2 go-left'))

WebUI.click(findTestObject('Object Repository/Page_My Account/a_Logout'))

WebUI.closeBrowser()

