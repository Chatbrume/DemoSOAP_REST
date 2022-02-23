package com.objis.demo.tp13.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class HomeController
{
    @GET
    @Path("/home")
    public Response sayHello()
    {
        String output = "Here is the home !";
        return Response.status(200).entity(output).build();
    }
}
