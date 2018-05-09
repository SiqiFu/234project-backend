import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://54.245.190.238:9998/')

WebUI.setText(findTestObject('AddToCarts/input_username'), 'user')

WebUI.setText(findTestObject('AddToCarts/input_password'), 'user')

WebUI.click(findTestObject('AddToCarts/button_Login'))

WebUI.click(findTestObject('AddToCarts/button_add to cart'))

WebUI.verifyElementText(findTestObject('AddToCarts/div_already added'), 'already added')

WebUI.click(findTestObject('AddToCarts/button_add to cart'))

WebUI.verifyElementText(findTestObject('AddToCarts/div_already added'), 'already added')

WebUI.click(findTestObject('AddToCarts/button_add to cart'))

WebUI.verifyElementText(findTestObject('AddToCarts/div_already added'), 'already added')

WebUI.click(findTestObject('AddToCarts/button_add to cart'))

WebUI.verifyElementText(findTestObject('AddToCarts/div_already added'), 'already added')

WebUI.click(findTestObject('AddToCarts/button_add to cart'))

WebUI.verifyElementText(findTestObject('AddToCarts/div_already added'), 'already added')

WebUI.click(findTestObject('AddToCarts/a_Carts            5'))

WebUI.verifyElementText(findTestObject('AddToCarts/td_Garden'), 'Garden')

WebUI.verifyElementText(findTestObject('AddToCarts/td_Banana'), 'Banana')

WebUI.verifyElementText(findTestObject('AddToCarts/td_Orange'), 'Orange')

WebUI.verifyElementText(findTestObject('AddToCarts/td_Papaya'), 'Papaya')

WebUI.verifyElementText(findTestObject('AddToCarts/td_Rambutan'), 'Rambutan')

WebUI.closeBrowser()

