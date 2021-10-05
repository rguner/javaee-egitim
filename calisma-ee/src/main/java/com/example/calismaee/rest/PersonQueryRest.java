package com.example.calismaee.rest;

import com.example.calismaee.model.Person;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/v1/person/query")
@Produces(MediaType.APPLICATION_JSON)
public class PersonQueryRest {

    @Path("/get/one")
    @GET
    public Person getOne(@QueryParam("name") final String name) {
        return new Person();
    }

    @Path("/get/all")
    @GET
    public List<Person> getAll() {
        return new ArrayList<>();
    }

    @Path("/get/by/surname")
    @GET
    public List<Person> getBySurname(@QueryParam("surname") final String surname) {
        return new ArrayList<>();
    }

}
