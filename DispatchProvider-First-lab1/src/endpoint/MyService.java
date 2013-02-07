package endpoint;
import javax.xml.ws.WebServiceProvider;
import javax.xml.ws.ServiceMode;

import javax.xml.ws.Provider;
import javax.xml.ws.Service;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;

import org.w3c.dom.Element ;

@WebServiceProvider(targetNamespace="http://test.omii.ac.uk",
                    serviceName="HelloService",
                    portName="HelloPort")
@ServiceMode(value=Service.Mode.MESSAGE)
public class MyService implements Provider<SOAPMessage> {

    public SOAPMessage invoke(SOAPMessage request) { 

        try {
            // Following doesn't work because of bug in Axiom 1.2.5.  See:
            //
            //   https://issues.apache.org/jira/browse/WSCOMMONS-255

            //String name = request.getSOAPBody() .
            //              getElementsByTagName("name").item(0) .
            //              getFirstChild().getNodeValue();

            // Workaround:

            org.w3c.dom.Node wrapper = request.getSOAPBody().getFirstChild() ;
            while(wrapper.getNodeType() != wrapper.ELEMENT_NODE) {
                wrapper = wrapper.getNextSibling() ;
            }
            org.w3c.dom.Node part = wrapper.getFirstChild() ;
            while(part.getNodeType() != part.ELEMENT_NODE) {
                part = part.getNextSibling() ;
            }
            String name = part.getFirstChild().getNodeValue() ;

            MessageFactory factory = MessageFactory.newInstance();

            SOAPMessage response = factory.createMessage();
            SOAPEnvelope envelope = response.getSOAPPart().getEnvelope();

            response.getSOAPBody() .
                    addBodyElement(envelope .
                            createName("helloResponse",
                                       "ns1", "http://test.omii.ac.uk")) .
                    addChildElement(envelope.createName("return")) .
                    addTextNode("Hello " + name + "!");

            return response;
        }
        catch(SOAPException e) {
            throw new RuntimeException(e);
        }
    }
}
