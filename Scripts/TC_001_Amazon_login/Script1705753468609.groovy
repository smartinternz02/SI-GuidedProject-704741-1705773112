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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.setText(findTestObject('Object Repository/Amazon_Login_Page/Amazon_Login/Page_Amazon.com/input_field-keywords'), 'BLBKLA')

WebUI.click(findTestObject('Object Repository/Amazon_Login_Page/Amazon_Login/Page_Amazon.com/button_Continue shopping'))

WebUI.click(findTestObject('Object Repository/Amazon_Login_Page/Amazon_Login/Page_Amazon.com. Spend less. Smile more/input_a-button-input'))

WebUI.click(findTestObject('Object Repository/Amazon_Login_Page/Amazon_Login/Page_Amazon.com. Spend less. Smile more/span_Hello, sign in'))

WebUI.setText(findTestObject('Object Repository/Amazon_Login_Page/Amazon_Login/Page_Amazon Sign-In/input_email'), email_id)

WebUI.click(findTestObject('Object Repository/Amazon_Login_Page/Amazon_Login/Page_Amazon Sign-In/inputcontinue'))

WebUI.setEncryptedText(findTestObject('Object Repository/Amazon_Login_Page/Amazon_Login/Page_Amazon Sign-In/input_password'), 
    password)

WebUI.click(findTestObject('Object Repository/Amazon_Login_Page/Amazon_Login/Page_Amazon Sign-In/inputsignInSubmit'))

WebUI.closeBrowser()

