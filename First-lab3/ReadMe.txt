package endpoint;
import javax.jws.WebService;
import javax.jws.WebMethod;
@WebService(
name="Maths",
serviceName="MathsWebService",
targetNamespace="http://wsimport")
public class Arithmetic {
public Arithmetic() {}
@WebMethod(
operationName="product")
public int multiply(int a, int b) {
int c = a * b ;
return c;
}
}

First we look at some of the properties of the @WebService annotation. The name property sets the name associated with the WSDL port type. This defaults to the Java class or interface name, Arithmetic in our case.
The serviceName property sets the WSDL service name as indicated by the <service> element. The default is the Java class name with "Service" appended, ArithmeticService in our case.

The targetNamespace property sets the XML namespace for WSDL and XSD documents. We described earlier in the WSDL section how the default is derived—in our case the default is http://endpoint/.
Next we consider the @WebMethod annotation. The operationName property sets the name of the WSDL operation. This defaults to the name of the Java method, multiply in our case.
We have listed the corresponding WSDL file, with modifications highlighted:
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<definitions targetNamespace="http://wsimport" name="MathsWebService"
xmlns:tns=http://wsimport
xmlns:xsd="http://www.w3.org/2001/XMLSchema"
xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
xmlns="http://schemas.xmlsoap.org/wsdl/">
<types>
<xsd:schema>
<xsd:import namespace="http://wsimport"
schemaLocation="MathsWebService_schema1.xsd"/>
</xsd:schema>
</types>
<message name="product">
<part name="parameters" element="tns:product"/>
</message>
<message name="productResponse">
<part name="parameters" element="tns:productResponse"/>
</message>
<portType name="Maths">
<operation name="product">
<input message="tns:product"/>
<output message="tns:productResponse"/>
</operation>
</portType>
<binding name="MathsPortBinding" type="tns:Maths">
<soap:binding transport= "http://schemas.xmlsoap.org/soap/http"
style="document"/>
<operation name="product">
<soap:operation soapAction=""/>
<input>
<soap:body use="literal"/>
</input>
<output>
<soap:body use="literal"/>
</output>
</operation>
</binding>
<service name="MathsWebService">
<port name="MathsPort" binding="tns:MathsPortBinding">
<soap:address location="http://localhost:8080/
arithmetic-webservice/ MathsWebService"/>
</port>
</service>
</definitions>

The web service Java client, WebServiceClient.java, is listed
below with modifications highlighted:
package client;
import javax.xml.ws.WebServiceRef;
import wsimport.MathsWebService;
import wsimport.Maths;
public class WebServiceClient {
@WebServiceRef(wsdlLocation="http://localhost:8080/
arithmetic-webservice/ MathsWebService?WSDL")
static MathsWebService service;
public static void main(String[] args) {
try {
int a = 3;
int b = 4;
Maths port = service.getMathsPort();
int result = port.product(3, 4);
System.out.println("Result of multiplying "
+ a + " by " + b + " using webservice is: "
+ result);
} catch(Exception e) {
e.printStackTrace();
}
}
}


