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


suiteProperties.put('id', 'Test Suites/TestF')

suiteProperties.put('name', 'TestF')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("F:\\234project-backend\\234project\\Reports\\TestF\\20180510_113719\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/TestF', suiteProperties, [new TestCaseBinding('Test Cases/TestF - Iteration 1', 'Test Cases/TestF',  [ 'variable_0' : 'admin' , 'username' : 'admin' ,  ]), new TestCaseBinding('Test Cases/TestF - Iteration 2', 'Test Cases/TestF',  [ 'variable_0' : 'user' , 'username' : 'user' ,  ]), new TestCaseBinding('Test Cases/TestF - Iteration 3', 'Test Cases/TestF',  [ 'variable_0' : 'hello' , 'username' : 'hello' ,  ])])
