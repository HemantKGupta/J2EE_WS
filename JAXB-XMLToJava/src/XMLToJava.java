import java.io.File;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import generated.StudentType;

public class XMLToJava {
	 public static void main (String [] args) throws FileNotFoundException {
	        try {
	            JAXBContext jc = JAXBContext.newInstance (StudentType.class n);
	            Unmarshaller u = jc.createUnmarshaller ();
	           File f = new File ("student.xml");
	           JAXBElement<StudentType> element = (JAXBElement<StudentType>) u.unmarshal(new StreamSource(f),StudentType.class);
	           StudentType student= (StudentType) element.getValue ();
	           System.out.println ("Student Gender is  : " + student.getGender ());
	           System.out.println ("Student Name is : " + student.getName ());
	           System.out.println ("Student Age is : " + student.getAge ());
	       } catch (JAXBException e) {
	           e.printStackTrace ();
	       }
	   }

}
