package example ;

import javax.xml.ws.Service;
import javax.xml.ws.Dispatch;

import javax.xml.namespace.QName;

import java.net.URL;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.Name;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPEnvelope;

/**
 * Example using Dispatch<SOAPMessage> Interface.
 */
public class DispatchSOAPMessageExample {

   

    public static void main(String [] args) throws Exception {

        System.out.println("Invoking simple service, " +
                           "using Dispatch<SOAPMessage>...") ;

        URL wsdlLocation = new URL("http://localhost:8080/arithmetic-webservice/ArithmeticService");
        QName serviceQName = new QName("http://endpoint/", "ArithmeticService");
        QName portQName =  new QName("http://endpoint/", "ArithmeticPort");
        
        Service service = Service.create(wsdlLocation, serviceQName);
        Dispatch<SOAPMessage> dispatch =   service.createDispatch(portQName, SOAPMessage.class,
                                       Service.Mode.MESSAGE);
        MessageFactory msgFactory = MessageFactory.newInstance();
        
        SOAPMessage reqMsg = msgFactory.createMessage();
        SOAPEnvelope envelope = reqMsg.getSOAPPart().getEnvelope();        
        SOAPBody body = reqMsg.getSOAPBody();
        
        Name multiplyName = envelope.createName("multiply", "ns2","http://endpoint/");
        SOAPBodyElement baseElement =  body.addBodyElement(multiplyName);
        SOAPElement arg0 = baseElement.addChildElement(envelope.createName("arg0"));
        arg0.addTextNode("8");
        SOAPElement arg1 = baseElement.addChildElement(envelope.createName("arg1"));
        arg1.addTextNode("7");
        reqMsg.writeTo(System.out); 
        SOAPMessage response = dispatch.invoke(reqMsg);

        // Following doesn't work in Axis2 because of bug in Axiom 1.2.5.
        // See:
        //
        //   https://issues.apache.org/jira/browse/WSCOMMONS-255

        String result = response.getSOAPBody() .
                        getElementsByTagName("return").item(0) .
                        getFirstChild().getNodeValue();


        // Workaround:

      /*  org.w3c.dom.Node wrapper = response.getSOAPBody().getFirstChild() ;
        while(wrapper.getNodeType() != wrapper.ELEMENT_NODE) {
            wrapper = wrapper.getNextSibling() ;
        }
        org.w3c.dom.Node part = wrapper.getFirstChild() ;
        while(part.getNodeType() != part.ELEMENT_NODE) {
            part = part.getNextSibling() ;
        }
        String result = part.getFirstChild().getNodeValue() ;

      */
        System.out.println("Got: \"" + result + "\"");
        
       
    }
}

