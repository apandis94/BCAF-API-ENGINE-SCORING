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

WebUI.navigateToUrl('http://192.168.29.42/sentralparam/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/ES_record/Page_Aplikasi/SP_username_text'), 'itproject')

WebUI.setEncryptedText(findTestObject('Object Repository/ES_record/Page_Aplikasi/SP_password_text'), 'HeCM15nHKBI=')

WebUI.click(findTestObject('Object Repository/ES_record/Page_Aplikasi/SP_login_button'))

WebUI.mouseOver(findTestObject('Object Repository/ES_record/Page_Sentral Parameter/Page_Sentral Parameter/SP_mainmenu_paramES_button'))

WebUI.click(findTestObject('Object Repository/ES_record/Page_Sentral Parameter/Page_Sentral Parameter/sp_paramES_parampefindo_button'))

WebUI.delay(2)

'screenshoot Sentral Param - List Parameter Pefindo\r\n'
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/ES_record/Page_Sentral Parameter/Page_Sentral Parameter/sp_parampefindo_view1_button'))

WebUI.delay(2)

'screenshoot Sentral Param - List Parameter Pefindo - detail 1\r\n'
WebUI.takeFullPageScreenshot()

WebUI.scrollToElement(findTestObject('ES_record/Page_Sentral Parameter/sp_parampefindo_view1_close_button'), 0)

WebUI.click(findTestObject('Object Repository/ES_record/Page_Sentral Parameter/Page_Sentral Parameter/sp_parampefindo_view1_close_button'))

WebUI.mouseOver(findTestObject('Object Repository/ES_record/Page_Sentral Parameter/Page_Sentral Parameter/SP_mainmenu_paramES_button'))

WebUI.click(findTestObject('Object Repository/ES_record/Page_Sentral Parameter/Page_Sentral Parameter/SP_paramES_parambscore_button'))

WebUI.delay(2)

'screenshoot Sentral Param - List Parameter Bscore'
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/ES_record/Page_Sentral Parameter/Page_Sentral Parameter/SP_parambscore_view1_button'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

'screenshoot Sentral Param - List Parameter Bscore - detail 1'
WebUI.click(findTestObject('Object Repository/ES_record/Page_Sentral Parameter/Page_Sentral Parameter/sp_parambscore_view1_close_button (1)'))

WebUI.mouseOver(findTestObject('Object Repository/ES_record/Page_Sentral Parameter/Page_Sentral Parameter/SP_mainmenu_paramES_button'))

WebUI.click(findTestObject('Object Repository/ES_record/Page_Sentral Parameter/Page_Sentral Parameter/SP_paramES_paramaplikasi_button'))

WebUI.delay(2)

'screenshoot Sentral Param - List Parameter Aplikasi'
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/ES_record/Page_Sentral Parameter/Page_Sentral Parameter/SP_paramES_paramaplikasi_view1_button'))

WebUI.delay(2)

'screenshoot Sentral Param - List Parameter Aplikasi - detail'
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/ES_record/Page_Sentral Parameter/Page_Sentral Parameter/SP_paramES_paramaplikasi_view1_close_button (1)'))

