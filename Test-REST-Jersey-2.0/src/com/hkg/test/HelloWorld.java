package com.hkg.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/helloworld")
public class HelloWorld {
    @Context
    private UriInfo context;
 
    public HelloWorld() {
    }
 
  /*  @GET
    @Produces("text/html")
    public String getHtml() {
        return "<html lang=\"en\"><body><h1>Hello, World!!</h1></body></html>";
    }*/
    
   /* @GET
    @Produces(MediaType.TEXT_XML)
    public String getXml() {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello , World!!" + "</hello>";
    }*/
    
    /*@GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        return "{hello:\"world\"}";
    }*/
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Track getJsonJackson() {
    	
    	Track track = new Track();
		track.setTitle("Enter Sandman");
		track.setSinger("Metallica");
 
		return track;
        
    }
}