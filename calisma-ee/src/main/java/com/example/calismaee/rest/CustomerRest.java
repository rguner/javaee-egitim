package com.example.calismaee.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.example.calismaee.model.Customer;


@Path("/v1/customer")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerRest {

    @Path("/greet/name/{name}/surname/{surname}")
    @GET
    public Customer read(@PathParam("name") final String name,
                        @PathParam("surname") final String surname) {
        Customer customer = new Customer();
        customer.setName(name);
        customer.setSurName(surname);
        return customer;
    }

    /*
    @Path("/greet2")
    @GET
    public String greet2(@QueryParam("abc") final String name,
                         @QueryParam("xyz") final String surname) {
        return "Greetings 2 " + name + " " + surname;
    }

    @Path("/greet3/{name}/{surname}")
    @GET
    public String greet3(@PathParam("name") final String name,
                         @PathParam("surname") final String surname,
                         @QueryParam("weight") final Integer weight,
                         @QueryParam("height") final Integer height) {
        return "Greetings 2 " + name + " " + surname + " w : " + weight + " h : " + height;
    }

     */

    @Path("/greet4")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String greet4(final Customer customer) {
        return customer.toString();
    }

}
