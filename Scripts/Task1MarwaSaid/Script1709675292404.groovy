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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

WebUI.setText(findTestObject('Task1/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.maximizeWindow()

WebUI.setEncryptedText(findTestObject('Task1/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Task1/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Task1/Page_OrangeHRM/a_Admin'))

String result1 = CustomKeywords.'NoOfRecords.hello'()

WebUI.click(findTestObject('Task1/Page_OrangeHRM/button_Add'))

WebUI.click(findTestObject('Task1/Page_OrangeHRM/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill oxd-select-text--arrow'))

WebUI.click(findTestObject('Task1/Page_OrangeHRM/div_Admin'))

WebUI.click(findTestObject('Task1/Page_OrangeHRM/i_Enabled_oxd-icon bi-caret-up-fill oxd-select-text--arrow'))

WebUI.click(findTestObject('Task1/Page_OrangeHRM/div_Enabled'))

WebUI.setText(findTestObject('Task1/Page_OrangeHRM/EmplName'), 'test')

WebUI.click(findTestObject('Task1/Page_OrangeHRM/span_Test 99  Tester'))

WebUI.setText(findTestObject('Task1/Page_OrangeHRM/input_Username_oxd-input oxd-input--active'), 'jihan7')

WebUI.setEncryptedText(findTestObject('Task1/Page_OrangeHRM/input_Password_oxd-input oxd-input--focus'), 'oJeqJr4KY/o=')

WebUI.setEncryptedText(findTestObject('Task1/Page_OrangeHRM/input_Confirm Password_oxd-input oxd-input--focus'), 'oJeqJr4KY/o=')

WebUI.click(findTestObject('Task1/Page_OrangeHRM/button_Save'))

String result2 = CustomKeywords.'NoOfRecords.hello'()

if (result1 == (result2 - 1)) {
    println('\u001B[35mnumber of records increased by 1 \u001B[0m')
} else {
    println('\u001B[35mthere is an error in number of records\u001B[0m')
}

WebUI.setText(findTestObject('Task1/Page_OrangeHRM/input_UsernameSearch'), 'jihan7')

WebUI.click(findTestObject('Task1/Page_OrangeHRM/button_Search'))

WebUI.scrollToPosition(0, 500)

WebUI.click(findTestObject('Task1/Page_OrangeHRM/div_jihan10AdminRahul DasEnabled'))

WebUI.click(findTestObject('Task1/Page_OrangeHRM/i_Actions_oxd-icon bi-check oxd-checkbox-input-icon'))

WebUI.click(findTestObject('Task1/Page_OrangeHRM/i_Enabled_oxd-icon bi-trash'))

WebUI.click(findTestObject('Task1/Page_OrangeHRM/button_Yes, Delete'))

WebUI.click(findTestObject('Task1/Page_OrangeHRM/a_Admin'))

result3 = CustomKeywords.'NoOfRecords.hello'()

if (result3 == (result2 - 1)) {
    println('\u001B[35mnumber of records decreased by 1\u001B[0m')
} else {
    println('\u001B[35mthere is an error in number of records\u001B[0m')
}

WebUI.closeBrowser()

