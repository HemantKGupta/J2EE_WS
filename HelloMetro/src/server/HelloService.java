package server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="HelloService", serviceName="HelloServiceService")
public class HelloService {
	@WebMethod()
	public String sayHello(@WebParam(name="name") String name) {
	      return "Hello " + name + "!!";
	}

}
