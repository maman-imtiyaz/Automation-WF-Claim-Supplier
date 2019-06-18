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

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('http://192.168.0.2:8787/jw/web/userview/claimsupplier/claimSupplier/_/welcome')

WebUI.click(findTestObject('Create Claim/Login'))

WebUI.setText(findTestObject('Create Claim/Username'), 'pdcperson')

WebUI.setEncryptedText(findTestObject('Create Claim/password'), '8SQVv/p9jVTHLrggi8kCzw==')

WebUI.click(findTestObject('Create Claim/tombolLogin'))

WebUI.delay(5)

WebUI.click(findTestObject('Create Claim/home'))

WebUI.delay(5)

WebUI.click(findTestObject('Create Claim/createClaim'))

