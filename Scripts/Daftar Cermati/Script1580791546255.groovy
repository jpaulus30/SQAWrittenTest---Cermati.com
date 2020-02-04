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
import org.openqa.selenium.Keys as Keys

for (def index : (0..100)) {
    WebUI.openBrowser('https://www.cermati.com/gabung')

    WebUI.maximizeWindow()

    WebUI.setText(findTestObject('Object Repository/input__email'), ('auto' + index) + '@email.com')

    WebUI.setEncryptedText(findTestObject('Object Repository/input__password'), '8SQVv/p9jVTHLrggi8kCzw==')

    WebUI.setEncryptedText(findTestObject('Object Repository/input__confirmPassword'), '8SQVv/p9jVTHLrggi8kCzw==')

    WebUI.setText(findTestObject('Object Repository/input__firstName'), 'Daftar')

    WebUI.setText(findTestObject('Object Repository/input__lastName'), 'Cermati')

    WebUI.setText(findTestObject('Object Repository/input__mobilePhone'), '0812345543' + index)

    WebUI.setText(findTestObject('Object Repository/input__residenceCity'), 'Bekasi')

    WebUI.click(findTestObject('Object Repository/div_KABUPATEN BELU'))

    WebUI.click(findTestObject('Object Repository/button_Daftar Akun'))

    WebUI.waitForElementVisible(findTestObject('div_Terima kasih telah bergabung dengan Cermaticom Harap verifikasi email Anda sekarang'), 
        0, FailureHandling.STOP_ON_FAILURE)

    WebUI.closeBrowser()
}

