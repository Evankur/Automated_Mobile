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

Mobile.startApplication('C:\\Users\\kvan4\\Katalon Studio\\Mobiletest\\androidapp\\Happy Day Shopping_1.2_APKPure.apk', 
    true)

Mobile.scrollToText('ELECTRONICS')

Mobile.tap(findTestObject('Object Repository/Testin_app_tambahdanhapus/android.widget.TextView - ELECTRONICS'), 0)

Mobile.tap(findTestObject('Object Repository/Testin_app_tambahdanhapus/android.widget.TextView - Charger  Cable'), 0)

Mobile.scrollToText('Elco 3in1')

Mobile.tap(findTestObject('Object Repository/Testin_app_tambahdanhapus/android.widget.TextView - Elco 3in1 Data Cable Fast Charger'), 
    0)

Mobile.setText(findTestObject('Object Repository/Testin_app_tambahdanhapus/android.widget.EditText - 1'), '2', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Testin_app_tambahdanhapus/android.widget.TextView - Add to Bag'), 0)

Mobile.tap(findTestObject('Object Repository/Testin_app_tambahdanhapus/android.widget.TextView - Add to Bag'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Testin_app_tambahdanhapus/android.widget.TextView - Earphones  Headphones'), 
    0)

Mobile.scrollToText('JBL')

Mobile.tap(findTestObject('Object Repository/Testin_app_tambahdanhapus/android.widget.TextView - JBL Wave 300 Earpods'), 
    0)

Mobile.setText(findTestObject('Object Repository/Testin_app_tambahdanhapus/android.widget.EditText - 1'), '3', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Testin_app_tambahdanhapus/android.widget.TextView - Add to Bag'), 0)

Mobile.tap(findTestObject('Object Repository/Testin_app_tambahdanhapus/android.widget.TextView - Add to Bag'), 0)

Mobile.tap(findTestObject('Object Repository/Testin_app_tambahdanhapus/android.widget.TextView - Your Bag'), 0)

Mobile.tap(findTestObject('Object Repository/Testin_app_tambahdanhapus/android.widget.TextView - JBL Wave 300 Earpods (1)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Testin_app_tambahdanhapus/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Testin_app_tambahdanhapus/android.widget.TextView - OMR 68.70   Save'), 0)

Mobile.tap(findTestObject('Object Repository/Testin_app_tambahdanhapus/android.widget.TextView - Clear'), 0)

Mobile.tap(findTestObject('Object Repository/Testin_app_tambahdanhapus/android.widget.Button - YES'), 0)

Mobile.tap(findTestObject('Object Repository/Testin_app_tambahdanhapus/android.widget.TextView - Add Products'), 0)

Mobile.tap(findTestObject('Object Repository/Testin_app_tambahdanhapus/android.widget.TextView - Contact Us'), 0)

Mobile.closeApplication()

