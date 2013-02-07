package client;

import sample.HelloWorld;
import sample.HelloWorldService;

public class HelloWorldClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Create Service
        HelloWorldService service = new HelloWorldService();

        //create proxy
        HelloWorld proxy = service.getHelloWorldPort();

        //invoke
        System.out.println(proxy.hello("hello"));

	}

}
