package example ;

import javax.xml.ws.Service;
import javax.xml.ws.Dispatch;

import javax.xml.namespace.QName;

import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;

import endpoint.*;

/**
 * Example using Dispatch<Object> Interface and JAXB generated classes.
 * This class needs class files generated by wsgen so import First-lab1 project in build path 
 */
public class DispatchObjectExample {
   
     public static void main(String [] args) throws Exception {

        System.out.println("Invoking simple service, " +
                           "using Dispatch<Object>...") ;

       

        URL wsdlLocation = new URL("http://localhost:8080/arithmetic-webservice/ArithmeticService");
        QName serviceQName = new QName("http://endpoint/", "ArithmeticService");
        QName portQName =  new QName("http://endpoint/", "ArithmeticPort");

        Service service = Service.create(wsdlLocation, serviceQName) ;
        JAXBContext jc = JAXBContext.newInstance("endpoint") ;

        Dispatch<Object> dispatch =
                service.createDispatch(portQName, jc, Service.Mode.PAYLOAD);

        ObjectFactory of = new ObjectFactory() ;

        Multiply requestValue = of.createMultiply();
        requestValue.setArg0(4);
        requestValue.setArg1(5);
        JAXBElement<Multiply> request = of.createMultiply(requestValue);

        JAXBElement<MultiplyResponse> response =   (JAXBElement<MultiplyResponse>) dispatch.invoke(request) ;

        int result = response.getValue().getReturn();

        System.out.println("Got: \"" + result + "\"");
    }
}

