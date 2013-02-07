package sample;

import javax.jws.WebService;

@WebService
public class HelloWorld {
    public String hello(String param){
    return param + ", World";
    }
}