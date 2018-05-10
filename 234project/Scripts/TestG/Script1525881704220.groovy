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

WebUI.setText(findTestObject('ShowAvailableProduct/input_username'), username)

WebUI.setText(findTestObject('ShowAvailableProduct/input_password'), password)

WebUI.click(findTestObject('ShowAvailableProduct/button_Login'))

WebUI.verifyElementText(findTestObject('ShowAvailableProduct/h5_Garden'), product1)

WebUI.verifyElementText(findTestObject('ShowAvailableProduct/h5_Banana'), product2)

WebUI.verifyElementText(findTestObject('ShowAvailableProduct/h5_Orange'), product3)

WebUI.verifyElementText(findTestObject('ShowAvailableProduct/h5_Papaya'), product4)

WebUI.verifyElementText(findTestObject('ShowAvailableProduct/h5_Rambutan'), product5)

WebUI.closeBrowser()

