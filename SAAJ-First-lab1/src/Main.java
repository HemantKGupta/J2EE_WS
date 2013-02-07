import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.soap.*;



public class Main {
   Main() throws SOAPException, MalformedURLException, IOException 
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
  SOAPBodyElement ele=soapbody.addBodyElement(new QName ("http://endpoint/","multiply","ns2"));
  // Add a child to body element 
  SOAPElement ele2=ele.addChildElement(soapenv.createName("arg0"));
  ele2.addTextNode("10");
  
  SOAPElement ele3=ele.addChildElement(soapenv.createName("arg1"));
  ele3.addTextNode("20");
  
  reqMsg.writeTo(System.out);
  //reqMsg.writeTo(new FileOutputStream("f.xml")); 
   SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
   SOAPConnection connection = soapConnectionFactory.createConnection();
   java.net.URL endpoint = new java.net.URL("http://localhost:8080/arithmetic-webservice/ArithmeticService");
   SOAPMessage response = connection.call(reqMsg, endpoint);
   connection.close();
   System.out.println("Response is: "+response.getSOAPBody().getFirstChild());
  // SOAPBody soapbody1 = response.getSOAPBody();
   // Node n = soapbody1.getFirstChild();
   //Iterator iterator = n.getChildElements();
   //SOAPBodyElement bodyelemt = (SOAPBodyElement)iterator.next();
  // String val = bodyelemt.getValue();
  // System.out.println("Value is:" + val);
   //System.out.println(productPrice);
   //System.out.println("The price of the product is ");
   //System.out.println(productPrice);
 
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, SOAPException {
        // TODO code application logic here
        Main m = new Main();
    }
}
