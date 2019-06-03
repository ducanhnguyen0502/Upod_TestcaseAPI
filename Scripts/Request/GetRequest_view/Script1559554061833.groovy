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

getRequest_view = WS.sendRequest(findTestObject('Request/GetRequest_view'))

WS.verifyResponseStatusCode(getRequest_view, 200)

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.request_id', 1)

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.agency_id', 31)

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.agency_name', 'The Coffee House - Chi nhánh số 1')

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.agency_address', '88 Ngô Tất Tố, Quận Bình Thạnh')

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.request_category_id', 3)

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.service_id', 1)

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.service_name', 'WIFI')

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.service_item_id', 6)

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.service_item_name', 'Wifi chậm')

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.request_name', 'The Coffee House - Chi nhánh số 1 - Wifi chậm')

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.request_description', 'acd')

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.agency_phone', '0397934468')

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.create_date', '2019-02-16 09:47:57')

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.update_date', '2019-05-29 15:48:25')

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.start_time', '2019-04-02 00:00:00')

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.end_time', '2019-04-16 09:45:37')

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.request_status_value', 0)

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.it_supporter_name', 'Lê Thị Ẫn')

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.it_supporter_phone', '0928374564')

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.rate', '6')

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.priority_value', '3')

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.request_problem', 'string')

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.request_solution', 'string')

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.list_ticket[0].ticket_id', 1)

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.list_ticket[0].device_id', 43)

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.list_ticket[0].device_code', 'N301')

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.list_ticket[0].description', 'Anh test')

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.list_ticket[0].device_name', 'Router TENDA N301 300Mbps Wireless N')

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.list_ticket[0].create_date', '2019-01-16 09:48:07')

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.list_ticket[0].creator', 'ADMIN')

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.history[5].request_history_id', 7)

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.history[5].request_id', 1)

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.history[5].pre_supporter_name', 'Phạm Phú Tiến')

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.history[5].pre_status', 3)

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.history[5].create_date', '2019-01-17 15:39:04')

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.history[5].start_date', '2019-01-17 15:39:04')

WS.verifyElementPropertyValue(getRequest_view, 'ObjReturn.history[5].end_date', '2019-01-17 16:39:04')

