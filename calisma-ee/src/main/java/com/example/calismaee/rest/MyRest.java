package com.example.calismaee.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/first")
@Produces({"application/xml", "application/json"})
@Consumes({"application/xml", "application/json"})
public class MyRest {

    @Path("/hello")
    @GET
    public String greet() {
        System.out.println("rest /hello isteği");
        return "Merhaba Dünya";
    }
}
