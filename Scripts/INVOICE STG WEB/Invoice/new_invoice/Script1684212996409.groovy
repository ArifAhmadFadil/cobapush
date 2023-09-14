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

//Link Website
WebUI.openBrowser('https://invoice.stg.mauju.com/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/APP INVOICE/USER/Login/input__email'), 'nav54867@gmail.com')

WebUI.setEncryptedText(findTestObject('APP INVOICE/USER/Login/input__password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('APP INVOICE/USER/Login/button_Sign In'))

//WebUI.click(findTestObject('APP INVOICE/USER/Login/owner'))
//
//WebUI.navigateToUrl('https://invoice.stg.mauju.com/dashboard')
Mobile.delay(5)

WebUI.click(findTestObject('Object Repository/APP INVOICE/INVOICE/New Invoice/Page_Mauju/span_Invoices'))

WebUI.click(findTestObject('APP INVOICE/INVOICE/New Invoice/btn_new_invoice'))

WebUI.click(findTestObject('APP INVOICE/INVOICE/New Invoice/btn_save_invoice'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/INVOICE/New Invoice/Page_Mauju/cli_dropdown'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('APP INVOICE/INVOICE/New Invoice/li_ibrahimmusa'))

WebUI.click(findTestObject('APP INVOICE/INVOICE/New Invoice/btn_add_a_line'))

WebUI.click(findTestObject('APP INVOICE/INVOICE/New Invoice/selest_item_in_addaline'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/INVOICE/New Invoice/Page_Mauju/button_Settings_MuiButtonBase-root MuiIconB_8d88ca'))

WebUI.click(findTestObject('APP INVOICE/INVOICE/New Invoice/btn_deposit'))

WebUI.setText(findTestObject('APP INVOICE/INVOICE/New Invoice/input_deposit'), '1')

WebUI.setText(findTestObject('APP INVOICE/INVOICE/New Invoice/input_note'), 'penjalananku kail')

WebUI.setText(findTestObject('APP INVOICE/INVOICE/New Invoice/label_invoice'), '')

WebUI.click(findTestObject('APP INVOICE/INVOICE/New Invoice/btn_save_invoice'))

