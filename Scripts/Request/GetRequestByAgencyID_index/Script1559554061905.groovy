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

a = WS.sendRequest(findTestObject('Request/GetRequestByAgencyID_index'))

WS.verifyResponseStatusCode(a, 200)

WS.verifyElementPropertyValue(a, 'ObjReturn[21].request_id', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[21].agency_id', 31)

WS.verifyElementPropertyValue(a, 'ObjReturn[21].agency_name', 'The Coffee House - Chi nhánh số 1')

WS.verifyElementPropertyValue(a, 'ObjReturn[21].agency_address', '88 Ngô Tất Tố, Quận Bình Thạnh')

WS.verifyElementPropertyValue(a, 'ObjReturn[21].request_category_id', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[21].service_id', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[21].service_name', 'Camera')

WS.verifyElementPropertyValue(a, 'ObjReturn[21].service_item_id', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[21].service_item_name', 'Camera không hiện màu')

WS.verifyElementPropertyValue(a, 'ObjReturn[21].request_name', 'The Coffee House - Chi nhánh số 1 - Camera không hiện màu')

WS.verifyElementPropertyValue(a, 'ObjReturn[21].request_description', 'dsdsfdsfsfdfdsfdsfdsfdrgvrdfgdfgdfgdfgdffg')

WS.verifyElementPropertyValue(a, 'ObjReturn[21].agency_phone', '0397934468')

WS.verifyElementPropertyValue(a, 'ObjReturn[21].create_date', '2019-01-16 09:54:15')

WS.verifyElementPropertyValue(a, 'ObjReturn[21].update_date', '2019-06-03 15:22:55')

WS.verifyElementPropertyValue(a, 'ObjReturn[21].start_time', '2018-05-31 06:19:26')

WS.verifyElementPropertyValue(a, 'ObjReturn[21].end_time', '2018-05-31 06:19:26')

WS.verifyElementPropertyValue(a, 'ObjReturn[21].request_status_value', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[21].it_supporter_name', 'Phạm Phú Tiến')

WS.verifyElementPropertyValue(a, 'ObjReturn[21].it_supporter_phone', '0916512300')

WS.verifyElementPropertyValue(a, 'ObjReturn[21].feedback', 'gf')

WS.verifyElementPropertyValue(a, 'ObjReturn[21].rate', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[21].priority_value', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[21].request_problem', 'problem')

WS.verifyElementPropertyValue(a, 'ObjReturn[21].request_solution', 'solution')

WS.verifyElementPropertyValue(a, 'ObjReturn[21].list_ticket[0].ticket_id', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[21].list_ticket[0].device_id', 45)

WS.verifyElementPropertyValue(a, 'ObjReturn[21].list_ticket[0].device_code', 'KX-S2001CA4')

WS.verifyElementPropertyValue(a, 'ObjReturn[21].list_ticket[0].device_name', 'Camera KBVISION KX-S2001CA4')

WS.verifyElementPropertyValue(a, 'ObjReturn[21].list_ticket[0].create_date', '2019-01-16 09:54:15.700')

