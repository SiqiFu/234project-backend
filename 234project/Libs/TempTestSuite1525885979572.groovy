import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/TestI')

suiteProperties.put('name', 'TestI')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("F:\\234project-backend\\234project\\Reports\\TestI\\20180510_001259\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/TestI', suiteProperties, [new TestCaseBinding('Test Cases/TestI - Iteration 1', 'Test Cases/TestI',  [ 'product1' : 'Garden' , 'product3' : 'Garden' , 'product2' : 'Garden' , 'product5' : 'Garden' , 'product4' : 'Garden' , 'password' : 'admin' , 'username' : 'admin' ,  ]), new TestCaseBinding('Test Cases/TestI - Iteration 2', 'Test Cases/TestI',  [ 'product1' : 'Banana' , 'product3' : 'Banana' , 'product2' : 'Banana' , 'product5' : 'Banana' , 'product4' : 'Banana' , 'password' : 'user' , 'username' : 'user' ,  ]), new TestCaseBinding('Test Cases/TestI - Iteration 3', 'Test Cases/TestI',  [ 'product1' : 'Orange' , 'product3' : 'Orange' , 'product2' : 'Orange' , 'product5' : 'Orange' , 'product4' : 'Orange' , 'password' : 'hello' , 'username' : 'hello' ,  ])])
