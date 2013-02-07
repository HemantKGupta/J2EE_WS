
package sample;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import sample.HelloWorld;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.0-b26-ea3
 * Generated source version: 2.0
 * 
 */
@WebService(name = "HelloWorld", targetNamespace = "http://sample/", wsdlLocation = "http://localhost:8080/helloworld/HelloWorldService?wsdl")
public interface HelloWorld {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://sample/", className = "sample.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://sample/", className = "sample.HelloResponse")
    public String hello(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}