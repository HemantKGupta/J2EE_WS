Read lab1 ReadMe first to know all steps
Deploying an EJB Session Bean as a Web Service

Below is a listing for the BankEndpointBean stateless session bean which we have modified to be a web service. The EJB has one business method, addCustomer(), which adds a new customer to the database. We use the same Customer entity from earlier chapters.
package endpoint;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import entity.Customer;
import javax.persistence.PersistenceContext;
import java.util.*;
@Stateless
@WebService
public class BankEndpointBean {
@PersistenceContext(unitName="BankService")
private EntityManager em;
private Customer cust;
public BankEndpointBean() {}
@WebMethod
public String addCustomer(int custId, String firstName,
String lastName) {
cust = new Customer();
cust.setId(custId);
cust.setFirstName(firstName);
cust.setLastName(lastName);
em.persist(cust);
return "Customer added";
}
}

Packaging an EJB Web Service

> jar -tvf BankWebService.jar
0 Mon May 14 09:55:44 BST 2007 META-INF/
106 Mon May 14 09:55:42 BST META-INF/MANIFEST.MF
0 Mon May 14 09:50:24 BST endpoint/
832 Mon May 14 09:55:44 BST endpoint/BankEndpointBean.class
0 Mon May 14 09:55:12 BST entity/
997 Mon May 14 09:55:44 BST entity/Customer.class
193 Wed Nov 01 09:05:10 GMT 2006 META-INF/persistence.xml
Note that we have included the entity, Customer.class, and the persistence.xml file as is usual with EJB 3. Finally we deploy the JAR file. At deployment the WSDL and associated artifacts are automatically created, or as before we can use a tool such as wsgen to create these artifacts.

Creating an EJB Web Service Client
package client;
import javax.xml.ws.WebServiceRef;
import endpoint.BankEndpointBeanService;
import endpoint.BankEndpointBean;
public class BankClient {
@WebServiceRef(wsdlLocation="http://localhost:8080/
BankEndpointBeanService/BankEndpointBean?WSDL")
static BankEndpointBeanService service;
public static void main(String[] args) {
try {
int custId = 0;
String firstName = null;
String lastName = null;
try {
custId = Integer.parseInt(args[0]);
firstName = args[1];
lastName = args[2];
} catch (Exception e) {
System.err.println(
"Invalid arguments entered, try again");
System.exit(0);
}
BankEndpointBean port =
service.getBankEndpointBeanPort();
String result = port.addCustomer(
custId, firstName, lastName);
System.out.println(result);
} catch (Exception e) {
e.printStackTrace();
}
}
}