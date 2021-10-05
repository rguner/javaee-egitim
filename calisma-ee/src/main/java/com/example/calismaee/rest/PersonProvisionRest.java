package com.example.calismaee.rest;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.example.calismaee.model.Person;

@Path("/v1/person/provision")
public class PersonProvisionRest {

    @Path("/add")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String add(@Valid final Person person) {
        //        if (person.getName() == null) {
        //            throw new IllegalArgumentException("name boş olamaz");
        //        }
        return "SUCCESS";
    }

    @Path("/remove")
    @GET
    public String remove(@QueryParam("name") final String name) {
        return "SUCCESS";
    }


}
