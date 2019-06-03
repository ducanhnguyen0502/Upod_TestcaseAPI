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

a = WS.sendRequest(findTestObject('Request/GetRequestByitSupporterID_index'))

WS.verifyResponseStatusCode(a, 200)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].request_id', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].request_name', 'The Coffee House - Chi nhánh số 1 - Wifi chậm')

WS.verifyElementPropertyValue(a, 'ObjReturn[2].date_create', '2019-02-16 09:47:57')

WS.verifyElementPropertyValue(a, 'ObjReturn[2].agency_name', 'The Coffee House - Chi nhánh số 1')

WS.verifyElementPropertyValue(a, 'ObjReturn[2].itsupporter_name', 'Lê Thị Ẫn')

WS.verifyElementPropertyValue(a, 'ObjReturn[2].issue_name[0]', 'acd')

WS.verifyElementPropertyValue(a, 'ObjReturn[2].request_status', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].request_status_id', 3)

