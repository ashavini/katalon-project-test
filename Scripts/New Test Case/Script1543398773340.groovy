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

WebUI.navigateToUrl('http://siachen:8003/AXIS_LERM_WEB_UAT_V4/login.aspx')

WebUI.setText(findTestObject('Object Repository/Page_Loan Equivalent Risk System/input_User Name_ctl00MainConte'), 'SIDDHIKA')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Loan Equivalent Risk System/input_Password_ctl00MainConten'), 
    'eTwAJt9OSQ9oSkvH5YyJG/dpjSNv4INdNBIZz/cvIgNaU3nRjdvNf3o4xxYaTzvOAEs7pk32rfOxzaxylvlU5rrP36ykgnQ5')

WebUI.click(findTestObject('Object Repository/Page_Loan Equivalent Risk System/input_Password_ctl00MainConten_1'))

WebUI.click(findTestObject('Object Repository/Page_Loan Equivalent Risk System/a_Counterparty Limit Maintaine'))

WebUI.click(findTestObject('Object Repository/Page_Loan Equivalent Risk System/a_Logout'))

