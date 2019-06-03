<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>PostRequest</name>
   <tag></tag>
   <elementGuidId>824cc9d3-cdbe-4307-b558-62abd91f96ab</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;agency_id\&quot;: 3,\n  \&quot;request_category_id\&quot;: 3,\n  \&quot;service_item_id\&quot;: 1,\n  \&quot;request_name\&quot;: \&quot;string\&quot;,\n  \&quot;request_description\&quot;: \&quot;string\&quot;,\n  \&quot;agency_phone\&quot;: \&quot;89898989\&quot;,\n  \&quot;list_ticket\&quot;: [\n    {\n      \&quot;ticket_id\&quot;: 3,\n      \&quot;device_id\&quot;: 3,\n      \&quot;device_code\&quot;: \&quot;string\&quot;,\n      \&quot;description\&quot;: \&quot;string\&quot;,\n      \&quot;device_name\&quot;: \&quot;string\&quot;,\n      \&quot;create_date\&quot;: \&quot;09/09/2019\&quot;,\n      \&quot;creator\&quot;: \&quot;lehongan\&quot;\n    }\n  ],\n  \&quot;fields\&quot;: \&quot;string\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://apihelpdesk.upod.vn/api/v2019-05/request/create</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
