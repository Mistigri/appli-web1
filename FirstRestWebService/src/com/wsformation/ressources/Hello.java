package com.wsformation.ressources;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String sayPlainTextHello(){
     return "Hello, World";
  }

  @GET
  @Produces(MediaType.TEXT_XML)
  public String sayPlainXmlHello(){
     return "<?xml version=\"1.0\"?>" + "<hello>Hello, World</hello>";
  }
}

