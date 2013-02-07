package example;
import java.io.InputStream ;
import java.io.ByteArrayInputStream ;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;

/**
 * Example using Dispatch<Source> Interface.
 */
public class DispatchSourceExample {

     
    private static final String bodyHello1 =
    "<ns2:multiply xmlns:ns2=\"http://endpoint/\">\n"+
    "  <arg0>5</arg0>\n" +
    "  <arg1>6</arg1>\n" +
    "</ns2:multiply>\n";

    public static void main(String [] args) throws Exception {

        System.out.println("Invoking simple service, " +
                           "using Dispatch<Source>...") ;

        InputStream requestStream =
                new ByteArrayInputStream(bodyHello1.getBytes());

        URL wsdlLocation = new URL("http://localhost:8080/arithmetic-webservice/ArithmeticService");

        QName serviceQName =
                new QName("http://endpoint/", "ArithmeticService");
        QName portQName =
                new QName("http://endpoint/", "ArithmeticPort");

        Service service = Service.create(wsdlLocation, serviceQName);

        Dispatch<Source> dispatch =
                service.createDispatch(portQName, Source.class,
                                       Service.Mode.PAYLOAD);

        Source request = new StreamSource(requestStream);

        Source response = dispatch.invoke(request);

        Transformer copier =
                TransformerFactory.newInstance().newTransformer();

        System.out.print("Got: \"");
        copier.transform(response, new StreamResult(System.out));
        System.out.println("\"");
    }
}