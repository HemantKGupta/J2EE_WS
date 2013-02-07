import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.activation.DataHandler;
import javax.xml.namespace.QName;
import javax.xml.soap.AttachmentPart;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;


public class ForAttachment {
	
	ForAttachment() throws SOAPException, MalformedURLException, IOException 
    {
   MessageFactory factory = MessageFactory.newInstance();
   //1. Create soap message
   SOAPMessage reqMsg = factory.createMessage();
   //2. Create part
   SOAPPart soapPart = reqMsg.getSOAPPart();
   //3. Create envolove
   SOAPEnvelope soapenv = soapPart.getEnvelope();
   //4. Create body
   SOAPBody soapbody = soapenv.getBody();
   
  // 5. Add body element with qname and prefix 
  SOAPBodyElement ele=soapbody.addBodyElement(new QName ("","celsiusToFarenheit","q0"));
  // Add a child to body element 
  SOAPElement ele2=ele.addChildElement(new QName ("","celsius","q0"));
  ele2.addTextNode("56");	
  
//  AttachmentPart attach = reqMsg.createAttachmentPart();
//  String stringAttach = "ZSRDXOIJ";
//  attach.setContent(stringAttach , "text/plain");
//  attach.setContentId("an update");
//  reqMsg.addAttachmentPart(attach);
 // reqMsg.writeTo(System.out);
  
  URL url = new URL("http://localhost:8080/Simple/pic31882.jpg");
  DataHandler dataHand = new DataHandler(url);
  AttachmentPart attach2 = reqMsg.createAttachmentPart(dataHand);
  attach2.setContentId("attch_image");
  reqMsg.addAttachmentPart(attach2);
  reqMsg.writeTo(System.out);

}
	public static void main(String[] args) throws MalformedURLException, SOAPException, IOException {
		ForAttachment m = new ForAttachment();

	}
}
